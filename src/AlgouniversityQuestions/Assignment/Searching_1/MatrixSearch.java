// https://www.algouniversity.com/problem/133/?asid=1732

package Searching_1;
import java.util.*;
import java.io.*;

public class MatrixSearch {
    static class FastReader {
        BufferedReader b;
        StringTokenizer s;

        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return s.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (s != null && s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader f = new FastReader();
        int n = f.nextInt();
        int m = f.nextInt();
        int q = f.nextInt();

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = f.nextInt();
            }
        }

        int size = n * m;

        while (q-- > 0) {
            int target = f.nextInt();

            int lo = 0;
            int hi = size - 1;
            int ansRow = -1, ansCol = -1;

            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                int row = mid / m;
                int col = mid % m;
                int val = matrix[row][col];

                if (val == target) {
                    ansRow = row;
                    ansCol = col;
                    break;
                } else if (val < target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
          System.out.println(ansRow + " " + ansCol);
        }
    }
}

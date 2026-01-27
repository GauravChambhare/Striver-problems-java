// https://www.algouniversity.com/problem/266/?asid=1732
package Searching_1;
import java.io.*;
import java.util.*;

public class RangeSearchQueries {

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
        FastReader fs = new FastReader();
        StringBuilder out = new StringBuilder();

        int n = fs.nextInt();
        int q = fs.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
        }

        // Sort the array once
        Arrays.sort(a);

        for (int i = 0; i < q; i++) {
            int L = fs.nextInt();
            int R = fs.nextInt();

            // first index with value >= L
            int leftIdx = lowerBound(a, L);

            // first index with value > R
            int rightIdx = upperBound(a, R);

            int count = rightIdx - leftIdx;
            out.append(count).append(' ');
        }

        System.out.println(out.toString().trim());
    }

    // Returns first index i such that a[i] >= x
    private static int lowerBound(int[] a, int x) {
        int lo = 0, hi = a.length; // [lo, hi)
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] >= x) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo; 
    }

    private static int upperBound(int[] a, int x) {
        int lo = 0, hi = a.length; // [lo, hi)
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] > x) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo; // may be a.length if all elements <= x
    }

}
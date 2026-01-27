/*
 * https://www.algouniversity.com/problem/269/?asid=1732
 * 
 * 
 * 
*/

package Searching_1;
import java.io.*;
import java.util.*;

public class SortedBinaryArray {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastReader f = new FastReader();
        int n = f.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = f.nextInt();
        }

        int lp = -1, rp = n;
        while (lp + 1 < rp) {
            int mid = lp + (rp - lp) / 2;
            if (input[mid] < 1) {
                lp = mid;
            } else {
                rp = mid;
            }
        }
        System.out.print(rp + " " + lp);
    }
}

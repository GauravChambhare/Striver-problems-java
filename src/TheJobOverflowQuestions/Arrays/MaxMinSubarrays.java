package TheJobOverflowQuestions.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxMinSubarrays {
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
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                if (s != null && s.hasMoreTokens()) str = s.nextToken("\n");
                else str = b.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader f = new FastReader();
        int n = f.nextInt();
        int x = f.nextInt();
        int y = f.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = f.nextInt();
        /*
          4 3 1
          1 2 3 1
          -> 4
        */
        // Uncomment one of the approaches as needed:
        //bruteForce(arr, n, x, y);
        optimized(arr, n, x, y);
    }

    // Brute force approach O(N^3), for educational purpose
    public static void bruteForce(int[] arr, int n, int x, int y) {
        int ans = 0;
        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {
                int minSub = Integer.MAX_VALUE, maxSub = Integer.MIN_VALUE;
                for (int idx = left; idx <= right; idx++) {
                    minSub = Math.min(minSub, arr[idx]);
                    maxSub = Math.max(maxSub, arr[idx]);
                }
                if (minSub == y && maxSub == x) ans++;
            }
        }
        System.out.println(ans);
    }

    // Optimized O(N) approach
    public static void optimized(int[] arr, int n, int x, int y) {
        int lastx = -1, lasty = -1, lastInvalid = -1;
        long count = 0L;
        for (int i = 0; i < n; i++) {
            if (arr[i] < y || arr[i] > x) lastInvalid = i;
            if (arr[i] == x) lastx = i;
            if (arr[i] == y) lasty = i;
            int minIdx = Math.min(lastx, lasty);
            if (minIdx > lastInvalid) {
                count += minIdx - lastInvalid;
            }
        }
        System.out.println(count);
    }
}

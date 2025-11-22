package TheJobOverflowQuestions.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxMinSubarrays {
    static class FastReader {
      
        // BufferedReader to read input
        BufferedReader b;
      
        // StringTokenizer to tokenize input
        StringTokenizer s; 

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) { // next() method har baar agla token return karta hai, agar tokens khatam 
                // ho jate hain, to BufferedReader se new line read karke fresh tokens banata hai.
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace(); 
                }
            }
            return s.nextToken();
        }

        // Method to read the next token as an integer
        int nextInt() { 
            return Integer.parseInt(next()); 
        }

        // Method to read the next token as a long
        long nextLong() { 
            return Long.parseLong(next()); 
        }

        // Method to read the next token as a double
        double nextDouble() { 
            return Double.parseDouble(next()); 
        }

        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
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
        int x = f.nextInt();
        int y = f.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
          arr[i] = f.nextInt();
        }
        MaxMinSubarrays.bruteForce(arr, n, x, y);
    }
    // this is brute force approach O(N**3) TC and O(N) SC -- this approach will lead to TLE generally
    public static void bruteForce(int[] arr, int n, int x, int y){
        int ans = 0;
        for(int left = 0; left < n; left++){
        
            for(int right = left; right<n; right++){
              
              Integer minSub = Integer.MAX_VALUE;
              Integer maxSub = Integer.MIN_VALUE;
              
              for(int idx = left; idx < right+1; idx++){
                minSub = Math.min(minSub, arr[idx]);
                maxSub = Math.max(maxSub, arr[idx]);
              }
              if(minSub==y && maxSub==x) ans++;
            }
            
          }
        System.out.println(ans);   
    }

    // below is the optimized approach
}

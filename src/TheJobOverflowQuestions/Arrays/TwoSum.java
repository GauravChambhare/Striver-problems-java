/*
You are given an array A of N integers and an integer K. Find two integers in A whose sum equals K. Assume a unique solution always exists, and the same integer cannot be used twice.
Output the two integers in ascending order.

Input:

First line: Two integers N (2 ≤ N ≤ 2×10^5) and K (0 ≤ K ≤ 10^9)

Second line: N integers A1, A2, ... An (1 ≤ Ai ≤ 10^8)

Output:
Two integers from A sorted in ascending order whose sum equals K.

Example:
Input:
5 8
1 2 3 4 5

Output:
3 5

Explanation:
3 + 5 = 8
*/

package TheJobOverflowQuestions.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class TwoSum {

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
        int t = f.nextInt();

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            int num = f.nextInt();
            int complement = t - num;
            if(set.contains(complement)){
                System.out.println(Math.min(num, complement)+" "+Math.max(num, complement));
                return;
            }
            else {
                set.add(num);
            }
        }
    }
    
}

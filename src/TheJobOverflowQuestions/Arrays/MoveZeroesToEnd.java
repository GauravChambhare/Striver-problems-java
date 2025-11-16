/*
https://thejoboverflow.com/problem/19/
*/

package TheJobOverflowQuestions.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MoveZeroesToEnd {
    
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
        int[] ip = new int[n];
        int index=0;

        for(int i=0; i<n; i++){
            int num = f.nextInt();
            if(num==0) continue;
            ip[index] = num;
            index++;
        }

        for( int num : ip){
            System.out.print(num +" ");
        }
        return;
    }
}

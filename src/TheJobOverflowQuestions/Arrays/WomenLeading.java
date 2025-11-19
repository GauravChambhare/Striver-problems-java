package TheJobOverflowQuestions.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WomenLeading {
    
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
        FastReader f =new FastReader();
        int no_of_lines = f.nextInt();
        // System.out.println();

        while(no_of_lines-- > 0){
            String line = f.nextLine();
            int len = line.length();
            int index = 0;
            int maxForLine = -1;
            while(index < len){
                int numW = 0;
                while(index < len && line.charAt(index)=='W'){
                    numW++;
                    index++;
                }
                if(numW==0){
                    index++;
                    continue;
                }
                int numM = 0;
                while(index < len && line.charAt(index) == 'M'){
                    numM++;
                    index++;
                }
                if(numW == numM && numW > 0){
                    maxForLine = Math.max(maxForLine, 2*numW);
                }
            }
            System.out.println(maxForLine); // print result for this line
        }        
    }
}

// WWMMMWMWWWMMMWWWWWMMW

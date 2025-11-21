/*
https://thejoboverflow.com/problem/311/
Problem 311 | 3 Sum Equals K :
------------------------------

You are given an array A of N integers and an integer K. Determine if there exist three integers in A whose sum equals K. You cannot use the same index twice. Print "Yes" if such integers exist, otherwise print "No". Case of output does not matter.

Input:
First line: Two integers N K (3 ≤ N ≤ 10^3), (0 ≤ K ≤ 10^9)
Second line: N integers A1, A2, ..., An (−10^8 ≤ Ai ≤ 10^8)

Output:
Print "Yes" if three integers sum to K, else "No".

Example:

Input:
5 8
1 2 3 4 5

Output:
Yes

Input:
5 10
1 2 3 4 -1

Output:
No
*/


package TheJobOverflowQuestions.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class ThreeSumEqualsK {

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
    Long target = f.nextLong();
    
    Long[] inputarr = new Long[n];
    for(int i = 0; i<n; i++){
      inputarr[i] = f.nextLong();
    }
    // for(Long val : inputarr) System.out.print(val + " ");
    for( int i = 0; i < n; i++){
      Long remaining = target - inputarr[i];
      HashSet<Long> set = new HashSet<>();
      for(int j = i+1; j<n ; j++){
        Long complement = remaining - inputarr[j];
        if(set.contains(complement)){
          System.out.print("Yes");
          return;
        }
        set.add(inputarr[j]);
      }
    }
    System.out.print("No");
    
  }
}
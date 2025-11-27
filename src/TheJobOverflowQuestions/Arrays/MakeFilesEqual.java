/*
https://thejoboverflow.com/problem/164/
Make Files Equal

Given two strings file1 and file2, print the modifications needed to convert file1 into file2.
If a character is removed from file1, print it with a - sign before it.
If a new character is added to get file2, print it with a + sign before it.
Unchanged characters are printed as they are.
All outputs should be space‑separated.

Input:
Two strings str1 and str2 on one line, with 1 ≤ |str1|, |str2| ≤ 10^5 and characters A–Z.

Output:
Print the sequence of modifications, separated by spaces.

Example
Input:
ABC BCDC

Output:
-A B C +D
*/

package TheJobOverflowQuestions.Arrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeFilesEqual {

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
      String first = f.next();
      String second = f.next();
      int i=0, j=0, n=first.length(), m=second.length();
      
    //   Note below approach is heurastic and not the most optimal,
    // When you have understood how to solve problems like equal distances then you can resolve this problem again
      while(i<n && j<m){
        if(first.charAt(i)==second.charAt(j)){
          System.out.print(first.charAt(i)+" ");
          i++; j++;
        } else {
          System.out.print("-"+ first.charAt(i) +" ");
          i++;
        }
      }
      while(i<n){
        System.out.print("-"+ first.charAt(i) +" ");
        i++;
      }
      while(j<m){
        System.out.print("+"+ second.charAt(j) +" ");
        j++;
      }
      return;
    }
  }
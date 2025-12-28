package MatrixAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.algouniversity.com/problem/131/?asid=1721
P33: Matrix Rotation [Standard] :
Given a square matrix A
 of size N×N
, rotate it by 90 degrees in the anti-clockwise direction and output the new rotate matrix.
Note: Since the input/output is huge in size, use fast input/output methods to avoid TLE.
1≤N≤1000
0≤Aij≤109
*/
public class MatrixRotation {
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
        while (s == null || !s.hasMoreElements()) {
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
    // method 1

  public static void main(String[] args) {
    FastReader f = new FastReader();
    int n = f.nextInt();
    int[][] matrix = new int[n][n];
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        matrix[i][j] = f.nextInt();
      }
    }
    // to 90 anti colckwise : transpose + reverse columns
    for(int i=0; i<n; i++){
      for(int j = i+1; j<n; j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    for(int col=0; col<n; col++){
      int tptr = 0, bptr=n-1;
      while(tptr<bptr){
        int temp = matrix[tptr][col];
        matrix[tptr][col] = matrix[bptr][col];
        matrix[bptr][col] = temp;
        tptr++; bptr--;
      }
    }
    for(int row=0; row<n; row++){
      for(int col=0; col<n; col++){
        System.out.print(matrix[row][col]+" ");
      }
      System.out.println();
    }
  }
}

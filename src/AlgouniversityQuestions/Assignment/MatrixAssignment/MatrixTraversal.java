package MatrixAssignment;
/*
https://www.algouniversity.com/problem/132/?asid=1721
P34: Matrix Traversal [Standard] :
You are given a matrix A with N rows and M columns. You have to traverse the matrix in spiral form and output the elements 
in the order that you encounter them. The spiral traversal starts from the top row of the matrix from the left to right direction. 
Please look at the sample testcase to understand the spiral traversal.

CONSTRAINTS
1≤N×M≤1000000

0≤Aij≤109
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixTraversal {
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
    int m = f.nextInt();

    int[][] matrix = new int[n][m];
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        matrix[i][j] = f.nextInt();
      }
    }
    int top = 0, bottom = n-1;
    int left = 0, right = m-1;
    while(top <= bottom && left <= right){
      for(int col=left; col<=right; col++){
        System.out.print(matrix[top][col]+" ");
      }
      top++;
      for(int row=top; row<=bottom; row++){
        System.out.print(matrix[row][right]+" ");
      }
      right--;
      if(top<=bottom){
        for(int col=right; col>=left; col--){
          System.out.print(matrix[bottom][col]+" ");
        }
      }
      bottom--;
      if(left<=right){
        for(int row=bottom; row>=top; row--){
          System.out.print(matrix[row][left]+" ");
        }
      }
      left++;
    }
    return;
  }  
}

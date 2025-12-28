package MatrixAssignment;
/*
https://www.algouniversity.com/problem/134/?asid=1721
P36: Special Matrix [Advanced][Optional] :
---------------------------------------------------------------------------------------------------
A matrix is called special if the sum of each row and the sum of each column is the same.

Given a square matrix A of dimensions N×N, find the minimum number of operations required to make it 
special. In one operation you can choose any number in the matrix and increase it by 1.

CONSTRAINTS
1≤N≤1000

1≤Aij≤109
INPUT
First line contains a single integer N. Next N lines contain N integers each representing the square 
matrix A.

OUTPUT
Output a single integer.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpecialMatrix {
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
    FastReader f  = new FastReader();
    int n = f.nextInt();
    int[][] matrix = new int[n][n];
    for(int row = 0; row<n; row++){
      for(int col=0; col<n; col++){
        matrix[row][col] = f.nextInt();
      }
    }
    long[] colMax = new long[n];
    long[] rowMax = new long[n];
    long maxSum = 0;
    for(int row=0; row<n; row++){
      int col=0;
      long sum=0;
      while(col<n){
        sum +=matrix[row][col];
        col++;
      }
      rowMax[row] = sum;
      if(sum>maxSum) maxSum = sum;
    }
    for(int col=0; col<n; col++){
      int row=0;
      long sum=0;
      while(row<n){
        sum +=matrix[row][col];
        row++;
      }
      colMax[col] = sum;
      if(sum>maxSum) maxSum = sum;
    }
    // now I will just find our required no of min operations
    long ans = 0;
    for(int i=0; i<n; i++){
      ans += maxSum - rowMax[i];
    }
    System.out.println(ans);
    return;
  }    
}
/*
3
5 3 2
3 2 1
2 4 3
ans: 5
*/

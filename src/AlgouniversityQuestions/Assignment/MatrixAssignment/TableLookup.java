package MatrixAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
https://www.algouniversity.com/problem/268/?asid=1721
Table Lookup :
You are given a 2D matrix, having n rows and m columns, such that the elements in each row as well 
elements in each column are sorted in non-decreasing order. Given an integer x, determine whether x
 is present in the matrix or not.

Constraints
1≤n,m≤1000

1≤Ai,j≤109
*/
public class TableLookup {
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
    int m = f.nextInt();
    int[][] matrix = new int[n][m];
    int x = f.nextInt();
    for(int row=0; row<n; row++){
      for(int col=0; col<m; col++){
        matrix[row][col] = f.nextInt();
      }
    }
    for(int row=0; row<n; row++){
      if(x>matrix[row][m-1]) continue;
      for(int col=m-1; col>=0; col--){
        if(matrix[row][col]==x){
          System.out.print("YES");
          return;
        }
      }
    }
    System.out.print("NO");
    return;
  }    
}

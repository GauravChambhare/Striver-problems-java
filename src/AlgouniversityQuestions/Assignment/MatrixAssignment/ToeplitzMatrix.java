/*
 * P54: Toeplitz Matrix 
 * https://www.algouniversity.com/problem/154/
 * --------------------------------------------------------------------------------
 * You are given a matrix A
 * of size n×m
.* Output 1 if the matrix is a toeplitz-matrix else output 0.
 *
 * A matrix A is said to be toeplitz if every diagonal (of all sizes) from the top-left to the bottom-right has the same elements. Have a look at the sample test case for a better understanding.
 * 1≤n×m≤10^5
 * 1≤Aij≤10^9
*/
package MatrixAssignment;
import java.util.*;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        //take input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
            
        for(int row=1; row<n; row++){
            for(int col=1; col<m; col++){
                if(matrix[row][col]!=matrix[row-1][col-1]){
                    System.out.println(0);
                    return;
                }
            }
        }
      System.out.println(1);
      return;
    }
}

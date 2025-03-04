/*
https://www.geeksforgeeks.org/problems/double-triangle-pattern-1662664259/0?ref=gcse_ind
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
*/

package a2z.step1.lec2;

public class Pattern_12 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    
    public static void printTriangle(int n) {
        for(int row=1; row <= n; row++){
            for(int col=1; col <= row; col++){
                System.out.print(col+" ");
            }
            for(int col=0; col < 2*(n-row); col++){
                System.out.print("  ");
            }
            for(int col=row; col>0; col-- ){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

/*
https://www.geeksforgeeks.org/problems/double-triangle-pattern/0?ref=gcse_ind
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/

package a2z.step1.lec2;

public class Pattern_19 {
    public static void main(String[] args) {
        Pattern_19 pattern = new Pattern_19();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }

    void printTriangle(int n) {
        
        for(int row=0; row<n; row++){
            for(int patt=n-row; patt>0; patt--){
                System.out.print("*");
            }
            for(int space=0; space<row; space++){
                System.out.print("  ");
            }
            for(int patt=n-row; patt>0; patt--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int row=0; row<n; row++){
            for(int patt=0; patt<=row; patt++){
                System.out.print("*");
            }
            for(int space=n-row-1; space>0; space--){
                System.out.print("  ");
            }
            for(int patt=0; patt<=row; patt++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

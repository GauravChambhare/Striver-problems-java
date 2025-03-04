/*
https://www.geeksforgeeks.org/problems/triangle-pattern-1661492263/0?ref=gcse_ind
    *
   ***  
  *****
 *******
*********
*/
package a2z.step1.lec2;

public class Pattern_7 {
    public static void main(String[] args) {
        Pattern_7 pattern = new Pattern_7();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }

    void printTriangle(int n) {
        for(int row=0; row<n; row++){
            for(int col=0; col<n-row-1; col++){
                System.out.print(" ");
            }
            for(int col=0; col<2*row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }

    
}

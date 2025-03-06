/*
https://www.geeksforgeeks.org/problems/double-triangle-pattern-1662287416/0?ref=gcse_ind
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/

package a2z.step1.lec2;

public class Pattern_20 {

    public static void main(String[] args) {
        Pattern_20 pattern = new Pattern_20();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }

    void printTriangle(int n) {
        for(int row=0; row<n; row++){
            for(int star=0; star<row+1; star++){
                System.out.print("*");
            }
            for(int space=1; space<=2*(n-1-row); space++){
                System.out.print(" ");
            }
            for(int star=0; star<row+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=0; row<n-1; row++){
            for(int star=0; star<n-1-row; star++){
                System.out.print("*"); 
            }
            for(int space=1; space<=2*(1+row); space++){
                System.out.print(" ");
            }
            for(int star=0; star<n-1-row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}

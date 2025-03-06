/*
https://www.geeksforgeeks.org/problems/square-pattern-1662287714/0?ref=gcse_ind
****
*  *
*  *
****
*/

package a2z.step1.lec2;

public class Pattern_21 {
    public static void main(String[] args) {
        Pattern_21 pattern = new Pattern_21();
        pattern.printSquare(4);  // You can change the value to print a square with different height
    }

    void printSquare(int n) {
        // two for loops 
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row==1 || row==n || col==1 || col==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}

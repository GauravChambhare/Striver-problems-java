/*
https://www.geeksforgeeks.org/problems/square-pattern-1662666141/0?ref=gcse_ind
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/

package a2z.step1.lec2;

public class Pattern_22 {

    public static void main(String[] args) {
        Pattern_22 pattern = new Pattern_22();
        pattern.printSquare(5);  // You can change the value to print a square with different height
    }

    void printSquare(int n) {
        for(int row=0; row<2*(n)-1; row++){
            for( int col=0; col<2*(n)-1; col++){
                int left = row;
                int right = 2*(n-1)-row;
                int top = col;
                int bottom = 2*(n-1)-top;
                int val = n-Math.min(Math.min(top, bottom),Math.min(left, right));
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    
}

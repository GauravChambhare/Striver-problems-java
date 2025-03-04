/*
https://www.naukri.com/code360/problems/star-diamond_6573686?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
  *
 ***
*****
*****
 ***
  *
*/

package a2z.step1.lec2;

public class Pattern_9 {
    public static void main(String[] args) {
        nStarDiamond(3);  // You can change the value to print a diamond with different height
    }
    public static void nStarDiamond(int n) {
        // Upper half of the diamond (including the middle row)
        for (int row = 1; row <= n; row++) {

            // Print spaces for the current row
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int stars = 1; stars <= 2 * row - 1; stars++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Lower half of the diamond (starts from the middle row again)
        for (int row = n; row > 0; row--) {

            // Print spaces for the current row
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int stars = 1; stars <= 2 * row - 1; stars++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    } 
}

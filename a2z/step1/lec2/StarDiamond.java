package a2z.step1.lec2;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
        sc.close();
    }
}

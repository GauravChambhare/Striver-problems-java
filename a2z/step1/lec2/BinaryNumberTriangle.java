package a2z.step1.lec2;

import java.util.Scanner;

public class BinaryNumberTriangle {
    public static void main(String[] args) {
        // Write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Determine the starting number: 1 for odd rows, 0 for even rows
            int start = i % 2;

            // Inner loop to print 'i' numbers in the ith row
            for (int j = 0; j < i; j++) {
                System.out.print(start + " ");
                // Toggle between 1 and 0
                start = 1 - start;
            }
            // Move to the next line after printing a row
            System.out.println();
        }
        sc.close();
    }
}

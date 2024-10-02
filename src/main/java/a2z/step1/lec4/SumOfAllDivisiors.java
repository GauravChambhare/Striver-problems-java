package a2z.step1.lec4;

import java.util.Scanner;

public class SumOfAllDivisiors {

    public static void main(String[] args) {
        long divisorsSum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Iterate over each number from 1 to N
        for (int i = 1; i <= n; i++) {
            // For each number i, add i to the sum of all its multiples
            divisorsSum += (long) i * (n / i);
        }

        System.out.println(divisorsSum);
    }
}

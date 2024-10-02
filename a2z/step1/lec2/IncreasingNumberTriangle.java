package a2z.step1.lec2;

import java.util.Scanner;

public class IncreasingNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int value = 1;
        for(int row=1; row<=n; row++){
            for(int column=1; column<=row; column++){
                System.out.print(value+ " ");
                value++;
            }
            System.out.println();
        }
    }
}

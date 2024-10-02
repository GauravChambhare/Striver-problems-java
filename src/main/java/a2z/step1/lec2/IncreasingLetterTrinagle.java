package a2z.step1.lec2;

import java.util.Scanner;

public class IncreasingLetterTrinagle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Write your code here

        for(int row=1; row<=n; row++){
            char letter ='A';
            for(int column=1; column<=row; column++){
                // char letter ="A";
                System.out.print(letter + " ");
                letter = (char)(letter + 1);

            }
            System.out.println();
        }

    }
}

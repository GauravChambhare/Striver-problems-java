package a2z.step1.lec2;

import java.util.Scanner;

public class Alpha_Ramp {

    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char letter ='A';
        for(int row=1; row<=n; row++){

            for(int column=1; column<=row; column++){
                // char letter ="A";
                System.out.print(letter + " ");
            }
            System.out.println();
            letter = (char)(letter + 1);
        }
    }
}

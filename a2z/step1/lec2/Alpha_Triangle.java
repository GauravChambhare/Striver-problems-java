package a2z.step1.lec2;

import java.util.Scanner;

public class Alpha_Triangle {
    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1; row<=n; row++){
            char val = (char)('A' + n);
            for(int col=1; col<=row; col++){
                val = (char)(val-1);
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

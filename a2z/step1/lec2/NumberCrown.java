package a2z.step1.lec2;

import java.util.Scanner;

public class NumberCrown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row=1; row<=n; row++){
            for(int lp=1; lp<=row; lp++){
                System.out.print(lp + " ");
            }
            for(int space=1; space < 2*(n-row); space++){
                System.out.print(" ");
            }
            for(int rp=row; rp>0; rp--){
                System.out.print(rp+ " ");
            }
            System.out.println();
        }
    }
}

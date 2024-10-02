package a2z.step1.lec2;

import java.util.Scanner;

public class AlphaHill {
    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Write your code here

        // rows
        for(int row=1; row<=n; row++){

            //print spaces
            for(int space=1; space<=2*(n-row); space++){
                System.out.print(" ");
            }
            // print pattern
            char val = 'A';
            for(int k=0; k<2*row-1; k++){
                System.out.print(val+" ");
                if(k>=(2*row-1)/2){
                    val--;
                }
                else{val++;}
            }
            //print spaces
            for(int space=1; space<=2*(n-row); space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
*4
      A
    A B A
  A B C B A
A B C D C B A
* */

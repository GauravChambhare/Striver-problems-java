package a2z.step1.lec2;

import java.util.Scanner;

public class SymmetricVoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row= 0; row<n; row++){
            for(int star=0; star<n-row; star++){
                System.out.print("* ");
            }
            for(int space=1; space<=4*row; space++){
                System.out.print(" ");
            }
            for(int star=0; star<n-row; star++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int row= 0; row<n; row++){
            for(int star=0; star<row+1; star++){
                System.out.print("* ");
            }
            for(int space=1; space<=4*(n-1-row); space++){
                System.out.print(" ");
            }
            for(int star=0; star<row+1; star++){
                System.out.print("* ");
            }
            System.out.println();

        }
        sc.close();
    }
}

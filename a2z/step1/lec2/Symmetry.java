package a2z.step1.lec2;

import java.util.Scanner;

public class Symmetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Write your code here
        for(int row=0; row<n; row++){
            for(int star=0; star<row+1; star++){
                System.out.print("* ");
            }
            for(int space=1; space<=2*(n-1-row); space++){
                System.out.print("  ");
            }
            for(int star=0; star<row+1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=0; row<n-1; row++){
            for(int star=0; star<n-1-row; star++){
                System.out.print("* ");
            }
            for(int space=1; space<=2*(1+row); space++){
                System.out.print("  ");
            }
            for(int star=0; star<n-1-row; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

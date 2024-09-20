package a2z.step1.lec2;

import java.util.Scanner;

public class RotatedTriangle {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=0; row<n; row++){
            for(int star=0; star<row+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=n-1; row>0; row--){
            for(int star=0; star<row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

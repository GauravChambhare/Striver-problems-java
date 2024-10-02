package a2z.step1.lec2;

import java.util.Scanner;

public class NinjaAndTheStarPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // whenever position is on edges, star will print
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                if(col==0 || col==n-1 || row==0 || row==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

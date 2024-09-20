package a2z.step1.lec2;

import java.util.Scanner;

public class NinjaAndTheNumberPattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=0; row<(2*n-1); row++){
            for(int col=0; col<(2*n-1); col++){
                // for each position there will be min distance from
                // boundries of square and itself
                // if you have doubt about how this is the solution view below video
                // https://bit.ly/3vtRNJJ
                int left=col;
                int right=(2*n-2)-col;
                int top=row;
                int bottom=(2*n-2)-row;
                System.out.print(n-Math.min(Math.min(left, right),Math.min(top, bottom)));
            }
            System.out.println();
        }
        sc.close();
    }
}

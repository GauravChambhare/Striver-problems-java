package a2z.step1.lec2;

import java.util.Scanner;

public class N_by_2_Forest {
    public static void main(String args[]) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
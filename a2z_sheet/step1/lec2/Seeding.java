package a2z.step1.lec2;

import java.util.Scanner;

public class Seeding {
    public static void main(String args[]) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

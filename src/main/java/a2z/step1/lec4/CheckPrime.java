package a2z.step1.lec4;

import java.util.Scanner;
import  java.lang.Math;

public class CheckPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float t1 = System.nanoTime();
        if(n <=1) {
            System.out.println("NO");
            return;
        }
        int count = 0;

        for(int i =2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

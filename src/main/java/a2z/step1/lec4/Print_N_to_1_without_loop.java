package a2z.step1.lec4;

import java.util.Scanner;

public class Print_N_to_1_without_loop {
    public static void printNos(int N) {
        // base case
        if(N==1){
            System.out.print(N + " ");
            return;
        }
        // print statement
        System.out.print(N + " ");
        printNos(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n);
    }
}

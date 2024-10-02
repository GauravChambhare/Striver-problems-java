package a2z.step1.lec4;

import java.util.Scanner;

public class Print_1_to_N_without_loop {
    public static void printNos(int N)
    {
        // base case
        if(N==1){
            System.out.print(N + " ");
            return;
        }
        // recursive logic
        printNos(N-1);
        System.out.print(N + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n);
    }
}

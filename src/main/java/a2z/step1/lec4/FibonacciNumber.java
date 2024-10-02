package a2z.step1.lec4;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fib(int n) {
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }

        return fib(n-1) + fib(n-2);
    }
//    Iterative approach -- more optimised
    public static int fibiter(int N)
    {
        if(N <= 1)
            return N;

        int a = 0, b = 1;

        while(N-- > 1)
        {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // recursion approach
        System.out.println(fib(n));
        System.out.println(fibiter(n));

//        int a = 0, b = 1;
//
//        while(n-- > 1)
//        {
//            System.out.println("-------------------------" + n);
//            int sum = a + b;
//            a = b;
//            b = sum;
//            System.out.println(a + "  " + b);
//        }
    }
}

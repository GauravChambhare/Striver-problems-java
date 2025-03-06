/*
https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM&count=25&page=1&search=fibonacci&sort_entity=order&sort_order=ASC&attempt_status=COMPLETED&customSource=studio_nav

The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

    F(n) = F(n - 1) + F(n - 2), 
    Where, F(1) = 1, F(2) = 1
*/
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
        sc.close();

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

/*
https://www.naukri.com/code360/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

You are given a number ’n’.
Find the number of digits of ‘n’ that evenly divide ‘n’.
*/
package a2z.step1.lec4;

import java.util.Scanner;

public class CountDigits {
    static int evenlyDivides(int N){
        // code here
        int counter=0;
        int num = N;
        while(num > 0){

            int digit = num % 10;

                if (digit > 0 && N % digit == 0) {
                    counter++;
                }
            num /= 10;
//            System.out.println(num);
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(evenlyDivides(n));
        sc.close();

    }
}

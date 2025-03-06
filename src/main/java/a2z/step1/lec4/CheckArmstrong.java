/*
https://www.naukri.com/code360/problems/check-armstrong_589?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to 
the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.
*/

package a2z.step1.lec4;
import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = String.valueOf(n).length();
        int copy = n;
        int sum = 0;
        while(copy > 0){
            sum = (int) (sum + Math.pow((copy % 10), power));
            copy /= 10;
        }
        System.out.println(sum == n);
        sc.close();
    }
}

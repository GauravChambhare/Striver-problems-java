package a2z.step1.lec4;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int revNum = 0;
        int original = x;
        if(x < 0 || x % 10 ==0 && x !=0 ){
            return false;
        }
        while(x > 0){
            int ld = x % 10;
            if( ld !=0 && revNum > (Integer.MAX_VALUE - ld )/10){
                return false; // false if it causes overflow
            }
            revNum = revNum*10 + ld;
            x /= 10;
        }
        return original == revNum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}

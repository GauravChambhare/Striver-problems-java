package a2z.step1.lec4;

import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x) {
        /*
        Below approach fails solution wise as question has explicitly stated a constraint
        "Assume the environment does not allow you to store 64-bit integers (signed or unsigned)."
        // int remainder = 0;
        long reverseNum = 0;
        boolean is_negative = x < 0;
        x = Math.abs(x);
        while(x > 0){
            int remainder = x % 10;
            reverseNum = 10*reverseNum + remainder;
            x /= 10;
        }

        if(is_negative){
            reverseNum =  -reverseNum;
        }

        if( reverseNum > Integer.MAX_VALUE || reverseNum < Integer.MIN_VALUE){
            return 0;
        }
        else {
            return (int) reverseNum;
        }

        // THis is another approach that could be tried using recursion
        public int reverse(int x) {
    return reverseHelper(Math.abs(x), 0, x < 0);
}

private int reverseHelper(int num, int rev, boolean isNegative) {
    if (num == 0) {
        return isNegative ? -rev : rev;
    }
    if (rev > (Integer.MAX_VALUE - num % 10) / 10) {
        return 0;  // Overflow check
    }
    return reverseHelper(num / 10, rev * 10 + num % 10, isNegative);
}


        // below is the correct approach
         */
        int rev =0;
        int orignal = x;
        x= Math.abs(x);
        while(x != 0){
            int digit = x % 10;
            if(rev > (Integer.MAX_VALUE - digit)/10){
                return 0;
            }
            rev = 10*rev + digit;
            x /= 10;
        }
        return orignal <0 ? -rev : rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));

    }
}

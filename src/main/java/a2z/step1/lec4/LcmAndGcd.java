package a2z.step1.lec4;

import java.util.Arrays;
import java.util.Scanner;

public class LcmAndGcd {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long[] result = new Long[2];
        result[1] = Gcd(A, B);  // GCD
        result[0] = (A * B) / result[1];  // LCM using the formula: LCM * GCD = A * B
        return result;
    }

    static Long Gcd(Long A, Long B) {
        if (B == 0) return A;
        return Gcd(B, A % B);
    }
    /*second method
        Long o[]=new Long[2];

        long first = A;
        long second = B;
        while(second!=0){
            long temp = second;
            second = first%second;
            first = temp;
        }


        o[0]=A*B/first;
        o[1]=first;
        return o;*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long m = sc.nextLong();
        System.out.println(Arrays.toString(lcmAndGcd(n, m)));

    }
}

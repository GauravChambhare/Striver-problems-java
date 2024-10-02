package a2z.step1.lec4;

import java.util.Scanner;

public class Sum_of_first_n_terms {
    static long sum = 0;
    public static long sumOfSeries(long n) {
        // code here

        if(n==1){
            sum = sum + 1;
            return sum;
        }
        sum = sum + n*n*n;
        sumOfSeries(n-1);

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfSeries(n));
    }
}

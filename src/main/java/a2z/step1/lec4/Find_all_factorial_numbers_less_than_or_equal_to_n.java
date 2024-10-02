package a2z.step1.lec4;
import  java.util.ArrayList;
import java.util.Scanner;

public class Find_all_factorial_numbers_less_than_or_equal_to_n {
    public static ArrayList<Long> factorialNumbers(long n) {
        // code here
        long factorial_number = 1;
        int i = 1;
        ArrayList<Long> list = new ArrayList<>();
        while(factorial_number<=n){
            list.add(factorial_number);
            i++;
            factorial_number = i*factorial_number;
        }
        return list;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(factorialNumbers(n));
    }
}

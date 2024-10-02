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
    }
}

package a2z.step1.lec2;
import java.util.Scanner;
public class Triangle {
    public static void main(String args[]) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

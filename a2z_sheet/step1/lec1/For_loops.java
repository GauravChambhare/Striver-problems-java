import java.util.Scanner;
public class Solution {


    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("1");
        }
        else if(num == 2){
            System.out.println("1");
        }
        else {
            int a = 1;
            int b = 1;
            int ans = 0;
            for(int i =0; i< num - 2; i++){
                ans = a + b;
                a = b;
                b = ans;
            }
            System.out.println(ans);

        }


    }

}

/*
import java.util.Scanner;
public class Solution {

    public static int fibonacci(int n){
        // int ans;
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        else if {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
/*
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println(fibonacci(val));

    }

}
*/

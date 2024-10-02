package a2z.step1.lec1;

import java.util.Scanner;
public class ForLoop {


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


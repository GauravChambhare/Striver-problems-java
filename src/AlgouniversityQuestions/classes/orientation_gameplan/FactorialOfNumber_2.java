package AlgouniversityQuestions.classes.orientation_gameplan;
import java.util.Scanner;

public class FactorialOfNumber_2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        short nums = sc.nextShort();
        for(Short s = 0; s<nums; s++){
          System.out.println(Factorial(sc.nextInt()));
        }
      }
      // we need to use long to store num value from input as factorial gets quite big and overshoots int types storage range.
      /*avoid recursion as for bigger values of input, we might encounter stack overflow and it also uses increasing memory in form 
      of stack frames */
      /*
      public static long Factorial(long num){
        if(num == 0) return 1;
        if(num == 1) return 1;
        num = num*Factorial(num-1);
        return num;
      }
        */
        public static long Factorial(int num){
            long result = 1;
            for(int i=2; i<=num; i++){
                result *= i;
            }
            return result;
        }
    /*  
     *  Approach	  Time	Space	 Risk of Overflow	  Interview Suitability
     *  ------------------------------------------------------------------------------
        Iterative	  O(n)	O(1)	 Only on overflow	  Best for clarity and safety 
        Recursive	  O(n)	O(n)	 Stack overflow	    Elegant but less robust
        BigInteger	O(n)	O(n)	 None (w/Big N)	    Use for huge results 

     */
}

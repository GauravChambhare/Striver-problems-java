package AlgouniversityQuestions.orientation_gameplan;
import java.util.Scanner;

public class ReverseANumber_1{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        for(int i=0; i<nums; i++){
          System.out.println(Reverse(sc.nextInt()));
        }
    }
    
    public static int Reverse(int no){
      int reverse = 0;
      while(no!=0){
        int digit = no%10;
        reverse = 10*reverse + digit;
        no /= 10;
        }
        return reverse;
    }
}


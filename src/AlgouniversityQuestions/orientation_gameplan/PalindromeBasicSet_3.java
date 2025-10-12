package AlgouniversityQuestions.orientation_gameplan;

import java.util.Scanner;

public class PalindromeBasicSet_3 {
	  public static void main(String[] args) {

    // System.out.println("Hello World");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i=0; i< n; i++){
      int num = sc.nextInt();
      System.out.println(isPalindrome(num));
    }
  }
  
  public static String isPalindrome(int num){
    int dup = num;
    int rev = 0;
    while(dup!=0){
      int d = dup%10;
      rev = rev*10 + d;
      dup /= 10;
    }
    return rev==num ? "Yes": "No";
  }
}

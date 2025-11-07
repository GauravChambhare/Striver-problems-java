package AlgouniversityQuestions.classes.orientation_gameplan;

import java.util.Scanner;

public class CountWords_5 {
      public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int res = 1;
    for(int i=0; i < str.length(); i++){
      if(str.charAt(i)==' '){  // no. of ' ' in a sentence + 1 will be the no. of words present in sentence.
        res+=1;
      }
    }
    System.out.println(res);

  }
}

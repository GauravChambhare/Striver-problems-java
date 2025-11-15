//  We are checking the case for input character
package AlgouniversityQuestions.classes.orientation_gameplan;

import java.util.Scanner;

public class CheckCharacter_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        message(sc);
    }
    
    public static void message(Scanner sc) {
        String c = sc.nextLine();
        if(c.length()!=1 || !Character.isLetter(c.charAt(0))) {
          System.out.println("error");
          return;
        }
      
        if(c.equals(c.toLowerCase())){ 
          System.out.println("lower");
        }
        else {
          System.out.println("upper");
        }
    }
}

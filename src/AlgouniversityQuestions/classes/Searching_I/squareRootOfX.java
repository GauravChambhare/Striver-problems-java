package AlgouniversityQuestions.classes.Searching_I;
import java.util.Scanner;
public class squareRootOfX {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //we have to find the sqr root of x now.
        double l=0, r=x, steps=150;
        while(steps-- >0){
            double m = (l+r)/2;
            if(predicate(m,x)==false){
                l=m;
            } else {
                r=m;
            }

        }
        System.out.println("Square root of "+x+" is "+l);
    }
    public static boolean predicate(double m, int x){
        return m*m>=x;
    }
    
}

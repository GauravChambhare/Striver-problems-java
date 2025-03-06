/*
https://www.geeksforgeeks.org/problems/triangle-pattern-1662285911/0?ref=gcse_ind
   A
  ABA
 ABCBA
ABCDCBA
*/

package a2z.step1.lec2;

public class Pattern_17 {
    public static void main(String[] args) {
        printTriangle(4);
    }
    public static void printTriangle(int n) {
        for(int row=1; row<=n; row++){
            for(int space=1; space<=n-row; space++){
                System.out.print(" ");
            }
            char c = 'A';
            for(int letter=1; letter<=row; letter++){
                System.out.print(c);
                c +=1;
            }
            c -=2;
            for(int letter=1; letter<row; letter++){
                System.out.print(c);
                c -=1;
            }
            System.out.println();
        }
    }
}

/*
https://www.geeksforgeeks.org/problems/triangle-pattern-1662286302/0?ref=gcse_ind
E
E D
E D C
E D C B
E D C B A
*/

package a2z.step1.lec2;


public class Pattern_18 {
    public static void main(String[] args) {
        Pattern_18 pattern = new Pattern_18();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }
    
    void printTriangle(int n) {
        // code here
        for(int row=1; row<=n; row++){
            char c = 'A';
            c +=n-1;
            for(int col=0; col<row; col++){
                System.out.print(c+" ");
                c -=1;
            }
            System.out.println();
        }
    }
}

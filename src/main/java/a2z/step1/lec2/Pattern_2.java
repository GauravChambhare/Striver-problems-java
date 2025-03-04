/*
https://www.geeksforgeeks.org/problems/right-triangle/1
* 
* * 
* * * 
* * * * 
* * * * *
*/
package a2z.step1.lec2;

public class Pattern_2 {
    void printTriangle(int n) {
        // code here
        for(int row=1; row <=n; row++){
            for (int col=0; col<row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_2 pattern = new Pattern_2();
        pattern.printTriangle(10);  // You can change the value to print a triangle with different height
    }
}

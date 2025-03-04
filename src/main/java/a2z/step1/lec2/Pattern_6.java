/*
https://www.geeksforgeeks.org/problems/triangle-number-1661489840/0?ref=gcse_ind
1 2 3 4 5
1 2 3 4
1 2 3 
1 2  
1
*/

package a2z.step1.lec2;

public class Pattern_6 {
    public static void main(String[] args) {
        Pattern_6 pattern = new Pattern_6();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }
    void printTriangle(int n) {
        for(int row=n; row>0; row--){
            for(int col=1; col<=row; col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }       
    }
}

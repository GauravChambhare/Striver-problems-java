/*
 https://www.geeksforgeeks.org/problems/triangle-number/0?ref=gcse_ind
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
*/

package a2z.step1.lec2;

public class Pattern_3 {
    public static void main(String[] args) {
        Pattern_3 pattern = new Pattern_3();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }
    void printTriangle(int n) {
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    
}

/*
https://www.geeksforgeeks.org/problems/triangle-pattern-1662285334/0?ref=gcse_ind
A
BB
CCC
DDDD
EEEEE
*/

package a2z.step1.lec2;

public class Pattern_16 {
    public static void main(String[] args) {
        Pattern_16 pattern = new Pattern_16();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }
    void printTriangle(int n) {
        char val = 'A';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(val);
            }
            System.out.println();
            val +=1;
        }
    }
    
}

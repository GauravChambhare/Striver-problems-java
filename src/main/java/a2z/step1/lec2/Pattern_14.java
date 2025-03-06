/*
https://www.geeksforgeeks.org/problems/triangle-pattern-1662284916/0?ref=gcse_ind
A
AB
ABC
ABCD
ABCDE
*/

package a2z.step1.lec2;

public class Pattern_14 {
    public static void main(String[] args) {
        Pattern_14 pattern = new Pattern_14();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }
    void printTriangle(int n) {
        
        for(int i=1; i<=n; i++){
        char c = 'A';
        for(int j=0; j<i; j++){
           System.out.print(c);
           c += 1;
        }
        System.out.println();
    }
    }
    
}

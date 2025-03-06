/*
https://www.geeksforgeeks.org/problems/triangle-pattern-1662285196/0?ref=gcse_ind
ABCDE
ABCD
ABC
AB
A
*/

package a2z.step1.lec2;

public class Pattern_15 {

    public static void main(String[] args) {
        Pattern_15 pattern = new Pattern_15();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }
    void printTriangle(int n) {
        for(int i=1; i<=n; i++){
            char c = 'A';
            for(int j=n-i; j>=0; j--){
               System.out.print(c);
               c += 1;
            }
        System.out.println();
        }
    }
}

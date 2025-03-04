/*
https://www.geeksforgeeks.org/problems/triangle-pattern/1&selectedLang=javascript?ref=gcse_ind
* * * * *
* * * * 
* * * 
* *  
* 
*/
package a2z.step1.lec2;

public class Pattern_5 {
    public static void main(String[] args) {
        Pattern_5 pattern = new Pattern_5();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }
    void printTriangle(int n) {
        for(int i=n; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

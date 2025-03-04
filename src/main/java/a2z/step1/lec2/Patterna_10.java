/*
https://www.geeksforgeeks.org/problems/triangle-pattern-1661718013/1&selectedLang=javascript?ref=gcse_ind
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*/
package a2z.step1.lec2;

public class Patterna_10 {
    public static void main(String[] args) {
        Patterna_10 pattern = new Patterna_10();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }

    void printTriangle(int n) {
        for(int row=1; row<=n; row++){
            for(int col=0; col<row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=n-1; row>0; row--){
            for(int col=row; col>0; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}

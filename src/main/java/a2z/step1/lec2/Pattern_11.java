/*
https://www.geeksforgeeks.org/problems/triangle-pattern-1661718455/0?ref=gcse_ind
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1
*/

package a2z.step1.lec2;

public class Pattern_11 {
    public static void main(String[] args) {
        printTriangle(10);
    }

    public static void printTriangle(int n) {
        for(int row=1; row<=n; row++){
            int start = row%2;
            for(int col=0; col<row; col++){
                System.out.print(start+" ");
                start = Math.abs(start - 1);
            }
            System.out.println();
        }
    }
    
}

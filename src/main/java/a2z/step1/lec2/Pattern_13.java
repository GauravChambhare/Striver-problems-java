/*
https://www.geeksforgeeks.org/problems/triangle-pattern-1661718712/0?ref=gcse_ind
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/

package a2z.step1.lec2;

public class Pattern_13 {
    public static void main(String[] args) {
        Pattern_13 pattern = new Pattern_13();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }

    void printTriangle(int n) {
        int counter = 1;
        for(int row=1; row <=n; row++){
            for(int col=0; col<row; col++){
                System.out.print(counter+" ");
                counter +=1;
            }
            System.out.println();
        }
    }
}

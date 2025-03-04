
/*
https://www.geeksforgeeks.org/problems/triangle-number-1661428795/0?ref=gcse_ind

1
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
*/
package a2z.step1.lec2;

public class Pattern_4 {
    public static void main(String[] args) {
        Pattern_4 pattern = new Pattern_4();
        pattern.printTriangle(5);  // You can change the value to print a triangle with different height
    }

    void printTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
}

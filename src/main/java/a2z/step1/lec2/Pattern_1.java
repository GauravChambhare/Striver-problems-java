/*
 https://www.geeksforgeeks.org/problems/square-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_1
* * *
* * *
* * * 
*/
package a2z.step1.lec2;

class Pattern_1 {

    void printSquare(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_1 pattern = new Pattern_1();
        pattern.printSquare(3);  // You can change the value to print a triangle with different height
    }
}
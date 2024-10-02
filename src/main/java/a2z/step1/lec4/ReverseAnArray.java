package a2z.step1.lec4;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements will you be storing in your array?");
        int no = sc.nextInt();
        int[] arr = new int[no];// new array of length the user wants
        for(int i=0; i<no; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        System.out.println("Reversed array:");
        for (int j : arr) {  //this iterates over the elements of array arr
            System.out.print(j + " ");
        }
    }
    public static void reverseArray(int[] arr) {
        // code here
        int p1 = 0;
        int p2 = arr.length-1;
        // System.out.println(p1+ " " +p2);
        int temp;
        while(p1<p2){
            temp = arr[p2];
            arr[p2] = arr[p1];
            arr[p1] = temp;
            p1++;
            p2--;
        }
    }
    /*This is another approach that can be taken
        public void reverseArray(int[] arr) {
        // code here
        int start=0;
        helper(arr, start, arr.length-1);
    }
    public void helper(int[] arr, int start, int end){

        if(start>=arr.length/2){
            return;
        }
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;

        helper(arr, start+1, end-1);
        return;
    }
    * */
}

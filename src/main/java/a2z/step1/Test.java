package a2z.step1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void sort(int[] data){
        for(int i=0; i< data.length; i++) {

            for (int j = 0; j < i; j++) {
                if (data[i] < data[j]) {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
    }

    public static Boolean isPalindrome(int num){

        String str = Integer.toString(num);
        if(str.length()==1){return true;}
        int len = str.length();
        for(int x=0; x<=len/2; x++){
            if(str.charAt(x)==str.charAt(len-1-x)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr = {7,3,1,9,4,5,2};
        sort(arr);
//        System.out.println(arr.);
//        for(int x=0; x <arr.length; x++){
//            System.out.println(arr[x]);
//        }
        Boolean value = isPalindrome(87981);
        System.out.println(value);
    }
}

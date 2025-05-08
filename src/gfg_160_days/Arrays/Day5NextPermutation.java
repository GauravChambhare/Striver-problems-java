/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226

Next Permutation

*/

package gfg_160_days.Arrays;

public class Day5NextPermutation {

    public static void nextPermutation(int[] arr) {
        //i got what I am being asked. i also got the pattern used to solve this 2ptr
        // if(arr.length<=2) return Array
    // step 1
    int l = arr.length;
    int i = l - 2;
    // find i
    while(i>=0 && arr[i]>=arr[i+1]){
        i--;
    }
    
    // step 2 swap
    if(i>=0){
        int j = l-1;
        while(arr[i]>=arr[j]){
            j--;
        }
        swap(arr, i, j);
    }
    // reverse the sublist from i to l-1
    reverse(arr, i+1, l-1);
    
    }
    
    public static void reverse(int [] arr, int left, int right){
        while(left<right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 8, 5, 0, 9};
        nextPermutation(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 1 4 3 8 5 9 0
    }
}
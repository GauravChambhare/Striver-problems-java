package a2z.step1.lec4;

import java.util.Scanner;

public class Frequencies_of_limited_range_array_elements {

    public static void frequencyCount(int arr[], int N, int P) {
        int i = 0;
        while (i < N) {
            // Ignore elements that are out of the range [1, P]
            if (arr[i] <= 0 || arr[i] > P) {
                i++;
                continue;
            }

            // Get index corresponding to current element (1-based to 0-based)
            int elementIndex = arr[i] - 1;

            // If element at elementIndex hasn't been processed yet (i.e., positive value)
            if (elementIndex < N && arr[elementIndex] > 0) {
                // Store the current element value and mark the position with -1
                int temp = arr[i];  // Store current element
                arr[i] = arr[elementIndex];  // Replace with the value at that index
                arr[elementIndex] = -1;  // Mark the element as seen once
            } else if (elementIndex < N) {
                // If already processed, decrement its value (it is stored as negative)
                arr[elementIndex]--;
                // Set current element to 0 as it's now processed
                arr[i] = 0;
                i++;
            } else {
                // Handle elements greater than N
                i++;
            }
        }

        // Second pass to adjust counts
        for (int k = 0; k < N; k++) {
            if (arr[k] < 0)
                arr[k] = -arr[k]; // Convert counts back to positive
            else
                arr[k] = 0; // Set positions where element didn't appear to 0
        }
    }
/*
    public static void frequencyInPlace(int[] arr, int n, int p){
        int i=0;
        while(i<n){

            if(arr[i]>0 && arr[i]<=n ){
                int j = arr[i] - 1;//calculating new index iff arr[i] = 2 then we will go to index position 1
                if(arr[j]<0){
                    arr[i]=0; // this means we have finished checking for arr[i]
                    arr[j] -=1;
                    i++;
                }
                else{
                    arr[i] = arr[j];
                    arr[j] = -1;
                }
            } else if (arr[i] > p) {
                arr[i] = 0;
                i++;
            }
            else{ // this is condition where arr[i] <=0 it means this is frequency, and we have to ignore it.
                i++;
            }
        }
        for(int k=0; k<n; k++){
            arr[k] = -arr[k];
        }
    }
    */



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements will you be storing in your array?");
        int N = sc.nextInt();
        System.out.println("What is the range till which individual elements can be?");
        int P = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        frequencyCount(arr, N, P);
//        frequencyInPlace(arr, N, P);

        System.out.println("------------ Frequencies are as below ------------");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

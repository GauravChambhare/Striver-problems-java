/*
https://leetcode.com/problems/rotate-array/

189. Rotate Array

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

package a2z.step3.lec1;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        // we will use reversing algorithm for this problem.
        //rev till d-1
        int n = nums.length;
        k %= n; // Handle cases where k >= n
        if (k == 0) return;
        
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start+=1;
            end-=1;

        }
    }
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: [5, 6, 7, 1, 2, 3, 4]
    }
    
}

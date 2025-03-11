/*
https://leetcode.com/problems/maximum-average-subarray-i/description/
Prefix sum
643.
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
*/

package faang_questions.string_arrays;

public class MaximumAverageSubarray1{

    public double findMaxAverage(int[] nums, int k) {
        int left = 0, right =k; 
        double curSum =0;
        for(int i=0; i<right;i ++){
            curSum += nums[i];
        }
        double max = curSum/k;
        while(right<nums.length){
            curSum += nums[right] - nums[left];
            max = Math.max(max, curSum/k);
            right++;
            left++;
        }
        return max;
    }
    public static void main(String[] args) {
        MaximumAverageSubarray1 mas = new MaximumAverageSubarray1();
        System.out.println(mas.findMaxAverage(new int[]{1,12,-5,-6,50,3, 21}, 3));
    }

}
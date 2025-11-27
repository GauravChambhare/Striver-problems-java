/*
https://leetcode.com/problems/move-zeroes/

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
*/

package Leetcode_self_study.Arrays;

import java.util.Arrays;


public class MoveZeroes_283 {
    public static void moveZeroes(int[] nums) {
        int sptr = 0;
        for( int fptr=0; fptr < nums.length; fptr++){
            if(nums[fptr]!=0){
                nums[sptr++]=nums[fptr];
            }
        }
        while(sptr<nums.length){
            nums[sptr++]=0;
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {4, 0, 8, 7,0, 2, 1, 0, 0, 9, 1, 0, 10};
        moveZeroes(nums); 
        System.out.println(Arrays.toString(nums));

    }
}

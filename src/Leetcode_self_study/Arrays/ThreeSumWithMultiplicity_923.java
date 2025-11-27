/*
https://leetcode.com/problems/3sum-with-multiplicity/
923. 3Sum With Multiplicity
Given an integer array arr, and an integer target, return the number of tuples i, j, k such that i < j < k and arr[i] + arr[j] + arr[k] == target.

As the answer can be very large, return it modulo 109 + 7.

 

Example 1:

Input: arr = [1,1,2,2,3,3,4,4,5,5], target = 8
Output: 20
Explanation: 
Enumerating by the values (arr[i], arr[j], arr[k]):
(1, 2, 5) occurs 8 times;
(1, 3, 4) occurs 8 times;
(2, 2, 4) occurs 2 times;
(2, 3, 3) occurs 2 times.
Example 2:

Input: arr = [1,1,2,2,2,2], target = 5
Output: 12
Explanation: 
arr[i] = 1, arr[j] = arr[k] = 2 occurs 12 times:
We choose one 1 from [1,1] in 2 ways,
and two 2s from [2,2,2,2] in 6 ways.
Example 3:

Input: arr = [2,1,3], target = 6
Output: 1
Explanation: (1, 2, 3) occured one time in the array so we return 1.
 

Constraints:

3 <= arr.length <= 3000
0 <= arr[i] <= 100
0 <= target <= 300
*/


package Leetcode_self_study.Arrays;

public class ThreeSumWithMultiplicity_923 {
    public int threeSumMulti(int[] arr, int target) {
        long mod = (long)1e9 + 7;
        long[] count = new long[101]; // Frequency array for numbers 0 to 100
        for (int num : arr) {
            count[num]++;
        }

        long answer = 0;
        // Iterate through all pairs of numbers
        for (int i = 0; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {
                int k = target - i - j;
                if (k < 0 || k > 100) continue; // Skip invalid k

                if (i == j && j == k) {
                    // Case (x, x, x): All numbers are the same
                    answer += (count[i] * (count[i] - 1) * (count[i] - 2)) / 6;
                } else if (i == j && j != k) {
                    // Case (x, x, y): Two numbers are the same
                    answer += (count[i] * (count[i] - 1) / 2) * count[k];
                } else if (i < j && j < k) {
                    // Case (x, y, z): All numbers are different
                    answer += count[i] * count[j] * count[k];
                }
            }
        }
        return (int)(answer % mod);
    }

    public static void main(String[] args) {
        ThreeSumWithMultiplicity_923 solver = new ThreeSumWithMultiplicity_923();

        // Sample test case
        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        int target = 8;
        int result = solver.threeSumMulti(arr, target);

        System.out.println(result); // Output: 20 (Leetcode 923 example)
    }
}

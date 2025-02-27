
// You will need to be able to iterate through a hashmap or hashtable for solving this question
//https://www.geeksforgeeks.org/how-to-iterate-through-hashtable-in-java/
/*
* Given an array 'v' of 'n' numbers.

Your task is to find and return the highest and lowest frequency elements.

If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.

Example:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]
Output: 1 2

Explanation: The element having the highest frequency is '1', and the frequency is 3. The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
6
1 2 3 1 1 4
Sample Output 1 :
1 2
Sample Explanation 1:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]
Output: 1 2

Explanation: The element having the highest frequency is '1', and the frequency is 3. The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].
Sample Input 2 :
6
10 10 10 3 3 3
Sample Output 2 :
3 3
Sample Explanation 2:
Input: ‘n' = 6, 'v' = [10, 10, 10, 3, 3, 3]
Output: 3 3

Explanation: Since the frequency of '3' and '10' is 3. Therefore, the element with the maximum and minimum frequency is '3'.
Expected Time Complexity :
The expected time complexity is O(n), where n is the size of the array.
Expected Space Complexity :
The expected time complexity is O(n), where n is the size of the array.
Constraints :
2 <=  n <= 10^4
1 <= v[i] <= 10^9
There are at least two distinct elements in the array.
Time Limit: 1 sec

* // use HashMap in place of hashmap as we are not concerned with concurrency here.
* */
package a2z.step1.lec5;
import java.util.*;

public class highestOrLowestFrequencyElements {

    public static int[] highLowFrequency(int[] v){
//        hashmap<Integer, Integer> hashmap = new hashmap<>();
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int j : v) {
            hashmap.put(j, hashmap.getOrDefault(j, 0) + 1);
        }
        int[] res = new int[2];
        System.out.println(hashmap);
        // we created a new set consisting of keys present in hashmap as we wanted to later iterate over hashmap key-wise
        Set<Integer> setOfKeys = hashmap.keySet();
        System.out.println(setOfKeys);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int max_key = Integer.MAX_VALUE;
        int min_key = Integer.MIN_VALUE;

        for(Integer k : setOfKeys){
            int freq = hashmap.get(k);
            if(freq > max || (freq ==max && k < max_key)){
                max = hashmap.get(k);
                max_key = k;
            }
            if(freq < min || (freq ==min && k < min_key)){
                min = freq;
                min_key = k;
            }
        }
        res[0] = max_key;
        res[1] = min_key;


        System.out.println("Max frequency is of: "+ max_key +'\t' + "Min frequency is of: "+ min_key);
        return res;
    }

    public static void main(String[] args) {

//        int[] arr = {1, 2, 3, 1, 1, 4};
        int[] arr = {10, 10, 10, 3, 3, 3};
        System.out.println(Arrays.toString(highLowFrequency(arr)));
//        System.out.println(highLowFrequency(arr));
//        System.out.println("Enter array elements");


    }
}

//below is the solution of chatgpt
/*import java.util.HashMap;
import java.util.Map;

public class highestOrLowestFrequencyElements {

    public static void highLowFrequency(int[] v) {
        // Using HashMap instead of Hashtable
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate frequency map
        for (int num : v) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Initialize variables for tracking min and max frequency
        int maxKey = Integer.MAX_VALUE, minKey = Integer.MAX_VALUE;
        int maxFrequency = Integer.MIN_VALUE, minFrequency = Integer.MAX_VALUE;

        // Single loop to find max and min frequency elements
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            // Check for max frequency
            if (freq > maxFrequency || (freq == maxFrequency && key < maxKey)) {
                maxFrequency = freq;
                maxKey = key;
            }

            // Check for min frequency
            if (freq < minFrequency || (freq == minFrequency && key < minKey)) {
                minFrequency = freq;
                minKey = key;
            }
        }

        // Print result
        System.out.println("Max frequency is of: " + maxKey + "\t" + "Min frequency is of: " + minKey);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 4};
        highLowFrequency(arr);
    }
}
*/
package Leetcode_self_study.Arrays;

public class ConsecutiveCharacters_1446 {
    
    // Method to find the maximum length of consecutive characters
    public int maxPower(String s) {
        int maxLen = 1;
        int curr = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                curr = 1;
            }
            maxLen = Math.max(maxLen, curr);
        }
        
        return maxLen;
    }
    
    // Main method to test locally
    public static void main(String[] args) {
        ConsecutiveCharacters_1446 solver = new ConsecutiveCharacters_1446();
        
        String test1 = "leetcode";
        String test2 = "abbcccddddeeeeedcba";
        String test3 = "triplepillooooow";
        String test4 = "hooraaaaaaaaaaay";
        String test5 = "tourist";
        
        System.out.println("Power of string " + test1 + " is " +solver.maxPower(test1)); // Output: 2
        System.out.println("Power of string " + test2 + " is " +solver.maxPower(test2)); // Output: 5
        System.out.println("Power of string " + test3 + " is " +solver.maxPower(test3)); // Output: 5
        System.out.println("Power of string " + test4 + " is " +solver.maxPower(test4)); // Output: 11
        System.out.println("Power of string " + test5 + " is " +solver.maxPower(test5)); // Output: 1
    }
}

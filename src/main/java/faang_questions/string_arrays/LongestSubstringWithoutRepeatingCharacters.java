package faang_questions.string_arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0; // Left pointer of the sliding window
        Set<Character> charSet = new HashSet<>(); // Set to store unique characters in the current window
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the current character is already in the set, slide the window to the right
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character to the set
            charSet.add(currentChar);
            
            // Update the maximum length
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

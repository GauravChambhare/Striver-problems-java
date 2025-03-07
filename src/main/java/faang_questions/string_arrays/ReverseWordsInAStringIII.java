/*
https://leetcode.com/problems/reverse-words-in-a-string-iii/
*/

package faang_questions.string_arrays;

import java.util.Scanner;

public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        String[] words = s.split(" "); // split on basis of whitespace
        StringBuilder result = new StringBuilder();
        for(String word : words){
            StringBuilder reverse = new StringBuilder(word).reverse();
            // reverse each word in the list
            result.append(reverse).append(" ");
            // appending the reversed words and whitespace
        }
        // now removing extra whitespace at end
        if(result.length()>0){
            result.deleteCharAt(result.length() - 1);
        }
        // convert StringBuilder to String
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = sc.nextLine();
        System.out.println("Reversed string is: " + reverseWords(st));
        sc.close();
    }   
    
}

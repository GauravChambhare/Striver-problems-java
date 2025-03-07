package faang_questions.string_arrays;

import java.util.Scanner;

public interface ReverseWordInAString {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+"); // this splits s into words having spaces,tabs, nnewlines in between them.
        int left=0, right = words.length - 1;
        // this will replace the words
        while(left<right){
            // swap the wordds between right and left
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            right--;
            left++;
        }
        // concatinate the words with a space in between
        return String.join(" ", words);
        
        // for(String word: words){
        //     System.out.println(word);// I have checked that it is splitting words correctly.
        // }
        // return "";
        // public static String reverseWords2(String s) {
        //     String[] words = s.split("\\s+");
        //     StringBuilder res = new StringBuilder();
    
        //     for (int i = words.length - 1; i >= 0; i--) {
        //         res.append(words[i]);
        //         if (i != 0) {
        //             res.append(" ");
        //         }
        //     }
    
        //     return res.toString().trim();
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // reverseWords("Om Jai Jagdish hare");
        System.out.println("Enter a string: ");
        String st = sc.nextLine();
        System.out.println("Reversed string is: " + reverseWords(st));
        sc.close();
    }
}

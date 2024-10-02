package a2z.step1.lec4;

import java.util.Scanner;

public class ValidPalindrome {
    public static boolean checker(String s, int lp, int rp){
        // base case
        if(lp>=s.length()/2){
            return true;
        }
        // logic
        if(s.charAt(lp)!=s.charAt(rp)){
            return false;
        }
        //recursive call
        return checker(s, lp+1, rp-1);

    }

    public static boolean isPalindrome(String s) {
        // [^a-zA-Z] replace with blank
        s = s.trim();
        s = s.toLowerCase();
        String regex = "[^a-zA-Z0-9]";
        s = s.replaceAll(regex, "");
        // System.out.println(s);
        if(s.isEmpty()){
            return true;
        }
        int ptr=0;
        return checker(s, ptr, s.length()-1);


    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your string below");
//        String s = sc.next();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}

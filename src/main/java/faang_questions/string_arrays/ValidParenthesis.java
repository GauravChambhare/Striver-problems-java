/*  https://leetcode.com/problems/valid-parentheses/description/
Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.
*/
package faang_questions.string_arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        // declare a Hashmap containing mapping for brackets
        Map<Character, Character> map = new HashMap<>() {{
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }};
        // declare a stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            } else if   (map.containsValue(c)) {
                if (stack.isEmpty()) {// thiscondition has to be checked first before equals condition as if stack.peek() is empty it could casue error.
                    return false; // If the stack is empty and we encounter a closing bracket, it's invalid
                }
                if (!map.get(stack.peek()).equals(c)) {
                    return false; // If the closing bracket doesn't match the opening bracket on the stack, it's invalid
                }
                stack.pop(); // If it matches, pop the opening bracket from the stack
            }
        }
        return stack.isEmpty(); // Return true if the stack is empty at the end, meaning all brackets were matched
    }

    public static void main(String[] args) {
        String s = "[]({})";
        String s2 = "}";
        System.out.println(isValid(s2));

    }
}
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
        return false;
    }
    public static void main(String[] args) {
        
    }
}

/*
 * P59: Bracket Matching [Standard] :
 * https://www.algouniversity.com/problem/158/?asid=2016
*/
package StacksAndQueue;
import java.util.Deque;
import java.util.ArrayDeque;

public class P59BracketMatching {
    //ip ="((()()((()))))"
    public static int[] correspondingIndex(String s){
        int[] result = new int[s.length()];
        Deque<Integer> stk = new ArrayDeque<>();
        for(int idx=0; idx<s.length(); idx++){
            if(s.charAt(idx)==')'){
                if(!stk.isEmpty()){
                    int prev = stk.pop();
                    result[prev] = idx;
                    result[idx]  = prev;
                } else {
                    result[idx] = -1;
                }
            } else {
                stk.push(idx);
            }
        }
        while(!stk.isEmpty()){
            result[stk.pop()] =-1;
        }
        return result;

    }
    public static void main(String[] args) {
        String s1 = "(((())";
        String s2 = "())))((())";

        System.out.println("For "+s1+" :" );
        for(int i : correspondingIndex(s1)){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("For "+s2+" :" );
        for(int i : correspondingIndex(s2)){
            System.out.print(i+" ");
        }
    }
}

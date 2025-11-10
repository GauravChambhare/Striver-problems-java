/* -- [Standard] P8: Treasure Room Easy
You have been exploring the tomb of some long dead person. There is a treasure room here full of vast riches. However, the door to it requires some trickery to unlock. There are N
 blocks of varied lengths available to you. The i
-th block has length li
.

On both sides of the door, you must place one block each. Only when the sum of lengths of the blocks is equal to the width of the door will the door open. The width of the door is W
.

So, you should pick two blocks i
 and j
 such that li+lj=W
. Which blocks should you pick?

Input
Two integers on the first line, N
 W
.

N
 integers on the second line where the i
-th integer is li
.

Constraints
1≤N≤106

1≤W≤106

1≤li≤106

Output
Any two distinct integers i
 and j
 such that li+lj=W
. If it is impossible, output −1
.

Example 1
Input
7 8
7 5 3 6 9 2 9
Output
2 3
Example 2
Input
12 9
4 19 14 18 1 14 8 15 19 19 2 9
Output
5 7
Limits
Time: 10
s
Memory: 512
 MB
*/

package AlgouniversityQuestions.Assignment;

import java.util.*;

public class TreasureRoomEasy {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String[] tokens = line1.split(" ");
        int N = Integer.parseInt(tokens[0]);
        int W = Integer.parseInt(tokens[1]);
        String[] input = sc.nextLine().split(" ");
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int inx = 0; inx <input.length; inx++ ){
            int num = Integer.parseInt(input[inx]);
            if(num>=W){
            continue;
            }
            Integer complement = W - num;
            if(map.containsKey(complement) && num!=complement){
            System.out.print((inx+1)+ " " + map.get(complement));
            return;
            }
            else {
            map.put(num, inx + 1);
            }
        }
        System.out.print(-1);
        return;
        
    }
    
}
    

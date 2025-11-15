/* -- 
[Standard] P8: Treasure Room Easy
You have been exploring the tomb of some long dead person. There is a treasure room here full of vast riches. However, the door to it requires some trickery to unlock. There are N
 blocks of varied lengths available to you. The i-th block has length li

On both sides of the door, you must place one block each. Only when the sum of lengths of the blocks is equal to the width of the door will the door open. The width of the door is W

So, you should pick two blocks i and j such that li+lj=W Which blocks should you pick?

Input
Two integers on the first line, N, W

N integers on the second line where the i-th integer is li

Constraints
1≤N≤106

1≤W≤106

1≤li≤106

Output
Any two distinct integers i
 and j
 such that li+lj=W
 If it is impossible, output −1


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
Time: 10s
Memory: 512 MB
*/

package AlgouniversityQuestions.Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TreasureRoomEasy {
    static class FastReader {
      
        // BufferedReader to read input
        BufferedReader b;
      
        // StringTokenizer to tokenize input
        StringTokenizer s; 

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) { // next() method har baar agla token return karta hai, agar tokens khatam 
                // ho jate hain, to BufferedReader se new line read karke fresh tokens banata hai.
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace(); 
                }
            }
            return s.nextToken();
        }

        // Method to read the next token as an integer
        int nextInt() { 
            return Integer.parseInt(next()); 
        }

        // Method to read the next token as a long
        long nextLong() { 
            return Long.parseLong(next()); 
        }

        // Method to read the next token as a double
        double nextDouble() { 
            return Double.parseDouble(next()); 
        }

        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace(); 
            }
            return str;
        }
    }
    public static void main(String[] args) {
        /*

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
        */

        // Method 2. More optimal
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for( int i=1; i<=N; i++ ){
            int num = sc.nextInt();
            int complement = W - num;

            if(map.containsKey(complement)){
                System.out.println(map.get(complement) + " "+i);
                return;
            }
            else{
                map.putIfAbsent(num, i);
            }
        }
        System.out.println(-1);
        return;
    }
}
    

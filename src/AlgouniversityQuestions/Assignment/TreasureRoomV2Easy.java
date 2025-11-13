/*
Use Fast Input/Output in this Question

What is fast i/o & how you can implement it in your language:

C++: https://www.geeksforgeeks.org/fast-io-for-competitive-programming/
Java: https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
Python: https://www.geeksforgeeks.org/fast-i-o-for-competitive-programming-in-python/
You have been exploring the tomb of some long dead person. There is a treasure room here full of vast riches. However, the door to it requires some trickery to unlock. There are N
 blocks of varied lengths available to you. The i
-th block has length li
.

There are holders for three blocks, you must place one block on each holder. Only when the sum of lengths of the blocks is equal to the width of the door will the door open. The width of the door is W
.

So, you should pick three blocks i
, j
 and k
 such that li+lj+lk=W
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
1≤N≤104

1≤W≤106

1≤li≤106

Output
Any three distinct integers i
, j
 and k
 such that li+lj+lk=W
. If it is impossible, output −1
.

Example 1
Input
10 3
9 9 9 8 6 7 1 9 9 2
Output
-1
Example 2
Input
13 11
4 3 4 4 9 12 20 14 2 12 12 11 6
Output
1 2 3
Limits
Time: 1
s
Memory: 256
 MB
 * 
*/

import java.io.*;
import java.util.*;

public class TreasureRoomV2Easy {

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
        while (s == null || !s.hasMoreElements()) {
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
    // method 1
  public static void main(String[] args) {
    FastReader f = new FastReader();
    int N = f.nextInt();
    int W = f.nextInt();
    
    Integer[][] input = new Integer[N][2];
    
    for( int i=0; i<N; i++){
      int num = f.nextInt();
      input[i] = new Integer[] {num, i+1};
    }
    /*
    
    Integer[][] sortedIp = Arrays.stream(input)
                          .sorted((a, b) -> a[0].copareTo(b[0]))
                          .toArray(Integer[][]::new);
    */
    Arrays.sort(input, (a, b) -> a[0].compareTo(b[0]));

    for(int i=0; i<N-2; i++){
      int Wr = W-input[i][0];
      int lp = i+1;
      int rp = N-1;
      
      
      while(lp<rp){
        int sum = input[lp][0] + input[rp][0];
        if(sum ==Wr ){
          System.out.println(input[i][1]+" "+input[lp][1]+" "+input[rp][1]);
          return;
        }
        if(sum > Wr){
          rp--;
        }
        else{
          lp++;
        }
      }
    }
    System.out.print(-1);
    return;

    // Method 2
    class Block {
      int length, originalIndex;
      Block(int l, int idx) { length = l; originalIndex = idx; }
  }
  
  // Inside main method (after reading input):
  Block[] blocks = new Block[N];
  for (int i = 0; i < N; i++) blocks[i] = new Block(f.nextInt(), i + 1);
  Arrays.sort(blocks, Comparator.comparingInt(b -> b.length));
  
  for (int i = 0; i < N - 2; i++) {
      int target = W - blocks[i].length;
      int lp = i + 1, rp = N - 1;
      while (lp < rp) {
          int sum = blocks[lp].length + blocks[rp].length;
          if (sum == target) {
              System.out.println(blocks[i].originalIndex + " " + blocks[lp].originalIndex + " " + blocks[rp].originalIndex);
              return;
          } else if (sum < target) lp++;
          else rp--;
      }
  }
  System.out.println(-1);
  

  }
}
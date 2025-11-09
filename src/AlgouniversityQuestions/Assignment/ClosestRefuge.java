/*
You are given an integer N
. You are also given an array A
 consisting of N
 integers.

Find the first natural number that is not present in A
.

Natural numbers are positive integers.

Input
One integer N
 on the first line.

N
 integers on the second line. The i
-th integer is vi
.

Constraints
1≤N≤106

1≤vi≤109

Output
One integer --- the first natural number that is not present in A.

Example 1
Input
7
6 7 5 9 3 2 8
Output
1
Example 2
Input
13
7 1 4 3 7 6 5 8 6 7 2 6 2
Output
9
*/

package AlgouniversityQuestions.Assignment;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class ClosestRefuge {
    public static void main(String[] args) {
        
// there are multiple methods----------------------------------------------------------------

/* // Method 1

    Scanner sc = new Scanner(System.in);
    int len = Integer.parseInt(sc.nextLine());
    int[] ip = new int[len];
    String inputstring = sc.nextLine();
    String[] token = inputstring.split(" "); //split on basis of empty space
    // System.out.print(Arrays.toString(token));
    Set<Integer> track = new HashSet<Integer>();
    for(int i=0; i<token.length; i++ ){
      ip[i] = Integer.parseInt(token[i]);
      track.add(ip[i]);
    }   
    if(len==1 && ip[0]==1) { 
      System.out.print(2); 
      return;
    }
    else if (len==1 && ip[0]>1){
      System.out.print(--ip[0]);
      return;
    }
    for(int j=1; j<=len+1; j++){
        if(!track.contains(j)){
            System.out.println(j);
            return ;
        }
    }
    // Method 2. -- Instead of taking input in a array, direclty add it to hashset.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> track = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            track.add(sc.nextInt());
        }
        
        for (int i = 1; i <= N + 1; i++) {
            if (!track.contains(i)) {
                System.out.println(i);
                return;
            }
        }
    // Method 3. -- use a boolean array of n+2 lenght if we want to save more on space. this is the most optimal approach.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] present = new boolean[N + 2]; // Include N+1 for the missing number
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num <= N + 1) {
                present[num] = true;
            }
        }
        
        for (int i = 1; i <= N + 1; i++) {
            if (!present[i]) {
                System.out.println(i);
                return;
            }
        }

    */
}
  
}

// https://www.algouniversity.com/problem/265/?asid=1732

package Searching_1;
import java.io.*;
import java.util.*;

public class FirstIndexLastIndex {

  static class FastReader {
    BufferedReader b;
    StringTokenizer s;

    public FastReader() {
        b = new BufferedReader(new InputStreamReader(System.in));
    }

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

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            if (s != null && s.hasMoreTokens()) {
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
    FastReader f = new FastReader();
    int n = f.nextInt();
    int q = f.nextInt();
    
    int[] arr= new int[n];
    
    for(int i=0; i<n; i++){
      arr[i] = f.nextInt();
    }
    while(q-->0){
      int lb=-1;
      int ub=n;
      int target = f.nextInt();
      //Basically, I have to find the lower bound and upper bound, and then print the values from the lower bound to the upper bound. 
      
      while(lb+1<ub){
        int mid = lb + (ub-lb)/2;
        if(arr[mid]<target){
          lb=mid;
        } else {
          ub=mid;
        }
      }
      int lower = ub;
      if(ub==n || arr[ub]!=target){
        System.out.println(-1 +" "+ -1);
        continue;
      }
      lb=-1;
      ub=n;
      while(lb+1<ub){
        int mid = lb + (ub-lb)/2;
        if(arr[mid]<=target){
          lb=mid;
        } else {
          ub=mid;
        }
      }
      int upper = lb;
      if(lb==-1 || arr[lb]!=target){
        System.out.println(-1 +" "+ -1);
        continue;
      }
      System.out.println(lower+" "+upper);
      
    }
    return;
  }
}

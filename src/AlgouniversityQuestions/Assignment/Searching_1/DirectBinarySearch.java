// https://www.algouniversity.com/problem/125/?asid=1732
package Searching_1;

import java.util.*;
import java.io.*;

public class DirectBinarySearch {
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
    if(n == 0 || q == 0) return;
    int[] arr = new int[n];
    int[] qrr = new int[q];
    for(int i=0; i<n; i++){
      arr[i] = f.nextInt();
    }
    for(int j=0; j<q; j++){
      qrr[j] = f.nextInt();
    }
    for(int k=0; k<q; k++){
      System.out.print(binarySearch(qrr[k], arr)+" ");
    }
    return;
  }
  public static int binarySearch(int target, int[] input){
    int lo=0, hi=input.length-1;
    // we are trying to find one no. lower than our target
    while(lo<=hi){
      int mid = (lo+hi)/2;
      if(input[mid] < target){
        lo = mid+1;
      } else if (input[mid] > target){
        hi = mid-1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}

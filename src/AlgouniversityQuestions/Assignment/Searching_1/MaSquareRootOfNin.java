// https://www.algouniversity.com/problem/119/?asid=1732

package Searching_1;
import java.util.*;
import java.io.*;

public class MaSquareRootOfNin {
  
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
    double n = f.nextDouble();
    int counter = 150;
    double lp=0, rp = n;
    while(counter-->0){
      double mid = (rp - lp)/2 + lp;
      if(mid * mid > n){
        rp = mid;
      } else {
        lp = mid;
      }
    }
    System.out.printf("%.10f\n",lp);
    return;
  }
}
package a2z.step1.lec4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Print_n_times {
    // below one was done using recursion
    public static List<String> printNtimes(int n){
        List<String> list = new ArrayList<>();
        if(n==0)
            return list;
        list.add("Coding Ninjas");
        list.addAll(printNtimes(n-1));
        return list;
    }
    // below one was done using loops
    public static List<String> printNtimesLoop(int n) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add("Coding Ninjas");
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Using recursion - " + printNtimes(n));
        System.out.println("Using loops - " + printNtimesLoop(n));
    }
}

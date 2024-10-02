package a2z.step1.lec1;

public class IfElse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        if ((n - m)== 0){ // or better yet use n==0
            System.out.println("equal");
        }
        else if (n > m){
            System.out.println("greater");
        }
        else {
            System.out.println("lesser");
        }

    }
}
/*
In Java, using n == m is perfectly appropriate for comparing two primitive int values. The comparison n == m checks whether the values of n and m are equal, not their memory addresses. This is because n and m are primitive types, and primitive type comparisons in Java check the values directly.

The misconception might come from how == works with reference types (objects). When comparing objects, == checks if both references point to the same object in memory. However, this does not apply to primitive types like int, float, char, etc.

Using (n - m) == 0 works but is unnecessary and can be less readable than n == m.
*/
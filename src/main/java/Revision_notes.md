![img_4.png](img_4.png)![img_1.png](img_1.png)

---
![img_2.png](img_2.png)

---
![img_3.png](img_3.png)



*1. Striver_a2z_sheet/step1/lec2/pattern11.java*
pattern 
```text
1
0 1
1 0 1
```
**Intuition**: Use two loops—outer for rows and inner for alternating binary values. Determine the starting value for each row (`1` for odd, `0` for even) and toggle using XOR (`start ^= 1`).

```java
public class Pattern11 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int start = i % 2;
            for (int j = 0; j < i; j++) {
                System.out.print(start + " ");
                start ^= 1;
            }
            System.out.println();
        }
    }
}
```
===========================

---
*2. Striver_a2z_sheet/step1/lec2/pattern12.java*
```text
1         1
1 2     2 1
1 2 3 3 2 1
```
The pattern can be broken into three parts for each row:
- Left Part: Numbers increment from 1 to the row number (i).
- Spaces: Decreasing spaces between the left and right parts, calculated dynamically based on the row.
- Right Part: Numbers decrement from the row number (i) to 1.
```java
public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int k = 0; k < 2 * (n - i); k++) {
                System.out.print("  ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
```
===========================

---

*3. Striver_a2z_sheet/step1/lec2/pattern14.java*

```text
A
A B
A B C
```

 **Intuition**: In Java, use typecasting to convert ASCII values to characters.

```java
public class Pattern14 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            char val = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = (char) (val + 1);
            }
            System.out.println();
        }
    }
}
```
===========================

---

*4. Striver_a2z_sheet/step1/lec2/pattern22.java*
```text
4444444
4333334
4322234
4321234
4322234
4333334
4444444
```
```java
public class Pattern22 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 0; row < 2 * n - 1; row++) {
            for (int col = 0; col < 2 * n - 1; col++) {
                int left = col;
                int right = 2 * n - 2 - col;
                int top = row;
                int bottom = 2 * n - 2 - row;
                int val = n - Math.min(Math.min(left, right), Math.min(top, bottom));
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
```
===========================

---

*5. Striver_a2z_sheet/step1/lec4/gcd_lcm.java*
```java
public class GCD_LCM {
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 15;
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }
}
```
===========================

---

*6. Striver_a2z_sheet/step1/lec5/reverse_array.java*
```java
import java.util.Arrays;
public class ReverseArray {
    public static void reverse(int[] arr, int left, int right) {
        if (left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
```
===========================

---

*7. Striver_a2z_sheet/step1/lec5/fibonacci_number.java*
```java
public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }
}
```
===========================

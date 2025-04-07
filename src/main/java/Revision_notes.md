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

---
*8. src/main/java/a2z/step1/lec4/CheckArmstrong.java*
```java
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = String.valueOf(n).length();
        int copy = n;
        int sum = 0;
        while(copy > 0){
            sum = (int) (sum + Math.pow((copy % 10), power));
            copy /= 10;
        }
        System.out.println(sum == n);
        sc.close();
    }
}
```
Step-by-Step Execution
1. Extract the last digit of copy using `copy % 10`.
2. Raise the digit to the given power using `Math.pow(digit, power)`.
3. Add the result to sum.
4. Remove the last digit from `copy` by performing integer division `copy /= 10`.
5. Repeat the process until `copy` becomes 0.

===========================

---
*9. src/main/java/a2z/step1/lec4/FibonacciNumber.java*
```java
public class FibonacciNumber {
    public static int fib(int n) {
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }

        return fib(n-1) + fib(n-2);
    }
//    Iterative approach -- more optimised
    public static int fibiter(int N)
    {
        if(N <= 1)
            return N;

        int a = 0, b = 1;

        while(N-- > 1)
        {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibiter(n));
        sc.close();
    }
}
```


### **Comparison of Recursive vs Iterative Fibonacci Methods**

| Approach      | Time Complexity | Space Complexity | Pros | Cons |
|--------------|---------------|----------------|------|------|
| **Recursive (`fib`)** | **O(2ⁿ) (Exponential)** | **O(n) (Stack space for recursion calls)** | Simple, follows the mathematical definition | Very slow for large `n`, causes stack overflow |
| **Iterative (`fibiter`)** | **O(n) (Linear)** | **O(1) (Constant, no extra space)** | Efficient, avoids recursion overhead | Slightly more code, but very fast |

===========================

---
*10. src/main/java/a2z/step1/lec4/Frequencies_of_limited_range_array_elements.java*

### **Problem Statement**
Given an array `arr[]` of size `N` and an integer `P` representing the maximum range value, count the frequency of each number from `1` to `P` in the array. Modify the array in-place to store the frequency of each number in its corresponding index.

In Java, when you create an integer array using new int[size], all elements are automatically initialized to 0 by default.

### **Example 1**
#### **Input:**
```text
N = 5, P = 5
arr = [2, 3, 2, 3, 5]
```
#### **Output:**
```text
0 2 2 0 1
```
#### **Explanation:**
- The frequency of `1` is `0`.
- The frequency of `2` is `2`.
- The frequency of `3` is `2`.
- The frequency of `4` is `0`.
- The frequency of `5` is `1`.

---

## **Approach (Optimized In-Place Counting)**
### **Logic Explanation**
- The idea is to use **indexing** to store the frequencies within the array itself.
- Instead of using an extra frequency array, we manipulate the given array to track frequencies efficiently.
- **Negative values** are used as markers to indicate that an element's frequency is being counted.

### **Algorithm**
1. **First Pass (Rearrange Elements)**
   - Iterate through the array.
   - If the element is **out of range** (i.e., not between `1` and `P`), ignore it.
   - Otherwise, compute its correct index (`arr[i] - 1`).
   - If the indexed position is still **positive**, swap values.
   - If already processed (negative marker), decrement its count.
   - Mark visited positions with `-1` to track counts.
2. **Second Pass (Adjust the Counts)**
   - Convert negative values back to positive to get the actual frequency counts.

---

## **Code Implementation**
```java
public class FrequenciesOfLimitedRangeArrayElements {

    public static void frequencyCount(int arr[], int N, int P) {
        int i = 0;
        while (i < N) {
            // Ignore elements that are out of the range [1, P]
            if (arr[i] <= 0 || arr[i] > P) {
                i++;
                continue;
            }

            // Get index corresponding to current element (1-based to 0-based)
            int elementIndex = arr[i] - 1;

            // If element at elementIndex hasn't been processed yet (i.e., positive value)
            if (elementIndex < N && arr[elementIndex] > 0) {
                // Store the current element value and mark the position with -1
                arr[i] = arr[elementIndex];  // Replace with the value at that index
                arr[elementIndex] = -1;  // Mark the element as seen once
            } else if (elementIndex < N) {
                // If already processed, decrement its value (it is stored as negative)
                arr[elementIndex]--;
                // Set current element to 0 as it's now processed
                arr[i] = 0;
                i++;
            } else {
                // Handle elements greater than N
                i++;
            }
        }

        // Second pass to adjust counts
        for (int k = 0; k < N; k++) {
            if (arr[k] < 0)
                arr[k] = -arr[k]; // Convert counts back to positive
            else
                arr[k] = 0; // Set positions where element didn't appear to 0
        }
    }
}
```

---

## **Time Complexity Analysis**
- **First pass:** `O(N)`, since we traverse the array once.
- **Second pass:** `O(N)`, since we again traverse the array once.
- **Total Complexity:** `O(N)`, making it an efficient solution.

## **Space Complexity Analysis**
- We use **O(1)** extra space as we modify the input array in place.

---

## **Edge Cases Considered**
- ✅ All numbers in the array are within range `[1, P]`.
- ✅ Some or all numbers are **out of range**.
- ✅ Duplicate numbers appear multiple times.
- ✅ `N == 1`, smallest input case.
- ✅ `P > N`, ensuring all values fit within the given range.


===========================

---

*11.src/main/java/a2z/step1/lec4/LcmAndGcd.java*

### LCM and GCD Calculation

#### **Problem Statement**
Given two numbers `a` and `b`, compute their **Least Common Multiple (LCM)** and **Greatest Common Divisor (GCD)**.

### **Approach 1: Brute Force (Iterative GCD Calculation)**
### **Logic Explanation**
- Iterate from `min(a, b)` down to `1`.
- The first number that divides both `a` and `b` is the **GCD**.
- Use the formula to compute **LCM**:  
  LCM(a, b) = (a * b)/GCD(a, b)

### **Code Implementation (Java)**
```java
public class LCM_GCD {
    public static int gcd(int a, int b) {
        for (int x = Math.min(a, b); x > 0; x--) {
            if (a % x == 0 && b % x == 0) {
                return x;
            }
        }
        return 1;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 15;
        System.out.println("LCM: " + lcm(a, b) + ", GCD: " + gcd(a, b));
    }
}
```

### **Time Complexity Analysis**
- **Worst-case:** `O(min(a, b))` iterations.
- Not efficient for large numbers.

---

### **Approach 2: Using Euclidean Algorithm (Efficient Method)**
### **Logic Explanation**
- The **Euclidean algorithm** is based on the property:
  
    GCD(a, b) = GCD(b, a % b)
  
  - Keep replacing `a` with `b` and `b` with `a % b` until `b == 0`.
  - The remaining value of `a` is the **GCD**.
  - Compute **LCM** using the formula:
    
    LCM(a, b) = (a * b)/GCD(a, b)

### **Code Implementation (Java)**
```java
public class LCM_GCD_Efficient {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 15;
        System.out.println("LCM: " + lcm(a, b) + ", GCD: " + gcd(a, b));
    }
}
```

---

### **Time Complexity Analysis**
- **GCD Calculation (Euclidean Method):** `O(log(min(a, b)))`
- **LCM Calculation:** `O(1)`
- **Overall Complexity:** `O(log(min(a, b)))` (Much faster than brute force!)

---

#### **Edge Cases Considered**
✅ `a == b` → Both GCD and LCM should be `a`.  
✅ One of the numbers is `1` → GCD is `1`, LCM is the larger number.  
✅ Large values of `a` and `b` → Handles efficiently using Euclidean algorithm.  
✅ Prime numbers → GCD is always `1`, LCM is `a * b`.  

===========================
---
# Linked Lists


*12.src/main/java/a2z/step6/lec1/delete_a_node_in_linked_list.java*

### **Delete Node in a Linked List**  
📌 **Problem Statement:**  
Given a node `node` (not the last node) in a **singly linked list**, delete it without access to `head`.  

### **Approach: Trick to Delete Without Head**
✅ **Key Idea:** Copy the next node’s value into `node` and bypass the next node.  
✅ **Implementation Steps:**  
1. Copy `node.next.val` into `node.val`.  
2. Point `node.next` to `node.next.next`.  
3. Do **not** remove the node from memory (as per the problem constraint).  

### **Code Implementation (Java)**
```java
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;  // Copy next node’s value
        node.next = node.next.next; // Skip the next node
    }
}
```

### **Complexity Analysis**  
- **Time Complexity:** `O(1)` (constant operations)  
- **Space Complexity:** `O(1)` (no extra space)  

---

### **Edge Cases Considered**
✅ `node` is **not** the last node (guaranteed by the problem).  
✅ Works for **any** position except the last.  
✅ **Preserves order** of remaining elements.  

📌 **Trick to Remember:** **Copy & Skip, No Head Needed!** 🚀  

===========================

---
*src/main/java/a2z/step6/lec2/introduction_to_doubly_linked_list.java*

### **Constructing a Doubly Linked List from an Array**  

#### **Problem Statement**  
Given an integer array `arr` of size `n`, construct a **Doubly Linked List (DLL)** where:  
- Each node has `data`, `next` (points to next node), and `prev` (points to previous node).  
- Return the **head** of the doubly linked list.  

---

### **Approach: Iterative Construction**  
✅ Create the **head node** with `arr[0]`.  
✅ Use a `prev` pointer to link nodes **both forward (`next`) and backward (`prev`)**.  
✅ Iterate through `arr` and construct the DLL.  

---

### **Code Implementation (Java)**  
```java
class Node {
    int data;
    Node next, prev;

    Node(int val) {
        data = val;
        next = prev = null;
    }
}

class Solution {
    public Node constructDLL(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]), prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.prev = prev;
            prev = temp;
        }
        return head;
    }
}
```

---

### **Time & Space Complexity**  
- **Time Complexity:** `O(n)` (traverse `arr` once).  
- **Space Complexity:** `O(n)` (create `n` nodes).  

---

### **Key Tricks & Edge Cases**  
✅ **Both forward (`next`) & backward (`prev`) links must be set.**  
✅ **If `arr` is empty, return `null`.**  
✅ **Handles single-element list (no `prev`).**  

📌 **Trick to Remember:**  
- Use `prev.next = temp; temp.prev = prev;` to link nodes both ways! 🚀

===========================

---
*13. src/main/java/a2z/step6/lec2/introduction_to_doubly_linked_list.java*

## **Problem Statement**
- Given a **doubly linked list**, a position `p`, and an integer `x`, insert a new node with value `x` **after the `p`-th node** and return the updated head.
- The index `p` follows **0-based indexing**.
- The doubly linked list has **both `next` and `prev` pointers**.

---

## **Example Walkthrough**

### **Example 1**
#### **Input**:  
```
LinkedList: 2 <-> 4 <-> 5  
p = 2, x = 6
```
#### **Processing**:
- Insert `6` **after** position `p = 2` (which is node `5`).
#### **Output**:  
```
2 <-> 4 <-> 5 <-> 6
```
---

## **Approach**
1. **Traverse to the `p`-th node**:
   - Start from `head` and move `p` times to reach the `p`-th node.
2. **Create a new node** with value `x`.
3. **Insert the new node after the `p`-th node**:
   - Adjust `next` and `prev` pointers to maintain the doubly linked list structure.
4. **Handle edge cases**:
   - If inserting after the last node, set `newNode.next = null`.
   - If inserting between two nodes, update the `prev` pointer of the next node.

---

## **Code Implementation (Java)**
```java
class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        Node temp = head;
        
        // Traverse to the p-th node
        for (int i = 0; i < p; i++) {
            if (temp == null) return head; // Handle invalid p (shouldn't happen as per constraints)
            temp = temp.next;
        }
        
        // Create new node
        Node newNode = new Node(x);
        
        // Insert newNode after temp
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;

        // If newNode is not the last node, update the next node's prev pointer
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

        return head;
    }
}
```

---

## **Complexity Analysis**
✅ **Time Complexity:** `O(p)` (since we traverse `p` nodes before insertion).  
✅ **Space Complexity:** `O(1)` (only one new node is created).  

---

## **Edge Cases Considered**
🔹 **`p == 0` (Insert after head)** → Works fine without special handling.  
🔹 **`p` is at the last node** → Correctly assigns `null` to `newNode.next`.  
🔹 **General insert in between** → Both `next` and `prev` pointers are properly set.  

---

===========================

---
*14.src/main/java/a2z/step6/lec2/ReverseDoublyLL.java*

## **Problem Statement**
- Given a **doubly linked list**, reverse the list such that the last node becomes the head and the first node becomes the tail.
- The doubly linked list has **both `next` and `prev` pointers**.

---

## **Example Walkthrough**

### **Example 1**
#### **Input**:  
```
LinkedList: 1 <-> 2 <-> 3 <-> 4 <-> 5
```
#### **Processing**:
- Reverse all `next` and `prev` pointers.
#### **Output**:  
```
5 <-> 4 <-> 3 <-> 2 <-> 1
```
---

## **Approach**
1. **Initialize two pointers**:
   - `current` starts at `head`.
   - `temp` is used for swapping `next` and `prev`.
2. **Swap `prev` and `next` for each node**:
   - Move `current` to `prev` (which was `next` before swapping).
3. **Update head to the last processed node**.

---

## **Code Implementation (Java)**
```java
class Solution {
    public Node reverseDLL(Node head) {
        Node current = head;
        Node temp = null;

        // Swap next and prev for all nodes
        while (current != null) {
            temp = current.prev; 
            current.prev = current.next; 
            current.next = temp;
            head = current; // Update head to last processed node
            current = current.prev; // Move to next node (was prev before swap)
        }
        return head;
    }
}
```

---

## **Complexity Analysis**
✅ **Time Complexity:** `O(n)` (since we visit each node once).  
✅ **Space Complexity:** `O(1)` (no extra memory used).  

---

## **Edge Cases Considered**
🔹 **Empty List (`head == null`)** → Return `null`.  
🔹 **Single Node List (`head.next == null`)** → Return `head` as is.  
🔹 **General Case** → Swaps all `next` and `prev` pointers correctly.

===========================

---
*15.src/main/java/a2z/step6/lec3/MiddleOfLinkedList.java*

## **Problem Statement**
- Given a **singly linked list**, find the **middle node** of the list.
- If there are **two middle nodes** (even-length list), return the **second middle node**.

---

## **Example Walkthrough**

### **Example 1: Odd-Length Linked List**
#### **Input**:  
```
1 -> 2 -> 3 -> 4 -> 5 -> null
```
#### **Processing**:
- `slow` moves one step, `fast` moves two steps.
- `fast` reaches the last node, `slow` stops at `3`.
#### **Output**:  
```
3
```

### **Example 2: Even-Length Linked List**
#### **Input**:  
```
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
```
#### **Processing**:
- `slow` moves one step, `fast` moves two steps.
- `fast` reaches `null`, `slow` stops at `4` (second middle node).
#### **Output**:  
```
4
```

---

## **Approach: Two-Pointer Technique**
1. **Initialize two pointers**:
   - `slow` (moves one step at a time).
   - `fast` (moves two steps at a time).
2. **Traverse the list**:
   - When `fast` reaches the end (`null`), `slow` will be at the middle.
3. **Return `slow`**:
   - If the list has an **odd** length, `slow` is at the exact middle.
   - If the list has an **even** length, `slow` is at the **second middle node**.

---

## **Code Implementation (Java)**
```java
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Returns the second middle in case of even-length list
    }
}
```

---

## **Complexity Analysis**
✅ **Time Complexity:** `O(n)` (since we traverse the list once).  
✅ **Space Complexity:** `O(1)` (only uses two pointers).  

---

## **Edge Cases Considered**
🔹 **Empty List (`head == null`)** → Return `null`.  
🔹 **Single Node List (`head.next == null`)** → Return `head`.  
🔹 **Even-Length List** → `slow` correctly returns the second middle node.

===========================

---
*16.src/main/java/a2z/step6/lec3/LinkedListCycle2.java*

## **Detecting and Finding the Starting Node of a Cycle in a Linked List**

### **Problem Statement**
Given a **singly linked list**, detect if there is a **cycle** in the list. If a cycle exists, return the **starting node** of the cycle. Otherwise, return `null`.

---

### **Example Walkthrough**

### **Example 1: Cycle Present**
#### **Input:**  
```
1 -> 2 -> 3 -> 4 -> 5 -> 3 (Cycle back to node 3)
```
#### **Processing**:
- The `slow` and `fast` pointers detect a cycle.
- Reset `slow` to `head`, move both `slow` and `fast` one step at a time.
- They meet at node `3`, which is the **start of the cycle**.
#### **Output:**  
```
Cycle detected at node with value: 3
```

### **Example 2: No Cycle**
#### **Input:**  
```
1 -> 2 -> 3 -> 4 -> 5 -> null
```
#### **Output:**  
```
No cycle detected.
```

---

## **Approach: Floyd’s Cycle Detection Algorithm**
1. **Use Two Pointers (Slow & Fast):**
   - `slow` moves **one step** at a time.
   - `fast` moves **two steps** at a time.
   - If they meet, a cycle **exists**.
2. **Find the Cycle’s Starting Node:**
   - Reset `slow` to `head`.
   - Move `slow` and `fast` **one step** at a time.
   - The meeting point is the **starting node of the cycle**.

---

## **Code Implementation (Java)**
```java
class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (isCycle) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

        return null;
    }
}
```

---

## **Time & Space Complexity**
✅ **Time Complexity:** `O(n)` (Each pointer moves at most `O(n)` steps).  
✅ **Space Complexity:** `O(1)` (Only two pointers used).  

---

## **Subproblems Related to Cycle Detection**
### **1. Finding the Length of the Cycle**
- After detecting a cycle (when `slow == fast`), keep one pointer fixed and move the other **one step** at a time.
- Count the number of steps until they meet again.

#### **Code to Find Cycle Length**
```java
public int cycleLength(ListNode slow) {
    ListNode temp = slow;
    int length = 0;
    do {
        temp = temp.next;
        length++;
    } while (temp != slow);
    return length;
}
```

✅ **Time Complexity:** `O(n)`, ✅ **Space Complexity:** `O(1)`

===========================

---
*17.src/main/java/a2z/step6/lec3/IntersectionOfTwoLinkedList.java*

# Intersection of Two Linked Lists

## Problem Statement
Given the heads of two singly linked lists, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return `null`.

### Example:
#### Input:
```
List A: 3 -> 6 -> 9 -> 8 -> 10
List B: 4 -> 8 -> 10
Intersection at node with value: 8
```
#### Output:
```
Intersection at node with value: 8
```

---

## Approach: Two Pointer Technique

### Intuition
- If two linked lists intersect, they will have a common suffix.
- Instead of using extra space, we can use two pointers and traverse both lists.
- If one pointer reaches the end, switch it to the other list's head. Eventually, they will meet at the intersection point.

### Algorithm
1. Initialize two pointers `ptrA` and `ptrB` at the heads of `headA` and `headB`, respectively.
2. Traverse both lists:
   - Move `ptrA` to `ptrA.next` and `ptrB` to `ptrB.next`.
   - If `ptrA` reaches `null`, set it to `headB`.
   - If `ptrB` reaches `null`, set it to `headA`.
3. When `ptrA == ptrB`, return `ptrA` (which is the intersection node or `null` if no intersection).

### Code Implementation (Java)
```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA, ptrB = headB;
        
        while (ptrA != ptrB) {
            if (ptrA == null) {
                ptrA = headB;
            } else {
                ptrA = ptrA.next;
            }
            if (ptrB == null) {
                ptrB = headA;
            } else {
                ptrB = ptrB.next;
            }
        }
        return ptrA;
    }

    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);
        
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(9);
        headA.next.next.next = common;
        
        ListNode headB = new ListNode(4);
        headB.next = common;
        
        IntersectionOfTwoLinkedList solution = new IntersectionOfTwoLinkedList();
        ListNode intersection = solution.getIntersectionNode(headA, headB);
        
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
```

*Note:* The above implementation can also be written in a compact form:
```java
while (ptrA != ptrB) {
    ptrA = (ptrA == null) ? headB : ptrA.next;
    ptrB = (ptrB == null) ? headA : ptrB.next;
}
```
Logically, both implementations are the same.

---

## Complexity Analysis
| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Traversing both lists | `O(m + n)` | `O(1)` |

- **Time Complexity:** `O(m + n)`, where `m` and `n` are the lengths of the two lists. Each pointer traverses both lists at most once.
- **Space Complexity:** `O(1)`, as we use only two pointers.

---

## Edge Cases Considered
- No intersection → Returns `null`.
- Intersection at the head node.
- Different list lengths.
- One or both lists are empty.

### Alternative Approach: HashSet
1. Store all nodes of one list in a `HashSet`.
2. Traverse the second list and check if any node exists in the set.
3. **Time Complexity:** `O(m + n)`, **Space Complexity:** `O(m)` (additional storage).

This approach is useful when modifying pointers is not allowed.

---

## Key Takeaways
- The **two-pointer technique** efficiently finds the intersection without extra space.
- If lists have an intersection, the two pointers will meet after `m + n` steps.
- The approach ensures an optimal `O(m + n)` time complexity without using a hash set.


===========================

---
*17.src/main/java/a2z/step6/lec3/ReverseLinkedList.java*

# Reverse a Singly Linked List

## Problem Statement
Given the head of a singly linked list, reverse the list and return its head.

### Example:
#### Input:
```
1 -> 2 -> 3 -> 4 -> 5 -> null
```
#### Output:
```
5 -> 4 -> 3 -> 2 -> 1 -> null
```

---

## Approach: Iterative Method

### Intuition
- We traverse the list while reversing the `next` pointers.
- Maintain three pointers:
  1. `prev` (stores the previous node)
  2. `current` (stores the current node being processed)
  3. `next` (stores the next node temporarily to avoid losing reference)
- Update the `next` pointers in each iteration to reverse the list.

### Algorithm
1. Initialize `prev` as `null` and `current` as `head`.
2. Iterate while `current` is not `null`:
   - Store `current.next` in `next`.
   - Reverse `current.next` to point to `prev`.
   - Move `prev` to `current` and `current` to `next`.
3. At the end, `prev` will be the new head of the reversed list.

### Code Implementation (Java)
```java
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head, prev = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " -> ");
            reversedHead = reversedHead.next;
        }
        System.out.println("null");
    }
}
```

---

## Complexity Analysis
| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Traversing the list | `O(n)` | `O(1)` |

- **Time Complexity:** `O(n)`, where `n` is the number of nodes in the list (each node is processed once).
- **Space Complexity:** `O(1)`, as we use only a few pointers without extra space.

---

## Edge Cases Considered
- Empty list (`head == null`) → Returns `null`.
- List with a single node (`head.next == null`) → Returns `head`.
- List with multiple nodes → Reverses successfully.

---

## Alternative Approach: Recursive Method
1. Base case: If `head == null` or `head.next == null`, return `head`.
2. Recursively call `reverseList(head.next)`.
3. Reverse pointers at each step.

```java
public ListNode reverseListRecursive(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    ListNode reversedHead = reverseListRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return reversedHead;
}
```

### Recursive Complexity:
- **Time Complexity:** `O(n)` (same as iterative)
- **Space Complexity:** `O(n)` (recursive stack depth)

This method is cleaner but uses extra space due to recursion.

---

## Key Takeaways
- The **iterative approach** efficiently reverses a linked list in `O(n)` time and `O(1)` space.
- The **recursive approach** is more elegant but requires `O(n)` extra space.
- Understanding pointer manipulation is crucial for solving linked list problems efficiently.

===========================

---
*18.src/main/java/a2z/step6/lec5/CloneLinkedListWithRandomPointer.java*

# Copy List with Random Pointer

## Problem Statement
A linked list of length `n` is given such that each node contains an additional **random pointer**, which could point to any node in the list, or `null`.

We need to **create a deep copy** of the linked list.
- The new list should have **exactly `n` new nodes**.
- Each new node’s `next` and `random` pointers should mimic the original list.
- No pointer in the new list should point to a node from the original list.

---
## Approach 1: Using **HashMap** (Easier Method)

### **Intuition**
- We create a **mapping** between the original nodes and their corresponding cloned nodes.
- First, we create **all cloned nodes** and store them in a HashMap.
- Then, we iterate again to **assign the `next` and `random` pointers** properly.

### **Algorithm**
1. **Create a HashMap** to store `{original node → cloned node}`.
2. **First pass:** Create cloned nodes and store them in the map.
3. **Second pass:** Assign `next` and `random` pointers using the map.

### **Code**
```java
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        // Step 1: Create HashMap to store original -> cloned mapping
        Map<Node, Node> map = new HashMap<>();
        Node current = head;
        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }
        
        // Step 2: Assign next and random pointers
        current = head;
        while (current != null) {
            map.get(current).next = map.get(current.next); // Assign next
            map.get(current).random = map.get(current.random); // Assign random
            current = current.next;
        }
        
        return map.get(head); // Return the new head
    }
}
```

### **Time Complexity**: `O(N)`
- We traverse the list twice (`O(N) + O(N) = O(N)`).

### **Space Complexity**: `O(N)`
- HashMap stores `N` elements (`O(N)`).

---
## Approach 2: **Optimized (O(1) Space) Without Extra Data Structures**

### **Intuition**
- Instead of using extra space, we **insert new nodes directly** into the original list.
- This helps us efficiently copy the `random` pointers **without a HashMap**.
- Finally, we **separate** the original and copied lists.

### **Algorithm**
1. **Step 1**: **Create new nodes** next to original nodes.
2. **Step 2**: **Copy `random` pointers**.
3. **Step 3**: **Detach the new list** from the old list.

### **Code**
```java
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        // Step 1: Create new cloned nodes and insert them next to original nodes
        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.val);
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next;
        }
        
        // Step 2: Assign random pointers to cloned nodes
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        
        // Step 3: Separate cloned list from the original list
        current = head;
        Node newHead = head.next;
        Node copy = newHead;
        while (current != null) {
            current.next = copy.next;
            current = current.next;
            if (current != null) {
                copy.next = current.next;
                copy = copy.next;
            }
        }
        
        return newHead;
    }
}
```

### **Time Complexity**: `O(N)`
- Three passes:  
  1. **Creating new nodes (`O(N)`)**  
  2. **Assigning `random` pointers (`O(N)`)**  
  3. **Separating lists (`O(N)`)**

### **Space Complexity**: `O(1)`
- No extra data structures used, only modifying pointers.

---
## **Comparison of Approaches**
| Approach | Time Complexity | Space Complexity | Notes |
|----------|----------------|------------------|-------|
| **HashMap Method** | `O(N)` | `O(N)` | Easier to understand but uses extra space |
| **Optimized (O(1) Space)** | `O(N)` | `O(1)` | More efficient, modifies list temporarily |

---
## **Key Takeaways**
- If **extra space is allowed**, use the **HashMap method** (simpler to implement and understand).
- If **constant space is required**, use the **optimized method** by modifying the original list.
- Always be careful when handling `random` pointers to avoid `NullPointerException`.

---
## **Edge Cases to Consider**
1. **Empty list (`head == null`)** → Return `null`.
2. **List with one node (`head.next == null`)** → Handle `random` pointers correctly.
3. **Random pointers pointing to `null`** → Ensure correct handling.
4. **All nodes having `random` pointers to themselves** → Verify if deep copy maintains structure.
5. **Cyclic dependencies in `random` pointers** → Make sure the algorithm works correctly.

===========================

---

# Binary Tree Traversals

## 1. Preorder Traversal (Root -> Left -> Right)
### **Recursive Approach**
**Algorithm:**
1. Visit the root node.
2. Recursively traverse the left subtree.
3. Recursively traverse the right subtree.

```java
public void preOrderRecursive(BinaryTreeNode root) {
    if (root == null) return;
    System.out.print(root.data + " ");
    preOrderRecursive(root.left);
    preOrderRecursive(root.right);
}
```

### **Iterative Approach (Using Stack)**
**Algorithm:**
1. Push the root node to a stack.
2. While the stack is not empty:
   - Pop a node, print its value.
   - Push its right child (if exists).
   - Push its left child (if exists).

```java
public void preOrderIterative(BinaryTreeNode root) {
    if (root == null) return;
    Stack<BinaryTreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
        BinaryTreeNode node = stack.pop();
        System.out.print(node.data + " ");
        if (node.right != null) stack.push(node.right);
        if (node.left != null) stack.push(node.left);
    }
}
```

---

## 2. Inorder Traversal (Left -> Root -> Right)
### **Recursive Approach**
**Algorithm:**
1. Recursively traverse the left subtree.
2. Visit the root node.
3. Recursively traverse the right subtree.

```java
public void inOrderRecursive(BinaryTreeNode root) {
    if (root == null) return;
    inOrderRecursive(root.left);
    System.out.print(root.data + " ");
    inOrderRecursive(root.right);
}
```

### **Iterative Approach (Using Stack)**
**Algorithm:**
1. Use a stack to store nodes while traversing.
2. Start from the root and push all left children.
3. Pop from stack, print node, then push right subtree.

```java
public void inOrderIterative(BinaryTreeNode root) {
    if (root == null) return;
    Stack<BinaryTreeNode> stack = new Stack<>();
    BinaryTreeNode curr = root;
    while (curr != null || !stack.isEmpty()) {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
        curr = stack.pop();
        System.out.print(curr.data + " ");
        curr = curr.right;
    }
}
```

---

## 3. Postorder Traversal (Left -> Right -> Root)
### **Recursive Approach**
**Algorithm:**
1. Recursively traverse the left subtree.
2. Recursively traverse the right subtree.
3. Visit the root node.

```java
public void postOrderRecursive(BinaryTreeNode root) {
    if (root == null) return;
    postOrderRecursive(root.left);
    postOrderRecursive(root.right);
    System.out.print(root.data + " ");
}
```

### **Iterative Approach (Using Two Stacks)**
**Algorithm:**
1. Push root to **stack1**.
2. While **stack1** is not empty:
   - Pop a node and push it into **stack2**.
   - Push left and right children into **stack1**.
3. Print elements from **stack2**.

```java
public void postOrderIterative(BinaryTreeNode root) {
    if (root == null) return;
    Stack<BinaryTreeNode> stack1 = new Stack<>(), stack2 = new Stack<>();
    stack1.push(root);
    while (!stack1.isEmpty()) {
        BinaryTreeNode node = stack1.pop();
        stack2.push(node);
        if (node.left != null) stack1.push(node.left);
        if (node.right != null) stack1.push(node.right);
    }
    while (!stack2.isEmpty()) {
        System.out.print(stack2.pop().data + " ");
    }
}
```

---

## 4. Level Order Traversal (BFS)
### **Iterative Approach (Using Queue)**
**Algorithm:**
1. Use a queue and enqueue the root.
2. While the queue is not empty:
   - Dequeue a node, print its value.
   - Enqueue its left and right children (if exist).

```java
public void levelOrder(BinaryTreeNode root) {
    if (root == null) return;
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
        BinaryTreeNode node = queue.poll();
        System.out.print(node.data + " ");
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}
```

---

## **Comparison of Traversal Approaches**
| Traversal | Time Complexity | Space Complexity | Best Used For |
|-----------|----------------|------------------|---------------|
| **Preorder** | O(N) | O(N) (Recursive), O(N) (Iterative) | Copying a tree, creating an expression tree |
| **Inorder** | O(N) | O(N) (Recursive), O(N) (Iterative) | Sorting elements, binary search trees (BST) |
| **Postorder** | O(N) | O(N) (Recursive), O(N) (Iterative) | Deleting a tree, evaluating expressions |
| **Level Order (BFS)** | O(N) | O(N) (Queue storage) | Shortest path problems, BFS traversal |

---

## **Key Takeaways**
- **Recursive approaches** are simpler but use extra memory due to recursion.
- **Iterative approaches** avoid recursion overhead but require explicit stacks or queues.
- **Use Level Order Traversal** for BFS applications (like shortest paths).
- **Inorder traversal** is useful for binary search trees (BSTs).
- **Postorder traversal** is useful for deleting nodes or evaluating expressions.

===========================

---

*19.src/main/java/a2z/step13/lec2/BinaryTreeZigZagLevelorderTraversal.java*

# Binary Tree Zigzag Level Order Traversal

## Problem Statement
Given the `root` of a binary tree, return the zigzag level order traversal of its nodes' values.
- (i.e., from left to right, then right to left for the next level and alternate between).

---
## Approach: Using BFS + Deque

### **Intuition**
- Similar to normal level-order traversal using a queue.
- The only difference is the order in which we add the nodes to the current level list.
- Use a **Deque** to allow fast additions at both ends.

### **Algorithm**
1. Create a queue for BFS and add the root node.
2. Use a boolean flag `isLeftToRight` to track the current direction.
3. For each level:
   - Create an empty `Deque`.
   - Traverse all nodes in the current level.
   - Add their values to the deque:
     - If left-to-right → `deque.addLast()`
     - If right-to-left → `deque.addFirst()`
   - Add child nodes to the queue for the next level.
4. Add the `deque` (converted to list) to the result.
5. Flip the `isLeftToRight` flag.

### **Code**
```java
public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new LinkedList<>();
    if (root == null) return result;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    boolean isLeftToRight = true;

    while (!queue.isEmpty()) {
        int size = queue.size();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();

            if (isLeftToRight) {
                deque.addLast(node.val);
            } else {
                deque.addFirst(node.val);
            }

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        result.add(new ArrayList<>(deque));
        isLeftToRight = !isLeftToRight;
    }

    return result;
}
```

### **Time Complexity**: `O(N)`
- We visit each node exactly once.

### **Space Complexity**: `O(N)`
- Space required for queue and result list.

---
## **Key Takeaways**
- Use **Deque** to efficiently insert from front and back.
- Toggle direction using a boolean flag.
- Always use a queue for BFS traversal.

---
## **Edge Cases to Consider**
1. Empty tree → return empty list.
2. Tree with only one node.
3. Perfect binary tree vs skewed trees (left-heavy or right-heavy).


/*
https://leetcode.com/problems/copy-list-with-random-pointer/description/
138. Copy List with Random Pointer
*/

package a2z.step6.lec5;

import java.util.HashMap;
import java.util.Map;

class Node1 {
    int val;
    Node1 next;
    Node1 random;

    public Node1(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CloneLinkedListWithRandomPointer {
    
    // Method 1: Using HashMap (Easier to understand)
    public static Node1 copyRandomListUsingMap(Node1 head) {
        if (head == null) return null;

        // Step 1: Create a mapping from original Node1s to cloned Node1s
        Map<Node1, Node1> map = new HashMap<>();
        Node1 current = head;
        while (current != null) {
            map.put(current, new Node1(current.val));
            current = current.next;
        }
        
        // Step 2: Assign next and random pointers
        current = head;
        while (current != null) {
            map.get(current).next = map.get(current.next);
            map.get(current).random = map.get(current.random);
            current = current.next;
        }
        
        return map.get(head);
    }
    
    // Method 2: Optimized O(1) space method
    public static Node1 copyRandomListOptimized(Node1 head) {
        if (head == null) return null;
        
        // Step 1: Create new Node1s and insert them after original Node1s
        Node1 current = head;
        while (current != null) {
            Node1 newNode1 = new Node1(current.val);
            newNode1.next = current.next;
            current.next = newNode1;
            current = newNode1.next;
        }
        
        // Step 2: Set up random pointers for the copied Node1s
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        
        // Step 3: Separate the two linked lists
        current = head;
        Node1 newHead = head.next;
        Node1 copyCurrent = newHead;
        while (current != null) {
            current.next = copyCurrent.next;
            current = current.next;
            if (current != null) {
                copyCurrent.next = current.next;
                copyCurrent = copyCurrent.next;
            }
        }
        
        return newHead;
    }
    
    // Helper method to print a linked list
    public static void printList(Node1 head) {
        Node1 temp = head;
        while (temp != null) {
            int randomVal = (temp.random != null) ? temp.random.val : -1;
            System.out.print("[" + temp.val + ", " + randomVal + "] -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    // Test cases
    public static void main(String[] args) {
        // Creating a test case: [-1, 0]
        Node1 head = new Node1(-1);
        Node1 Node12 = new Node1(2);
        Node1 Node13 = new Node1(3);
        head.next = Node12;
        Node12.next = Node13;
        
        head.random = Node13;
        Node12.random = head;
        Node13.random = null;
        
        System.out.println("Original List:");
        printList(head);
        
        // Copy using HashMap method
        Node1 clonedList1 = copyRandomListUsingMap(head);
        System.out.println("Cloned List (HashMap method):");
        printList(clonedList1);
        
        // Copy using Optimized O(1) space method
        Node1 clonedList2 = copyRandomListOptimized(head);
        System.out.println("Cloned List (Optimized method):");
        printList(clonedList2);
    }
}


/*
https://leetcode.com/problems/linked-list-cycle-ii/description/
Linked List Cycle II
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the 
next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). 
It is -1 if there is no cycle. Note that pos is not passed as a parameter.
Do not modify the linked list.
*/

package a2z.step6.lec3; // Change package name as per your project structure

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle2 {
    
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head;
        boolean isCycle = false;

        // Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                isCycle = true;
                break;
            }
        }

        if (isCycle) {
            slow = head;
            while (slow != fast) { // Find cycle entry point
                slow = slow.next;
                fast = fast.next;
            }
            return slow; // Cycle starts at this node
        }

        return null; // No cycle
    }

    // Helper function to create a cycle in the linked list (for testing)
    public static void createCycle(ListNode head, int pos) {
        if (pos == -1) return;

        ListNode temp = head, cycleNode = null;
        int index = 0;

        while (temp.next != null) {
            if (index == pos) {
                cycleNode = temp;
            }
            temp = temp.next;
            index++;
        }
        temp.next = cycleNode; // Creating the cycle
    }

    public static void main(String[] args) {
        LinkedListCycle2 list = new LinkedListCycle2();

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Creating a cycle at node index 2 (3rd node, value = 3)
        createCycle(head, 2);

        // Detect cycle
        ListNode cycleStart = list.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle detected at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}


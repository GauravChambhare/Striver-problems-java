/*
https://leetcode.com/problems/intersection-of-two-linked-lists/description/
160. Intersection of Two Linked Lists
Given the heads of two singly linked-lists headA and headB, return the node at 
which the two lists intersect. If the two linked lists have no intersection at all, return null.
For example, the following two linked lists begin to intersect at node c1:
*/
package a2z.step6.lec3;

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfTwoLinkedList {
    public ListNode1 getIntersectionNode(ListNode1 headA, ListNode1 headB) {
        ListNode1 ptrA = headA, ptrB = headB;
        
        // Traverse both lists
        while (ptrA != ptrB) {
            ptrA = (ptrA == null) ? headB : ptrA.next;
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }
        return ptrA; // Will be null if no intersection, otherwise intersection node
    }

    public static void main(String[] args) {
        // Create two linked lists with an intersection
        ListNode1 common = new ListNode1(8);
        common.next = new ListNode1(10);

        ListNode1 headA = new ListNode1(3);
        headA.next = new ListNode1(6);
        headA.next.next = new ListNode1(9);
        headA.next.next.next = common;  // Intersection starts here

        ListNode1 headB = new ListNode1(4);
        headB.next = common; // Intersection starts here

        IntersectionOfTwoLinkedList solution = new IntersectionOfTwoLinkedList();
        ListNode1 intersection = solution.getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}


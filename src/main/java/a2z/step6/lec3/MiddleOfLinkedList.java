/*
https://leetcode.com/problems/middle-of-the-linked-list/description/
876. Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
*/

package a2z.step6.lec3;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {

            if(fast.next == null){
                return slow;
            }
            else if(fast.next.next == null){
                return slow.next;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        // Creating test linked list: 1 -> 2 -> 3 -> 4 -> 5
        // ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head = new ListNode(1, new ListNode(2));
        MiddleOfLinkedList solution = new MiddleOfLinkedList();
        ListNode middle = solution.middleNode(head);
        System.out.println("Middle Node Value: " + (middle != null ? middle.val : "null"));
    }
}
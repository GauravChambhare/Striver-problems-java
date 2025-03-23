/*
https://leetcode.com/problems/middle-of-the-linked-list/description/
876. Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
*/

package a2z.step6.lec3;

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}

public class MiddleOfLinkedList {
    public ListNode2 middleNode(ListNode2 head) {
        ListNode2 slow = head, fast = head;
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
        // ListNode2 head = new ListNode2(1, new ListNode2(2, new ListNode2(3, new ListNode2(4, new ListNode2(5)))));
        ListNode2 head = new ListNode2(1, new ListNode2(2));
        MiddleOfLinkedList solution = new MiddleOfLinkedList();
        ListNode2 middle = solution.middleNode(head);
        System.out.println("Middle Node Value: " + (middle != null ? middle.val : "null"));
    }
}
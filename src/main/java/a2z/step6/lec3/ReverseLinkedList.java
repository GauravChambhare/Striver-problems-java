/*
https://leetcode.com/problems/reverse-linked-list/submissions/1581980677/
206. Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.Given the head of a singly 
linked list, reverse the list, and return the reversed list.
*/

package a2z.step6.lec3;

class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int val) { this.val = val; }
    ListNode3(int val, ListNode3 next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {
    public ListNode3 reverseList(ListNode3 head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode3 current = head, prev = null;
        while (current != null) {
            ListNode3 next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode3 head = new ListNode3(1, new ListNode3(2, new ListNode3(3, new ListNode3(4, new ListNode3(5)))));
        
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode3 reversedHead = solution.reverseList(head);
        
        // Printing the reversed linked list
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " -> ");
            reversedHead = reversedHead.next;
        }
        System.out.println("null");
    }
}


/*
https://leetcode.com/problems/delete-node-in-a-linked-list/description/
There is a singly-linked list head and we want to delete a node node in it.

You are given the node to be deleted node. You will not be given access to the first node of head.

All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

    The value of the given node should not exist in the linked list.
    The number of nodes in the linked list should decrease by one.
    All the values before node should be in the same order.
    All the values after node should be in the same order.
*/

package a2z.step6.lec1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class delete_a_node_in_linked_list {

    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; // Cannot delete the last node using this method
        }
        node.val = node.next.val; // Copy the next node's value to the current node
        node.next = node.next.next; // Skip the next node
    }

    // Function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating linked list: 4 -> 5 -> 1 -> 9 -> null
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("Original Linked List:");
        printList(head);

        // Deleting node with value 5 (we have access to the node itself, not head)
        deleteNode(head.next); // head.next is the node with value 5

        System.out.println("Linked List after deleting node with value 5:");
        printList(head);
    }
}

/*
https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-node-in-doubly-linked-list

*/
package a2z.step6.lec2;

// Definition for a Node in Doubly Linked List

public class DeleteNodeInDLL {

    // Function to delete a node at position x (1-based index)
    public static Node deleteNode(Node head, int x) {
        if (head == null) return null; // Edge case: Empty list

        // Case 1: Deleting the head node
        if (x == 1) {
            head = head.next;
            if (head != null) { // Ensure we don't access null.prev
                head.prev = null;
            }
            return head;
        }

        // Case 2: Traverse to the node at position x
        Node current = head;
        for (int i = 1; i < x; i++) {
            current = current.next;
        }

        Node prev = current.prev;
        Node next = current.next;

        // Case 3: Deleting the last node
        if (next == null) {
            prev.next = null;
            return head;
        }

        // Case 4: Deleting a middle node
        prev.next = next;
        next.prev = prev;

        return head;
    }

    // Helper function to print the doubly linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main function to test the deleteNode function
    public static void main(String[] args) {
        // Creating a sample doubly linked list: 1 <-> 2 <-> 3 <-> 4 <-> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.println("Original List:");
        printList(head);

        // Delete node at position 3 (1-based index)
        head = deleteNode(head, 3);
        System.out.println("After deleting node at position 3:");
        printList(head);

        // Delete head node
        head = deleteNode(head, 1);
        System.out.println("After deleting head:");
        printList(head);

        // Delete last node
        head = deleteNode(head, 3);
        System.out.println("After deleting last node:");
        printList(head);
    }
}

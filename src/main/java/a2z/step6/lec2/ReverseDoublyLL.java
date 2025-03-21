/*
https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reverse-a-doubly-linked-list
Reverse a Doubly Linked List
*/

package a2z.step6.lec2;


public class ReverseDoublyLL {
    public static Node reverseDLL(Node head) {
        Node current = head;
        Node temp = null;

        // Swap next and prev for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;  // Move to next node (was prev)
        }

        // Update head to the last processed node
        return (temp == null) ? head : temp.prev;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original DLL:");
        printList(head);

        head = reverseDLL(head);
        System.out.println("Reversed DLL:");
        printList(head);
    }
}

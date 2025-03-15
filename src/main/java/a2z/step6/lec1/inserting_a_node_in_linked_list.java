/*
https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion
Given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return t
he modified Linked List.


*/

package a2z.step6.lec1;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class inserting_a_node_in_linked_list {

    // Function to insert a node at the end of the linked list.
    public static Node insertAtEnd(Node head, int x) {
        // If the list is empty, create a new node and return it as head
        if (head == null) {
            return new Node(x);
        }

        // Traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert new node at the end
        temp.next = new Node(x);
        
        return head;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Original Linked List:");
        printList(head);

        head = insertAtEnd(head, 40);

        System.out.println("Linked List after insertion:");
        printList(head);
    }
}


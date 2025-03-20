package DSA_made_easy_by_NK.linked_lists;

public class ReverseSinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void reverseLinkedList() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next; // Store next node
            current.next = prev; // Reverse link
            prev = current; // Move prev to current node
            current = next; // Move current to next node
        }
        head = prev; // Update head to the last node
    }

    public static void main(String[] args) {
        ReverseSinglyLinkedList rsll = new ReverseSinglyLinkedList();
        rsll.add(1);
        rsll.add(10);
        rsll.add(11);
        rsll.add(100);
        rsll.add(101);
        rsll.add(110);
        rsll.add(111);

        System.out.println("Original List:");
        rsll.printList();

        rsll.reverseLinkedList(); // Reverse the list

        System.out.println("Reversed List:");
        rsll.printList();
    }
}

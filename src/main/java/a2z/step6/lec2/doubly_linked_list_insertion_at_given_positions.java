/*
https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=insert-a-node-in-doubly-linked-list

*/

package a2z.step6.lec2;

public class doubly_linked_list_insertion_at_given_positions {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        Node temp = head;
        
        // Traverse to the p-th node
        for (int i = 0; i < p; i++) {
            if (temp == null) return head; // Handle invalid p (shouldn't happen as per constraints)
            temp = temp.next;
        }
        
        // Create new node
        Node newNode = new Node(x);
        
        // Insert newNode after temp
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;

        // If newNode is not the last node, update the next node's prev pointer
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

        return head;
    }
}

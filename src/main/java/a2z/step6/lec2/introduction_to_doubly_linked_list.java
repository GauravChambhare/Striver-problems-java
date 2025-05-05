/* 
https://www.geeksforgeeks.org/problems/introduction-to-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-doubly-linked-list

*/

package a2z.step6.lec2;

class Node1 {
    int data;
    Node1 next;
    Node1 prev;

    Node1(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

class introduction_to_doubly_linked_list {
    public Node1 constructDLL(int[] arr) {
        if (arr.length == 0) return null;

        Node1 head = new Node1(arr[0]); // Create head Node1
        Node1 prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node1 temp = new Node1(arr[i]); // Create new Node1
            prev.next = temp;  // Link forward
            temp.prev = prev;  // Link backward
            prev = temp;  // Move prev pointer
        }
        
        return head; // Return the head of DLL
    }

    // Helper method to print DLL
    public void printDLL(Node1 head) {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        introduction_to_doubly_linked_list sol = new introduction_to_doubly_linked_list();
        int[] arr = {1, 2, 3, 4, 5};
        Node1 head = sol.constructDLL(arr);
        sol.printDLL(head); // Output: 1 2 3 4 5
    }
}

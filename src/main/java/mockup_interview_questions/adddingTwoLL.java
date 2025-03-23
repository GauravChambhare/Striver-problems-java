package faang_questions;

public class adddingTwoLL {
    class ListNode1{
        int data ;
        ListNode1 next;
    
        ListNode1(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    ListNode1 head ;
    public ListNode1 adder(ListNode1 l1, ListNode1 l2){

        return null;
    }
    public static ListNode reverseRecursive(ListNode head) {
        // Base case: if the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse the rest of the list
        ListNode newHead = reverseRecursive(head.next);

        // Reverse the current node's pointer
        head.next.next = head;
        head.next = null;

        // Return the new head of the reversed list
        return newHead;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the list
        head = reverseRecursive(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}

package DSA_made_easy_by_NK.linked_lists;

public class InsertNodeInSortedlL {
    public class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private int length=0;
    Node head = null;
    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        length++;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node temp = head;
        while(temp!=null){
            sb.append(temp.data).append(" --> ");
            temp = temp.next;
        }
        sb.append("NULL ]");
        return sb.toString();
    }
    public void putInSortedLL(Node node) {
        if (head == null || node.data > head.data) {
            node.next = head;
            head = node;
            return;
        }

        Node temp = head;
        Node current = head;

        // ✅ Fix: Avoid infinite loop by checking `current != null` first
        while (current != null && node.data < current.data) {  // Descending order fix
            temp = current;
            current = current.next;
        }

        node.next = current;
        temp.next = node;
    }

    public static void main(String[] args) {
        InsertNodeInSortedlL llist = new InsertNodeInSortedlL();
        // System.out.println(llist.isEmpty());
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.push(7);
        System.out.println(llist);
        llist.putInSortedLL(llist.new Node(6));//Non-static inner classes must be instantiated using an instance of the outer class.
        // new Node(6) doesn’t work because Node is not static, and it needs an instance of InsertNodeInSortedlL.
        System.out.println(llist);

    }
}

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
    public void push(int data){
        if(head==null){ 
            head = new Node(data); 
            length++;
            return; 
        }
        Node node = new Node(data); //adding new node at head itself instead of tail
        node.next = head;
        head  = node;
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

    public static void main(String[] args) {
        FindNthNodeFromEnd llist = new FindNthNodeFromEnd();
        // System.out.println(llist.isEmpty());
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.push(6);
        System.out.println(llist);

    }
}

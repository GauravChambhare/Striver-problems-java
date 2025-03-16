package DSA_made_easy_by_NK.linked_lists;

public class FindNthNodeFromEnd {
    public class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    private int length=0;

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
    public int nthNodeFromEnd(int n){
        // initialie 2 pointers
        Node ptemp = head;
        Node pNthNode = head;
        // moveptemp n times
        for(int i=0; i < n; i++){
            if(ptemp==null){
                throw new RuntimeException("List has nodes less than "+n + " nodes");
            }
            ptemp = ptemp.next;
        }
        //now ptemp has reached nth position from head
        // now we will move both ptemp and pNthNode at the same time till ptemp becomes last node
        while(ptemp!=null){
            ptemp = ptemp.next;
            pNthNode = pNthNode.next;
        } 
        return pNthNode.data;//returning the data of nth node from end.
    }

    public static void main(String[] args) {
        FindNthNodeFromEnd llist = new FindNthNodeFromEnd();
    // System.out.println(llist.isEmpty());
        llist.push(9);
        llist.push(8);
        llist.push(14);
        llist.push(91);
        llist.push(2);
        llist.push(76);
        System.out.println(llist);
        System.out.println("3rd node from end in this list is : " + llist.nthNodeFromEnd(3));

    }
    
}

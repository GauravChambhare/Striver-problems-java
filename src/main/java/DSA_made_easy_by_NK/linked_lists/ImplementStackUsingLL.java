package DSA_made_easy_by_NK.linked_lists;



public class ImplementStackUsingLL {

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

    public int pop() { 
        if (head == null) { 
            throw new RuntimeException("Stack underflow"); // Proper error handling
        }
        int data = head.data;  // Store head data
        head = head.next; // Move head to the next node
        length--; // Decrement size
        return data;
    }
    


    public int peek(){ //reove and return node that was added last
        if(head==null){ 
            throw new RuntimeException("Stack is empty");
        }
        return head.data;

    }

    public boolean isEmpty(){//only if head is null/ LL is empty return true else retun false
        return head == null;
    }

    public int size(){
        return length;
    }

    public static void main(String[] args) {
        ImplementStackUsingLL stack = new ImplementStackUsingLL();
        // System.out.println(stack.isEmpty());
        stack.push(9);
        stack.push(8);
        stack.push(14);
        stack.push(91);
        stack.push(2);
        stack.push(76);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack);
        // System.out.println(stack.peek());
        // System.out.println(stack.isEmpty());
        System.out.println(stack.size());


    }
    
}

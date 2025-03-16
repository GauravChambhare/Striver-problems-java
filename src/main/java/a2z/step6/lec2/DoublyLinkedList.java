package a2z.step6.lec2;


public class DoublyLinkedList{
    Node head = null;
    int length = 0;

    public void insert(int data){
        Node node = new Node(data);
        node.data = data;
        if(head==null){ 
            head = node; 
        }
        else {
    
            head.prev = node;
            node.next = head;
            head = node;
        }
        length++;

    }
    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while(temp!=null){
            sb.append(temp.data).append("-->");
            temp = temp.next;
        }
        sb.append("null");

        return sb.toString();
    }

    public void insertAtPosition(int data, int position){
        if(position >= 0){
            Node node = new Node(data);
            Node temp = head;
            if(position > length){
                System.out.println("Invalid poisiton: position is greater than length ");
                return;
            }
            for(int i=0; i < position-1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next = node;
        }
        length++;
    }

    public static void main(String[] args) {
        DoublyLinkedList db = new DoublyLinkedList();
        db.insert(11);
        db.insert(9);
        db.insert(7);
        db.insert(2);
        db.insertAtPosition(10, 10);

        System.out.println(db);
    }
    
}

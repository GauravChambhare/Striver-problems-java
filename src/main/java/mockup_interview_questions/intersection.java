package faang_questions;

class ListNode{
    int data ;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
    
}

public class intersection {

    public static ListNode detectIntersection(ListNode l1, ListNode l2){

        ListNode current1 = l1;
        ListNode current2 = l2;
        while(current1!=current2){

            if(current1==null){
                current1 = l2;
            }
            else{
                current1 = current1.next;
            }
            if(current2==null){
                current2 = l1;
            }
            else{
                current2 = current2.next;
            }
        }

        return current1;
    }


    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;

        ListNode b1 = new ListNode(4);
        // b1.next = a2;

        ListNode ans = detectIntersection(a1, b1);
        if(ans==null){
            System.out.println("Both do not intersect");
        }
        else{System.out.println(ans.data);}
        
        
    }
    
}

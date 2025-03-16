package DSA_made_easy_by_NK.linked_lists;
// We have to check if given linked list ends in NULL or if it has cycel in it

import java.util.HashSet;
import java.util.Hashtable;

public class CheckForCycleInLL {
    
    public static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
// even if inefficient, it will still work
/*
    public boolean detectCycle(Node head){
        Node curr = head;
        Integer pos = 1;
        Hashtable<Integer, Node> table = new Hashtable<>();
        while(curr!=null){
            if(table.containsValue(curr)){
                return true;
            }
            table.put(pos, curr);
            pos++;
            curr = curr.next;
        }

        return false;
    }
*/
// this still not being moset optimal solution, is better than above solution.
    public boolean detectCycle(Node head){
        Node curr = head;
        //declare a hashset
        HashSet<Node> set = new HashSet<>();
        while(curr!=null){
            if(!set.add(curr)){// if element get successfuly added it is return true and false if not, here we are checking for false.
                return true; //since adding fails it means that cycle exist.
            }
            curr = curr.next;
        }
        return false;// no cycle;
    }

    public Node detectCycleFloyds(Node head){
        Node fastPtr = head;
        Node slowPtr = head;
        boolean loopExist = false;


        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr==fastPtr){  
                loopExist = true;
                break;
            }
        }
        if(loopExist){
            slowPtr = head;
            while(slowPtr!=fastPtr){
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }
            return slowPtr;
        }
        else{
            return null;
        }
    }


    public static void main(String[] args) {
        CheckForCycleInLL list = new CheckForCycleInLL();
        
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creating a cycle


        System.out.println("Detection using brute force :" + list.detectCycle(head)); // Output: true
        // System.out.println("Detection using Floyds algorithm :" + list.detectCycleFloyds(head));
        Node result = list.detectCycleFloyds(head);
        if(result!=null){
            System.out.println("Cycel is present and it starts at " + result.data + " node");
        }
        else {
            System.out.println("No cycle detected.");
        }
    }

}

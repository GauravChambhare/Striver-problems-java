/*
https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-nodes-of-linked-list
Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.
*/

package a2z.step6.lec1;

public class count_linked_list_nodes {
        // Function to count nodes of a linked list.
        public int getCount(Node head) {
            Node temp = head;
            int length = 1;
            while(temp.next!=null){
                length++;
                temp = temp.next;
            }
            return length;
        }
}

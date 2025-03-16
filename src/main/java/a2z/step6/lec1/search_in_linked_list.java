/*
https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-linked-list-1664434326
Search in Linked List

*/
package a2z.step6.lec1;

public class search_in_linked_list {
    static boolean searchKey(int n, Node head, int key) {
        // Code here

        Node temp = head;
        for(int i=1; i<=n; i++){
            if(temp.data==key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

package com.pratham.Easy;
//  https://practice.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-linked-list-1664434326
public class Search {
    class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }

    static boolean searchKey(int n, Node head, int key) {
        Node node = head;
        // traverse in the list
        while(node!=null) {
            // check if val is present at current node
            if(node.data==key){
                return true;
            }
            // move node pointer
            node = node.next;
        }
        // list ended, we didn't found target
        return false;
    }
}

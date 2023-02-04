//https://practice.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-linked-list-1664434326
package com.pratham.Easy;

public class Search {
    class Node{
        int data;
        Node next;
        Node(int a) {
            data = a;
            next = null;
        }
    }

    static boolean searchKey(int n, Node head, int key) {
        Node ptr = head;
        while(ptr!=null){
            if(ptr.data==key){
                return true;
            }
            ptr = ptr.next;
        }
        return false;
    }
}

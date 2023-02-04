//  https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-nodes-of-linked-list
package com.pratham.Easy;

public class countNodes {
    class Node{
        int data;
        Node next;
        Node(int a) {
            data = a;
            next = null;
        }
    }

    public static int getCount(Node head)
    {
        int count = 0;
        Node ptr = head;
        while(ptr!=null){
            count++;
            ptr = ptr.next;
        }
        return count;
    }
}

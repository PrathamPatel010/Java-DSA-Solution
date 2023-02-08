package com.pratham.Easy;
//  https://practice.geeksforgeeks.org/problems/introduction-to-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-doubly-linked-list
public class DLL {
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int x) {
            data = x;  next = null; prev=null;
        }
    }

    // Brute force
    Node constructDLL(int[] arr) {
        Node head=null;
        for(int i=0;i<arr.length;i++){
            if (head==null){
                Node node = new Node(arr[i]);
                head = node;
            } else{
                Node ptr = head;
                while (ptr.next!=null){
                    ptr = ptr.next;
                }
                Node node = new Node(arr[i]);
                ptr.next = node;
                node.prev = ptr;
            }
        }
        return head;
    }

    // Optimized
    Node constructDLL2(int[] arr) {
        Node head = null;
        //last for traversalin linkedList
        Node last = null;

        for (int i = 0; i < arr.length; i++) {
            // first case when head is null, this can also safe you if arr is blank
            if (head == null) {
                Node node = new Node(arr[i]);
                head = node;
                // for head- next and prev will be null intially
                head.next = null;
                head.prev = null;
                // set last as head, we'll use last for traversal now
                last = head;
            } else {
                Node node = new Node(arr[i]);
                last.next = node;
                node.prev = last;
                last = last.next;
            }
        }
        return head;
    }
}

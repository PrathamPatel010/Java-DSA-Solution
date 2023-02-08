package com.pratham.Easy;
//  https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion
public class LLinsertion {

    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }

    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x) {
        if (head==null){
            Node node = new Node(x);
            head = node;
            return head;
        }
        Node node = new Node(x);
        node.next = head;
        head = node;
        return head;
    }

    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        if (head==null){
            Node node = new Node(x);
            head = node;
            return head;
        }
        Node ptr = head;
        while (ptr.next!=null){
            ptr = ptr.next;
        }
        Node node = new Node(x);
        ptr.next = node;
        return head;
    }
}

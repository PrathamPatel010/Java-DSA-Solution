package com.pratham.Easy;
//  https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    // Brute force : Find length of list, traverse till that node
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode node = head;
        while (node!=null) {
            length++;
            node = node.next;
        }

        int mid = length/2;
        node = head;
        for (int i=0;i<mid;i++){
            node = node.next;
        }
        return node;
    }

    // Optimized : Using slow-fast pointer
    // As fast pointer moves twice nodes than slow
    // when fast pointer will at end of list, slow will be at mid
    public ListNode middleNode1(ListNode head) {
        if (head==null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null && fast.next==null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



}

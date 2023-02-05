package com.pratham.Easy;
//  https://leetcode.com/problems/middle-of-the-linked-list/description/
public class MiddleNode {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    // Approach-1: using length of list
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode node = head;
        while (node!=null){
            length++;
            node = node.next;
        }
        int mid = length/2;

        node = head;
        for(int i=1;i<=mid;i++) {
            node = node.next;
        }
        return node;
    }
}

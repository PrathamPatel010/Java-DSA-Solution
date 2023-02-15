package com.pratham.Medium;
//  https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class RemoveNthNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int length = 0;
        while (node!=null) {
            length++;
            node = node.next;
        }

        if(length==1) {
            head = null;
            return head;
        } else if(length<=n){
            head = head.next;
            return head;
        }

        node = head;
        for(int i=1;i<length-n;i++) {
            node = node.next;
        }
        if(node!=null && node.next!=null) {
            node.next = node.next.next;
        }
        return head;
    }
}

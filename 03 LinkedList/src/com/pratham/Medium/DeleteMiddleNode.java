package com.pratham.Medium;
//  https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
public class DeleteMiddleNode {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteMiddle(ListNode head) {
        int length = 0;
        ListNode node = head;
        while(node!=null) {
            length++;
            node = node.next;
        }
        if(length==1) {
            head = null;
            return head;
        }
        int index = (length/2);
        node = head;
        for(int i=0;i<index-1;i++){
            node = node.next;
        }
        if(node!=null && node.next!=null) {
            node.next = node.next.next;
        }
        return head;
    }
}

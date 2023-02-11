package com.pratham.Easy;
//  https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Iterative approach : In one pass
    public ListNode reverseList(ListNode head) {
        if(head==null) {
            return null;
        }
        // we can do it using 3 pointer
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;

        while(pres!=null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null){
                next = next.next;
            }
        }
        head = prev;
        return head;
    }
}

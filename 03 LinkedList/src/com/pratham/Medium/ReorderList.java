package com.pratham.Medium;
//https://leetcode.com/problems/reorder-list/
public class ReorderList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}
    }

    public void reorderList(ListNode head) {
        if (head==null || head.next==null) {
            return;
        }
        // find the middle node and reverse second half
        ListNode mid = mid(head);
        ListNode fhead = head;
        ListNode shead = reverse(mid);
        while (fhead!=null) {
            ListNode temp = fhead.next;
            fhead.next = shead;
            fhead = temp;

            temp = shead.next;
            shead.next = fhead;
            shead = temp;
        }
    }

    static ListNode reverse(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;
        while (pres!=null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null) {
                next = next.next;
            }
        }
        head = prev;
        return head;
    }

    static ListNode mid(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

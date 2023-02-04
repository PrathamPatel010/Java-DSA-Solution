package com.pratham.Easy;
//  https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
public class RemoveDuplicates {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        // check if head is null
        if (node==null){
            return node;
        }
        // traverse through the list
        while (node.next!=null) {
            // check if current node & next node is same
            if (node.val==node.next.val){   // change the next part of current node
                node.next = node.next.next;
            } else{     // just traverse ahead
                node = node.next;
            }
        }
        return head;    // in the end, just return head
    }
}

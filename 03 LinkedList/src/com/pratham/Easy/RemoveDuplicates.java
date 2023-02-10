package com.pratham.Easy;
//  https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicates {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        // check if list is empty
        if (node==null){
            return node;
        }
        // traverse in the list
        while(node.next!=null) {
            // check if current and next node node holds same value
            if (node.val==node.next.val){
                // skip next node
                node.next = node.next.next;
            } else{
                // just traverse to next node
                node = node.next;
            }
        }
        return head;
    }
}

package com.pratham.Easy;
//  https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode node = head;

        while (list1!=null && list2!=null) {
            if (list1.val<list2.val){
                // if list1 ele. is smaller, link that with node
                node.next = list1;
                list1 = list1.next;
                node = node.next;
            } else{
                // link node of second node
                node.next = list2;
                list2 = list2.next;
                node = node.next;
            }
        }
        node.next = (list1!=null) ? list1 : list2;
        return head.next;
    }
}

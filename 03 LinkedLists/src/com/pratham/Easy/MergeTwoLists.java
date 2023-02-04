package com.pratham.Easy;
//  https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // creating a new list head
            ListNode ansHead = new ListNode();
            ListNode node = ansHead;

            while(list1!=null && list2!=null){
                if (list1.val < list2.val){
                    node.next = list1;
                    list1 = list1.next;
                    node = node.next;
                } else{
                    node.next = list2;
                    list2 = list2.next;
                    node = node.next;
                }
            }
            node.next = (list1!=null) ? list1 : list2;
            return ansHead.next;
        }
    }
}

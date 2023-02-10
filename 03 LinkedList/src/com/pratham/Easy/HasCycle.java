package com.pratham.Easy;
//  https://leetcode.com/problems/linked-list-cycle/
public class HasCycle {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // additional question
    public int lengthOfCycle(ListNode head){
        // check if list is empty
        if (head==null) {
            return 0;
        }

        ListNode fast = head;
        ListNode slow = head;

        // traverse on list
        // fast will move ahead by 2 nodes, slow will move by 1 node
        while (fast!=null && fast.next!=null) {
            // if they point to same node for instance, it means list cycle
            // otherwise fast will point to null before slow can complete traversing
            slow = slow.next;
            fast = fast.next.next;

            int length = 0;
            if (fast==slow) {
                // move only slow pointer until it reaches fast
                ListNode temp = slow;
                do{
                    length++;
                    temp = temp.next;
                }while (temp!=fast);
                return length;
            }
        }
        // out of loop, fast pointing to null.
        // list has no cycle
        return 0;
    }
    // Brute force : changing node values
    public boolean hasCycle(ListNode head) {
        ListNode node = head;
        // check if list is empty
        if (node==null) {
            return false;
        }

        while (node.next!=null) {
            // check if value of current node is flag value
            // if yes, means you are again visiting this, thus list has cycle.
            if (node.val==Integer.MIN_VALUE){
                return true;
            } else{
                // change value of each node you visit
                node.val = Integer.MIN_VALUE;
                node = node.next;
            }
        }
        // out of the loop, list has no cycle
        return false;
    }

    // Optimized : fast & slow pointers
    public boolean hasCycle2(ListNode head) {
        // check if list is empty
        if (head==null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        // traverse on list
        // fast will move ahead by 2 nodes, slow will move by 1 node
        while (fast!=null && fast.next!=null) {
            // if they point to same node for instance, it means list cycle
            // otherwise fast will point to null before slow can complete traversing
            slow = slow.next;
            fast = fast.next.next;

            if (fast==slow) {
                return true;
            }
        }
        // out of loop, fast pointing to null.
        // list has no cycle
        return false;
    }
}

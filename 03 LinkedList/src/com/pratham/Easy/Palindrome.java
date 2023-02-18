package com.pratham.Easy;
//  https://leetcode.com/problems/palindrome-linked-list/
public class Palindrome {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

        public boolean isPalindrome(ListNode head) {
            // find the middle node of list
            ListNode mid = mid(head);
            // reverse the second half
            ListNode shead = reverse(mid);
            ListNode node = head;
            boolean ans = true;
            while (node!=null && shead!=null) {
                if (node.val != shead.val) {
                    ans = false;
                    break;
                }
                node = node.next;
                shead = shead.next;
            }
            return ans;
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

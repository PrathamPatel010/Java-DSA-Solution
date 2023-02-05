package com.pratham.Easy;
//  https://leetcode.com/problems/linked-list-cycle/description/
public class HasCycle {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public boolean hasCycle(ListNode head) {
        // Using fast and slow pointers method
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            // fast will move ahead by 2 nodes & slow will move ahead by 1 node
            fast = fast.next.next;
            slow = slow.next;

            // at any point if they are equal, that means list has cycle
            if(fast==slow){
                return true;
            }
        }
        // fast becomes null, that means list does not have a cycle.
        return false;
    }

    // additional : find the length of cycle
    public int LengthOfCycle(ListNode head) {
        // Using fast and slow pointers method
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            // fast will move ahead by 2 nodes & slow will move ahead by 1 node
            fast = fast.next.next;
            slow = slow.next;

            // at any point if they are equal, that means list has cycle.
            if(fast==slow) {
                // calculate the length
                int length=0;
                do{     // we are using do-while because i want it to execute atleast once.
                    slow = slow.next;
                    length++;
                }while(slow!=fast);
                return length;
            }
        }
        // fast becomes null, that means list does not have a cycle.
        return 0;
    }
}

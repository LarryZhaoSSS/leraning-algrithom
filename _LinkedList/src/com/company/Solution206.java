package com.company;
public class Solution206 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val =x;}
    }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    public ListNode reverseListRecur(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode rev = reverseListRecur(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
}

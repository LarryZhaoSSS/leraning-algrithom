package com.company;

// remove  elements
public class Solution203 {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }
        if(head == null) {
            return null;
        }
        ListNode prev = head;
        while(prev.next != null) {
            if(prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }
    public ListNode removeByDummyHead(ListNode head,int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while(prev.next != null) {
            if(prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }
    public ListNode removeElementsByRecur(ListNode head,int val) {
        if(head == null) {
            return null;
        }
        ListNode res = removeElements(head.next,val);
        if(head.val == val) {
             return res;
        } else {
            head.next = res;
            return head;
        }
    }

    public static void main(String[] args) {

    }
}

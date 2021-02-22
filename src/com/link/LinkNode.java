package com.link;

public class LinkNode {

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

    public static ListNode swapPairs(ListNode head) {

        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode first = head;
        ListNode second = first.next;
        ListNode third = second.next;
        int count = 0;
        while (third.next != null) {
            first.next = third.next;
            second.next = first;
            if (count == 0)
                second = head;
            first = third;
            second = third.next;
            third = second.next;
        }


        return head;
    }

    public static void display(ListNode node){

        while(node!=null){
            System.out.println(node.val+" ");
            node = node.next;
        }
    }


    public static void main(String args[]){

    }
}



package com.link;


public class LinkedList {

    Node head;

    public static class Node{
    int data;
    Node next;
    Node(){

    }
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void display(LinkedList l){
        Node curr =l.head;
        System.out.println();
        if(curr==null)
            System.out.println("Empty Linked list");
        while(curr!=null){
            System.out.print(+curr.data+" ");
            curr=curr.next;
        }
    }
    public static LinkedList insertattail(LinkedList l,int d){
        Node curr=l.head;
        Node new_node = new Node(d);
        if(curr==null)
            l.head = new_node;
        else
        {
            while(curr.next!=null)
                curr=curr.next;

                curr.next=new_node;
        }
        return l;
    }

    public static LinkedList removeDups(LinkedList l){
        Node point = l.head;
        if(l.head==null) {
            System.out.println("List empty");
            return l;
        }
        Node curr = point.next;
        Node prev = point;
    while(point.next!=null) {
        while (curr != null) {
            if (curr.data == point.data)
                prev.next = curr.next;

            prev = curr;
            curr = curr.next;
        }
        point = point.next;
        curr = point.next;
        prev = point;
    }
        return l;

    }

    public static Node kElement(LinkedList l,int k){
        int count =0;
        Node knode = new Node();
        Node curr ;
        curr = l.head;
        if(l.head==null) {
            System.out.println("List empty");
            return null;
        }
        while(curr.next!=null){
            if(count==k) {
                knode = l.head;
                knode = knode.next;
            }
            if(count>k)
                knode = knode.next;
            count++;
            curr=curr.next;
        }
if(count<k){
    System.out.println("Invalid k");
    return null;
}
return knode;
    }


    public static Node middleDelete(LinkedList l){
        int count =1;
        Node m = l.head;
        Node curr = l.head;
        if(l.head==null) {
            System.out.println("List empty");
            return null;
        }
        while(curr!=null){
            if(count%2==1&&count>1)
                m = m.next;
            curr = curr.next;
            count++;
        }
return m;
    }

    public static LinkedList partition(LinkedList l,int d){
        Node curr = l.head;
        Node prev = l.head;
        Node point = new Node();
      if(curr.data<d)
        curr =curr.next;
        while(curr!=null)
        {
            if(curr.data<d)
            {
                point =new Node();
                point.data= curr.data;
                //if(curr.next!=null)
                point.next = curr.next;
                prev.next=curr.next;


                point.next=l.head;
              l.head=point;
                //curr=prev.next;
                curr = curr.next;
            }
            else {
                prev = curr;
                // if(curr.next!=null)
                curr = curr.next;
            }
        }


return l;
    }

    public static LinkedList sum(LinkedList l1,LinkedList l2){
        Node l1head = l1.head;
        Node l2head = l2.head;
        LinkedList sum = new LinkedList();
        int carry =0;
                int rem,total;
        Node sumhead = null;

        if (l1head  == null && l1head  == null)
            return null;
        else if (l1head  == null)
            return l2;
        else if (l2head  == null)
            return l1;

        while(l1head!=null && l2head!=null){
            sumhead = new Node();
            total = l1head.data + l2head.data +carry;
            rem = total%10;
            carry = total/10;

            if(l1head.next!=null && l2head.next!=null){
                sum.insertattail(sum,rem);
            }
            else
            {
                sum.insertattail(sum,total+carry);
            }
            l1head = l1head.next;
            l2head = l2head.next;
        }
        while(l1head!=null){
            total = l1head.data +carry;
            rem = total%10;
            carry = total/10;

            if(l1head.next!=null){
                sum.insertattail(sum,rem);
            }
            else
            {
                sum.insertattail(sum,total+carry);
            }
            l1head = l1head.next;
        }
        while(l2head!=null){
            total = l2head.data +carry;
            rem = total%10;
            carry = total/10;

            if(l2head.next!=null){
                sum.insertattail(sum,rem);
            }
            else
            {
                sum.insertattail(sum,total+carry);
            }
            l2head = l2head.next;
        }

        return sum;
    }

    public static void main(String[] args){

       /* LinkedList l = new LinkedList();
        l.insertattail(l,40);
        l.insertattail(l,3);
        l.insertattail(l,2);
       l.insertattail(l,1);
        l.insertattail(l,7);
        l.insertattail(l,2);
        l.insertattail(l,190);
        display(l);
        LinkedList l1 = new LinkedList();

        l1 = l.partition(l,5);

        java.util.LinkedList

        display(l1);*/

      //  l1 = l.removeDups(l);
      //  display(l1);
   /*     Node N = new Node();
        N = l.kElement(l,3);
        if(N==null){
            System.out.println("Invalid input");
        }
        else {
            System.out.println("Kth element is " + N.data);
        }

        N = l.middleDelete(l);
        System.out.println("Middle Element is: "+N.data);

    */

        LinkedList l1 = new LinkedList();
        l1.insertattail(l1,4);
        l1.insertattail(l1,3);
        l1.insertattail(l1,2);
        l1.insertattail(l1,2);
        l1.insertattail(l1,2);
        display(l1);
        LinkedList l2 = new LinkedList();
        l2.insertattail(l2,7);
        l2.insertattail(l2,6);
        l2.insertattail(l2,3);
        l2.insertattail(l2,7);
        l2.insertattail(l2,6);
        l2.insertattail(l2,3);
        display(l2);

        LinkedList l3 = new LinkedList();

        l3 = sum(l1,l2);
        display(l3);

    }

}

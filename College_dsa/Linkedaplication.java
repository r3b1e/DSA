import java.util.LinkedList;

import org.w3c.dom.Node;

import java.util.*;
public class Linkedaplication {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  Node merge(Node head){
        if(head == null || head.next ==null){
            return head;
        }
    //  to find midle
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node sec = slow.next;
    slow.next = null;
    Node left = merge(head);
    Node right = merge(sec);
      return sort(left, right);
    }
    public  Node sort(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
           if(head1.data>head2.data){
            temp.next=head2;
            temp=head2;
            head2=head2.next;
           }
           else{
            temp.next=head1;
            temp=head1;
            head1=head1.next;
           }
        }
        while(head1!=null){
            temp.next=head1;
            temp=head1;
            head1=head1.next;
        }
        while(head2!=null){
            temp.next=head2;
            temp=head2;
            head2=head2.next;
        }
         return mergedLL.next;
    }
    public void zig(Node head){
        // to find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next;
        }
        Node curr = slow.next;
        slow.next=null;
        Node pre = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        Node head1=head;
        Node head2 = pre;
        Node help1;
        Node help2;
        while(head1 !=null && head2 != null){
            help1=head1.next;
            head1.next=head2;
            help2=head2.next;
            head2.next=help1;
            head1=help1;
            head2=help2;
        }
    }
    public static void main(String[] args) {
        Linkedaplication ll = new Linkedaplication();
        // LinkedApplication app = new LinkedApplication();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);

        // head = ll.merge(head);
        ll.zig(head);
        // Print the merged linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

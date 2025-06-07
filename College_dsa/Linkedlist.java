import java.nio.file.SecureDirectoryStream;

import org.w3c.dom.Node;

public class Linkedlist{
    public static class Node{
        int data;
        Node next;
      public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newnode=new Node(data);
       if(head==null){
        head=tail=newnode;
        return;
       }
       newnode.next=head;
       head=newnode;
       size++;
    }
    public void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        size++;
    }
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newnode=new Node(data);
        int i=0;
        Node temp=head;
        while(i!=idx-1){
           temp=temp.next;
           i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
        return;
    }
    public void length(){
        System.out.println(size);
    }
    public void removeLast(){
        if(head==tail){
            head=tail=null;
        }  
        else if(head==null){
           System.out.println("Empty");
        }
        int i=0; 
        Node temp=head;
        while(i!=size-1){
            temp=temp.next;
            i++;
        }
        temp.next=null;
        size--;
    }
    public void removeFirst(){
        if(head==tail){
            head=tail=null;
        }
        else if(head==null){
            System.out.println("Empty");
         }
        head=head.next;
        size--;
    }
    public void reverse(){
        Node pre=null;
        Node cur=tail=head;
        Node nex;
        while(cur!=null){
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
          head=pre;
        
    }
    public Node midFind(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast != null){
             slow=slow.next;
             fast=fast.next.next;
        }
        return slow;
    }
    public boolean pelen(){
        Node mid=midFind(head);
        Node pre=null;
        Node cur=mid;
        Node nex;
        while(cur!=null){
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        Node Right=pre;
        Node Left=head;
        while(Right!=null){
            if(Right.data != Left.data){
                return false;
            }
            Left=Left.next;
            Right=Right.next;
        }
        return true;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
        }
        System.out.println("null");
    }
    public void removecycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle;
        while(slow != fast){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=head;
        Node pre=null;
        while(slow!=fast){
            pre=fast;
            slow=slow.next;
            fast=fast.next;
        }
        pre.next=null;
    }
    public void removerec(int idx, int val){
        head=helperrec(head, idx, val);
    }
    public Node helperrec(Node head, int idx, int val){
        if(idx==0){
            Node temp = new Node(val);
            temp.next=head;
            return temp;
        }
        head.next=helperrec(head.next, idx-1, val);
        return head;
    }
    public void removereapeate(){
        int[] arr=new int[10];
        Node pre=null;
        Node curr=head;
        while(curr!=null){
            arr[curr.data]+=1;
            if(arr[curr.data]>1){
               pre.next=curr.next;
               curr=curr.next;
            }
            else{
                pre=curr;
                curr=curr.next;
            }
        }
    }
    public void cycle(){
        Node slow = head;
        Node fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow=head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
    }
    public void between(int n, int m){
        int i=0;
        Node temp = head;
        while(i < n - 1){
        temp = temp.next;
        i++; 
        }
        temp.next=reverse(temp.next, i, m);
    }
    public Node reverse(Node head1, int i, int m){
        Node pre=null;
        Node cur=head1;
        Node nex;
        while(i<m){
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
            i++;
        }
        head1.next=cur;
        return pre;
        
    }
        public static void main(String[]args){
        Linkedlist ll=new Linkedlist();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        // System.out.println(ll.pelen();
        // ll.removerec(2, 99);
        ll.print();
       ll.between(2, 4);
       ll.print();
    }
}

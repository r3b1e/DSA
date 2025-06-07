public class DLL {
    public  class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        Node head;
        Node tail;
        public void addFirst(int data){
            Node node = new Node(data);
            if(head == null){
                head=tail=node;
                return;
            }
            node.prev=null;
            node.next=head;
            head.prev=node;
            head=node;
        }
        public void print(){
            Node temp= head;
            while(temp != null){
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
            System.out.println("null");
        }public void printrev(){
            Node temp= tail;
            while(temp != null){
                System.out.print(temp.data+"<->");
                temp=temp.prev;
            }
            System.out.println("null");
        }

    
    public static void main(String[] args) {
        DLL ll = new DLL();
        ll.addFirst(5);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.addFirst(9);
        ll.print();
        ll.printrev();
    }
}

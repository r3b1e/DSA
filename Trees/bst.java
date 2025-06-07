class Node{
    int val;
    Node right;
    Node left;
    Node(int val){
        this.val = val;
        right = null;
        left = null;
    }
}
public class bst {
    public static Node add(Node root, int data){
        if(root == null){
            Node node = new Node(data);
            return node;
        }
        else if(root.val>data){
            root.left = add(root.left, data);
        }
        else{
            root.right = add(root.right, data);

        }
        return root;
    }
    public static  void display(Node root){
          if(root == null){
            return;
          }
          System.out.print(root.val+" ");
          display(root.left);
          display(root.right);

    }
public static void search(Node root, int data){
    
    if(root == null){
        System.out.println("\nThere is no such value present");
      return;  
    }
    if(root.val == data){
        System.out.println("\nWe found an Element");
        return;
    }
    if(root.val>data){
        search(root.left, data);
    }
    else{
        search(root.right, data);
    }
}
public static Node delete(Node root, int data){
    if(root.val>data){
        root.left = delete(root.left, data);
    }
    else if(root.val<data){
        root.right = delete(root.right, data);
    }
    else{
        //case 1
        if(root.right == null && root.left == null){
            return null;
        }
        //case 2
        if(root.right == null){
            return root.right;
        }
        else if(root.left == null){
            return root.left;
        }
        //case 3
        Node temp = inordersucessive(root.right);
        root.val = temp.val;
        root.right = delete(root, temp.val);
    }
    return root;
}
public static Node inordersucessive(Node root){
    while(root.left != null){
        root = root.left;
    }
    return root;
}
    public static void main(String args[]){
         //creating root;
         Node root = new Node(4);
         add(root, 3);
         add(root, 2);
         add(root, 1);
         add(root, 5);
         add(root, 6);
         display(root);
         root = delete(root, 1);
        //  search(root, 7);
        System.out.println();
        display(root);

    }
}

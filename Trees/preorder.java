import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class preorder{
    public static void main(String[] args){
     Node bt = new Node();
     int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    //  System.out.println((bt.BinaryTree(arr, 0)).data);
    Node root = bt.BinaryTree(arr);
    //  bt.postorder(root);
    //  bt.iterativepreorser(root);
    int a = bt.diameter(root);
    System.out.println(a);
    }
}
class Node{
int data;
Node right;
Node left;
Node(){
    System.out.println("Tree Process is started");
}
Node(int data){
    this.data = data;
    this.right = null;
    this.left = null;
}
static int i = -1;
public Node BinaryTree(int[] arr) {
       i++;
    if (i >= arr.length || arr[i] == -1) return null;
    Node node = new Node(arr[i]);
    node.left = BinaryTree(arr);  // Left child index
    node.right = BinaryTree(arr); // Right child index
    return node;
}

public void preorder(Node root){
    if(root == null){
        return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
    return;
}
public void inorder(Node root){
    if(root == null) return;
    inorder(root.left);
    System.out.print(root.data+ " ");
    inorder(root.right);
}
public void postorder(Node root){
    if(root == null) return;
    inorder(root.left);
    inorder(root.right);
    System.out.print(root.data+ " ");
}
public void iterativepreorser(Node root){
    if(root == null){
        return;
    }
  Queue<Node> que = new LinkedList<>();
  que.add(root);
  que.add(null);
  while(!que.isEmpty()){
      Node currnode = que.remove();
      if(currnode == null){
        System.out.println();
        if(que.isEmpty()){
           break;
        }
        else{
            que.add(null);
        }
      }
      else{
        System.out.print(currnode.data+" ");
        if(currnode.right != null){
            que.add(currnode.right);
        }
        if(currnode.left != null){
            que.add(currnode.left);
        }
      }
  }
}
public int height(Node root){
   if(root == null){
    return 0;
   }
   int right = height(root.right);
   int left = height(root.left);
   return Math.max(right, left)+1;
}
public int noofnodeinthetree(Node root){
    if(root == null){
        return 0;
       }
       int right = noofnodeinthetree(root.right);
       int left = noofnodeinthetree(root.left);
       return right+left+1;
    } 
    public int diameter(Node root){
       if(root == null){
        return 0;
       }
       int rightdia = diameter(root.right);
       int heightright = height(root.right);
       int leftdia = diameter(root.left);
       int heightleft = height(root.left);
       int selfdai = heightleft+heightright+1;
       return Math.max(selfdai, Math.max(rightdia, leftdia));
    }
}

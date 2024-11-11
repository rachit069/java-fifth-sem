class Node{
    int data;
    Node left;
    Node right;
    public Node(int key){
        data = key;
    }
}
public class Intro {
    public static void inorder(Node n){
        if(n == null){
            return;
        }
        inorder(n.left);
        System.out.println(n.data);
        inorder(n.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.left = new Node(5);
        root.right.right = new Node(6);


        inorder(root);
    }    
}

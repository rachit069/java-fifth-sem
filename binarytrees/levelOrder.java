import java.util.*;

public class levelOrder {
    static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    }  
    static class BinaryTree{
        static int idx = -1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }
    public static void LevelOrder(Node root){
        if(root == null){
            return;
        }
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftnodes = countNodes(root.left);
        int rightnodes = countNodes(root.right);

        return leftnodes+rightnodes+1;
    }
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodeSum = sumOfNodes(root.left);
        int rightNodeSum = sumOfNodes(root.right);

        return leftNodeSum + rightNodeSum + root.data;
    }
    public static int sumOfLeftNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodeSum = sumOfNodes(root.left);

        return leftNodeSum + root.data;
    }
    public static int Height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = Height(root.left);
        int rightheight = Height(root.right);

        int maxHeight = Math.max(leftheight, rightheight)+1;
        // System.out.println(leftheight);
        // System.out.println(rightheight);
        return maxHeight;
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = Height(root.left) + Height(root.right) + 1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        LevelOrder(root);

        System.out.println("Number of Nodes: "+countNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(sumOfLeftNodes(root));
        System.out.println(Height(root));
        System.out.println("Diameter of this tree: "+diameter(root));
    }
}

public class homework {
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
    public static void preorder(Node n){
            if(n == null){
                return;
            }
            System.out.println(n.data);
            preorder(n.left);
            preorder(n.right);

        }
    public static void inorder(Node n){
        if(n == null){
            return;
        }
        inorder(n.left);
        System.out.println(n.data);
        inorder(n.right);
        }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
        // System.out.println(root.left.left.data);
        // System.out.println(root.left.left.left.data);

        preorder(root);
        inorder(root);
    }
}
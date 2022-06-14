public class MirrorTree {
    static void mirror(Node root)
    {
        Node temp = root;
        if(root == null)
            return;
        else
        {
            mirror(root.left);
            mirror(root.right);
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }

    static class Node
    {
        Node left;
        Node right;
        int data;
        public Node(Node  left, Node right, int data)
        {
            this.left = left;
            this.right = right;
            this.data = data;
        }
    }
}

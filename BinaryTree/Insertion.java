
public class Insertion {
    

    static Node insert(Node node, int x)
    {
        if(node == null)
            return node;
        
        if(x < node.data)
        node.left = insert(node.left, x);
        else
        node.right = insert(node.right, x);

        return node;
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

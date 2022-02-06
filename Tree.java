public class Tree {
    Node head;
    class Node 
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Node head, int data)
    {
        if(head == null)
        {
            head = new Node(data);
        } else {
            if(data < head.data)
            {
                head.left = insert(head.left,data);
            }
            else if(data> head.data) 
            {
                head.right = insert(head.right,data);
            }
        }
        return head;
    }

    public void printtree(Node head)
    {
       if(head.left != null) 
            printtree(head.left);
        System.out.print(head.data+" ");
        if(head.right != null)
        {
            printtree(head.right);
        }
                System.out.print(head.data+" ");
        }
       public static void main(String[] args) {
           try {
               
           Tree tree = new Tree();
           tree.insert(tree.head,10);
           tree.insert(tree.head,12);
           tree.insert(tree.head,3);
           tree.printtree(tree.head);
           } catch (Exception e) {
               
               System.err.println(e);
           }
       }
    
    
}

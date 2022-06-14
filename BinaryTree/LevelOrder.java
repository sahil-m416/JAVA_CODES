import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class LevelOrder
{
    public ArrayList<Integer> levelOrder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            for(int i=1;i<n;i++)
            {
                Node t = q.poll();
                list.add(t.data);
                if(t.left != null) q.add(t.left);
                if(t.right != null) q.add(t.right);
            }
        }
        return list;
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
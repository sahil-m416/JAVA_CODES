import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {
    
    static void topViewOfTree(Node root)
    {
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new ArrayDeque<Pair>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty())
        {
            Pair current = q.poll();
            if(!map.containsKey(current.hd))
                map.put(current.hd, current.node.data);
            if(current.node.left != null)
                q.add(new Pair(current.node.left, current.hd-1));
            if(current.node.right != null)
                q.add(new Pair(current.node.right, current.hd+1));
        }
        ArrayList<Integer> fin = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
            fin.add(entry.getValue());
        
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

    static class Pair
    {
        Node node;
        int hd;
        public Pair(Node node, int hd)
        {
            this.node = node;
            this.hd = hd;
        }
    }
}

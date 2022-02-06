public class LinkedListMatrix {
    class Node
    {
        int data;
        Node right, down;
        Node(int data)
        {
            this.data = data;
            right = null;
            down = null;
        }
    }
    static Node construct(int arr[][], int n)
    {
        Node temp=null;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp.data = arr[i][j];
                temp = temp.right;
            }
            temp = temp.down;
            
        }
        return temp;
    }
    
}

class OccurenceInLL
{
    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int data, Node next)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        
    }

    static int count(Node head, int integer)
    {
        Node temp = head;
        int count = 0;
        while(temp != null)
        {
            if(temp.data == integer)
            {
                count++;
            }
        }
        return count;
    }

}   
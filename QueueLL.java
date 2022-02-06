public class QueueLL
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    
    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        return false;
    }
    
    public void push(int data)
    {
        Node newNode = new Node(data);
        
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }
    
    public void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static void main(String args[])
    {
        QueueLL q = new QueueLL();
        q.push(1);
        q.push(2);
        q.print();
        
    }
}
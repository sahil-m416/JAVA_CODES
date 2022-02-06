public class StackLL
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
        else
        {
            return false;
        }
    }
    
    public void push(int data)
    {
        Node newNode = new Node(data);
        
        if(head == null)
        {
            head = newNode;
        }
        
        else
        {
            Node temp  = head;
            head = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }
    
    public int pop()
    {
        int popped = Integer.MIN_VALUE;
        if(head == null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            popped = head.data;
            head = head.next;
        }
        return popped;
    }
    
    public int peek()
    {
        if(head == null)
        {
            System.out.println("EMpty stack");
            return Integer.MIN_VALUE;
        }
        
        else
        {
            return head.data;
        }
        
    }
    
    public static void main(String args[])
    {
        StackLL sll = new StackLL();
        sll.push(10);
        sll.push(20);
        sll.push(30);
        System.out.println(sll.pop() + " Popped from stack");
        System.out.println("Top element is " + sll.peek());
    }
}
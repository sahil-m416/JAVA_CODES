class LList
{
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    static void append(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    static void printL(Node head)
    {
        Node temp = head;
        while(temp  != null)
        {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    
    static int midPoint(Node head)
    {
        Node single = head;
        Node doublep = head;
        while(doublep != null && doublep.next != null)
        {
            single = single.next;
            doublep = doublep.next.next;
        }
        return single.data;
    }
    
    public static void reverseList(Node head)
    {
        Node current = head, prev = null, next = null;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
            head = prev;
    }
    
    // recursive For reverse
    public static Node reverseRec(Node prev, Node current)
    {
        if(current == null)
            return prev;
        Node nextNode = current.next;
        current.next = prev;
        return reverseRec(current, nextNode);
    }
    public int nthFromEnd(int n)
    {
        int size = 0;
        Node temp = head;
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }
        temp = head;
        for(int i=1;i<(size-n)+1;i++)
        {
            temp = temp.next;
        }
        return temp.data;
    }
    
    public static void main(String args[])
    {
        LList list = new LList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.printL(head);
        list.reverseList(head);
        list.printL(head);
        System.out.println(list.nthFromEnd(2));
        System.out.println(list.midPoint(head));
    }
}
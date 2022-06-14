public class LinkedList {
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

    static void push(int data)
    {
        Node newNode = new Node (data);
        if(head == null)
        head = newNode;
        else{
            Node temp = head;
            while(temp.next != null)
            temp = temp.next;
            temp.next = newNode;
        }
    }
    static void printList(Node head)
    {
        if(head == null)
        return;
        else
        {
            Node temp = head;
            while(temp!= null)
            {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    static Node rotateList(Node head, int k)
    {
        if(head == null || k<1)
        return null;
        Node current = head;
        Node nextNode = null;
        int i = 1;
        while(i<k && current != null)
        {
            current = current.next;
            i++;
        }
        if(current == null || current.next == null)
        return null;
        else{
            Node kth = current;
            current = current.next;
            nextNode = kth.next;
            kth.next = null;
        }
        while(current.next != null)
        current = current.next;
        current.next = head;
        return nextNode;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.printList(head);

        list.printList(list.rotateList(head, 4));
    }
}

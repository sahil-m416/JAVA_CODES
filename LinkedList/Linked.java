public class Linked 
{
    static Node head;
    public static class Node{
        int data;
        Node next;
        public Node(int data)
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
    public static void main(String[] args) {
        Linked list = new Linked();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);

    }
}
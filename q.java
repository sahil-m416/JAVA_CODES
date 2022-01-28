class q {
    Node head;
    class Node 
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    public void enqueue(int d)
    {
        Node new_node = new Node(d);
        if(head == null)
        {
            head = new_node;
        } else {
            Node temp = head;
            head = new_node;
            new_node.next = temp;
        }
    }

    public void dequeue()
    {
        if(head == null)
        {
            System.out.println("Cannot Dequeue ! Queue Empty");
        } else {
            Node temp = head;
            while(temp.next.next != null)
                temp = temp.next;
            temp.next = null;
        }
    }

    public void printQ()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        q que = new q();
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.printQ();
        que.dequeue();
        que.printQ();
        que.dequeue();
        que.printQ();

    }
}

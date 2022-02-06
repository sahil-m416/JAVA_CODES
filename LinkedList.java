public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void append(int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if (head == null) {
            head = new_node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public void insert_begin(int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (head == null) {
            head = new_node;
        } else {
            Node temp = head;
            head = new_node;
            new_node.next = temp;

        }
    }

    public void pop_begin() {
        if (head == null) {
            System.out.println("List Empty ! Cannot Pop anything ");
        } else {
            Node temp = head;
            head = temp.next;
        }
    }

    public void pop_end() {
        if(head == null)
        {
            System.out.println("List Empty ! Cannot Pop anything. ");
        } else {
            Node temp = head;
            while(temp.next.next != null)
            {
               temp = temp.next;
            }
            temp.next= null;
        }

    }

    

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

   

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.printList();
        System.err.println("List after popping - ");
        list.pop_end();
        list.printList();
    }
}
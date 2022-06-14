
class findMiddle extends Linked
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
    static void printList(Node temp2)
    {
        if(temp2 == null)
        return;
        
        
            Node temp = temp2;
            while(temp!= null)
            {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        
    }

    public static int printMiddle(Node head)
    {
      if(head == null)
        return -1;
      else
      {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
          fast = fast.next.next;
          slow = slow.next;
        }
        return slow.data;
      }
    }

    static Node reverse(Node head)
    {
      Node current = head, prev = null, nextNode = head;
      while(current != null)
      {
        nextNode = current.next;
        current.next = prev;
        prev = current;
        current = nextNode;
      }
      return prev;
    }
    static Node reverseRecursive(Node head)
    {
      if(head == null || head.next ==  null)
      return head;
      Node newHead = reverse(head.next);
      Node headNext = head.next;
      headNext.next = head;
      head.next = null;
      return newHead;

    }
    public static void main(String[] args) {
        findMiddle list = new findMiddle();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.printList(head);
        System.out.println(list.printMiddle(head));
        list.printList(list.reverse(head));
        list.printList(list.reverseRecursive(head));
    }
}

public class nthnode 
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    void printnthNode(int n)
    {
        Node main_ptr = head;
        Node refr_ptr = head;
        int count = 0;
        if(head !=null)
        {
            while(count < n)
            {
                if(refr_ptr == null)
                {
                    System.out.println(n + " is greager than the no " + "of nodes in the llist ");
                    return;
                }
                refr_ptr = refr_ptr.next;
                count++;
            }
            if(refr_ptr == null)
            {
                if(head!=null)
                {
                    System.out.println("NOde no " + n +" from last Is "+ head.data);
                }
                else
                {
                    while(refr_ptr != null)
                    {
                        main_ptr = main_ptr.next;
                        refr_ptr = refr_ptr.next;
                    }
                    System.out.println("Node no " + n + " from last is " + main_ptr.data);
                }
            }
        }
    }
        public void push(int new_data)
        {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }
        
        public static void main(String args[])
        {
            nthnode l = new nthnode();
            l.push(10);
            l.push(12);
            l.push(14);
            l.push(1);
            
            l.printnthNode(3);
        }
    }

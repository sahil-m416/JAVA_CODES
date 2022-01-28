class Stack
{
    static final int Max = 1000;
    int top;
    int a[] = new int[Max];
    
    boolean isEmpty()
    {
        return (top<0);
    }
    
    Stack()
    {
        top = -1;
    }
    
    boolean push(int x)
    {
        if(top >= (Max - 1))
        {
            System.out.println("Stack Overflow");
            return false;
        }
        
        else
        {
            a[++top] = x;
            System.out.println(x + "PUshed into stack");
            return true;
        }
    }
    
    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }
    
    int peek()
    {
        if(top<0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = a[top];
            return x;
        }
    }
    
    void print()
    {
        for(int i=top;i>-1;i--)
        {
            System.out.print(" "+a[i]);
        }
    }
    
    public static void main(String args[])
    {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(20);
        s.push(20);
        s.push(90);
        s.push(10);
        System.out.println(s.pop() + " popped from stack");
        System.out.println("Top element" + s.peek());
        System.out.println("ALL ELEMENTS");
        s.print();
        System.out.println(s.isEmpty());
    }
}
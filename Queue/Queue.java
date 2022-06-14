class Queue
{
    int a[];
    int capacity;
    int rear;
    Queue(int n)
    {
        capacity = n;
        a = new int[n];
        rear = -1;
    }
    void enqueue(int data)
    {
        if(rear == capacity-1)
        {
            System.out.println("Queue full");
            return;
        }
        rear ++;
        a[rear] = data;
    }
    int dequeue()
    {
        if(rear == -1)
        {
            System.out.println("Queue Empty");
            return -1;
        }
        int result = a[0];
        for(int i=1;i<rear;i++)
            a[i] = a[i+1];
        rear--;
        return result;
    }
    int getFront()
    {
        if(rear == -1)
        {
            System.out.println("Queue Empty");
            return -1;
        }
        return a[0];
    }
    void printQ()
    {
        int i;
        for(i=0;i<=rear;i++)
        {
            System.out.print(a[i]);
        }
    }
    public static void main(String[] args) {
        Queue que = new Queue(4);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(4);
        que.printQ();
    }
}
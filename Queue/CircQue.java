public class CircQue {
    int a[];
    int capacity;
    int rear = -1, front = -1;
    CircQue(int n)
    {
        capacity = n;
        a = new int[n];
    }

    //  Formula to create rear = (rear+1)%size 

    // if front = -1 && rear = -1
    // Queue Empty


    // if (rear + 1) % size == front 
    // Queue Full

    // DO NOT DO FRONT++ / REAR++
    // DO (REAR+1)%SIZE & (FRONT +1) % SIZE

    //IF FRONT == REAR
    // Only one element is present and do Rear = -1 & Front = -1

    void enqueue(int data)
    {
        if((rear+1)%capacity == front)
            return;
        if(front == -1)
            front = 0;
        rear = (rear+1)%capacity;
        a[rear] = data;
    }
    int dequeue()
    {
        if(front == -1)
            return -1;
        int result = a[front];
        if(front == rear)
            front = rear = -1;
        else
            front = (front+1)%capacity;
        return result;
    }
    void printQ()
    {
        for(int i=front;i<=rear;i=(i+1)%capacity)
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args) {
        CircQue q = new CircQue(4);
        q.enqueue(4);
        q.enqueue(2);
        q.enqueue(3);
        q.printQ();
        q.dequeue();
        q.printQ();
    }
}
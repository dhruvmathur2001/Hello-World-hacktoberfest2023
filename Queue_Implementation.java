import javax.management.QueryExp;

public class MyQueue 
{
    private int capacity;
    private int rear;
    private int QueueArray[];
    private int front;
    private int size;

    public MyQueue(int s)
    {
        capacity=s;
        rear=-1;
        QueueArray= new int[capacity];
        front=0;
        size=0;
    }

    public void enqueue(int e)
    {
        if(size==capacity)
              {
                System.out.println("Overflow");
                return;
              }
        
        rear=(rear+1)%QueueArray.length;
        if(front==-1)
        {
            front++;
        }
        QueueArray[rear]=e;
        size++;
        System.out.println(e + " is added to the queue");

    }

    public void dequeue()
    {
        if(rear==-1)
        {
             System.out.println("Underflow");
             return;
        }
        int p= QueueArray[front];
        size--;
        front=(front+1)%QueueArray.length;
        System.out.println(p + " is popped out of the stack");
    }

    public void display()
    {
        int i= front;
        System.out.println(front);
        while(i!=rear)
        {
            System.out.println(QueueArray[i]);
            i=(i+1)%QueueArray.length;
        }
    }    
    public static void main(String args[])
    {
       MyQueue sv= new MyQueue(7);
        sv.enqueue(1);
        sv.enqueue(2);
        sv.enqueue(3);
        sv.enqueue(4);
        sv.enqueue(5);
        sv.enqueue(6);
        sv.enqueue(7);
        //sv.enqueue(8);
        sv.dequeue();
        sv.dequeue();
        sv.enqueue(8);
        sv.enqueue(9);
        sv.display();
    }
}

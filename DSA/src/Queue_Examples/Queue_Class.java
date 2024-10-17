package Queue_Examples;

public class Queue_Class 
{
	private int Q[], MaxSize, front,rear;

	public void create_Queue(int size)
	{
	MaxSize = size;//init MaxSize 
	front = 0;
	rear=-1;
	Q= new int[size];//create queue 
	}

	void Enqueue(int e) 
	{
	rear++;
	Q[rear]=e;
	System.out.println("Element " + e + " Inserted in Queue");
	}

	boolean is_Full()
	{
	if (rear == MaxSize - 1)
	return true;
	else
	return false;
	}

	int Dequeue()
	{
	int temp = Q[front];
	front++;
	return (temp);
	}

	boolean is_Empty() 
	{
	if (front>rear)
	return true;
	else
	return false;
	}

	void print_Queue()
	{
		//lifo print 
		System.out.println("Queue has");
	for (int i = front; i <=rear; i++)
	{
	System.out.print(Q[i]+"--");
	}
	
	
	}
}
package Linked_List_examples;

public class Dynamic_Queue_Class 
{
Node front,rear;
void create_Queue()
{
front=rear=null;
}

void Enqueue(int data)
{
Node n = new Node(data);
if (rear==null)
{
front=rear=n;
}
else
{
rear.next=n;
rear=n;
}
System.out.println(data + " inserted");

}
void Dequeue() {
if ( front==null) {
System.out.println("Empty Queue");
}
else {
Node t;
t = front;//1 if(front==rear)//single node front=rear=null;//reset else
front=front.next;
System.out.println(t.data + " dequeued");
}
}
void print_queue() {
if (front == null)
System.out.println("Queue Empty");
else
  {
           Node t = front;
           while (t != null) {
           System.out.print("|" + t.data + "|---");
           t = t.next;
    }
   }
  }

}

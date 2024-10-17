package Queue_Examples;

import java.util.Scanner;

public class Queue_Main {

	public static void main(String[] args) {

        Queue_Class obj=new Queue_Class();
        //Circular_Queue_Class obj=new Circular_Queue_Class();
        Priority_Queue_Class obj1=new Priority_Queue_Class();
        Scanner in=new Scanner(System.in);
        int ch;
        System.out.println("Enter size of queue:");
        int size=in.nextInt();
        obj1.create_Queue(size);//creating stack
        do
        {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print:\n0.Exit :");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    if(obj1.is_Full()!=true)// !obj.isFull()
                    {
                        System.out.println("Enter element:");
                        int e=in.nextInt();
                        obj1.Enqueue(e);
                    }
                    else
                        System.out.println("Queue is Full");
                    break;

                case 2:
                    if(obj1.is_Empty()!=true)// !obj.isEmpty()
                    {

                        int e=obj1.Dequeue();
                        System.out.println("Element Dequeued:"+e);
                    }
                    else
                        System.out.println("queue Empty");
                    break;

                case 3:
                    if(obj1.is_Empty()!=true)// !obj.isEmpty()
                    {
                        System.out.println("Elements in queue:");
                        obj1.print_Queue();
                    }
                    else
                        System.out.println("Queue Empty");
                    break;

                case 0:
                    System.out.println("Exiting thank for using code");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;

            }

        }while(ch!=0);
    }

}
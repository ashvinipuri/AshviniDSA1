package Linked_List_examples;

import java.util.Scanner;

public class Dynamic_Queue_Class_Main 
{
    Node front, rear;

    void create_Queue() {
        front = rear = null;
    }

    void Enqueue(int data) {
        Node n = new Node(data);
        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
        System.out.println(data + " inserted");

    }

    void Dequeue() {
        if (front == null) {
            System.out.println("Empty Queue");
        } else {
            Node t;
            t = front;//1
            if (front == rear)//single node
                front = rear = null;//reset
            else
                front = front.next;
            System.out.println(t.data + " dequeued");
        }
    }

    void print_queue() {
        if (front == null)
            System.out.println("Queue Empty");
        else {
            Node t = front;
            while (t != null) {
                System.out.print("|" + t.data + "|---");
                t = t.next;
            }
        }
    }

    public static void main(String args[]) {
        Dynamic_Queue_Class obj = new Dynamic_Queue_Class();
        Scanner in = new Scanner(System.in);
        int ch;
        obj.create_Queue();//creating stack
        do {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print:\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                        System.out.println("Enter element:");
                        int e = in.nextInt();
                        obj.Enqueue(e);
                        break;
                case 2:
                       obj.Dequeue();
                       break;

                case 3:
                        System.out.println("Elements in queue:");
                        obj.print_queue();
                        break;

                case 0:
                    System.out.println("Exiting thank for using code");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;

            }

        } while (ch != 0);
    }
}

//Write a menu driven program for singly linked list-
//-	To create linked list.
//-	To display linked list
//-	To search node in linked list.
//-	Insert at last position


package Assignment5;

import java.util.Scanner;

import Linked_List_examples.Linked_List_Class;
import Linked_List_examples.Node;

public class Singly_LinkedList 
{
	Node root;//linked list uses container ship-uses has a relation


	void create_list() {
	    root = null;//preparing with empty root
	}

	void display_list() {
	    if (root == null)
	        System.out.println("List Empty");
	    else {
	        Node t = root;
	        while (t != null) {
	            System.out.print("|" + t.data + "|->");
	            t = t.next;
	        }
	    }
	}

	void search_list(int data) {
	    if (root == null)
	        System.out.println("List Empty");
	    else {
	        Node t = root;
	        while (t != null) {
	            if (t.data == data)//match found
	            {
	                System.out.println(t.data + " found in list");
	                break;
	            }
	            t = t.next;
	        }
	        if (t == null)//not found
	            System.out.println(data + " not found in list");
	    }
	}

	
	void insert_after(int key,int new_data) {
	    Node n = new Node(new_data);
	    if (root == null)
	        System.out.println("List Empty");
	    else {
	        Node t = root;
	        while (t != null) {
	            if (t.data == key)//match found
	            {
	                System.out.println(t.data + " found in list");
	                n.next = t.next;//1
	                t.next = n;
	                System.out.println(new_data + " inserted in list");
	                break;
	            }
	            t = t.next;
	        }
	        if (t == null)//not found
	            System.out.println(key + " not found in list");

	    }
	   
	}
	public static void main(String args[]) {
        Linked_List_Class obj = new Linked_List_Class();
        Scanner in = new Scanner(System.in);
        int ch, e = 0;
        obj.create_list();//creating LinkedList
        do {
            System.out.println("\n1.Insert after\n2.Search element in List\n3.Display\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    break;
                case 2:
                    obj.print_list();
                    break;
                case 3:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.search_list(e);
                    break;
               
                case 4:
                    System.out.println("Enter element to insert after:");
                    e = in.nextInt();
                    System.out.println("Enter element to search:");
                    int key = in.nextInt();
                    obj.insert_after(key,e);
                    System.out.println("Element Inserted");
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Wrong option selected");
                    break;

            }

        } while (ch != 0);
    }
}

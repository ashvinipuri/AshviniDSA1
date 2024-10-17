import java.util.Scanner;

import Linked_List_examples.Circular_Doubly_LinkedList_Class;

public class Circular_Doubly_LinkedList_Main 
{
	 public static void main(String args[])
	 {
		 Circular_Doubly_LinkedList_Class obj = new Circular_Doubly_LinkedList_Class();
	        Scanner in = new Scanner(System.in);
	        obj.insert_End(1);
	        obj.insert_End(2);
	        obj.insert_End(3);
	        obj.insert_End(4);

	        System.out.println("Traverse Forward:");
	        obj.traverseForward(); // 

	        System.out.println("Traverse Backward:");
	        obj.traverse_Backward(); 

	        obj.remove_Front();
	        System.out.println("After removing from front:");
	        obj.traverseForward();

	        obj.remove_End();
	        System.out.println("After removing from end:");
	        obj.traverseForward(); 
	    }
}
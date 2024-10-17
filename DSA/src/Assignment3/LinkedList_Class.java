//question 3

package Assignment3;

import java.util.Scanner;

public class LinkedList_Class 
{
	Node root;

	void create_list()
	{
		root = null;
	}

	void insert_left(int data)
	{
		Node n = new Node(data);
		if (root == null) 
		{
			root = n;
		} else {
			n.next = root;
			root = n;
		}
	}

	void print_list() 
	{
		if (root == null)
			System.out.println("List Empty");
		else 
		{
			Node t = root;
			while (t != null) 
			{
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
		}
	}

	public static void main(String[] args) 
	{

		LinkedList_Class obj = new LinkedList_Class();
		Scanner in = new Scanner(System.in);
		int n;

		System.out.println("Enter elements:");
		n = in.nextInt();
		while (n != 0) {
			int k = n % 10;
			obj.insert_left(k);
			n = n / 10;
		}

		System.out.println("Data is : ");
			obj.print_list();

	}

}

package Assignment;

import java.util.Scanner;



public class String_Reverse_Main 
{

	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		String_Reverse obj = new String_Reverse();// object created 
		System.out.println("Enter size of string:");
		int size = in.nextInt();
		obj.create_string(size);
		int ch, e;
		do {
			System.out.println("string Menu");
			System.out.println("-----------");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Print all elements");
			System.out.println("0.Exit");
			System.out.println("-----------");
			System.out.println("Choice:");
			ch = in.nextInt();
			switch (ch) 
			{
			case 1:
				if (obj.is_Full() != true) 
				{ // not full
					System.out.println("Enter a number:");
					e = in.nextInt();
					obj.push(e);
				} else 
				{
					System.out.println("string Full");
				}
				break;
			case 2:
				if (obj.is_Empty() != true) 
				{ // not empty
					System.out.println("Element poped is " + obj.pop());
				} else
				{
					System.out.println("string Empty");
				}
				break;
			case 3:
				if (obj.is_Empty() != true) { // not empty
					System.out.println("Element @peek is " + obj.peek());
				} else

				{
					System.out.println("string Empty");
				}
				break;
			case 4:
				if (obj.is_Empty() != true) 
				{ // not empty
					System.out.println("Elements in string are\n");
					obj.print_string();
				} else 
				{
					System.out.println("string Empty");
				}
				break;
			case 0:
				System.out.println("Thanks for using code");
				break;
			default:
				System.out.println("Wrong option selsected:");
				break;
			}

		} while (ch != 0);
	}
}



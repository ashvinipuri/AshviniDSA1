package Stack_Examples;

public class Stack_Char_Class
{
	private int MaxSize, tos;
	private int[] stack;
	public void create_Stack(int size) 
	{
		tos = -1;
		stack = new int[size];
		MaxSize = size;
	}
	void push(char e) 
	{
		tos++;
		stack[tos] = e;
		System.out.println("Element " + e + " Pushed :");
	}
	boolean is_full()
	{
		if (tos == MaxSize - 1)
			return true;
		else
			return false;
	}
	int pop() 
	{
		char temp = (char) stack[tos];
		tos--;
		return (temp);
	}
   char peek() 
   {
		return (char) (stack[tos]);
	}
	boolean is_empty() 
	{
		if (tos == -1)
			return true;
		else
			return false;
	}
	void print_Stack() {// lifo print 
		System.out.println("Stack has");

		for (int i = tos; i >= 0; i--) 
		{ 
			System.out.println(stack[i]);
		}
	}
}
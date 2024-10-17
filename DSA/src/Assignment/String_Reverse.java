package Assignment;

public class String_Reverse
{
	
		private int string[], MaxSize,tos;
		public void create_string(int size)
		{
			tos= -1;  //init tos
			string=new int[size];  //create string
			MaxSize=size;  //init MaxSize
		}

		public void push(int e)
		{
			tos++;
			string[tos]=e;
			System.out.println("Element "+e+" pushed:");
		}

		public boolean is_Full()
		{
			if(tos==MaxSize-1)
				return true;
			else
				return false;
		}

		public int pop()
		{
			int temp=string[tos];
			tos--;
			return(temp);
		}
			//return(string[tos--]);
			
			public boolean is_Empty() 
			{
				if (tos == -1)
				return true;
				else
				return false;
				}

				public int peek()
				{
				return (string[tos]);
				}
				
				public void print_string() {//lifo print 
				System.out.println("string has");
				for (int i = tos; i >= 0; i--) 
				{
				System.out.println(string[i]);
				}

		     }
	}



// Write a program which accept the string and reverse each word of the string using Static implementation of stack.
//Example: Input - This is an input string
//   Output - sihTsinatupnignirts.


package Assignment5;

import java.util.Scanner;

public class String_Reverse 
{
	private  int MaxSize, tos;
    private char stack[];

    public void create_Stack(int size) 
    {
        tos = -1;
        stack = new char[size];
        MaxSize = size;
    }

    void push(char e) 
    {
        tos++;
        stack[tos] = e;
    }

    boolean is_Full() {
        if (tos == MaxSize - 1)
            return true;
        else
            return false;
    }

    char pop() {
        char temp = stack[tos];
        tos--;
        return (temp);

    }

    boolean is_Empty() {
        if (tos == -1)
            return true;
        else
            return false;
    }

    char peek()
    {
        return (stack[tos]);
    }

    void print_Stack() 
    {
        System.out.println("Stack has");
        for (int i = tos; i >= 0; i--) 
        {
            System.out.println(stack[i]);
        }

    }

public static void main(String args[])
{
		
        Scanner in = new Scanner(System.in);
        
        String_Reverse obj = new String_Reverse();
        
        System.out.println("Enter word");
        String word=in.nextLine();
        
        obj.create_Stack(word.length());
        
        for(int i=0;i<word.length();i++)
            obj.push(word.charAt(i));
        
        String r_word="";
        while(obj.is_Empty()!=true)
            r_word+=obj.pop();

        System.out.println("Reverse is:"+r_word);
    }
}


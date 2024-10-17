package Stack_Examples;

import java.util.Scanner;

public class Wellness_Control
{
   static boolean check_welness(String word)
    {
        Stack_Char_Class obj = new Stack_Char_Class();//object created
        obj.create_Stack(word.length());
        for(int index=0;index<word.length();index++)
        {
            if(word.charAt(index)=='{')
                obj.push('{');
            else if (word.charAt(index)=='}')
            {
                if(obj.is_empty()!=true)
                {
                    char g=(char) obj.pop();
                }
                else
                    return false;
            }
        }
        
        return obj.is_empty();
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter data:");
        String word=in.next();//read word from user
        System.out.println(word+"is balanced:"+check_welness(word));
    }
}

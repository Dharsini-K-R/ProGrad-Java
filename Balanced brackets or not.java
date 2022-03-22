/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/ 
import java.util.*;
import java.util.Stack;

public class Main
{
    static boolean isBlancedOrNot(String str)
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='{'||ch=='('||ch=='[')
            {
                stack.push(ch);
            }
            if(stack.isEmpty())
                return false;
            switch(ch)
            {
              case '}':
              if(!stack.peek().equals('{'))
              return false;
              stack.pop();
              break;
              case ')':
              if(!stack.peek().equals('('))
              return false;
              stack.pop();
              break;
              case ']':
              if(!stack.peek().equals('['))
              return false;
              stack.pop();
              break;
            }
        }
        return(stack.isEmpty());
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(isBlancedOrNot(str))
		{
		    System.out.println("Balanced");
		}
		else
		{
		    System.out.println("Not Balanced");
		}
	}
}

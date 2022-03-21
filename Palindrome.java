/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/ 
import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev  = "";
		int l=0;
		int h=str.length()-1;
		for(int i=str.length()-1;i>=0;i--)
		{
		    rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
		    System.out.println("Palindrome");
		else 
		{
		    while(l<h)
		    {
		    if(str.charAt(l)!=str.charAt(h))
		    {
		        
        		str = str + str.charAt(l);
        		l++;
		    }
        		l++;
        		h--;
		    } 
		    System.out.println(str);
		}
		    
	}
}




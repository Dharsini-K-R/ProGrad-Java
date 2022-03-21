/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/ 
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main
{
	public static void main(String[] args)
	{
	    char ch;
	    Scanner sc=new Scanner(System.in);
	    String str1=sc.nextLine();
	    String str2=sc.nextLine();
	    /*System.out.println(str1);
	    System.out.println(str2);*/
	    Map map1=new HashMap<String,Integer>();
	    Map map2=new HashMap<String,Integer>();
	    
	    for(int i=0;i<str1.length();i++)
	    {
	        ch=str1.charAt(i);
	        //System.out.println(ch);
	        if(map1.containsKey(ch))
	        {
	            Integer count =new Integer ((Integer) map1.get(ch));//It read the repeated value and update it to count
	            count+=1;//here count value comes increases 
	            map1.put(ch,count);
	        }
	        else
	        {
	            map1.put(ch,1);//if the element occurs 1st it update its value to 1
	        }
	    }
	        for(int i=0;i<str2.length();i++)
	        {
	        ch=str2.charAt(i);
	        if(map2.containsKey(ch))
	        {
	            Integer count =new Integer ((Integer) map2.get(ch));
	            count+=1;
	            map2.put(ch,count);
	        }
	        else
	        {
	            map2.put(ch,1);
	        }
	        }
	   /* System.out.println(map1);
	    System.out.println(map2);*/
	    if(map1.equals(map2))
	    {
	        System.out.println("Strings are Anagrams");
	    }
	    else
	    {
	        System.out.println("Strings are not an Anagrams");
	    }
	}
}


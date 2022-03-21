/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/ 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int temp;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i+=2)
		{
		    if(i+1==n)
		    {
		        break;
		    }
		    temp = arr[i];
		    arr[i]=arr[i+1];
		    arr[i+1]=temp;
		}
		for(int i=0;i<n;i++)
		{
		    System.out.println(arr[i]);
		}
		
	}
}


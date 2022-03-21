/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/ 
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements:");
		int n = sc. nextInt();
		System.out.println("Enter the value of k:");
		int k = sc.nextInt();
		int arr[] = new int [n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if((arr[i] * arr[j]==k)||(arr[j] * arr[i]==k))
		        count ++;
		        
		    }
		}
		System.out.println(count);
	}
}


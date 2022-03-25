package IPChecker;

import java.util.Scanner;

public class IPChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println(validate( str1));
	}
	public static Boolean validate(String str) 
	{
		String[] str2 = str.split("\\.");
		if(str2.length != 4)
			return false;	
		int n=(int) Integer.parseInt(str2[str2.length-1]);
		if(n==0 || n==255)
			return false;
		for(int i = 0; i< str2.length;i++ ) 
		{
				int c = Integer.parseInt(str2[i]);
				if(c<0 || c>255) 
					return false;
			
				else return true;
		}
		return true;
	}
}

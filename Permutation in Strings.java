/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
    public static Integer Factorial(Integer var)
    {
        int fact = 1;
        for(int i=1;i<=var;i++){    
        fact=fact*i;    
        }
        return fact;
    }
    public static void main(String[] args) 
    {
        int result;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map<Character, Integer> str1 = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) 
        {
            if (str1.containsKey(ch)) 
            {
                str1.put(ch, str1.get(ch) + 1);
            }
            else
            {
                str1.put(ch, 1);
            }
        }
            result = Factorial(str.length());
  
        for (Map.Entry<Character, Integer> entry :str1.entrySet())
        {
            result = result / Factorial(entry.getValue());
        }
            System.out.println(result);
    }
}




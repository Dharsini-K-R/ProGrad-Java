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
  
  Scanner s = new Scanner(System.in);
  String pr = s.nextLine();
  int flag = 0;
  for (int i=0;i<pr.length()-1;i++)
  {
      if((pr.startsWith("P")||pr.startsWith("R"))&&((pr.charAt(i) == 'P' && pr.charAt(i+1) =='R') || ( pr.charAt(i)=='R' && pr.charAt(i+1) =='P')))
      {
          flag = 1;
      }
      else
      {
          flag = 0;
          break;
      }
  }
  
  if (flag == 1)
      System.out.println("Perfect");
  else
      System.out.println("Imperfect");
  
 }
}


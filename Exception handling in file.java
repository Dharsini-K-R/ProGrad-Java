/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileExistException extends Exception
{
    public FileExistException()
    {
        super("FileExistException");
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	    File file = new File("newfile.txt");
	    try
	    {
	        boolean present = file.exists();
	        if(present==false)
	        {
	            file.createNewFile();
	            System.out.println("File Created");
	        }
	        else 
	        {
	            throw new FileExistException();
	        }
	        Scanner sc = new Scanner(System.in);
	        FileWriter fw = new FileWriter(file);
	        fw.write("Student Details:");
	        for(int i=0;i<3;i++)
	        {
        	    String rollNo=sc.next();
        	    String name=sc.next();
        	    String college=sc.next();
    	        fw.append('\n');
    	        fw.write(rollNo);
    	        fw.append('\n');
    	        fw.write(name);
    	        fw.append('\n');
    	        fw.write(college);
    	        fw.flush();
	        }
	        fw.close();
	    }
	    catch(IOException e)
	    {
	        System.out.println(e);
	    }
	    catch (FileExistException e)
	    {
	        System.out.println("File already exists:"+e);
	    }
	}
}

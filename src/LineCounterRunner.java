//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;
import java.io.FileNotFoundException;  

public class LineCounterRunner
{
   public static void main( String args[] ) throws FileNotFoundException
   {	
	   Scanner file1 = new Scanner(new File("LineCounter.txt"));
	   
	   while(file1.hasNextLine())
	   {
		   String St1 = file1.nextLine();
		   LineCounter C1 = new LineCounter(St1);
		   System.out.println(St1);
		   System.out.println(C1.toString());
	   }
	   
	   
	}
}
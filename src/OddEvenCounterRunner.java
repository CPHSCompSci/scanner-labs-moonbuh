//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;

public class OddEvenCounterRunner
{
   public static void main(String args[]) throws FileNotFoundException
   {
	   Scanner file1 = new Scanner(new File("OELine.txt"));
	   
	   while(file1.hasNextLine())
	   {
		   String St1 = file1.nextLine();
		   OddEvenCounter C1 = new OddEvenCounter(St1);
		   System.out.println(St1);
		   System.out.println(C1.toString());
	   }
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;
import java.io.*;
public class DogFoodRunner
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file1 = new Scanner(new File("DogFood.txt"));
		   
		   while(file1.hasNextLine())
		   {
			   String St1 = file1.nextLine();
			   DogFood C1 = new DogFood(St1);
			   System.out.println(St1);
			   System.out.println(C1.toString());
		   }
	}
}
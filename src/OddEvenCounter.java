//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
	   setLine("");
   }

   public OddEvenCounter(String s)
   {
	   setLine(s);
   }

	public void setLine(String s)
	{
		line = s;
	}

	public int getEvenCount()
	{
		
		int count= 0;
		Scanner S1 = new Scanner(line);
		while(S1.hasNextInt())
		{
			if((S1.nextInt()%2)==0)
			{

				count++;
			}
		}
		return count;
	}

	public int getOddCount()
	{
		int count= 0;
		Scanner S1 = new Scanner(line);
		while(S1.hasNextInt())
		{
			if((S1.nextInt()%2)==1)
			{

				count++;
			}
		}
		return count;
	}
	public String getAns()
	{
		return "Even Count = "+getEvenCount()+"\nOdd  Count = "+getOddCount();
	}
			
	

	public String toString( )
	{
		return getAns();
	}
}
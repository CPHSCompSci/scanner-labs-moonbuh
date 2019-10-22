//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class LineCounter
{
   private String line;

   public LineCounter()
   {
		setLine("");
   }

   public LineCounter(String s)
   {
	   setLine(s);
   }

	public void setLine(String s)
	{
		line = s;
	}

	public int getCount()
	{
		int count=0;	
		Scanner S1 = new Scanner(line);
		while(S1.hasNextInt())
		{
			S1.nextInt();
			count++;
		}
		return count;
	}

	public String getLine()
	{
		return "Count = "+getCount();
	}

	public String toString()
	{
		return getLine();
	}
}
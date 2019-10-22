//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
 private double amount;
   public DogFood()
   {		
   }

   public DogFood(String line)
   {
		int pound; pound = 0; 
		double cup = 0;

		//calc code goes here
		Scanner S1 = new Scanner(line);
		while(S1.hasNextInt())
		{
			pound = S1.nextInt();
			if(pound>=2&&pound<5)
			{
				cup+=.5;
			}else if(pound>=5&&pound<7)
			{
				cup+=1;
				
			}else if(pound>=8&&pound<10)
			{
				cup+=1.5;
			}else if(pound>=10&&pound<20)
			{
				cup+=2;
			}else if(pound>=20&&pound<40)
			{
				cup+=3.5;
			}else if(pound>=40&&pound<60)
			{
				cup+=4.5;
			}else if(pound>=60&&pound<80)
			{
				cup+=6;
			}else if(pound>=80)
			{
				cup+=7.5;
			}
			}
	   amount = (cup*7)/60;
	   amount = Math.ceil(amount);
   }

   public String getAmount()
   {
	   return amount+" - 10 POUND BAGS";
   }

	public String toString()
	{
		return getAmount();
	}
}
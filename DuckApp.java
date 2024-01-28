/*---------------------------------------------------------------------------------------------------------------
  			5) WAP to input the number and check number is duck or not using a Scanner class 
 ----------------------------------------------------------------------------------------------------------------*/


package PracticeQuestions;
import java.util.Scanner;
public class DuckApp 
{
	public static void main(String[] args) 
	{
		int number, i, rem;
		boolean flag = false;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("\tEnter number to check duck or not : ");
			number = sc.nextInt();
			
				for(i= number; i>0; i=i/10)
				{
					rem = i % 10;
					if(rem == 0)
					{
						flag = true;
						break;
					}
				}
				
			if(flag)
				System.out.println("\t"+ number + " Number is Duck Number");
			else
				System.out.println("\t"+ number + " Number is not Duck");
			
			sc.close();
		}
	}
}

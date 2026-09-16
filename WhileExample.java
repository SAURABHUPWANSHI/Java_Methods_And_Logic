package cdac;

import java.util.Scanner;

public class WhileExample
{

	public static int sumOfDigits(int num)
	{
		int digit=0;
		int sumofdigit =0;
		while(num!=0)
		{
			
			digit = num%10;
			sumofdigit = sumofdigit+digit;
			num = num/10;
			
			
		}
		
		return sumofdigit;
		
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
	
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int res=sumOfDigits(num);
		
		System.out.println("sum of given digit is "+res);
		
		
		
		
		
		
		
	}

	 
	
	
}

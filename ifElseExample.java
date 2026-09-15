package cdac;

import java.util.Scanner;

public class ifElseExample
{

	public static void main(String[] args) 
	{
		System.out.println("enter the value");
		Scanner s = new Scanner(System.in);
		int num  = s.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println("given number is Even");
		}else
		{
			System.out.println("given number is Odd");
			
		}
		
		
	} 
	
	
}

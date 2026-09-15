package cdac;

import java.util.Scanner;

public class InbuiltnonStaticMethodExample
{

	
	public static void main(String[] args) 
	{
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the student data");
		int sid = s.nextInt();
		float per = s.nextFloat();
		String name = s.next();
		
		System.out.println(sid);
		System.out.println(per);
		System.out.println(name);
		
		
		
	} 
	
	
}

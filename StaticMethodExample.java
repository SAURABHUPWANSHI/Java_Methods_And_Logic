package cdac;

public class StaticMethodExample
{

	
	public static String findOddEven(int num)
	{
        
       String res;
		
		if(num%2 == 0)
		{
			//System.out.println("given number is Even");
			res = "even";
		}else
		{
			//System.out.println("given number is Odd");
			res = "odd";
		}
		
		return res;
		
	}
	
	
//	public static void greeting()
//	{
//		System.out.println("welcome");
//	}
	
	
	
	public static void main(String[] args) 
	{
	
		String result;
	
		//StaticMethodExample.findOddEven();
		 int num  = 30;
		result=findOddEven(num);
		System.out.println(result);
		
		
		
	}
	
		
}

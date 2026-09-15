package cdac;

public class ifelseifExample 
{

	public static void main(String[] args) 
	{
	
		int sid = 1001;
		String name = "nsnathan";
		int projectMark = 50;
		char grade=' ';
		
		if(projectMark>80)
		{
			grade = 'A';
			
		}else if(projectMark>60)
		{
			grade = 'B';
			
		}else if(projectMark>50)
		{
			grade = 'C';
			
		}else
			grade = 'F';
		
		System.out.println(sid);
		System.out.println(name);
		System.out.println(grade);
		
		
		// another example
		
		int a =10;
		int b = 20;
		char op = '+';
		
		if(op == '+')
			System.out.println(a+b);
		else if(op == '-')
			System.out.println(a-b);
		else
			System.out.println("invalid operator");
		
		
		
		
		
		
	} 
	
	
}

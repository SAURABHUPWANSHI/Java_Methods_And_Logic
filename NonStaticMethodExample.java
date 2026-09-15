package cdac;

public class NonStaticMethodExample 
{

	
	public void greetings(String name)
	{
		System.out.println("welcome   " + name);
		
	}
	
	
	public static void main(String[] args) 
	{
		NonStaticMethodExample obj = new NonStaticMethodExample();
		
		String name = "nsnathan";
		obj.greetings(name);
		
		
	}	
		
	
}

package cdac;

public class LogicalOperatorExample
{


	public static void main(String[] args)
	{
	
		int sid = 1001;
		String name = "nsnathan";
		String qualification= "Msc";
		
		
				
		// AND
		
		
		int lab = 25;
		int ccee = 30;
		
		if(lab>16 & ccee>16)
		{
			System.out.println("PASS");
		}
		
		else
		{
			System.out.println("FAIL");
		}
		
		
		// OR 
		
		if(qualification=="Msc" ||qualification =="BTech")
		{
			
			System.out.println("eligible");
			
			
		}else
			System.out.println("not eligible");
		
		
		
		
		
	}
	
	
	
}

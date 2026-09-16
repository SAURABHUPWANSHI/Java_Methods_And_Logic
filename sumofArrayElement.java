package cdac;

public class sumofArrayElement
{

	
	
	public static int[] createintArray() 
	{
		int[] num = new int[5];

				

				num[0]=10;
				num[1]=20;
				num[2]=30;
				num[3]=40;
				num[4]=50;
				
				return num;
		
	}
	
	
	public static int findsum(int[] num) 
	{
		 int sum =0;
		 
		for(int i =0;i<5;i++)
		{
		System.out.println(num[i]);
        sum = sum +num[i];
		}
		return sum;
		
		
	}

	
	
	
}

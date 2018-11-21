package arrays;

public class Main {
	public static void main(String arg[]) 
	{
		helloWorld();
		int[] arrayOfInts = {1,2,3,4,5,6,7,8,9,10};
		for( int i:arrayOfInts){
			add(i, 3, false);
			System.out.println(i);
		}
	}

	public static void helloWorld() 
	{
		System.out.println("Hello World!");
	}

	

	public static int add(int number1,int number2,boolean isAnitaHungry)
	{		
		
		if( number1 == 0 ) 
		{
			
			return number2;
	
		}
		else if (number2 == 0) 
		{
			
			return number1;
		}
		
		else 
		{
			
			if(isAnitaHungry == true) 
			{
				int number3 = number1 + number2;
				return number3;
			}
			else 
			{
				int number3 = number1 * number2;
				return number3;
			} 
		}
	}	

}

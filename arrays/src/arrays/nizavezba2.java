package arrays;

public class nizavezba2 
{
	
	public static void main(String[] args) 
	{
		Integer array[] = new Integer [10];
	
	//array = [0,1,2,3,4,5,6..]
		
	//FOR CIKLUS
	
		for (int i = 0; i < array.length; i++) 
		{ 
 
			System.out.println("i=" + i);
			System.out.println("array["+ i +"]=" + array [i]);	
		}
		
		array[0] = array[0] + 10;
		array[1] = array[1] + 10;
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println("i=" + i);
			System.out.println("array["+ i +"]=" + array [i]);
		}
		
	
	}
}



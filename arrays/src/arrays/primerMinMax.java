package arrays;

public class primerMinMax 
{

	public static void main(String[] args) 
	{
		                  // 0  1  2  3  4  5  6  7  8  9
		 Integer niza[] = { 25,14,56,15,36,56,77,18,29,49};
		 minMax(niza); // povikuvanje na metodot za min-max
	}
	
	public static void minMax(Integer minMax[]) // metod za min-max
	{
		Integer max = minMax[0];
		Integer min = minMax[0];
		Integer size = minMax.length;
		
		for (int i = 1; i <= minMax.length - 1; i = i + 2) 
		{
			// PRVA PROVERKA
			if (i+1 == size)  // dali ima posleden broj od nizata
			{
				if ( minMax[i] > max)
				{
					max = minMax[i];
				}
				
				if (minMax[i] < min)
				{
					min = minMax[i];
				}
			}
			
			else
			// VTORA PROVERKA
			// 56 > 15
			if (minMax[i] > minMax[i+1]) //sporedbata na dva broevi
			{
				if (minMax[i] > max)
				{
					max = minMax[i];
				}
				if (minMax[i+1] < min)
				{
					min = minMax[i+1];
				}
			}
			
			//TRETA PROVERKA
			// 14 < 56
			if ( minMax[i] < minMax[i+1])  
			{
				if (minMax[i] < min)
				{
					min = minMax[i];
				}
				if (minMax[i+1] > max)
				{
					max = minMax[i+1];
				}
			}
		}
		
		System.out.println("Minimumot vo nizata e ---> " + min);
		System.out.println("Maksimumot vo nizata e ---> " + max);
	}
	
	
}

package arrays;

public class primerFindANumber 
{
	public static void main(String[] args) 
	{
		Integer niza[] = {1789, 2305, 1899, 1456, 2013};
		// dali odreden broj se sodrzi vo nizata
		
		contains(2305,niza);
		
	}
	
	public static Boolean contains(Integer number, Integer niza[])
	{
		for (int i = 0; i < niza.length; i++) 
		{
			System.out.println(niza[i]);
			if(number.equals(niza[i])) //ova e isto so number ==
			{
				System.out.println("Brojot go ima vo nizata");
				
			}
			System.out.println("Brojot go nema vo nizata");
		}
		return false;
	}
}

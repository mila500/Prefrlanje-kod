package arrays;

import java.util.Arrays;

public class primerRemoveElement 
{
	public static void main(String[] args) 
	{
		Integer niza[] = { 25,14,56,15,36,56,77,18,29,49};
		
		System.out.println("Originalnata niza" + Arrays.toString(niza));
		// OTSTRANI GO VTORIOT ELEMENT NA NIZATA ( INDEX = 1, VALUE = 14 )
		
		Integer removeIndex=1;
		
		for(int i = removeIndex; i < niza.length - 1; i++)
		{
			niza[i] = niza[i+1];
		}
		
		System.out.println("Modificirana niza" + Arrays.toString(niza));
		
		System.out.println("---------------Zadaca 2------------");
		Integer niza2[] = { 25,14,56,15,36,56,77,18,29,49};
		
		removeNumber(14, niza2);
		
	}
	//METOD ZA BRISENJE BROJ
	public static void  removeNumber(Integer n, Integer niza[])
	{
		System.out.println("Originalna niza" + Arrays.toString(niza));
		
		Integer indeks = findIndex(n, niza);
		for (int i = indeks; i < niza.length - 1; i++)
		{
			niza[i] = niza[i + 1];
		}
		
		System.out.println("Modificirana" + Arrays.toString(niza));
		
	}
	private static Integer findIndex(Integer n, Integer[] niza) 
	{
		for (int i = 0; i < niza.length; i++) 
		{
			if(niza[i] == n)
			{
				return i;
			}
		}
		return null;
	}
	
	
	
}

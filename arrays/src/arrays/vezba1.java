package arrays;

import java.util.Arrays;

public class vezba1 {
	public static void main(String[] args) 
	{
		Integer celiBroevi[] = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

		String tekst[] = { "Java", "Python", "C#", "C", "C++" };

		System.out.println(Arrays.toString(celiBroevi));
		Arrays.sort(celiBroevi); // sort metod od bibliotekata java.util, gi podreduva broevite po redosled
		System.out.println(Arrays.toString(celiBroevi));
		System.out.println(Arrays.toString(tekst));
		Arrays.sort(tekst); // sort metod
		System.out.println(Arrays.toString(tekst));
		
		////////////////////////////////////////////////
		
		// 2) Izdvoj gi vo posebna niza site broevi sto se pogolemi od 2 000
		
		// Integer arraySize = countNumbersLargerThan2k(celiBroevi); ( ova e nova promenliva za povikuvanje na metodot koja ne e zadolzitelna )
		// Integer pogolemiBroevi[] = new Integer[arraySize]; 
		
		Integer pogolemiBroevi[] = new Integer[countNumbersLargerThan2k(celiBroevi)]; //povikuvanje na metodot za broenje na kolku vkupno pogolemi broevi od 2k ima
		int j = 0;
		for(int i = 0; i < celiBroevi.length; i ++) 
		{
			if ((celiBroevi[i]) >= 2000)
			{
				pogolemiBroevi[j] = celiBroevi[i];
				j++;		
			}	
		}
		
		System.out.println(Arrays.toString(pogolemiBroevi));
		System.out.println(pogolemiBroevi.length);
		
		
	
}
	public static Integer  countNumbersLargerThan2k(Integer niza[])
	{
		Integer rezultat = 0;
		for(int i = 0; i < niza.length; i++)
		{
			if(niza[i] > 2000)
			{
				rezultat++;
			}
		}
		
		
		return rezultat;
		
	}
}



		
// for home --> metod za broenje na broevi pogolemi od 2 000
// deklariranje na dolzinata na nizata so nego
		


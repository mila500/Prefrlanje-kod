package arrays;

import java.util.Arrays;

public class primerFromTo
{
	public static void main(String[] args) 
	{
		Integer celiBroevi[] = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		// DA SE IZVADAT SITE BOREVI OD EDEN RANGE ; FROM-TO VO NOVA NIZA, DA PRESMETAME KOLKU BROEVI IMA TAKVI ZA DA JA UTVRDIME DOLZINATA NA NIZATA
		// 1) 	metod so argumenti from i to  
		
		System.out.println(Arrays.toString(fromTo(1700, 2300, celiBroevi)));
		
	}
	
	public static Integer[] fromTo(Integer from, Integer to, Integer niza[])
	{
		Integer rezLength = countNumbers(from,to, niza);
		Integer rez[] = new Integer [rezLength];
		Integer j = 0;
		for (int i = 0; i < niza.length; i++) 
		{
				if((niza[i] > from) && (niza[i] <to))
				{
					rez[j] = niza[i];
					j++;
				}
		}
		
		return rez;
		
	}
	
	public static Integer countNumbers (Integer from, Integer to, Integer niza[])
	{
		Integer res = 0;
		for (int i = 0; i < niza.length; i++) 
		{
			if ((niza[i] > from) && (niza[i] < to)) //mora da se ispolnat i dvata uslova && = AND
			{
				res++;
			}
			
		}
		return res;
		
	}
}

package exercises;

import java.util.ArrayList;
import java.util.Collections;


public class exercise1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(156);
		numbers.add(195);
		numbers.add(21);
		numbers.add(1476);
		numbers.add(56);
		numbers.add(11284817);
		numbers.add(64);
		numbers.add(406);
		numbers.add(344433);
		numbers.add(55);
		System.out.println(numbers);
		
	// 1 baranje - kolku broevi ima listata
		System.out.println("Golemina na listata" + numbers.size());
		
	// 2 baranje - kolku cifri ima sekoj broj, pr. ( 3,3,2,3 )
		ArrayList<Integer> brojNaCifri = new ArrayList<>();
		brojNaCifri = countDigits(numbers);
	
	System.out.println("Sekoj od broevite ima: " + countDigits(numbers) + " broevi ");
	
	// 3 baranje - da se presmeta po kolku broevi imaat isti broj na cifri, pr ( 1 cifra = 5 broja; 2 cifri = 8 broja; )
	istBrojNaCifri(brojNaCifri);
	
	System.out.println(istBrojNaCifri(brojNaCifri));
	
	// 4 baranje - kolku parni a kolku neparni broevi ima i kolkava e sumata na site parni/neparni broevi
	
	System.out.println("Vo listata ima: " + parniBroevi(numbers) + " parni broevi"); // kolku parni broevi ima
	System.out.println(" Lista so parni broevi: " + listaParniBroevi(numbers)); // lista so site parni broevi
	
	System.out.println(" Zbirot na neparnite broevi iznesuva: " + sumaNeparniBroevi(numbers)); // zbirot na neparnite broevi
	
	
	
	}
	
	// 2 baranje metod za broenje kolku cifri ima vo eden broj vo listata
	public static ArrayList<Integer> countDigits(ArrayList<Integer> lista )
	{
		Integer counter = 0;
		ArrayList<Integer> result = new ArrayList<>();
		for (Integer broj : lista) // za/izbroj go sekoj broj od listata
		{
			do 
			{
				counter++;
				broj = broj/10;
				
			}
			while(broj != 0);
			
			result.add(counter);
			counter = 0;
		}
		return result;
	}
	
	// 3 baranje metod za kolku broevi so ista kolicina na cifri ima vo listata
	public static ArrayList<String> istBrojNaCifri(ArrayList<Integer> lista)
	{
		ArrayList<String> result = new ArrayList<>();
		Integer counter = 0;
		
		for (Integer broj : lista) 
		{
			counter = Collections.frequency(lista, broj); // collections.frequency e metod za kolku pati se povtoruva eden broj vo listata
			String temp = broj + " cifri: " + counter;
			if ( !result.contains(temp)) // inverzno -> so ova se prekinuva dupliranjeto 
			// dokolku temp vekje ne se sodrzi vo rezultatnata lista, togas dodadi go temp, a dokolku se sodrzi togas preskokni i odi na sledno
			
			{
			result.add(temp);
			}
			
		}
		return result;
	}
	
	// 4 baranje metod za broenje na parni broevi, neparni
	public static Integer parniBroevi (ArrayList<Integer> lista)
	{
		Integer counter = 0;
		for (Integer broj : lista) 
		{
			if ( broj % 2 == 0)
			{
				counter++;
			}
		}
		return counter;
	}
	
	// smestuvanje na parnite broevi vo lista
	public static ArrayList<Integer> listaParniBroevi (ArrayList<Integer> lista)
	{
		ArrayList<Integer> res = new ArrayList<>();
		for (Integer broj : lista) 
		{
			if ( broj % 2 == 0)
			{
				res.add(broj);
			}
		}
		return res;
	}
	
	// suma na site neparni broevi
	public static Integer sumaNeparniBroevi (ArrayList<Integer> lista)
	{
		Integer resultat = 0;
		for (Integer broj : lista) 
		{
			if ( broj % 2 != 0)
			{
				resultat = resultat + broj;
			}
		}
		return resultat;
	}
	
	
	
	
	
}

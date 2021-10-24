package arrayLIst;

import java.util.ArrayList;

public class primerGetElement 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colors = new ArrayList<>();
		colors.add("White");
		colors.add("BLACK");
		colors.add("Red");
		colors.add("Orange");
		System.out.println("Colors: " + colors);
		
		String black = colors.get(1);;
		System.out.println("Color with index 1 is: " + black);
		// ILI 
		System.out.println(colors.get(2));
		
		ArrayList<Integer> broevi = new ArrayList<>();
		broevi.add(1);
		broevi.add(2);
		broevi.add(3);
		broevi.add(4);
		broevi.add(5);
		System.out.println(broevi);
		
		Integer parni = 0;
		parni = parniBroevi(broevi);
		System.out.println(parni);
		
		Integer neparni = 0;
		neparni = neparniBroevi(broevi);
		System.out.println(neparni);
		
		// POVIKUVANJE METOD PARNI NEPARNI
		ParniNeparni res = new ParniNeparni();
		res = parniNeparni(broevi);
		System.out.println(" Parni: " + res.getParni() + " Neparni: " + res.getNeparni());
		
		
		
	}
	
	// metod sto kje ni kaze kolku broevi ima vo listata
	public static Integer goleminaNaNiza ( ArrayList<String> niza,  Integer brojka)
	{
		Integer golemina = 0;
		for (String string : niza)
		{
			golemina++;
		}
		return golemina;
	}
	
	// metod sto kje ni kaze kolku parni broevi ima vo listata
	public static Integer parniBroevi (ArrayList<Integer> lista)
	{
		Integer count = 0;
		for (Integer broj : lista) 
		{
			if ( broj % 2 == 0)
			{
				count++;
			}
		}
		return count;
	}
	
	// metod sto kje ni kaze kolku neparni broevi ima vo listata
	public static Integer neparniBroevi (ArrayList<Integer> lista)
	{
		Integer count = 0;
		for (Integer broj : lista) 
		{
			if ( broj % 2 != 0)  // != znaci razlicno
			{
				count++;
			}
		}
		return count;
	}
	
	//metod sto kje ni vrati objekt sto sodrzi 2 parametri, paren i neparen i kje ni kaze kolku parni a kolku neparni elementi ima
	// KORISTIME OBJEKT KOJ SODRZI 2 PARAMETRA
	public static ParniNeparni parniNeparni(ArrayList<Integer> lista)
	{
		ParniNeparni result = new ParniNeparni();
		Integer parni = 0;
		Integer neparni = 0;
		
		for (Integer broj : lista) 
		{
			if ( broj % 2 == 0 )
			{
				parni ++;
			}
			else
			{
				neparni ++;
			}
		}
		
		result.setParni(parni);
		result.setNeparni(neparni);
		return result;
		
	}
	
	
	
	
	
	
	
	
}

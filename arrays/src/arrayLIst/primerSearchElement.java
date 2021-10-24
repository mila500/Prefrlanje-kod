package arrayLIst;

import java.util.ArrayList;

public class primerSearchElement 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colors = new ArrayList<>();
		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.add("Orange");
		System.out.println("Original array" + colors);
		
		// 1 NACIN - contains funkcija
		System.out.println(colors.contains("Red"));  //.contains e funkcijata
		
		System.out.println(ifContains(colors, "Red")); //ifContains e povikaniot metodot 
	}
	
	// 2 NACIN - poseben metod
	public static String ifContains(ArrayList<String> lista, String element)
	{
		if (lista.isEmpty())
		{
			return "Listata e prazna";
		} 
		else 
		{
			for (String boja : lista) 
			{
				if (boja == element)
				{
					return "Bojata postoi vo listata";
				}	
			}
			return "Bojata ne postoi";
		}
		
	}
	
}

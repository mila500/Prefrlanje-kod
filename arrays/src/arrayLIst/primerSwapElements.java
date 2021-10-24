package arrayLIst;

import java.util.ArrayList;
import java.util.Collections;

public class primerSwapElements 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Blue");
		colors.add("Red");
		colors.add("White");
		colors.add("Black");
		colors.add("Brown");
		
		System.out.println("Colors: " + colors);
		
		Collections.swap(colors, 0, 2);
		System.out.println("Swapped: " + colors);
		
		// swap 1 with 4
		
		String t = colors.get(4);
		colors.add(4, colors.get(1));
		colors.add(1, t);
		System.out.println("Modified: " + colors);
		// vaka se dupliraat vrednostite a so SET se menuvaat samo
		
	}
	
	// metod
	public static Integer vratiIndex(ArrayList<String> lista, String boja)
	{
		Integer index = 0;
		for (String color : lista) 
		{
			if( color == boja )
			{
				return index;
			}
			index ++;
		}
		return null;
		
	}
}

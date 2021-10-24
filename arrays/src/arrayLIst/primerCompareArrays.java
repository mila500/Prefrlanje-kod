package arrayLIst;

import java.util.ArrayList;

public class primerCompareArrays 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colors1 = new ArrayList<>();
		colors1.add("White");
		colors1.add("Black");
		colors1.add("Purple");
		colors1.add("Orange");
		colors1.add("Blue");
		System.out.println("Collors1 array: " + colors1);

		ArrayList<String> colors2 = new ArrayList<>();
		colors2.add("White");
		colors2.add("Black");
		colors2.add("Red");
		colors2.add("Orange");
		colors2.add("Blue");
		colors2.add("");
		System.out.println("Colors2 array: " + colors2);
		
		ArrayList<String> result = new ArrayList<>();
		for (String boja : colors1) // boja = element od prvata niza
		{
			if (colors2.contains (boja))  // dali vtorata lista go sodrzi elementot od prvata lista
			{
				result.add("True");
			}
			else
			{
				result.add("False");
				
			}
		}
		System.out.println(result);
		}
}
// ZA DOMA VIDI JA 15 ZADACA
// PROBAJ DA NAPRAVIS 4 NIZI I METOD ZA SPOREDBA I CONTAINS

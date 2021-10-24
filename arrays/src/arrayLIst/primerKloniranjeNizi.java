package arrayLIst;

import java.util.ArrayList;

public class primerKloniranjeNizi 
{
	public static void main(String[] args) 
	{
		ArrayList<String> lista1 = new ArrayList<>();
		ArrayList<String> result = new ArrayList<>();
		lista1.add("Orange");
		lista1.add("Blue");
		lista1.add("Red");
		lista1.add("White");
		lista1.add("Black");
		System.out.println("Prvobitna: " + lista1);
		
		result = (ArrayList<String>) lista1.clone();
		System.out.println("Klonirana: " + result);
		
	}
}

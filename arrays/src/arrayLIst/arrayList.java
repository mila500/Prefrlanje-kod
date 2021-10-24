package arrayLIst;

import java.util.ArrayList;

public class arrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println(fruits.isEmpty());
		
		// 1) ADD FUNKCIJA
		fruits.add("Apple"); 
		fruits.add("Orange");
		fruits.add(0, "Watermelon"); // gi overrida i ima prioritet zatoa sto stoi 0 napred
		
		// 2) FUNCKCIJA ZA DOBIVANJE INDEX
		System.out.println("Element with index 1 " + fruits.get(1)); 
		
		//System.out.println(fruits.toString());
		
		// 3) BRISENJE ELEMENT
		fruits.remove(0); 
		
		// 4) BRISENJE NA CELATA NIZA1
		fruits.clear();
		
		// 5) FOREACH, GI PRINTA EDNO PO EDNO
		for (String fruit : fruits)
		{
			System.out.println(fruit);
		}
		
		
		
	}
	
	
}

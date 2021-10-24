package Hash;

import java.util.HashMap;

public class HashMapExample 
{
	public static void main(String[] args) 
	{
		HashMap<String,String> mapa = new HashMap<String,String>();
		mapa.put("Name", "Suzuki");
		mapa.put("Power", "220");
		
		// brisenjeto na vrednosti se izvrsuva samo preku vnesuvanje na klucot
		mapa.remove("Power");
		
		System.out.println(mapa);
		
		mapa.entrySet(); // funkcijata gi naogja celata sodrzina
		mapa.keySet(); // funkcijata gi naogja site klucevi
		System.out.println(mapa.get("Name"));  // funkcijata gi vadi elementite
		
	}
}

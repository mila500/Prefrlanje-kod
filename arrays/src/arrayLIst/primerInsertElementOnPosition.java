package arrayLIst;

import java.util.ArrayList;

public class primerInsertElementOnPosition 
{
	public static void main(String[] args) 
	{
		ArrayList<String> lista = new ArrayList<>();
		lista.add("White");
		lista.add("BLack");
		lista.add("Red");
		System.out.println("First array: " + lista);
		
		lista.add(0, "Blue");
		System.out.println("Modified array: " + lista);
		
	}
}

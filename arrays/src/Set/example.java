package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import arrayLIst.arrayList;

public class example 
{
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<>();
		
		set.add("White");
		set.add("Black");
		set.add("Red");
		set.add("Blue");
		
		Iterator<String> i = set.iterator();
		while (i.hasNext()) 
		{
			String string = (String) i.next();
			System.out.println(string);
		}
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("eden"); lista.add("dva"); lista.add("tri");
		
	}
}

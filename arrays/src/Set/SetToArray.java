package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetToArray 
{
	public static void main(String[] args) 
	{
		HashSet<String> colorsSet = new HashSet<>();
		colorsSet.add("White");
		colorsSet.add("Blue");
		colorsSet.add("Red");
		colorsSet.add("Purple");
		
		ArrayList<String> colorsList = new ArrayList<>();
		
		colorsList = set2array(colorsSet); //povikuvanje na metodot za konvertiranje Hash Set vo Array
		System.out.println(colorsList);
		
		HashSet<Cars> carsSet = new HashSet<>();
		Cars opel = new Cars("Corsa", 2021, "Opel", "White", CarType.Offroad);
		Cars wv = new Cars("T-Rock", 2021,"Wv");
		
		carsSet.add(opel);
		carsSet.add(wv);
	}
	
	public static ArrayList<Cars> setToArrayCars(HashSet<Cars> set)
	{
		ArrayList<Cars> res = new ArrayList<>();
		Iterator<Cars> i = set.iterator();
		
		while (i.hasNext())
		{
			res.add(i.next());
		}
		return res;
	}
	
	
	public static ArrayList<String> set2array(HashSet<String> set)
	{
		ArrayList<String> result = new ArrayList<>();
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) 
		{
			result.add(iterator.next());
		}
		
		return result;
	}
}

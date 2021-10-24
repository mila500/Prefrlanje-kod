package arrayLIst;

import java.util.ArrayList;
import java.util.Collections;

public class primerCopyArray 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colors = new ArrayList<>();
		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.add("Orange");
		System.out.println("First array: " + colors);
		
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		System.out.println("Second array: " + numbers);
		
		Collections.copy(colors, numbers);
		System.out.println(colors);
		
	}
}

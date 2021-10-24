package arrayLIst;

import java.util.ArrayList;
import java.util.List;

public class primerExtractValues 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colors = new ArrayList<>();
		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.add("Orange");
		colors.add("Blue");
		System.out.println("Original array" + colors);
		
		List<String> nova = colors.subList(0, 3); //extract
		System.out.println(nova);
		
	}
}

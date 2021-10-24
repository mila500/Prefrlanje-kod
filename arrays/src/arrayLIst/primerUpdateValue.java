package arrayLIst;

import java.util.ArrayList;

public class primerUpdateValue 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colors = new ArrayList<>();
		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.add("Orange");
		System.out.println("Original array" + colors);
		
		colors.set(0, "Purple");
		System.out.println(colors);
		
	}
}

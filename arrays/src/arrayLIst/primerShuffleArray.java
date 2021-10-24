package arrayLIst;

import java.util.ArrayList;
import java.util.Collections;

public class primerShuffleArray 
{
	public static void main(String[] args) 
	{ 
		
	ArrayList<String> numbers = new ArrayList<>();
	numbers.add("1");
	numbers.add("2");
	numbers.add("3");
	numbers.add("4");
	System.out.println("Original Array: " + numbers);
	
	Collections.shuffle(numbers);
	System.out.println("Shuffled array" + numbers);
	}
}

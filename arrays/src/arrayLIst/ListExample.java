package arrayLIst;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExample 
{
	public static void main(String[] args) 
	{
		String array[] = {"Java", "PHP", "C", "C++" };
		
		ArrayList<String> nova = new ArrayList<>(Arrays.asList(array)); //PREBACUVAJE NA ARRAYS VO ARRAY LIST
		System.out.println(nova);
	}
}

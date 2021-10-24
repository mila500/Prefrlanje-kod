package arrays;

import java.util.Arrays;

public class primerReverseArray 
{
	public static void main(String[] args) 
	{
		Integer niza[] = { 1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456 };
		 reverseArray(niza);
	}
	
	public static void reverseArray( Integer[] niza)
	{
		System.out.println("Originalnata niza" + Arrays.toString(niza));
		
		for (int i = 0; i < niza.length; i++) 
		{
			Integer temp = niza[i];
			System.out.println("temp= " + temp);
			niza[i] = niza[niza.length - i-i];
			niza[niza.length - i-1] = temp;
			System.out.println("niza [" + (niza.length - i - 1));
		}
	}
}

//NEDOVRSENA, PREKUCAJ OD GIT
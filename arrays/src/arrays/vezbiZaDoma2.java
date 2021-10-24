package arrays;

public class vezbiZaDoma2 
{
	public static void main(String[] args) 
	{
		//Integer niza[] = {3,4,5,7,9};
		
	}

	//private static Double average(Integer niza[])
	{
		//Double rezultat = 0.00;
		
		//Double sum = zbir(niza);
		//rezultat = (double) ( sum /niza.length);
		
		
		
		//return rezultat;
		
	}
		
	public static Double zbir(Integer niza[])
	{
		Double suma = 0.00;
		
		for(int i  = 0; i < niza.length; i ++)
		{
			suma += niza[i];
		}
		return suma;
	}
	

}

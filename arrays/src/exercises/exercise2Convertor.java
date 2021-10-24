package exercises;

public class exercise2Convertor 
{
	public static void main(String[] args) 
	{
		// F = C * 9/5 + 32
		System.out.println(convertor(25));
		
	}
	
	public static Double convertor(Integer Celsius)
	{
		Double f = (double) ( Celsius * 9/5 + 32); // F = C * 9/5 + 32 --> formulata za konvertiranje celsius - f 
		return f;
	}
}

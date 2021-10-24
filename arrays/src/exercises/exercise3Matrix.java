package exercises;

public class exercise3Matrix {
	public static void main(String[] args) 
	{
		starLeft('^');
		starRight('^');
	}
	
	public static void starLeft(char c)
	{
		for (int i = 0; i <= 6; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}		
	
	public static void starRight(char d)
	{
		for (int i = 0; i <6; i++) 
		{
			for (i = 6; i>1; i--)
			{
				System.out.print("");
			}
			for (j=0; j<=i; j++)
			{
				
			}

		}
		
		
		
		for (n = 0; n<row; n++)
		{
			for (x=row-n; x>1; x++)
			{
				System.out.print("");
			}
			for (x=0; x<=n; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

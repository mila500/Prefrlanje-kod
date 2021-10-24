package arrays;

public class vezba2 // rezultat na site broevi
{
	public static void main(String[] args) 
	{
		Integer celiBroevi[] = {3,4,5,7,9};
		Integer rezultat = 0;
		for(int i = 0; i < celiBroevi.length; i ++)
		{
			rezultat = rezultat + celiBroevi[i];
			rezultat += celiBroevi[i];
		}
		System.out.println("Rezultatot e " + rezultat);
		
		// ODZEMANJE NA BROEVI NAZACKI
		Integer rez = 0;
		//Boolean flag;
		for (int i = celiBroevi.length - 2; i >= 0; i--)
		{
			//if (flag = true)
			{
			rez = rez - celiBroevi [i];
			} 
			//else
			{
				//flag = true;
				rez =celiBroevi[i];
			}
		}
		
		System.out.println("Rezultatot od odzemanje e" + rez);
	}
}



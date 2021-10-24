package arrayLIst;

import java.util.ArrayList;
import java.util.Collections;

public class vezba 
{
	public static void main(String[] args) 
	{
		ArrayList<String> listaNaUcenici = new ArrayList();
		listaNaUcenici.add("Marko");
		listaNaUcenici.add("Angela");
		listaNaUcenici.add("Elena");
		listaNaUcenici.add("Sofija");
		listaNaUcenici.add("Darko");
		System.out.println("Ucenici vo klasot" + listaNaUcenici);
		
		listaNaUcenici.add(0, "Emilija");
		System.out.println("Nov ucenik" + listaNaUcenici);
		
		Collections.sort(listaNaUcenici);
		System.out.println(listaNaUcenici);
		
	}
}

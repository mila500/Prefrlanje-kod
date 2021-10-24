package vezba;

public class Dog {
	private String breed;
	private String size;
	private Integer age;
	private String color;
	

	public String getInfo() {
		return "Dog breed:" +breed+ "Dog color:" +color;
	}
	
	public static void main(String[] args) {
		Dog maltese = new Dog();
		maltese.age= 11;
	 	maltese.breed= "maltese";
		maltese.color="white";
		
		String res = maltese.getInfo();
		System.out.println(res);
		System.out.println(maltese.getInfo());
	}
}

 //1. napravete main method vo nova klasa, 2. iskucajte go kodot za doktor i hirurg, 3. testirajte gi overriding i overloading
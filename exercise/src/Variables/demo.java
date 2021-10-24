package Variables;

public class demo {
	public static void main(String[] args) {
		byte x;
		int a = 270;
		double b = 128.128;
		System.out.println("int converted to byte");
		x = (byte) a;
		System.out.println("a =" + a);
		System.out.println("x =" + x);
		System.out.println("double converted to int");
		a = (int) b;
		System.out.println("a = " + a);
	    System.out.println("b =" + b);
	
		
		System.out.println("\ndouble converted to byte");
		x = (byte) b;
		System.out.println("x = " +	x);
		System.out.println("b = " + b);
	}
}

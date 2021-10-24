package arrays;

public class Account 
{
	Integer a;
	Integer b;
	
	public Account(Integer a, Integer b) 
	{
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Account [a=" + a + ", b=" + b + "]";
	}
	
	public void setData(Integer c, Integer d)
	{
		a = c;
		b = d;
	}
	
	public void showData()
	{
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	public Account() {
		super();
	}
}
package doctorExample;

public class doctor 
{
	String speciality;
	String name;
	
	public void getDoctorDetails()
	{
		System.out.println("Doctor details"); 
	}
	
	public String getInfo(String ime)
	{
		return "Doctor name from attribute: " +this.name + " \nDoctor name ";
	}

	@Override
	public String toString() {
		return "doctor [speciality=" + speciality + ", name=" + name + "]";
	}
}

 


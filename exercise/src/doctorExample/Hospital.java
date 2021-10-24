package doctorExample;

public class Hospital {
	public static void main(String[] args) {
		Surgeon s = new Surgeon();
		s.getDoctorDetails();
		//method from Surgeon class
		s.getSurgeonDetails();

		
		s.getDoctorDetails();
		
		doctor d = new Surgeon();
		d.getDoctorDetails();
		
		doctor doc = new doctor();
		doc.getDoctorDetails();
		
		System.out.println(doc.getInfo("Tom"));
	}
		
	}
	


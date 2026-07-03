package in.co.rays.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		Person p1 = new Person();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		p1.setName("apurv");
		p1.setDob(sdf.parse("2005-09-02"));
		p1.setAdress("Indore");
		
		System.out.println("Name=" + p1.getName());
		System.out.println("DOB=" + p1.getDob());
		System.out.println("Adress=" + p1.getAdress());


		
		
	}

}

package in.co.rays.encapsulation;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String adress;

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package org.medex.beans;

public class Patient {
	
	String fname;
	String lname;
	String pwd;
	int age;
	String gender;
	String email;
	String phn_number;
	String address;
	int zipcode;
	String city;
	public Patient()
	{
		
	}
	
	
	
	public Patient(String fname, String lname, String pwd, int age,
			String gender, String email, String phn_number, String address,
			int zipcode, String city) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.pwd = pwd;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phn_number = phn_number;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
	}



	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhn_number() {
		return phn_number;
	}
	public void setPhn_number(String phn_number) {
		this.phn_number = phn_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}

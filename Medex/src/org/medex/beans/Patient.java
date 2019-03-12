package org.medex.beans;

public class Patient {
	
	String fname,lname,pwd,gender,email,phn_number,address,city;
	int age,zipcode;
	public Patient()
	{
		
	}
	public Patient(String fname, String lname, String pwd, int age,String gender,
			 String phn_number,String email, String address, String city,
			 int zipcode) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.pwd = pwd;
		this.gender = gender;
		this.email = email;
		this.phn_number = phn_number;
		this.address = address;
		this.city = city;
		this.age = age;
		this.zipcode = zipcode;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	

}

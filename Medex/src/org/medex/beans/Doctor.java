package org.medex.beans;

public class Doctor {
	
	private String pwd;
	private String fname;
	private String lname;
	private String gender;
	private int age;
	private String qualification,specialization,contact_no;
	private String email,address;
	private int zipcode;
	private String city;
	public Doctor()
	{
	}
	public Doctor(String fname, String lname,String pwd, String gender,
			int age, String qualification, String specialization,
			String contact_no, String email, String address, int zipcode,
			String city) {
		super();
		this.pwd = pwd;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.qualification = qualification;
		this.specialization = specialization;
		this.contact_no = contact_no;
		this.email = email;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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

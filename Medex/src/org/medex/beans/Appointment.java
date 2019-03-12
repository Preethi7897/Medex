package org.medex.beans;

public class Appointment {
	int id;
	String date,time, time_booked,category,doc_id,pat_id,diag_info;
       public Appointment()
       {
              
       }
	public Appointment(int id, String date, String time, String time_booked,
			String category, String doc_id, String pat_id, String diag_info) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.time_booked = time_booked;
		this.category = category;
		this.doc_id = doc_id;
		this.pat_id = pat_id;
		this.diag_info = diag_info;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTime_booked() {
		return time_booked;
	}
	public void setTime_booked(String time_booked) {
		this.time_booked = time_booked;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(String doc_id) {
		this.doc_id = doc_id;
	}
	public String getPat_id() {
		return pat_id;
	}
	public void setPat_id(String pat_id) {
		this.pat_id = pat_id;
	}
	public String getDiag_info() {
		return diag_info;
	}
	public void setDiag_info(String diag_info) {
		this.diag_info = diag_info;
	}
	
	

}

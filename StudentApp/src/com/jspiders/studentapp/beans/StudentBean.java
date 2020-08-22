package com.jspiders.studentapp.beans;

public class StudentBean {

	private String regno;
	private String name;
	private String email;
	private String gender;
	private String course;
	private double fee;
	private double paid;
	private int due;
	private String address;
	private long contact;

	public StudentBean() {

	}

	public StudentBean(String relno, String name, String email, String gender, String course, double fee, double paid,
			int due, String address, long contact) {
		this.regno = relno;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.course = course;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
		this.address = address;
		this.contact = contact;
	}

	public StudentBean(String name, String email, String gender, String course, double fee, double paid, int due,
			String address, long contact) {
		
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.course = course;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
		this.address = address;
		this.contact = contact;
	}

	public String getRelno() {
		return regno;
	}

	public void setRelno(String relno) {
		this.regno = relno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}

	public int getDue() {
		return due;
	}

	public void setDue(int due) {
		this.due = due;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

}

package com.mortgage;

import java.sql.Date;

public class PersonalDetails {
	private int personaldetailsid;
	private String firstname;
	private String lastname;
	private Date dob;
	private String address;
	private String city;
	private String state;
	private String pincode;
	private String mobileno;
	private int id;

	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public int getPersonaldetailsid() {
		return personaldetailsid;
	}

	public void setPersonaldetailsid(int personaldetailsid) {
		this.personaldetailsid = personaldetailsid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



}
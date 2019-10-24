package com.mortgage;

public class Loan {

	
	private int loanid;
	private int loanamount;
	private int areacode;
	private int creditscore;
	private String propertyname;
	private int propertyid;
	private int propertysq;
	private String residence;
	private String status;
	private int id;
	
	
	public String getPropertyname() {
		return propertyname;
	}
	public void setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPropertyid() {
		return propertyid;
	}
	public void setPropertyid(int propertyid) {
		this.propertyid = propertyid;
	}
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public int getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(int loanamount) {
		this.loanamount = loanamount;
	}
	public int getAreacode() {
		return areacode;
	}
	public void setAreacode(int areacode) {
		this.areacode = areacode;
	}
	public int getCreditscore() {
		return creditscore;
	}
	public void setCreditscore(int creditscore) {
		this.creditscore = creditscore;
	}
	public int getPropertysq() {
		return propertysq;
	}
	public void setPropertysq(int propertysq) {
		this.propertysq = propertysq;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Loan [loanid=" + loanid + ", loanamount=" + loanamount + ", areacode=" + areacode + ", creditscore="
				+ creditscore + ", propertyname=" + propertyname + ", propertyid=" + propertyid + ", propertysq="
				+ propertysq + ", residence=" + residence + ", status=" + status + ", id=" + id + "]";
	}
	

	
}



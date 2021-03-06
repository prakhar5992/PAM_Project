package com.s_space.trademanagementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class tradeDO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Applicant Name")
	private java.lang.String applicantName;
	@org.kie.api.definition.type.Label("Account Number")
	private int accountNumber;
	@org.kie.api.definition.type.Label("Contact No.")
	private int contactNumber;
	@org.kie.api.definition.type.Label("Address Line 1")
	private java.lang.String addressLine1;
	@org.kie.api.definition.type.Label("Address Line 2")
	private java.lang.String addressLine2;
	@org.kie.api.definition.type.Label("Pincode")
	private int pincode;
	@org.kie.api.definition.type.Label("City")
	private java.lang.String city;
	@org.kie.api.definition.type.Label("State")
	private java.lang.String state;
	@org.kie.api.definition.type.Label("Country")
	private java.lang.String country;
	@org.kie.api.definition.type.Label("Comments")
	private java.lang.String comments;
	@org.kie.api.definition.type.Label("Reliability")
	private java.lang.String reliability;

	@org.kie.api.definition.type.Label("Checker Action")
	private java.lang.String checkerAction;

	@org.kie.api.definition.type.Label(value = "Checker Comments")
	private java.lang.String checkerComments;

	public tradeDO() {
	}

	public java.lang.String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(java.lang.String applicantName) {
		this.applicantName = applicantName;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public java.lang.String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(java.lang.String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public java.lang.String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(java.lang.String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public int getPincode() {
		return this.pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public java.lang.String getCity() {
		return this.city;
	}

	public void setCity(java.lang.String city) {
		this.city = city;
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getCountry() {
		return this.country;
	}

	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	public java.lang.String getComments() {
		return this.comments;
	}

	public void setComments(java.lang.String comments) {
		this.comments = comments;
	}

	public java.lang.String getReliability() {
		return this.reliability;
	}

	public void setReliability(java.lang.String reliability) {
		this.reliability = reliability;
	}

	public java.lang.String getCheckerAction() {
		return this.checkerAction;
	}

	public void setCheckerAction(java.lang.String checkerAction) {
		this.checkerAction = checkerAction;
	}

	public java.lang.String getCheckerComments() {
		return this.checkerComments;
	}

	public void setCheckerComments(java.lang.String checkerComments) {
		this.checkerComments = checkerComments;
	}

	public tradeDO(java.lang.String applicantName, int accountNumber,
			int contactNumber, java.lang.String addressLine1,
			java.lang.String addressLine2, int pincode, java.lang.String city,
			java.lang.String state, java.lang.String country,
			java.lang.String comments, java.lang.String reliability,
			java.lang.String checkerAction, java.lang.String checkerComments) {
		this.applicantName = applicantName;
		this.accountNumber = accountNumber;
		this.contactNumber = contactNumber;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.comments = comments;
		this.reliability = reliability;
		this.checkerAction = checkerAction;
		this.checkerComments = checkerComments;
	}

}
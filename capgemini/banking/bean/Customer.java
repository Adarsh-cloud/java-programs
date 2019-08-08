package com.capgemini.banking.bean;

public class Customer {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private String emailId;

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String phoneNumber, String address, String emailId) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setAddress(address);
		setEmailId(emailId);
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setEmail(String emailId) {
		this.emailId = emailId;
	}

	public String getEmail() {
		return emailId;
	}

	@Override
	public String toString() {
		return String.format("Account [firstName=%s, lastName=%s, , phoneNumber=%s, address=%s]", firstName, lastName,
				phoneNumber, address);
	}

}

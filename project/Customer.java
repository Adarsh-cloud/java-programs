package com.capgemin.bean;

public class Customer {
	private String name;
	private String phoneNo;
	private String address;

	// Default Constructor
	public Customer() {
		name = null;
		phoneNo = null;
		address = null;
	}

	// Parameterised Constructor
	public Customer(String name, String phoneNo, String address) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Getter
	public String getName() {
		return name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Name of Customer=" + name + ", PhoneNo=" + phoneNo + ", Address=" + address;
	}

}

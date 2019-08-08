package com.capgemini.test.service;

import java.util.Map;

import com.capgemini.test.bean.Person;

public interface ServiceInterface {
	String userNamePattern="[A-Z][a-z]{9}";
	boolean validateUserName(String Username);
	void storeIntoMap(Person person);
	//public interface
	Map<Integer,Person>displayPersons();
}

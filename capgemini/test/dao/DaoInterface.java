package com.capgemini.test.dao;

import java.util.Map;
import com.capgemini.test.bean.Person;
public interface DaoInterface {
	Map<Integer,Person>displayPersons();
	void storeIntoMap(Person person);
}

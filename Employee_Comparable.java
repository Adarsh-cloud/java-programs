package capgemini.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {

private int empId;
private String name;

public Employee(int empId, String name) {
super();
this.empId = empId;
this.name = name;
}

public int getEmpId() {
return empId;
}

public String getName() {
return name;
}

@Override
public String toString() {
return "Employee [empId=" + empId + ", name=" + name + "]";
}

@Override
public int compareTo(Employee otherEmployee) {
if(empId==otherEmployee.getEmpId()) return 0;
else if(empId>otherEmployee.getEmpId()) return 1;
else return -1;
}
}

class NameComparator implements Comparator<Employee> {

@Override
public int compare(Employee firstEmp, Employee secondEmp) {
if(firstEmp.getName().equals(secondEmp.getName())) return -1;
else return 1;
}
}

public class Employee_Comparable {
public static void main(String[] args) {
Employee e1, e2, e3;
e1 = new Employee(101, "abc");
e3 = new Employee(103, "ghi");
e2 = new Employee(102, "def");

Employee[] emps = { e1, e3, e2 };
//java.lang.ClassCastException: capgemini.collection.Employee 
//cannot be cast to java.lang.Comparable
Arrays.sort(emps);
System.out.println("Array sorted via Arrays.sort: " + Arrays.toString(emps));

List<Employee> list = new ArrayList<Employee>();
list.add(e1);
list.add(e3);
list.add(e2);
System.out.println("Natural Size:" + list.size() + "\t" + list);
Collections.sort(list);
System.out.println("Array sorted via collections.sort:"+list);
Collections.sort(list, new NameComparator());
System.out.println("Array sorted via collections.sort:"+list);
}
}


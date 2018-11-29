package com.stream.filter.modal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

	private int id;
	private String fName;
	private String lName;
	private Date doj;
	private float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static List<Employee> getEmployeeList() {
		List<Employee> listOfEmployee = new ArrayList<>();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emp1.setfName("Sunil");
		emp2.setfName("Rajesh");
		emp3.setfName("Sanjeev");
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		return listOfEmployee;
	}
}

package com.stream.filter.modal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Manager {


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

	public static List<Manager> getManagerList() {
		List<Manager> listOfEmployee = new ArrayList<>();
		Manager emp1 = new Manager();
		Manager emp2 = new Manager();
		Manager emp3 = new Manager();
		emp1.setfName("Sunil");
		emp2.setfName("Raju");
		emp3.setfName("Santosh");
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		return listOfEmployee;
	}

}

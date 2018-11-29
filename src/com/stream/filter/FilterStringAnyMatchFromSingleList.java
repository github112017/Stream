package com.stream.filter;

import com.stream.filter.modal.Employee;

public class FilterStringAnyMatchFromSingleList {

	public static void main(String[] args) {
		String str ="Sunil";
		boolean matchedFlag2 = Employee.getEmployeeList().stream()
				.anyMatch(emp -> emp.getfName().equals(str));
		System.out.println(matchedFlag2);

	}

}

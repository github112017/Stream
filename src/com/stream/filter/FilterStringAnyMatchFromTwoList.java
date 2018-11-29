package com.stream.filter;

import java.util.List;
import java.util.stream.Collectors;

import com.stream.filter.modal.Employee;
import com.stream.filter.modal.Manager;

public class FilterStringAnyMatchFromTwoList {

	public static void main(String[] args) {
		List<Employee> listOfEmployee = Employee.getEmployeeList();
		List<Manager> listOfManager = Manager.getManagerList();
		
		List<Employee> l3 =listOfEmployee.stream().filter(x -> !listOfManager.contains(x)).collect(Collectors.toList());
		
	/*	List<Employee> intersect = listOfEmployee.stream()
                .filter(listOfManager::contains)
                .collect(Collectors.toList());*/
		System.out.println(l3.get(0).getfName());
		//System.out.println(intersect.get(0).getfName());
	}

}

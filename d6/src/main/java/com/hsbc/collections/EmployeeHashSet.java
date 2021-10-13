package com.hsbc.collections;


import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSet {

	public static void main(String[] args) {
		Set<Employee> emp=new HashSet<Employee>();
		emp.add(new Employee(1,"Alex",23.000,"Accounts"));
		emp.add(new Employee(9,"Roma",2500,"Marketing"));
		emp.add(new Employee(1,"Alex",23.000,"Accounts"));
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}

	}

}

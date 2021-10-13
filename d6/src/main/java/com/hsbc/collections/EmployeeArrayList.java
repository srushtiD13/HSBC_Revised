package com.hsbc.collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeArrayList {
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Alex",23.000,"Accounts"));
		emp.add(new Employee(9,"Roma",2500,"Marketing"));
		emp.add(new Employee(1,"Alex",23.000,"Accounts"));
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}
	

}

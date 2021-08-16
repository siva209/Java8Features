package com.java8features;

import java.util.ArrayList;
import java.util.List;

class Employee1{
	int employeeId;
	String employeeName;
	double salary;
	public Employee1(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	
}
public class MainJava8StreamAPI {

	public static void main(String[] args) {
		Employee1  e1=new Employee1(1, "siva", 1000000.00);
		Employee1 e2=new Employee1(2, "ramu",2000000.00 );
		Employee1 e3=new Employee1(3, "sravani", 3000000.00);
		List<Employee1>employeeList=new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		System.out.println("Employee ID"+"\t"+"Employee Name");
		/*
		 * Display employee name where employee salary is equal to 1000000.00. By using
		 * stream and filters we find employee name
		 */
		employeeList.stream().filter(emp->emp.salary==2000000.00).forEach(emp->System.out.println(emp.employeeId+"\t"+emp.employeeName));
		
		

	}

}

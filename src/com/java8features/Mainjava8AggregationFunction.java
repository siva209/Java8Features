package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
	int employeeid;
	String employeeName;
	double salary;
	public Employee(int employeeid, String employeeName, double salary) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
}
public class Mainjava8AggregationFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(1,"chiranjeevi",900000.00);
		Employee e2=new Employee(2, "Balakrishna", 800000.00);
		Employee e3=new Employee(3, "Nagaarjuna", 70000.000);
			
List<Employee>employee=new ArrayList<Employee>();
employee.add(e1);
employee.add(e2);
employee.add(e3);
double sumOfsalary=employee.stream().collect(Collectors.summingDouble(emp->emp.salary));
System.out.println("The sum of employee salarys :"+sumOfsalary);
Employee e=employee.stream().min((emp1,emp2)->emp1.salary>emp2.salary?1:-1).get();
System.out.println(e.salary);
	}

}

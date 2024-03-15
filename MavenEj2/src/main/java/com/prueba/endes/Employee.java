package com.prueba.endes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;




public class Employee{
	private String name;
	private int years;
	ArrayList<Employee> employeeNames=new ArrayList<>();
	public Employee(String name, int years) {
		this.name = name;
		this.years = years;
	}

	
int numberOfEmployees = 0;

public void addEmployee(Employee emp) {
employeeNames.add(emp);
numberOfEmployees++;
}
public void printEmployees() {
System.out.println("List of employees:");
for (Employee aux : employeeNames) {
System.out.println("Nombre :"+aux.getName() + ", Years in company: " + aux.getYears());
}
}

public String getName() {
	return name;
}
public int getYears() {
	return years;
}
public static void main(String[] args) {
Employee emp1 = new Employee("Juan",3);
Employee emp2 = new Employee("Luis",1);
emp1.addEmployee(emp1);
emp1.addEmployee(emp2);
emp1.printEmployees();
}
}

package com.prueba.endes;

import java.util.ArrayList;

public class EmployeeManager {
ArrayList<EmployeeManager> empMan = new ArrayList<EmployeeManager>();
private String name;
private int years;
public static int numberOfEmployees = 0;
public EmployeeManager(String name, int years) {
	this.name = name;
	this.years = years;
}
public void addEmployee(EmployeeManager emp) {

empMan.add(emp);
numberOfEmployees++;
System.out.println(name + " added to the system.");

}

public void printEmployees() {
System.out.println("List of employees:");
for (EmployeeManager aux : empMan) {
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
EmployeeManager manager = new EmployeeManager("Antonio",4);
EmployeeManager manager2 = new EmployeeManager("Raul",1);
manager.addEmployee(manager);
manager.addEmployee(manager2);
manager.printEmployees();
}

}

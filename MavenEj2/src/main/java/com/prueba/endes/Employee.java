package com.prueba.endes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @param name Nombre empleado
 * @param years Años en la empresa
 * @version 1.0
 * @author Imanol
 */

public class Employee{
	private String name;
	private int years;
	ArrayList<Employee> employeeNames=new ArrayList<>();
	public Employee(String name, int years) {
		this.name = name;
		this.years = years;
	}

	
int numberOfEmployees = 0;

/**
 * 
 * @param emp Introduzco empleado
 * @version 1.1
 * @author Imanol
 */
public void addEmployee(Employee emp) {
employeeNames.add(emp);
numberOfEmployees++;

}
/**
 * Recorremos la lista y vemos los empleados y los años en la empresa
 * @version 1.2
 * @author Imanol
 * 
 */
public void printEmployees() {
System.out.println("List of employees:");
for (Employee aux : employeeNames) {
System.out.println("Nombre :"+aux.getName() + ", Years in company: " + aux.getYears());
}
}
/**
 * 
 * @return devolvemos el nombre del empleado
 */
public String getName() {
	return name;
}
/**
 * 
 * @return Devolvemos los años en la empresa del empleado
 */
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

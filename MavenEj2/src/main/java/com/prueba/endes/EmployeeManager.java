package com.prueba.endes;

import java.util.ArrayList;

public class EmployeeManager {
ArrayList<EmployeeManager> empMan = new ArrayList<EmployeeManager>();
private String name;
private int years;
public static int numberOfEmployees = 0;

/**
 * @param name Nombre empleado
 * @param years Años en la empresa
 * @version 1.0
 * @author Imanol
 */
public EmployeeManager(String name, int years) {
	this.name = name;
	this.years = years;
}
/**
 * 
 * @param emp Introduzco empleado
 * @version 1.1
 * @author Imanol
 */
public void addEmployee(EmployeeManager emp) {

empMan.add(emp);
numberOfEmployees++;
System.out.println(name + " added to the system.");

}
/**
 * Recorremos la lista y vemos los empleados y los años en la empresa
 * @version 1.2
 * @author Imanol
 * 
 */

public void printEmployees() {
System.out.println("List of employees:");
for (EmployeeManager aux : empMan) {
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
EmployeeManager manager = new EmployeeManager("Antonio",4);
EmployeeManager manager2 = new EmployeeManager("Raul",1);
manager.addEmployee(manager);
manager.addEmployee(manager2);
manager.printEmployees();
}

}

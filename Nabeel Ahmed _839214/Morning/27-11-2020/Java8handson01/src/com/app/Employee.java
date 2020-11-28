package com.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private LocalDate dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Employee(int id, String name, double salary, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}
	public Employee() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dob=" + dob + "]";
	}
	public static List<Employee> loadEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(64, "Yash", 35000, LocalDate.parse("1998-11-20")));
		employees.add(new Employee(65, "Nabeel", 25000, LocalDate.parse("1999-07-08")));
		employees.add(new Employee(66, "Sreeni", 75000, LocalDate.parse("1998-07-21")));
		employees.add(new Employee(67, "Mahul", 20000, LocalDate.parse("1997-04-23")));
		employees.add(new Employee(68, "Soney", 65000, LocalDate.parse("2000-10-16")));
		return employees;
	}
	
	
}

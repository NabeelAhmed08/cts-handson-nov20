package com.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Service {

	//list
		List<Employee> employee = new ArrayList<>();
	//add	 
		public void addEmployee(Employee emp) {
			employee.add(emp);
		}
	
		
		public  Employee findEmployeeById(int id) {
			
			for (Employee  emp:employee) {
				
				if ((emp.getId())==id)
				{
						return emp;
				}
				}
			return null;
			
		}
		
		public List<Employee> displayAll() {
	 
	 return employee;
		}
	
		
		public List <Employee> sortById() {
		Collections.sort(employee,(e1,e2) -> e1.getId()  - e2.getId());
		return employee;	
		}
		
		public List<Employee> sortByName()
		{
			Collections.sort(employee,(e1,e2)-> e1.getName().compareTo(e2.getName()));
			return employee;
		}
		
		public List<Employee> sortEmployeeBySalary()
		{
			Collections.sort(employee,(e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));
			return employee;
		}
		
		public List <Employee> sortByDob() {
			Collections.sort(employee,(e1,e2) -> e1.getDob().compareTo(e2.getDob()));
			
			return employee;

		}
		
		public List<Employee> sortEmployeeByDob()
		{
			Collections.sort(employee,(e1,e2)->e1.getDob().compareTo(e2.getDob()));
			return employee;
		}
		
		
	
	
	
	
	
	
	
	
	
	
}

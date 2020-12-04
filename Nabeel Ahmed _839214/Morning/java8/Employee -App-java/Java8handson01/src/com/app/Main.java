package com.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service();
		List<Employee> emp = new ArrayList<>();
		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			 System.out.println("++++++++++++++Select ++++++++++++++");
			System.out.println(" 1. Add Employee\n 2. Display by Id \n 3. Display All \n 4. Sort by Id \n 5. Sort by Dob \n 6. Sort by Salary \n 7. Sort by Name \n 0. Exit \n");
		
			choice = sc.nextInt();

			// System.out.println("");

			switch (choice) {
			case 1:
				System.out.println("selected 1.Add ");

				System.out.println("Enter Id:");
				int id = sc.nextInt();
				System.out.println("Enter Name:");
				String name = sc.next();

				System.out.println("Enter Salary:");
				double salary = sc.nextDouble();

				System.out.println("Enter DOB:");

				String date = sc.next();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

				LocalDate dob = LocalDate.parse(date, formatter);

				Employee e = new Employee(id, name, salary, dob);
				service.addEmployee(e);
				System.out.println("+++++++++++++++ Employee Details Added Sucessfully.++++++++++++++++");

				break;

			case 2:
				System.out.println("selected 2. Display by Id");
				System.out.println("Enter Id:");
				int ids = sc.nextInt();
				Employee em = service.findEmployeeById(ids);
				System.out.println("ID :  " + em.getId() + "Name:  " + em.getName() + "Salary:  " + em.getSalary()
						+ "DOB:  " + em.getDob());
				break;

			case 3:
				System.out.println("selected 3. Display All");

				emp = service.displayAll();
				emp.forEach(item -> System.out.println(item));
				break;

			case 4:
				System.out.println("selected 4. Sort by Id");
				emp = service.sortById();
				emp.forEach(item -> System.out.println(item));

				break;

			case 5:
				System.out.println("selected 5. Sort by Dob ");
				break;
			// emp = service.sortEmployeeByDob();
			// emp.forEach(item -> System.out.println(item));

			case 6:
				System.out.println("selected 6. Sort by Salary");

				emp = service.sortEmployeeBySalary();
				emp.forEach(item -> System.out.println(item));
				break;

			case 7:
				System.out.println("selected 7. Sort by Name");
				emp = service.sortByName();
				emp.forEach(item -> System.out.println(item));
				break;

			case 0:
				System.out.println("..........Exiting App...... ");
				System.exit(0);
				
			}

		} while (choice < 8);
	}

}

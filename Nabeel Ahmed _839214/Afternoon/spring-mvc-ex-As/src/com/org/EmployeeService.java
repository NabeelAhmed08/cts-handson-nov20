package com.org;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDaoImpl dao;

	public List<Employee> getEmployeesNamesInAcendingOrder() {
		List<Employee> list = dao.getAllEmployees().stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		return list;
	}

	public Employee fetchEmployeeById(int empId) {
		return dao.fetchEmployeeById(empId);
	}

	public void deleteEmployeeById(int empId) {

		dao.delete(empId);
	}

}

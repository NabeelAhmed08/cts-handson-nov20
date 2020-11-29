package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	
	
	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query("select * from employee", 
			(rs,num )-> new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));						
		}
	
	public Employee fetchEmployeeById(int id) {
		return jdbcTemplate.queryForObject("select * from employee where id = ?",  new Object[] {id},
				(rs, num) -> new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));
	}
	
	
}

package org.service;

import org.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDaoImpl dao;
	
	
	

	public EmployeeDaoImpl getDao() {
		return dao;
	}




	public void setDao(EmployeeDaoImpl dao) {
		this.dao = dao;
	}




	@Override
	public void storeEmployee() {
		// TODO Auto-generated method stub
		System.out.println("store() of EmployeeService");
		dao.store();

	}

}

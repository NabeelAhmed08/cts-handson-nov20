package org.main;

import org.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeServiceImpl service = (EmployeeServiceImpl) context.getBean("service");
		
		service.storeEmployee();
		
	}

}

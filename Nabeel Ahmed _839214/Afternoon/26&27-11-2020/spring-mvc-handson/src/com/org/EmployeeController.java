package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value = "/sortByNameReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInReverseOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesNamesInReverseOrder());
		return mav;
	}
	
	@RequestMapping(value = "/sortByNameAce", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNamesInAcendingOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeesNamesInAcendingOrder());
		return mav;
	}
	
	@RequestMapping(value ="/sortIdInAcendingOrder" , method = RequestMethod.GET)
	public ModelAndView viewEmployeesIdInAceOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeesIdInAceOrder());
		return mav;
	}
	
	@RequestMapping(value ="/sortIdInDecOrder" , method = RequestMethod.GET)
	public ModelAndView viewEmployeesIdInDecOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeIdInDecOrder());
		return mav;
	}
	
	@RequestMapping(value ="/sortInAceOrderSal" , method = RequestMethod.GET)
	public ModelAndView viewEmployeesSalInAceOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeSalInAceOrder());
		return mav;
	}
	
	@RequestMapping(value ="/sortSalInDecOrder" , method = RequestMethod.GET)
	public ModelAndView viewEmployeeSalInDecOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeSalInDecOrder());
		return mav;
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ModelAndView extractEmployee(@RequestParam("employeeId") int empId) {
		ModelAndView mav = new ModelAndView("hello", "msg", service.fetchEmployeeById(empId));
		return mav;
	}
	
	
}

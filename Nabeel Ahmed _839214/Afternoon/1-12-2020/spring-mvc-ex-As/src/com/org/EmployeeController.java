package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@Autowired
	private EmployeeDao dao;

	@RequestMapping(value = "/sortByNameAce", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNamesInAcendingOrder() {

		ModelAndView mav = null;
		// create ModelMap
		ModelMap modelMap = new ModelMap();
		modelMap.put("employeeList", service.getEmployeesNamesInAcendingOrder());
		mav = new ModelAndView("hello", "model", modelMap);
		return mav;
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ModelAndView extractEmployee(@RequestParam("employeeId") int empId) {
		ModelAndView mav = new ModelAndView("hello", "msg", service.fetchEmployeeById(empId));
		return mav;
	}

	@RequestMapping(value = "/addemployee", method = RequestMethod.POST)
	public ModelAndView addEmployee(@RequestParam("employeeId") int empId, @RequestParam("employeeName") String name,
			@RequestParam("employeeSalary") double salary) {
		dao.save(new Employee(empId, name, salary));
		ModelAndView mav = new ModelAndView("success", "val", "Successfully Added ");
		return mav;
	}

	@RequestMapping(value = "/addnew", method = RequestMethod.GET)
	public ModelAndView addpage() {
		return new ModelAndView("storeEmployee");
	}

	@RequestMapping(value = "/delemployee", method = RequestMethod.POST)
	public ModelAndView DelEmployee(@RequestParam("employeeId") int Id) {
		dao.delete(Id);
		ModelAndView mav = new ModelAndView("success", "val", "Successfully Deleted");
		return mav;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView delpage() {
		return new ModelAndView("deleteEmployee");
	}

}

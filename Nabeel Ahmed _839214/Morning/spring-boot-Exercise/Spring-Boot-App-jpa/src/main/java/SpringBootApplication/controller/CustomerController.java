package SpringBootApplication.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApplication.dao.Customer;
import SpringBootApplication.service.CustomerService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CustomerController {
 
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer createCustomerAPI(@RequestBody Customer customer) {
		Customer createdCustomer = customerService.addCustomer(customer);
		return createdCustomer;
	}
	
	@GetMapping
	public List<Customer> getAllCustomersAPI() {
		return customerService.fetchCustomer();
	}
	
	@GetMapping("{customerId}")
	public Customer getCustomerAPI(@PathVariable("customerId") int id) {
		Customer customer = customerService.fetchcustomer(id);
		return customer;
	}
	
	@PutMapping("{customerId}/{dob}")
	public Customer updateCustomerDobAPI(@PathVariable("customerId") int id, @PathVariable("dob") String stringDob) {
		return customerService.updateCustomer(id, LocalDate.parse(stringDob));
	}
	
	@DeleteMapping("{customerId}")
	public Customer deleteCustomerAPI (@PathVariable("customerId") int id) {
		     customerService.deleteCustomer(id);
		return null;
	}
	
	
}

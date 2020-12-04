package SpringBootApplication.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import SpringBootApplication.dao.Customer;
import SpringBootApplication.dao.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository dao;
	
	public Customer addCustomer(Customer customer) {
		Customer createdCustomer = dao.save(customer);
		return createdCustomer;
	}

	public List<Customer> fetchCustomer (){
		return dao.findAll();
	}
	
	public Customer fetchcustomer (int id) {
		
		Optional<Customer> option = dao.findById(id);
		if (option.isPresent())
			return option.get();
		else return null;
	}
	public Customer updateCustomer(int id, LocalDate dob) {
		Customer customer = fetchcustomer(id) ;
		if(customer != null) {
			customer.setDob(dob);
			return dao.save(customer);
		} 
		else 
			return null;
	}
	
	public Customer deleteCustomer(int id) {
		Customer customer = fetchcustomer(id);
	
		     if (customer != null) {
				dao.deleteById(id);
	    	}
		return null;
		
	}
	
	
	
	
}

package com.SpringBootApplication.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootApplication.dao.Customer;
import com.SpringBootApplication.dao.CustomerRepository;
import com.SpringBootApplication.exception.CustomerNotFoundException;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository dao;

	public Customer addCustomer(Customer customer) throws CustomerNotFoundException {

		Customer createdCustomer = dao.save(customer);
		if (createdCustomer != null) {
			return createdCustomer;
		} else
			throw new CustomerNotFoundException("Sorry unable to add Customer Details");

	}

	public List<Customer> fetchCustomer() throws CustomerNotFoundException {
		return dao.findAll();
	}

	public Customer fetchcustomer(int id) throws CustomerNotFoundException {

		Optional<Customer> option = dao.findById(id);
		if (option.isPresent())
			return option.get();
		else
			throw new CustomerNotFoundException("Sorry customer with id " + id + "not found");
	}

	public Customer updateCustomer(int id, LocalDate dob) throws CustomerNotFoundException {
		Customer customer = fetchcustomer(id);
		customer.setDob(dob);
		customer = dao.save(customer);
		return customer;
	}

	public Customer deleteCustomer(int id) throws CustomerNotFoundException {
		Customer customer = fetchcustomer(id);

		if (customer != null) {
			dao.deleteById(id);
		}
		return null;

	}

}

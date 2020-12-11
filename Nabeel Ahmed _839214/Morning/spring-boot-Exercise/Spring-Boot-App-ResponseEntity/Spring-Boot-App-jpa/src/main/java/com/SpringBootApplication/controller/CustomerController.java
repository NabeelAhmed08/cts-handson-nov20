package com.SpringBootApplication.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootApplication.dao.Customer;
import com.SpringBootApplication.exception.CustomerNotFoundException;
import com.SpringBootApplication.service.CustomerService;
import com.SpringBootApplication.util.ResponseMessage;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> createCustomerAPI(@RequestBody Customer customer) {
		ResponseEntity<Object> response = null;
		try {
			Customer createdCustomer = customerService.addCustomer(customer);
		} catch (CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getAllCustomersAPI() throws CustomerNotFoundException {
		ResponseEntity<Object> response = null;
		try {
			customerService.fetchCustomer();
		} catch (CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
	}

	@GetMapping("{customerId}")
	public ResponseEntity<Object> getCustomerAPI(@PathVariable("customerId") int id) {
		ResponseEntity<Object> response = null;
		try {
			Customer customer = customerService.fetchcustomer(id);
			response = ResponseEntity.status(200).body(customer);
		} catch (CustomerNotFoundException e) {

			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
	}

	@PutMapping("{customerId}/{dob}")
	public ResponseEntity<Object> updateCustomerDobAPI(@PathVariable("customerId") int id,
			@PathVariable("dob") String stringDob) {
		ResponseEntity<Object> response = null;

		try {
			Customer customer = customerService.updateCustomer(id, LocalDate.parse(stringDob));
			response = ResponseEntity.status(200).body(customer);
		} catch (CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
	}

	@DeleteMapping("{customerId}")
	public ResponseEntity<Object> deleteCustomerAPI(@PathVariable("customerId") int id) {
		ResponseEntity<Object> response = null;

		try {
			customerService.deleteCustomer(id);
			response = ResponseEntity.status(200).body(null);
		} catch (CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
	}

}

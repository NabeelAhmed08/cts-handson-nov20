package com.org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;






public class Service {
	
	List<Customer> customer = new ArrayList<>();
	
	
	public void addCustomer(int accno, String name, double balance) throws Exception {
		// TODO Auto-generated method stub
		
		int count = 0;
		for (int i = 0; i < customer.size(); i++) {
			if (customer.get(i).getAccno()  == (accno )) {

				count = count + 1;

				throw new Exception("AccountNoAlreadyExistsException");
			}
		}
		if (count == 0) {
		customer.add(new Customer(accno,name,balance));
		}
	}
	
	public void removeCustomer(int acc ) throws Exception {
	
		
		if (displayAccountByAccntNo(acc) == null) 

			throw new Exception("AccountNotFoundException");
		
		else {
		
			for (int i = 0; i < customer.size(); i++) {
				if (customer.get(i).getAccno() == acc)

				{

					customer.remove(i);
					System.out.println("Account Removed");
			}
	  }
		}
	}
	
	
	public  Customer displayAccountByAccntNo(int acc) throws Exception {
		
		for (Customer  cust:customer) {
			
			if ((cust.getAccno()) == acc)
			{
					return cust;
			}
			}
		
		if (customer.size() == 0)
			throw new Exception("AccountNotFoundException");
		return null;
		
	}
	
	public List<Customer> displayAll() {
		 
		 return customer;
			}
	
	public List<Customer> getAccountsWithBalbelow2000(){
		long count = customer.stream().filter(item -> item.getBalance() < 2000).count();
		
		if (count != 0) {
		List<Customer> list = customer.stream().filter(item -> item.getBalance() < 2000)
		.collect(Collectors.toList());
		
		   return list;  }
		else {
			
			System.out.println("No Accounts Found");
		}
		
		return null;
	}



}

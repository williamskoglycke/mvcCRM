package se.william.springboot.mvcCRM.service;

import se.william.springboot.mvcCRM.entity.Customer;

import java.util.List;

public interface CustomerService {
	
	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int theId);

	void deleteCustomer(int theId);

}

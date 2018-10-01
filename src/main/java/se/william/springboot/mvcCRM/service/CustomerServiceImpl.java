package se.william.springboot.mvcCRM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.william.springboot.mvcCRM.dao.CustomerDAO;
import se.william.springboot.mvcCRM.entity.Customer;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customerList = new ArrayList<>();
		this.customerDAO.findAll().forEach(customerList::add);
		return customerList;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		this.customerDAO.save(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		return this.customerDAO.findById(theId).get();
	}

	@Override
	public void deleteCustomer(int theId) {
		this.customerDAO.deleteById(theId);
		
	}

}

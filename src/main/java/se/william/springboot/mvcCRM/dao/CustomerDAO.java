package se.william.springboot.mvcCRM.dao;

import org.springframework.data.repository.CrudRepository;
import se.william.springboot.mvcCRM.entity.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {
	

}

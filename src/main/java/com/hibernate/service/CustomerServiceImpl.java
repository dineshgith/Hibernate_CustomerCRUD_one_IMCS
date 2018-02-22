package com.hibernate.service;

import com.hibernate.dao.CustomerDaoImpl;
import com.hibernate.entity.Customers;
import com.hibernate.exception.CustomException;
import com.hibernate.interf.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	CustomerDaoImpl cdao = new CustomerDaoImpl();

	public void addCustomer(Customers customer) throws CustomException {
		cdao.addCustomer(customer);

	}

	public Customers loadCustomer(int customerId) throws CustomException {
		return cdao.loadCustomer(customerId);

	}

	public void updateCustomer(Customers customer) throws CustomException {
		cdao.updateCustomer(customer);

	}

	public void deleteCustomer(int customerId) throws CustomException {
		cdao.deleteCustomer(customerId);
	}
}

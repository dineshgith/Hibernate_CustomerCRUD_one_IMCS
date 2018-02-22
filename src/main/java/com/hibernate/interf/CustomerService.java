package com.hibernate.interf;

import com.hibernate.entity.Customers;
import com.hibernate.exception.CustomException;

public interface CustomerService {

	public void addCustomer(Customers customer) throws CustomException;

	public Customers loadCustomer(int customerId) throws CustomException;

	public void updateCustomer(Customers customer) throws CustomException;

	public void deleteCustomer(int customerId) throws CustomException;
}

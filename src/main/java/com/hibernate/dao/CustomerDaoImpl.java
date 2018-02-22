package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entity.Customers;
import com.hibernate.exception.CustomException;
import com.hibernate.interf.CustomerService;
import com.hibernate.util.HibernateUtil;

public class CustomerDaoImpl implements CustomerService {

	private Session getSession() {

		return HibernateUtil.buildSessionFactory().openSession();
	}

	public void addCustomer(Customers customer) throws CustomException {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(customer);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

	public Customers loadCustomer(int customerId) throws CustomException {
		Session session = getSession();
		Customers customer = (Customers) session.get(Customers.class, customerId);
		session.close();
		return customer;
	}

	public void updateCustomer(Customers customer) throws CustomException {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(customer);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

	public void deleteCustomer(int customerId) throws CustomException {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			Customers customer = (Customers) session.get(Customers.class, customerId);
			session.delete(customer);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}

	}
}

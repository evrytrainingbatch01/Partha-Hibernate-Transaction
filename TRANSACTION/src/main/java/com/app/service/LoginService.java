package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Customer;
import com.app.util.HibernarteUtil;

public class LoginService implements ILoginService {

	public boolean authenticateUser(String userId, String password) {
		Customer user = getUserByUserId(userId);

		if (user != null && user.getUserId().equals(userId) && user.getPassword().equals(password)) {

			return true;

		} else {

			return false;

		}
	}

	public Customer getUserByUserId(String userId) {
		Session session = HibernarteUtil.getSessionFactory().openSession();

		Transaction tx = null;

		Customer user = null;

		try {

			tx = session.getTransaction();

			tx.begin();

			Query query = session.createQuery("from Customer where userId='" + userId + "'");

			user = (Customer) query.uniqueResult();

		tx.commit();

		} catch (Exception e) {

			if (tx != null) {

				tx.rollback();

			}

			e.printStackTrace();

		} finally {

			session.close();

		}

		return user;
	}

	public List<Customer> getListOfUsers() {
		List<Customer> list = new ArrayList<Customer>();

		Session session = HibernarteUtil.getSessionFactory().openSession();

		Transaction tx = null;

		try {

			tx = session.getTransaction();

			tx.begin();

			list = session.createQuery("from CUSTOMER").list();

			tx.commit();

		} catch (Exception e) {

			if (tx != null) {

				tx.rollback();

			}

			e.printStackTrace();

		} finally {

			session.close();

		}

		return list;

	}
}

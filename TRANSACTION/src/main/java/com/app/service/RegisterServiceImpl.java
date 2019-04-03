package com.app.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Customer;
import com.app.util.HibernarteUtil;

public class RegisterServiceImpl implements IRegisterService {

	public boolean register(Customer user) {

		Session session = HibernarteUtil.getSessionFactory().openSession();

		if (isUserExists(user))
			return false;

		Transaction tx = null;

		try {

			tx = session.getTransaction();

			tx.begin();

			;

			session.saveOrUpdate(user);

			tx.commit();

		} catch (Exception e) {

			if (tx != null) {

				tx.rollback();

			}

			e.printStackTrace();

		} finally {

			session.close();

		}

		return true;
	}

	public boolean isUserExists(Customer user) {
		Session session = HibernarteUtil.getSessionFactory().openSession();

		boolean result = false;

		Transaction tx = null;

		try {

			tx = session.getTransaction();

			tx.begin();

			Query query = session.createQuery("from Customer where userId='" + user.getUserId() + "'");

			Customer u = (Customer) query.uniqueResult();

			tx.commit();

			if (u != null)
				result = true;

		} catch (Exception ex) {

			if (tx != null) {

				tx.rollback();

			}

		} finally {

			session.close();

		}

		return result;

	}
}

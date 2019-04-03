package com.app.service;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Account;
import com.app.util.HibernarteUtil;

public class AccountServiceImpl implements IAccountService {

	public boolean addMoney(Account account) {
		 Session session = HibernarteUtil.getSessionFactory().openSession();

	     

		    if(isAccountExists(account)) return false;  

		     

		     Transaction tx = null;

		     try {

		         tx = session.getTransaction();

		         tx.begin();

		        ;

		         session.saveOrUpdate(account);       

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

	public boolean isAccountExists(Account account) {
		Session session = HibernarteUtil.getSessionFactory().openSession();

		

	     boolean result = false;

	     Transaction tx = null;

	     try{

	         tx = session.getTransaction();

	         tx.begin();

	         Query query = session.createQuery("from Account where accountNumber='"+account.getAccountNumber()+"'");

	         Account a = (Account)query.uniqueResult();

	         tx.commit();

	         if(a!=null) result = true;

	     }catch(Exception ex){

	         if(tx!=null){

	             tx.rollback();

	         }

	     }finally{

	         session.close();

	     }

	     return result;

	    

	}



	
	}



package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface ILoginService {
	public boolean authenticateUser(String userId, String password);
	 public Customer getUserByUserId(String userId);
	 public List<Customer> getListOfUsers();

}

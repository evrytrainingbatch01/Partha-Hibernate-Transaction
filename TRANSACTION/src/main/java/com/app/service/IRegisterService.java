package com.app.service;

import com.app.model.Customer;

public interface IRegisterService {
	public boolean register(Customer user);
	 public boolean isUserExists(Customer user);

}

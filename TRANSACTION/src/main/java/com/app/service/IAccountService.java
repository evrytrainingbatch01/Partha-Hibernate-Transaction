package com.app.service;

import com.app.model.Account;

public interface IAccountService {
	public boolean addMoney(Account account);

	public boolean isAccountExists(Account account);

}

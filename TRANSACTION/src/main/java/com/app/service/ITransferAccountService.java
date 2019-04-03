package com.app.service;

import com.app.model.TransferAccount;

public interface ITransferAccountService {
	public boolean transferMoney(TransferAccount transfer);
	public boolean isTransferAccountExists(TransferAccount transfer);

}

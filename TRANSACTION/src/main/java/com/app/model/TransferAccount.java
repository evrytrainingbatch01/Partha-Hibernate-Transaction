package com.app.model;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity

@Table(name = "TRANSFERDETAILS")

public class TransferAccount {

	private long id;

	private String fromaccountNumber;

	private String toaccountNumber;

	private String transferBal;

	public TransferAccount(String fromaccountNumber, String toaccountNumber, String transferBal) {

		super();

		this.fromaccountNumber = fromaccountNumber;

		this.toaccountNumber = toaccountNumber;

		this.transferBal = transferBal;

	}

	public long getId() {

		return id;

	}

	public void setId(long id) {

		this.id = id;

	}

	public String getFromaccountNumber() {

		return fromaccountNumber;

	}

	public void setFromaccountNumber(String fromaccountNumber) {

		this.fromaccountNumber = fromaccountNumber;

	}

	public String getToaccountNumber() {

		return toaccountNumber;

	}

	public void setToaccountNumber(String toaccountNumber) {

		this.toaccountNumber = toaccountNumber;

	}

	public String getTransferBal() {

		return transferBal;

	}

	public void setTransferBal(String transferBal) {

		this.transferBal = transferBal;

	}

}

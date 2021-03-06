package com.app.domain;

public class Customer {
	private int id;

    private String userName;

    private String password;

    private String email;

    private String phone;

    private String city;

    

	public Customer() {

		super();

	}



	public Customer(int id, String userName, String password, String email, String phone, String city) {

		super();

		this.id = id;

		this.userName = userName;

		this.password = password;

		this.email = email;

		this.phone = phone;

		this.city = city;

	}



	public int getId() {

		return id;

	}



	public void setId(int id) {

		this.id = id;

	}



	public String getUserName() {

		return userName;

	}



	public void setUserName(String userName) {

		this.userName = userName;

	}



	public String getPassword() {

		return password;

	}



	public void setPassword(String password) {

		this.password = password;

	}



	public String getEmail() {

		return email;

	}



	public void setEmail(String email) {

		this.email = email;

	}



	public String getPhone() {

		return phone;

	}



	public void setPhone(String phone) {

		this.phone = phone;

	}



	public String getCity() {

		return city;

	}



	public void setCity(String city) {

		this.city = city;

	}

    

    

}



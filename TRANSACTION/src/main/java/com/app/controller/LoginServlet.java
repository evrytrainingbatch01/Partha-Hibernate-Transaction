package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Customer;
import com.app.service.LoginService;

public class LoginServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		

		String userId = request.getParameter("userId");   

	     String password = request.getParameter("password");

	     LoginService loginService = new LoginService();

	     boolean result = loginService.authenticateUser(userId, password);

	     Customer user = loginService.getUserByUserId(userId);

	     if(result == true){

	         request.getSession().setAttribute("user", user);      

	         response.sendRedirect("home.jsp");

	     }

	     else{

	         response.sendRedirect("error.jsp");

	     }

	}




}

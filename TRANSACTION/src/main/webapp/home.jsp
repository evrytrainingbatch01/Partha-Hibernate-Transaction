<%@page import="java.util.List"%>

<%@page import="com.app.service.LoginService"%>

<%@page import="java.util.Date"%>

<%@page import="com.app.model.Customer"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="com.app.service.LoginService"%>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/style.css" />

<title>Result Page</title>

</head>

<body>

	<center>

		<div id="container">

			<h1>E-WALLET</h1>

			<b>===start the trnsaction===</b> </br>

			<%=new Date()%></br>

			<%
				Customer user = (Customer) session.getAttribute("user");
			%>

			<h3>
				Welcome
				<%=user.getFirstName() + " " + user.getLastName()%></h3>

			<br />



			<h3>
				<a href="logout.jsp">Logout</a>|<a href="addmoney.jsp">AddMoney</a>|<a
					href="transaction.jsp">Transaction</a>|<a href="checkbal.jsp">CheckBalance</a>
			</h3>

			</p>



			<table>

				<thead>

					<tr>

						<th>User ID</th>

						<th>First Name</th>



						<th>Last Name</th>

						<th>email</th>

					</tr>

				</thead>

				<tbody>

					<%
						LoginService loginService = new LoginService();

						List<Customer> list = loginService.getListOfUsers();

						for (Customer u : list) {
					%>

					<tr>

						<td><%=u.getUserId()%></td>

						<td><%=u.getFirstName()%></td>

						<td><%=u.getLastName()%></td>

						<td><%=u.getEmail()%></td>

					</tr>

					<%
						}
					%>
				
				<tbody>
			</table>

			<br />

		</div>

	</center>

</body>

</html>
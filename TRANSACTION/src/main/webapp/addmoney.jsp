<html>

<head>

<title>Account Form</title>

<style type="text/css">

h3{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:SlateBlue;

text-align: center; text-decoration: underline }

table{font-family: Calibri; color:black; font-size: 11pt; font-style: normal;width: 50%;

text-align:; background-color: yellow; border-collapse: collapse; border: 2px solid navy}

table.inner{border: 0px}

</style>

</head>

<body>

<h3>JUST FILL UP</h3>

<form action="AccountServlet" method="POST">

<table align="center" cellpadding = "10">

<tr>

<td>Account Number</td>

<td><input type="text" name="accountNumber" maxlength="30"/>



</td>

</tr>



<tr>

<td>Account Name</td>

<td><input type="text" name="accountName" maxlength="30"/>



</td>

</tr>

<tr>

<td>Enter Amount</td>

<td><input type="text" name="amount" maxlength="100" /></td>

</tr>



<tr>

<td colspan="2" align="center">

<input type="submit" value="Submit">

<input type="reset" value="Reset">

</td>

</tr>

</table>

</form>

</body>

</html>


<html>

<head>

<title>Account Form</title>

<style type="text/css">

h3{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:SlateBlue;

text-align: center; text-decoration: underline }

table{font-family: Calibri; color:white; font-size: 11pt; font-style: normal;width: 50%;

text-align:; background-color: SlateBlue; border-collapse: collapse; border: 2px solid navy}

table.inner{border: 0px}

</style>

</head>

<body>

<h3>Transaction Amount Here</h3>

<form action="TransferAccountServlet" method="POST">

<table align="center" cellpadding = "10">

<tr>

<td>From AccountNumber</td>

<td><input type="text" name="fromaccountNumber" maxlength="30"/>



</td>

</tr>



<tr>

<td>To AccountNumber</td>

<td><input type="text" name="toaccountNumber" maxlength="30"/>



</td>

</tr>

<tr>

<td>Transfer Amount</td>

<td><input type="text" name="transeramount" maxlength="100" /></td>

</tr>



<tr>

<td colspan="2" align="center">

<input type="submit" value="Transfer">

<input type="reset" value="Cancle">

</td>

</tr>

</table>

</form>

</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add-employee</title>
</head>
<body>



  	<form action = "addemployee" method = "POST">
		<label>Enter Id</label>
		<input type = "text" name = "employeeId">
		<br>
		<label>Enter Name</label>
		<input type = "text" name = "employeeName">
		<br>
		<label>Enter Salary</label>
		<input type = "text" name = "employeeSalary">
		<br><br>
		<hr>
		<input type = "submit" value = "Add">
	</form>
	



</body>
</html>
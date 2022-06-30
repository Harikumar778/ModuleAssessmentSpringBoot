<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

<h2>Employee Added sucessfully</h2>



<%

String EmployeeName=request.getParameter("empName");
String EmployeeSalary=request.getParameter("empSal");
String EmployeeRole=request.getParameter("empRole");


out.println("Employee Name "+ EmployeeName);
out.println("Employee Salary "+ EmployeeSalary);
out.println("Employee Role "+ EmployeeRole);

%>


</body>
</html>
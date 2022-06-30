<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spform" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Registration Form</h2>

<spform:form action="adduser" method="post" modelAttribute="emp">
Employee Name <spform:input path="empName"/>
Employee Salary <spform:input path="empSal"/>
Employee Role <spform:input path="empRole" />
Submit<input type="submit" value="savedeatails"/>
</spform:form>

</body>
</html>
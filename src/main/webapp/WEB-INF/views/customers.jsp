<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customers</title>
</head>
<body>

<table>
<tr>
	<th>#</th> <th>First Name</th> <th>Last Name</th> <th>Address</th> <th>Phone Number</th>
</tr>
<c:forEach var="customer" items="${customers}">
<tr>
	<td>${customer.customerId}</td>	
	<td>${customer.firstName}</td>
	<td>${customer.lastName}</td>
	<td>${customer.address.address}</td>
	<td>${customer.address.phone}</td>
	<td><a href="/update/${customer.customerId}">Update</a></td>
	<td><a href="/delete/${customer.customerId}">Delete</a></td>
</tr>
</c:forEach>
</table>
	
</body>
</html>
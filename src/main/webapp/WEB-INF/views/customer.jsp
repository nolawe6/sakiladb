<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer</title>
</head>
<body>
<table>
<tr>
	<th>#</th> <th>First Name</th> <th>Last Name</th> <th>Address</th> <th>Phone Number</th>
</tr>
<c:forEach var="" items="${}">
<tr>
	<td>${}</td><td>${}</td><td>${}</td><td>${}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
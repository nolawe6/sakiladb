<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>

<div>
	<p>Update Customer Info</p>
</div>
<form method="post" action="/customers">
	<input hidden type="text" name="customerId" value="${customer.customerId}"></input>
	<input type="text" name="firstName" value="${customer.firstName}"></input>
	<input type="text" name="lastName" value="${customer.lastName}"></input>
<%-- 	<input type="text" name="address" value="${customer.address.address}"></input> --%>
	<input type="text" name="phone" value="${customer.address.phone}"></input>
	<input hidden type="text" name="addressId" value="${customer.address.addressId}"></input>
	<input type="submit" value="Submit"/>
</form>
</body>
</html>
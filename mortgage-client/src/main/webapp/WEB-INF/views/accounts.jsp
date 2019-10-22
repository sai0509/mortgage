<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<center>
		<tr>
			<th>Account Number</th>
			<th>Amount</th>
			<th>Account Type</th>
		</tr>
		<c:forEach var = "account" items = "${accounts}">
			<tr>
				<td>${account.accountnum}</td>
				<td>${account.amount}</td>
				<td>${account.accounttype}</td>
			</tr>
		</c:forEach>
	</center>
</table>
</body>
</html>
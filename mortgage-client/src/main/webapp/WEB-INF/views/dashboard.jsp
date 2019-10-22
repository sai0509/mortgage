<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<table>
		<tr>
			<th>loanid</th>
			<th>loanamount</th>
			<th>areacode</th>
			<th>propertyid</th>
			<th>propertysq</th>
			<th>creditscore</th>
			<th>residence</th>
			<th>userid</th>
		</tr>
	</table>
	<form:forEach var = "loan" items = "${loans}">
		<tr>
			<td>${loan.loanid}</td>
			<td>${loan.loanamount}</td>
			<td>${loan.areacode}</td>
			<td>${loan.propertyid}</td>
			<td>${loan.propertysq}</td>
			<td>${loan.creditscore}</td>
			<td>${loan.residence}</td>
			<td>${loan.id}</td>
		</tr>
	</form:forEach>
	<a href = "loan" >NEW LOAN</a><br/><br/>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
a:link { COLOR: red; TEXT-DECORATION: none; font-weight: normal }
a:visited { COLOR: red; TEXT-DECORATION: none; font-weight: normal }
a:active { COLOR: black; TEXT-DECORATION: none }
a:hover { COLOR: blue; TEXT-DECORATION: none; font-weight: none }
</style>
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<table id="customers" border="2">
		<tr>
			<th>S No.</th>
			<th>Loan Amount</th>
			<th>AreaCode</th>
			<th>propertyname</th>
			<th>propertyid</th>
			<th>propertysq</th>
			<th>creditscore</th>
			<th>residence</th>
			<th>status</th>
			<th>check</th>
		</tr>
	<form:forEach var = "loan" items = "${loans}">
		<tr>
			<td>${loan.loanid}</td>
			<td>${loan.loanamount}</td>
			<td>${loan.areacode}</td>
			<td>${loan.propertyname}</td>
			<td>${loan.propertyid}</td>
			<td>${loan.propertysq}</td>
			<td>${loan.creditscore}</td>
			<td>${loan.residence}</td>
			<td>${loan.status}</td>
			<td><a href = "/loanamount/${loan.loanid}" >check loan amount</a></td>
		</tr>
	</form:forEach><br/><br/>
	</table>
</div>
</body>
</html>
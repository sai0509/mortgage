<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Apply Loan </h1><br/><br/>	
		<h2 style="color: red">${result}</h2>
	</center>
	<form:form method="post" action="applyloan" modelAttribute = "loan">
	
		<center>
			<form:hidden path = "id" />
			Loan Required: <form:input path="loanamount" /><br/><br/>
			Area Code :<form:input path="areacode" /><br/><br/>
			Property Id : <form:input path = "propertyid" /><br/><br/>
			Property(In sqft): <form:input path="propertysq" /><br/><br/> 
			Credit Score: <form:input path="creditscore" /><br/><br/> 
			Country: <form:input path="residence" /><br/><br/> 			
			<input type="submit" value="Apply" />
		</center>
	</form:form>

</body>
</html>
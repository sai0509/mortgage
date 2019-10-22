<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="Authenticate" method="post">
		<center>
			<h1>Enter Login Details</h1>
			<table border="2">
				<tr>
					<th>User Name</th>
					<td><input type="username" name="username" /></td>
				</tr>
				</br>
				</br>
				<tr>
					<th>Password</th>
					<td><input type="password" name="password"/></td>
				</tr>
				</br>
				</br>
				<tr>
					<td colspan="2"><input type = "submit" value = "Login" style="width: 150px;"/></td>
				</tr>
			</table><br/><br/>
			<a href = "registeruser">NEW USER REGISTER</a>
		</center>
	</form:form>
</body>
</html>
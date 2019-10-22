<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="adduserdetails" method = "post">
		<center>
			<table border="2">
				<tr>
					<th>User Name</th>
					<td><input type = "text" name = "username" /></td>
				</tr>
				</br>
				</br>
				<tr>
					<th>Password</th>
					<td><input type="password" name="password" /></td>
				</tr>
				</br>
				</br>
				<tr>
					<td colspan="2"><center><input type="submit" value="Next" style="width: 150px;" /></center></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>
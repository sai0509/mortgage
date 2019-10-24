<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">

input[type]{
width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

#submit {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

#submit:hover {
  opacity: 0.8;
}

a:link { COLOR: red; TEXT-DECORATION: none; font-weight: normal }
a:visited { COLOR: red; TEXT-DECORATION: none; font-weight: normal }
a:active { COLOR: black; TEXT-DECORATION: none }
a:hover { COLOR: blue; TEXT-DECORATION: none; font-weight: none }
</style>

<title>Insert title here</title>
</head>
<body style="background-color:#5DADE2">

<form:form action="Authenticate" method="post">

<center>
<h1>Enter Login Details</h1>
<table>
<tr>
<th>User Name</th>
<td><input type="username" name="username" placeholder="Enter Username"/></td>
</tr>

<tr>
<th>Password</th>
<td><input type="password" name="password" placeholder="Enter Password"/></td>
</tr>
<tr>
<td colspan="2"><input type = "submit" id="submit" value = "Login" /></td>
</tr>
</table><br/><br/>
<a href = "registeruser">NEW USER REGISTER</a>
</center>
</form:form>
</body>
</html>
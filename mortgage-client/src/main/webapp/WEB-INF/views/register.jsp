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
  border: 1px solid black;
  box-sizing: border-box;
}

#submit {
  background-color: black;
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
<body style="background-color:pink">
<form:form action="adduserdetails" method = "post">
<div align="center">
<h1>New User Register</h1>
<table>
<tr>
<th>User Name</th>
<td><input type = "text" name = "username" style="background-color:#EBEDEF" /></td>
</tr>
<tr>
<th>Password</th>
<td><input type="password" name="password" style="background-color:#EBEDEF" /></td>
</tr>

<tr>
<td colspan="2"><input type="submit" id="submit" value="Next" /></td>
</tr>
</table>
</div>
</form:form>
</body>
</html>

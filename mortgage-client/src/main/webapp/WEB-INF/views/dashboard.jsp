<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
a:link { COLOR: red; TEXT-DECORATION: none; font-weight: normal }
a:visited { COLOR: red; TEXT-DECORATION: none; font-weight: normal }
a:active { COLOR: black; TEXT-DECORATION: none }
a:hover { COLOR: blue; TEXT-DECORATION: none; font-weight: none }</style>
</head>
<body style="background-color: #f2f2f2">
<h2 style="color: grey">${customer}</h2>

<div align="center">
	<h1><a href = "existingloans" >EXISTING LOANS</a></h1>
	<h1><a href = "loan" >NEW LOAN</a><br/><br/></h1>
</div>
</body>
</html>
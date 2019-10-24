<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
#Signup{
 width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
   text-align: center;
}
#tb{
  width: 100%;
  padding: 14px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}


input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
 
}

input[type=submit]:hover {
  background-color: #45a049;
}

.row:after{
content:"";
display:table;
clear:both;
}

 

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<body>
<title>Apply Loan</title>
</head>

<body>
    <div align="center">
     
          <h1>Apply Loan </h1>
          <h2 style="color: red">${result}</h2>
        <form:form action="applyloan" method="post" modelAttribute="loan">
       
        <table>
          <div class="row">
          
         
        <form:hidden path="id"/>
            <tr>
                <td>Loan Required:</td>
                <td><form:input path="loanamount" placeholder="Loan Amount" id="tb"/></td>
            </tr>
            <tr>
                <td>Area Code:</td>
                <td><form:input path="areacode" placeholder="Area Code" id="tb"/></td>
            </tr>
            <tr>
                <td>Property Name:</td>
                <td> <form:input path="propertyname"  placeholder="Property Name" id="tb"/>
                </td>
            </tr>
            <tr>
                <td>Property Id:</td>
                <td> <form:input path="propertyid"  placeholder="Property Id" id="tb"/>
                </td>
            </tr>
            <tr>
                <td>Property(In sqft):</td>
                <td><form:input path="propertysq" placeholder="Property in sq" id="tb"/></td>
            </tr>
            <tr>
                <td> Credit Score:</td>
                <td><form:input path="creditscore" placeholder="Credit Score" id="tb"/></td>
            </tr>
            <tr>
                <td> Country:</td>
                <td><form:input path="residence" placeholder="Country" id="tb"/></td>
            </tr>
            
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Apply"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>

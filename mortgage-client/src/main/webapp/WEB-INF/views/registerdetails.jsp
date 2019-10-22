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
<title>New Applicant</title>
</head>
<body>
    <div align="center">
        <h1>New Applicant</h1>
        <form:form action="registeruserdetails" method="post" modelAttribute="personalDetails">
        <table>
        <form:hidden path="id"/>
            <tr>
                <td>FirstName</td>
                <td><form:input path="firstname" /></td>
            </tr>
            <tr>
                <td>LastName:</td>
                <td><form:input path="lastname" /></td>
            </tr>
            <tr>
                <td>DateOfJoin:</td>
                <td> <form:input path="dob" type="date"/>
                </td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td> City:</td>
                <td><form:input path="city" /></td>
            </tr>
            <tr>
                <td> State:</td>
                <td><form:input path="state" /></td>
            </tr>
            <tr>
                <td> PinCode:</td>
                <td><form:input path="pincode" /></td>
            </tr>
            <tr>
                <td> Mobile No:</td>
                <td><form:input path="mobileno" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Register"></td>
            </tr>
        </table>
        </form:form>
    </div>
   
   
   
   
   
</body>
</html>
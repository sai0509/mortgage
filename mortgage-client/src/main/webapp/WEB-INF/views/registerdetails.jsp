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
<title>New Applicant</title>
</head>

<body>
    <div align="center">
     <h1>New Applicant</h1>
        <form:form action="registeruserdetails" method="post" modelAttribute="personalDetails">
       
        <table>
          <div class="row">
         
          
          
          </div></div>
        <form:hidden path="id"/>
            <tr>
                <td>First Name:</td>
                <td><form:input path="firstname" placeholder="FirstName" id="tb"/></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><form:input path="lastname" placeholder="LastName" id="tb"/></td>
            </tr>
            <tr>
                <td>Date Of Birth:</td>
                <td> <form:input path="dob" type="date" placeholder="DateOfBirth" id="tb"/>
                </td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" placeholder="Address" id="tb"/></td>
            </tr>
            <tr>
                <td> City:</td>
                <td><form:input path="city" placeholder="City" id="tb"/></td>
            </tr>
            <tr>
                <td> State:</td>
                <td><form:input path="state" placeholder="State" id="tb"/></td>
            </tr>
            <tr>
                <td> Pin Code:</td>
                <td><form:input path="pincode" placeholder="PinCode" id="tb"/></td>
            </tr>
            <tr>
                <td> Mobile No:</td>
                <td><form:input path="mobileno" placeholder="MobileNo" id="tb"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Register"></td>
            </tr>
        </table>
        </form:form>
    </div>
   
   
   
   
   
</body>
</html>

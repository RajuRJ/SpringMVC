<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib
    prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" 
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart WebSite</title>
</head>
<body>
<center><h2>Shopping Cart</h2></center>
<center> ${msg} </center>
<br>
<center> ${loginmsg} </center>
<hr>

<a href="Login">Login</a><br>
<a href="Register">Register</a>
<br>

<c:if test="{isUserClickedLogin==true}">
<jsp:include page="Login.jsp"></jsp:include>
</c:if>
<c:if test="{isUserClickedRegister==true}">
<jsp:include page="Register.jsp"></jsp:include>
</c:if>     

</body>
</html>
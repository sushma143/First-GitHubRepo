<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
p,li{
color:white;
font-family:fantasy;
font-size:26px;

}
</style>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body style="background-color:#587501;">
<%@ include file="header.html" %>


<c:set var="uname" value="${param.username }" scope="session"></c:set>
<c:url var = "productUrlEnc" value="product.jsp"></c:url>
	<section style="text-align:center;border:2px double maroon;background-color:#93bf0d;width:50%;margin-left:250px;">
	<p>Dear ${param.username} Welcome to online Shopping of Zensar</p>
	<p>Your session time out Period is ${pageContext.session.maxInactiveInterval } seconds.</p>
	
	<p>To view and purchase products <a style="color:black;" " href="${ productUrlEnc}">Click Here</a> </p>
	
	
	</section>
	

<%@ include file="footer.html" %>

</body>
</html>
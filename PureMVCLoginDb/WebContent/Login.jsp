<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" buffer="16kb" session="false"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">

input[type="text"],[type="password"]{
border-radius: 7px;
    width:200px;
    border: 2px solid black;
    padding: 5px;
}
p{
 text-size:18px;
 color:maroon;
 font-family:arial;
}


</style>

<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body style="background-color:#587501;">

	
	<%@ include file="header.html" %>
	
			<form action="checkuser" method="get" style="border:2px solid white; margin-left:200px;background-color:#93bf0d;margin-right:200px;padding-left:100px;">
				<p>UserName: <input type="text" name="username" placeholder="Enter username"></p>
				<p>Password: <input type="password" name="passwd" placeholder="Enter password"></p>
				<p> <input style="background-color:#4a070c;color:white;" type="submit" value="sign in"></p>
			
			</form>
			
			<%@ include file="footer.html" %>
			

</body>
</html>
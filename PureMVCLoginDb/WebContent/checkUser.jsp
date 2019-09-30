<jsp:useBean id="ob" class="com.zensar.models.LoginBean" scope="request"></jsp:useBean>
<jsp:setProperty property="username" name="ob" />
<jsp:setProperty property="password" name="ob" param="passwd"/>
<% 
				
		//business logic
		if(ob.validateUser())
		{%>
			<%-----pageContext.forward("welcome.jsp");
			RequestDispatcher rd= request.getRequestDispatcher("welcome.jsp");
			rd.forward(request,response);-----%>
			
			<jsp:forward page="welcome.jsp">
				<jsp:param value="Core Java" name="book1"/>
				<jsp:param value="Spring" name="book2"/>
			</jsp:forward>
	<%	}
		else
		{ 
		%>
		<h2 style="color:white;">Sorry !!!!!!!!Invalid username/password</h2>
				<%-----//pageContext.include("Login.jsp");-----%>
			
			<jsp:include page="Login.jsp"/>
		<%}

%>
<header id="pageheader">
	<img src="http://placehold.it/1080x50" />
	<h1>Hello</h1>
	<nav>
		<ul>
			 <% 
			 String s1 = "";
			 String s2 = "";
			 String s3 = "";
			 switch(request.getParameter("page")){
			 case "home": s1 = "id=\"current\""; break;
			 case "overview": s2 = "id=\"current\""; break;
			 case "add": s3 = "id=\"current\""; break;
			 }
			 %>
			<li <%= s1 %>><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
			<li <%= s2 %>><a href="${pageContext.request.contextPath}/overview.jsp">Tracker Overview</a></li>
			<li <%= s3 %>><a href="${pageContext.request.contextPath}/add.jsp">Add Page</a></li>
			
		</ul>
	</nav>
</header>
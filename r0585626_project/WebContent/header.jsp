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
			<li><a href="home.jsp" <%= s1 %>>Home</a></li>
			<li><a href="overview.jsp" <%= s2 %>>Tracker Overview</a></li>
			<li><a href="add.jsp" <%= s3 %>>Add Page</a></li>
			
		</ul>
	</nav>
</header>
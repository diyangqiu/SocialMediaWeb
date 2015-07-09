<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<c:import url="/WEB-INF/inserts/head.jsp" />
<body>
	<c:import url="/WEB-INF/inserts/header.jsp" />
	<div class="container">
	
		<table class="table">
			<tr>
				<th>Name</th>
				
				<th>Nick Name</th>
			</tr>
			
			<c:forEach items="${userlist}" var="user">
				
			<tr><td><a href="/SocialMediaWeb_Group/displayUserDetails?id=${user.userid}">${user.name}</a></td>
			
		
			
			<td>${user.nickname}</td></tr>
			
			
			</c:forEach>
		</table>
		<a href ="/SocialMediaWeb_Group/index.jsp">Back</a>

	
	<c:import url="/WEB-INF/inserts/footer.jsp" />
	</div> <!-- /container -->
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	

</body>
</html>

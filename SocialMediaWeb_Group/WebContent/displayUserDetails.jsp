<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<c:import url="/WEB-INF/inserts/head.jsp" />
<body>
	<c:import url="/WEB-INF/inserts/header.jsp" />
	<div class="container">
	
		${message}
		<div class="jumbotron">
			<h1>Users Details</h1>
			<!-- 		<p><a class="btn btn-primary btn-lg" href="index.html" role="button">Home</a></p>  -->
		</div>	
		<table class="table table-hover">
			${tableInfo}
		</table>
		
		
    <c:import url="/WEB-INF/inserts/footer.jsp" />
	</div> <!-- /container -->
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
</body>
</html>
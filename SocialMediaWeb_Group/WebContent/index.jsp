<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<c:import url="/WEB-INF/inserts/head.jsp" />
<body>
	
	<div class="jumbotron">
		<c:import url="/WEB-INF/inserts/header.jsp" />
		<div class="container">
			<h1>FakeFacebook</h1>
			<p>Connect with friends and the <br /> world around you on FakeFacebook. </p>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h2>Sign Up: </h2>
				<p><a class="btn btn-danger col-md-3" href="register.jsp" role="button">New User </a></p>
			</div>
			<div class="col-md-6">
				<h2>Log In: </h2>
				<p><a class="btn btn-primary col-md-3" href="login.jsp" role="button">Log In</a></p>
			</div>
		</div>
	<c:import url="/WEB-INF/inserts/footer.jsp" />
	</div> <!-- /container -->
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
</body>
</html>
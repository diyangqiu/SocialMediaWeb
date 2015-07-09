<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="javax.servlet.ServletContext" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="javax.servlet.RequestDispatcher" %>
<html>
	<c:import url="/WEB-INF/inserts/head.jsp" />
<body>
	<c:import url="/WEB-INF/inserts/header.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1>FakeFacebook</h1>
			<p>Welcome to FakeFacebook.</p>			
		</div>
	</div>
	<div class="container">
		<c:if test="${message != null}">
			<div class='alert alert-danger' role='alert'><c:out value="${message}" /></div>
		</c:if>
		<form class="form-horizontal col-sm-offset-0" action="Login" method="post">
			<div class="form-group">
				<label for="email" class="col-sm-3 control-label">Email</label>
				<div class="col-sm-5">
					<input type="email" class="form-control" name="email" id="email" placeholder="Email" />
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="col-sm-3 control-label">Password</label>
				<div class="col-sm-5">
					<input type="password" class="form-control" name="password" id="password" placeholder="Password" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-3"></div>
				<div class="col-sm-5">
					<button type="submit" class="btn btn-primary form-control" id="submit">Sign On</button>
				</div>
			</div>
		</form>
	<c:import url="/WEB-INF/inserts/footer.jsp" />
	</div> <!-- /container -->
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
</body>
</html>
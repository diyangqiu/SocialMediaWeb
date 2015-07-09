<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<c:import url="/WEB-INF/inserts/head.jsp" />
<body>
	<c:import url="/WEB-INF/inserts/header.jsp" />
	<div class="container">
	<form action="Register" method="post" class="form-horizontal">
		<fieldset>
		<legend>User Info</legend>
		
		<div class="form-group">
			<label for="email" class="col-sm-2 control-label">Email: </label>
			<div class="col-sm-10">
				<input id="email" name="email" type="email" class="form-control" required="required"/> <br/>
			</div>
		</div>
			
		<div class="form-group">
			<label for="password" class="col-sm-2 control-label">Password: </label>
			<div class="col-sm-10">
				<input id="password" name="password" type="password" class="form-control" required="required"/> <br/> 
			</div>
		</div>
		
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">Name: </label>
			<div class="col-sm-10">
				<input id="name" name="name" class="form-control"/> <br/> 
			</div>
		</div>
		
		<div class="form-group">
			<label for="nickname" class="col-sm-2 control-label">Nickname: </label>
			<div class="col-sm-10">
				<input id="nickname" name="nickname" class="form-control"/> <br/> 
			</div>
		</div>
		
		<div class="form-group">
			<label for="favsong" class="col-sm-2 control-label">Favorite Song: </label>
			<div class="col-sm-10">
				<input id="favsong" name="favsong" class="form-control"/> <br/> 
			</div>
		</div>
		
		<div class="form-group">
		<label for="favmovie" class="col-sm-2 control-label">Favorite Movie: </label>
			<div class="col-sm-10">
				<input id="favmovie" name="favmovie" class="form-control"/> <br/> 
			</div>
		</div>
		
		<div class="form-group">
			<label for="favcolor" class="col-sm-2 control-label">Favorite Color: </label>
			<div class="col-sm-10">
				<input id="favcolor" name="favcolor" class="form-control"/> <br/> 
			</div>
		</div>
		
		</fieldset>
		<div class="form-group">
	    	<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" name="register" value="register" class="btn btn-default">Register</button>
			</div>
		</div>
	</form>
	<c:import url="/WEB-INF/inserts/footer.jsp" />
	</div> <!-- /container -->
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
</body>
</html>
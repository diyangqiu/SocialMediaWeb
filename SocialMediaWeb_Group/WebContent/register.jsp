<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Register" method="post">
<fieldset>
<legend>User Info</legend>
<label for="email">Email: </label>
<input id="email" name="email" type="email" required="required"/> <br/>
<label for="password">Password: </label>
<input id="password" name="password" type="password" required="required"/> <br/> 
<label for="name">Name: </label>
<input id="name" name="name"/> <br/> 
<label for="nickname">Nickname: </label>
<input id="nickname" name="nickname"/> <br/> 
<label for="favsong">Favorite Song: </label>
<input id="favsong" name="favsong"/> <br/> 
<label for="favmovie">Favorite Movie: </label>
<input id="favmovie" name="favmovie"/> <br/> 
<label for="favcolor">Favorite Color: </label>
<input id="favcolor" name="favcolor"/> <br/> 
</fieldset>
<button type="submit" name="register" value="register">Register</button>
</form>
</body>
</html>
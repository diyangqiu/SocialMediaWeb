<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<th>Name</th><th></th><th>Nick Name</th>

	
	<c:forEach items="${userlist}" var="user">
	
	
	<tr><td><a href="/DisplayCustomerDetails?id=${user.userid}">${user.name}</a></td><td></td>
	
	<td>${user.nickname}</td></tr>
	
	
	</c:forEach>
	</table>
	<a href ="/index.jsp">Back</a>
</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header id="header">
		<nav class="navbar navbar-inverse navbar-fixed-top" style="background-color:3A5795;" >
			<div class="container" style="background-color:3A5795;">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.jsp">FakeFacebook</a>
				</div>
				<c:if test="${log != true && pageContext.request.requestURL != 'http://localhost:8080/LifeCorpTM/logon.jsp'}">
				<div id="navbar" class="navbar-collapse collapse">
					<form class="navbar-form navbar-right" action="Logon" method="post">
						<div class="form-group">
							<input type="text" placeholder="Email" name="email" id="email" class="form-control" />
						</div>
						<div class="form-group">
							<input type="password" placeholder="Password" name="password" id="password" class="form-control" />
						</div>
						<button type="submit" class="btn btn-default">Sign in</button>
					</form>
				</div><!--/.navbar-collapse -->
				</c:if>
				
				<c:if test="${log == true}">
					<div class="navbar-right"><a style="color:white;" href="Logout">Logout <c:out value="${user.email}" /></a></div>
				</c:if>
			</div>
		</nav>
		<br />
		<br />
		<br />
		<br />
	</header>
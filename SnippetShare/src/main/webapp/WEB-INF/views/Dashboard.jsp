<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
<link href="./css/bootstrap.min.css" rel="stylesheet">
<link href="./css/Style.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="header clearfix">
			<nav>
			<ul class="nav nav-pills pull-right">

				<form:select path="category">
					<form:options items="${categoryList}" />
				</form:select>

				<li role="presentation" class="active"><a href="#">Dashboard</a></li>

				<li role="presentation" class="dropdown"><a
					class="dropdown-toggle" data-toggle="dropdown" href="#"
					aria-expanded="false"> User Name </span><span class="badge">5</span><span
						class="caret"></a>
					<ul class="dropdown-menu">
						<li role="presentation"><a
							href="${pageContext.request.contextPath}/Profile">Profile</a></li>
						<li role="presentation"><a href="#">Activity <span
								class="badge">5</span></a></li>
						<li role="presentation"><a href="#">History</a></li>
					</ul></li>
                <li role="presentation" ><a href="#">New Board</a></li>
				<li role="presentation"><a href="${pageContext.request.contextPath}/SignIn">Log Out</a></li>
			</ul>
			</nav>
			<h3 class="text-muted">Snippet Share</h3>
		</div>


		<form class="Dashboard">
			<h2>TO DO :// List all public and private board according to
				category</h2>
			<h3>ON click on a particular board.. should navigae to View
				Board... View board should display all the snippets</h3>

			<div class="row">
				<div class="col-md-5">
					<h3>Public</h3>
					<h4>Subheading</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
						Laudantium veniam exercitationem expedita laborum at voluptate.
						Labore, voluptates totam at aut nemo deserunt rem magni pariatur
						quos perspiciatis atque eveniet unde.</p>
					<a class="btn btn-primary" href="#">View Project <span
						class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
			</div>

			<div class="row">
				<div class="col-md-5">
					<h3>Private</h3>
					<h4>Subheading</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
						Laudantium veniam exercitationem expedita laborum at voluptate.
						Labore, voluptates totam at aut nemo deserunt rem magni pariatur
						quos perspiciatis atque eveniet unde.</p>
					<a class="btn btn-primary" href="#">View Project <span
						class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
			</div>

			<div class="row">
				<div class="col-md-5">
					<h3>Project One</h3>
					<h4>Subheading</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
						Laudantium veniam exercitationem expedita laborum at voluptate.
						Labore, voluptates totam at aut nemo deserunt rem magni pariatur
						quos perspiciatis atque eveniet unde.</p>
					<a class="btn btn-primary" href="#">View Project <span
						class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
			</div>

		</form>

		<footer class="footer">
		<p>&copy; CMPE275 2015</p>
		</footer>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Snippet Share - Snippet Details</title>

<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/css/agency.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet" type="text/css">

<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>

</head>
<body>
<body id="page-top" class="index">

	<!-- Navigation -->
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand page-scroll" href="#page-top">Snippet
				Share</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="hidden"><a href="#page-top"></a></li>
				<li><a class="page-scroll" href="${pageContext.request.contextPath}/signin">Home</a></li>
				<li><a class="page-scroll" href="${pageContext.request.contextPath}/signout">Log Out</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>

	<!-- Header -->
	<header>
	<div class="container">
		<div class="intro-text">
		<div class="intro-lead-in">Snippet Details</div>
			<form class="Dashboard" method="post" action="${pageContext.request.contextPath}/${boardId}/addSnippet">
				<div class="form-group" >
					<input type="text" class="form-control" placeholder="Title *"
						name="title" id="inputTitle" required
						data-validation-required-message="Please enter your .">
					<p class="help-block text-danger"></p>
				</div>

				<div class="form-group">
					<select name="category" class="form-control">
						<option value="Business">Business</option>
						<option value="Sports">Sports</option>
						<option value="Health">Health</option>
						<option value="School">School</option>
						<option value="Politics">Politics</option>
						<option value="Military">Military</option>
						<option value="Software">Software</option>
						<option value="Economics">Economics</option>
						<option value="History">History</option>
						<option value="Environment">Environment</option>
					</select>
				</div>

				
				<div class="form-group">
					<select name="category" class="form-control">
						<option value="Public">Public</option>
						<option value="Private">Private</option>
					</select>
				</div>
				
				<div class="form-group">
						<textarea rows="10" id="inputContent" class="form-control" 
					       placeholder="Add Content Here" required></textarea>
					<p class="help-block text-danger"></p>
				</div>
				
			<input type="text" class="form-control" placeholder="Tags"
						name="title" id="inputTitle" required
						data-validation-required-message="Please enter your .">

				<p>By creating a snippet you agree to our Terms of Service.</p>
				<br />
				<button class="btn btn-lg btn-success" type="submit">Create</button>
					
			</form>
		</div>
	</div>
	</header>

	<footer>
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<span class="copyright">Copyright &copy; CMPE 2015 Team 12</span>
			</div>
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<ul class="list-inline quicklinks">
					<li><a href="#">Privacy Policy</a></li>
					<li><a href="#">Terms of Use</a></li>
				</ul>
			</div>
		</div>
	</div>
	</footer>

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script
		src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
	<script src="js/classie.js"></script>
	<script src="js/cbpAnimatedHeader.js"></script>

	<!-- Contact Form JavaScript -->
	<script src="js/jqBootstrapValidation.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="js/agency.js"></script>
</body>
</html>
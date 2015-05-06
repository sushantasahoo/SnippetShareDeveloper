<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request Access</title>

<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/css/agency.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath}/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

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
				<li><a class="page-scroll"
					href="${pageContext.request.contextPath}/signin">Home</a></li>
				<li><a class="page-scroll"
					href="${pageContext.request.contextPath}/signout">Log Out</a></li>
				<li><a href="#requestModal1" class="portfolio-link"
					data-toggle="modal">New Comment</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>


	<header>
	<div class="container">
		<div class="intro-text">
			<form method="POST" id="${privateBoard.getBoardId()}"
				action="${pageContext.request.contextPath}/postComment/${boardId}/${snippetId}">
				<div class="Dashboard">
					<h2>Post Comment</h2>
					<div class="form-group">
						<textarea rows="10" id="comment" name="comment"
							class="form-control" placeholder="Add Comment Here" required></textarea>
						<p class="help-block text-danger"></p>
					</div>


					<button type="submit" class="btn btn-lg btn-success">
						COMMENT</button>
				</div>
			</form>
		</div>
	</div>
	</header>
</body>
</html>
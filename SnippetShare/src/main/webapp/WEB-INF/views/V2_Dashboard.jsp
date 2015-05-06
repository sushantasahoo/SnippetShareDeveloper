<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Snippet Share - Dashboard</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/agency.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">

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
				<li><a class="page-scroll"
					href="${pageContext.request.contextPath}/CreateBoard">New Board</a></li>
				<li><a class="page-scroll" href="#publicBoard">Public
						Boards</a></li>
				<li><a class="page-scroll" href="#privateBoard">Private
						Boards</a></li>
				<li><a class="page-scroll"
					href="${pageContext.request.contextPath}/viewUnsubscribedBoard">Subscribe</a></li>
				<li><a class="page-scroll"
					href="${pageContext.request.contextPath}/viewProfile">Profile</a></li>
				<li><a class="page-scroll"
					href="${pageContext.request.contextPath}/viewNotification">Notification</a></li>
				<li><a class="page-scroll"
					href="${pageContext.request.contextPath}/signout">Log Out</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>

	<!-- Header -->
	<header>
	<div class="container">
		<div class="intro-text">
			<div class="intro-lead-in">Welcome</div>
			<h2>${userSession.getFirstname()}</h2>
		</div>
	</div>
	</header>


	<!-- Public Grid Section -->
	<section id="publicBoard" class="bg-light-gray">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading">Public Boards</h2>
				<div class="Dashboard form-group">
					<select name="category" class="form-control">
						<option value="All">ALL</option>
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
			</div>
		</div>
		<div class="row">
			<c:if test="${ not empty publicBoardList }">

				<c:forEach var="publicBoard" items="${publicBoardList}">
					<form method="GET" name="${publicBoard.getBoardId()}"
						action="${pageContext.request.contextPath}/viewBoard/${publicBoard.getBoardId()}">
						<div class="col-md-3 portfolio-item">
							<a href="#" onclick="$(this).closest('form').submit()"
								class="portfolio-link" data-toggle="modal">
								<div class="portfolio-hover"></div> <img
								src="img/portfolio/roundicons.png" class="img-responsive" alt="">
							</a>
							<div class="portfolio-caption">
								<h4>${publicBoard.getTitle()}</h4>
								<p class="text-muted">${publicBoard.getDescription()}</p>
							</div>
						</div>
					</form>
				</c:forEach>
			</c:if>
			<c:if test="${empty publicBoardList }">
				<h4>No Boards Available</h4>
			</c:if>
		</div>
	</div>
	</section>

	<!-- Private Grid Section -->
	<section id="privateBoard" class="bg-light-gray">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading">Private Boards</h2>
				<div class="Dashboard form-group">
					<select name="category" class="form-control">
						<option value="All">ALL</option>
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
			</div>
		</div>
		<div class="row">
			<c:if test="${ not empty privateBoardList }">
				<c:forEach var="privateBoard" items="${privateBoardList}">
					<form method="post"
						action="${pageContext.request.contextPath}/viewBoard/${privateBoard.getBoardId()}">
						<div class="col-md-3 portfolio-item">
							<a href="#" onclick="$(this).closest('form').submit()"
								class="portfolio-link" data-toggle="modal">
								<div class="portfolio-hover"></div> <img
								src="img/portfolio/roundicons.png" class="img-responsive" alt="">
								<div class="portfolio-caption">
									<h4>${privateBoard.getTitle()}</h4>
									<p class="text-muted">${privateBoard.getDescription()}</p>
								</div>
						</div>
					</form>
				</c:forEach>
			</c:if>
			<c:if test="${empty privateBoardList }">
				<h4>No Boards Available</h4>
			</c:if>

		</div>
	</div>
	</section>


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
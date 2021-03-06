<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Snippet Share - Board</title>

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
<body id="page-top" class="index" bgcolor="#E6E6FA">

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
				<li><a
					href="${pageContext.request.contextPath}/addComment/${boardId}/${snippet.getSnippetId()}"
					class="portfolio-link" data-toggle="modal">New Comment</a></li>
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
		<div class="intro-text text-align">
			<form class="Dashboard" style="background-color:White">
				
					<div class="Dashboard form-group" >
						<h3 style="color:Green">Snippet</h3></br>
						<h2 style="color:Red" id="${snippet}" >${snippet.getTitle()}</h2>
						<h4 style="color:BLUE">Tag: ${snippet.getTags()} </h4>
						<h4 style="color:BLUE" >Content: ${snippet.getContent()} </h4><br><br>
						<h3 style="color:Green">Comments</h3>
						<form>
							<c:if test="${ not empty comments }">
								<c:forEach var="comment" items="${comments}">
									<form>
									<div class="form-inline">
										<p style="color:Black">${comment.getUserName()} :<input class="form-control" readonly value=" ${comment.getComment()}"></input></p>
										</br>
										</div>
									</form>
								</c:forEach>
							</c:if>

							<c:if test="${empty comments }">
								<h4>No Comments Found</h4>
								</br>
							</c:if>
						</form>
						</div>
					
			</form>
		</div>
	</div>
	</header>


	<!-- Portfolio Grid Section -->
	

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


	<div class="portfolio-modal modal fade" id="commentModal1"
		tabindex="-1" role="dialog" aria-hidden="true">
		<form>
			<div class="modal-content">
				<div class="close-modal" data-dismiss="modal">
					<div class="lr">
						<div class="rl"></div>
					</div>
				</div>
				<div class="container">
					<div class="row">
						<div class="col-lg-8 col-lg-offset-2">
							<div class="modal-body">
								<!-- Project Details Go Here -->
								<h2>Add Comment</h2>
								<p class="item-intro text-muted">Please read all the Terms
									and Condition befor adding Comment</p>

								<div class="form-group">
									<textarea rows="10" id="inputContent" class="form-control"
										placeholder="Add Comment Here" required></textarea>
									<p class="help-block text-danger"></p>
								</div>

								<button type="button" class="btn btn-lg btn-default"
									data-dismiss="modal">Back</button>

								<button type="submit" class="btn btn-lg btn-success">
									Add</button>

							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>


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
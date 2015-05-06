<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Snippet Share - Board</title>

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
				<li><a class="page-scroll" href="#">Dashboard</a></li>
				<li><a href="#commentModal1" class="portfolio-link"
					data-toggle="modal">New Comment</a></li>
				<li><a class="page-scroll" href="${pageContext.request.contextPath}/signout">Log Out</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>

	<!-- Header -->
	<header>
	<div class="container">
			<div class="intro-text text-align">
				<form class="Dashboard"> 
					<div class="row">
						<div class="col-md-7">
							<c:if test="${ not empty commentList }">
								<textarea id="sinppet"> TO DO:?? Get Snippet </textarea>
								<h3>Comments</h3>
								<c:forEach var="comment" items="${commentList}">
									<h4>${publicBoard.title}</h4>
									<p>${publicBoard.description}</p>
									<a class="btn btn-primary" href="#"><span
										class="glyphicon glyphicon-chevron-right"></span></a>
								</c:forEach>
							</c:if>
						</div>
					</div>
				</form>
			</div>
		</div>
	</header>


	<!-- Portfolio Grid Section -->
	<section id="portfolio" class="bg-light-gray">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading">Portfolio</h2>
				<h3 class="section-subheading text-muted">Lorem ipsum dolor sit
					amet consectetur.</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4 col-sm-6 portfolio-item">
				<a href="#portfolioModal1" class="portfolio-link"
					data-toggle="modal">
					<div class="portfolio-hover">
						<div class="portfolio-hover-content">
							<i class="fa fa-plus fa-3x"></i>
						</div>
					</div> <img src="img/portfolio/roundicons.png" class="img-responsive"
					alt="">
				</a>
				<div class="portfolio-caption">
					<h4>Round Icons</h4>
					<p class="text-muted">Graphic Design</p>
				</div>
			</div>
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

	<div class="portfolio-modal modal fade" id="portfolioModal1"
		tabindex="-1" role="dialog" aria-hidden="true">
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
							<h2>Project Name</h2>
							<p class="item-intro text-muted">Lorem ipsum dolor sit amet
								consectetur.</p>
							<img class="img-responsive img-centered"
								src="img/portfolio/roundicons-free.png" alt="">
							<p>Use this area to describe your project. Lorem ipsum dolor
								sit amet, consectetur adipisicing elit. Est blanditiis dolorem
								culpa incidunt minus dignissimos deserunt repellat aperiam quasi
								sunt officia expedita beatae cupiditate, maiores repudiandae,
								nostrum, reiciendis facere nemo!</p>
							<p>
								<strong>Want these icons in this portfolio item sample?</strong>You
								can download 60 of them for free, courtesy of <a
									href="https://getdpd.com/cart/hoplink/18076?referrer=bvbo4kax5k8ogc">RoundIcons.com</a>,
								or you can purchase the 1500 icon set <a
									href="https://getdpd.com/cart/hoplink/18076?referrer=bvbo4kax5k8ogc">here</a>.
							</p>
							<ul class="list-inline">
								<li>Date: July 2014</li>
								<li>Client: Round Icons</li>
								<li>Category: Graphic Design</li>
							</ul>
							<button type="button" class="btn btn-primary"
								data-dismiss="modal">
								<i class="fa fa-times"></i> Close Project
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



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

								<button type="button" class="btn btn-lg btn-success">
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
					<li><a class="page-scroll" href="#">New Board</a></li>
					<li><a class="page-scroll" href="#">Profile</a></li>
					<li><a class="page-scroll" href="#">Activity</a></li>
					<li><a class="page-scroll" href="#">History</a></li>
					<li><a class="page-scroll" href="#">Log Out</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<!-- Header -->
	<header>
		<div class="container">
			<div class="intro-text">
				<div class="intro-lead-in">Profile Details</div>
				<form class="form-signin" method="post">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="First Name *" value =${userSession.getFirstName()} 
							name="firstname" id="inputFirstName" required data-validation-required-message="Please enter your first name.">
						<p class="help-block text-danger"></p>
					</div>

					<div class="form-group">
						<input type="text" class="form-control" name="lastname"
							placeholder="Last Name *" value =${userSession.getLastName()}  id="inputLastName" required
							data-validation-required-message="Please enter your last name.">
						<p class="help-block text-danger"></p>
					</div>

					<div class="form-group">
						<input type="email" class="form-control" placeholder="Email *"
							name="email" id="inputEmail" value =${userSession.getEmail()} required
							data-validation-required-message="Please enter your email address.">
						<p class="help-block text-danger"></p>
					</div>


					<div class="form-group">
						<input type="tel" class="form-control" placeholder="Phone *"
							name="mobileNumber" id="inputPhone" value =${userSession.getPhone()} required
							data-validation-required-message="Please enter your phone number.">
						<p class="help-block text-danger"></p>
					</div>

					<p>By updating your profile you agree to our Terms of
						Service.</p>
					<br />
					<button class="btn btn-lg btn-success" type="submit">Update</button>

					<button class="btn btn-lg btn-danger" type="submit">Delete</button>

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
	<script src="js/contact_me.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="js/agency.js"></script>

</body>
</html>
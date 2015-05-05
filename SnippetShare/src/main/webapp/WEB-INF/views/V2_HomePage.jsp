<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Snippet Share</title>

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
				<li><a class="page-scroll" href="#services">Services</a></li>
				<li><a class="page-scroll" href="#team">Team</a></li>
				<li><a class="page-scroll" href="#signin">SignIn</a></li>
				<li><a class="page-scroll" href="#register">Register</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>

	<!-- Header -->
	<header>
	<div class="container">
		<div class="intro-text">
			<h1>Welcome To Our Snippet Share !</h1>
			<div class="intro-lead-in">The simplest way to create and share
				snippets</div>
			<a href="#services" class="page-scroll btn btn-xl">Register Now</a>
		</div>
	</div>
	</header>

	<!-- Services Section -->
	<section id="services">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading">Services</h2>
			</div>
		</div>
		<div class="row text-center">
			<div class="col-md-4">
				<h4 class="service-heading">Create Boards</h4>
				<p class="text-muted">You can create either Public or Private Board.</p>
			</div>
			<div class="col-md-4">
				<h4 class="service-heading">Create Snippets</h4>
				<p class="text-muted">You can create snippets.</p>
			</div>
			<div class="col-md-4">
				<h4 class="service-heading">Comment</h4>
				<p class="text-muted">Comment on the snippets shared by other users.</p>
			</div>
			<div class="col-md-4">
				<h4 class="service-heading">Comment</h4>
				<p class="text-muted">Comment on the snippets shared by other users.</p>
			</div>
			<div class="col-md-4">
				<h4 class="service-heading">Comment</h4>
				<p class="text-muted">Comment on the snippets shared by other users.</p>
			</div>
			
		</div>
	</div>
	</section>

	<!-- Team Section -->
	<section id="team" class="bg-light-gray">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading">Our Amazing Team</h2>
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-4">
				<div class="team-member">
					<img src="img/team/1.jpg" class="img-responsive img-circle" alt="">
					<h4>Avadhut</h4>
					<p class="text-muted">000000</p>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="team-member">
					<img src="img/team/2.jpg" class="img-responsive img-circle" alt="">
					<h4>Sushantha Sahoo</h4>
					<p class="text-muted">000000</p>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="team-member">
					<img src="img/team/3.jpg" class="img-responsive img-circle" alt="">
					<h4>Srisha</h4>
					<p class="text-muted">000000</p>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="team-member">
					<img src="img/team/1.jpg" class="img-responsive img-circle" alt="">
					<h4>Vaibhav</h4>
					<p class="text-muted">000000</p>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="team-member">
					<img src="img/team/1.jpg" class="img-responsive img-circle" alt="">
					<h4>Vinay</h4>
					<p class="text-muted">000000</p>
				</div>
			</div>
		</div>
	</div>
	</section>

	<section id="signin" style="color:white">
	<div class="signinform">
		<form class="form-signin" method="post"
			action="${pageContext.request.contextPath}/signin">
			<h2 class="form-signin-heading">Please sign in</h2>

			<div class="form-group">
				<input type="email" class="form-control" placeholder="Email *"
					name="email" id="inputEmail" required
					data-validation-required-message="Please enter your email.">
				<p class="help-block text-danger"></p>
			</div>

			<div class="form-group">
				<input type="password" class="form-control" placeholder="Password *"
					name="password" id="inputPassword" required
					data-validation-required-message="Please enter your password.">
				<p class="help-block text-danger"></p>
			</div>

			<input class="btn btn-lg btn-primary btn-block" type="submit"
				value="Sign In">
		</form>
	</div>
	</section>

	<section id="register" style="color:white">
	<div class="RegisterForm">
		<form class="form-signin" method="post"
			action="${pageContext.request.contextPath}/createAccount"
			onsubmit="return myFunction()">
			<h2 class="form-signin-heading">Create an account</h2>

			<div class="form-group">
				<input type="text" class="form-control" placeholder="First Name *"
					name="firstname" id="inputFirstName" required
					data-validation-required-message="Please enter your first name.">
				<p class="help-block text-danger"></p>
			</div>

			<div class="form-group">
				<input type="text" class="form-control" name="lastname"
					placeholder="Last Name *" id="inputLastName" required
					data-validation-required-message="Please enter your last name.">
				<p class="help-block text-danger"></p>
			</div>

			<div class="form-group">
				<input type="email" class="form-control" placeholder="Email *"
					name="email" id="inputEmail" required
					data-validation-required-message="Please enter your email address.">
				<p class="help-block text-danger"></p>
			</div>


			<div class="form-group">
				<input type="tel" class="form-control" placeholder="Phone *"
					name="mobileNumber" id="inputPhone" required
					data-validation-required-message="Please enter your phone number.">
				<p class="help-block text-danger"></p>
			</div>

			<div class="form-group">
				<input type="password" class="form-control" placeholder="Password *"
					name="password" id="inputPassword" required
					data-validation-required-message="Please enter password.">
				<p class="help-block text-danger"></p>
			</div>

			<div class="form-group">
				<input type="password" class="form-control"
					placeholder="Confirm Password *" name="password1"
					id="inputConfirmPassword" required
					data-validation-required-message="Please enter password.">
				<p class="help-block text-danger"></p>
			</div>

			<p>By creating an account you agree to our Terms of Service.</p>
			<input class="btn btn-lg btn-primary btn-block" TYPE="submit"
				value="Create My Account">

		</form>
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
	<script src="js/contact_me.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="js/agency.js"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>SnippetShare-Register</title>
	<link href="./css/bootstrap.min.css" rel="stylesheet">
	<link href="./css/Style.css" rel="stylesheet">
</head>
<body>
<div class="container">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation" ><a href="Home.html">Home</a></li>
            <li role="presentation"><a href="SignIn.html">Sign In</a></li>
            <li role="presentation" class="active"><a href="Register.html">Register</a></li>
          </ul>
        </nav>
        <h3 class="text-muted">Snippet Share</h3>
      </div>

      <div class="RegisterForm">
		<form class="form-signin">
			<h2 class="form-signin-heading">Create an account</h2>
			
			<label for="inputFirstName" class="sr-only">First Name</label><br>
			<input type="text" id="inputFirstName" class="form-control" placeholder="First name" required autofocus>
	
			<label for="inputLastName" class="sr-only">Last Name</label><br>
			<input type="text" id="inputLastName" class="form-control" placeholder="Last name" required>
			
			<label for="inputEmail" class="sr-only">Email address</label>
			<input type="email" id="inputEmail" class="form-control" placeholder="Email address" required>

			<label for="inputPhone" class="sr-only">Phone</label>
			<input type="tel" id="inputPhone" class="form-control" placeholder="Phone" required>
			
			<label for="inputEmail" class="sr-only">Password</label>
			<input type="password" id="inputEmail" class="form-control" placeholder="Password" required>
			
			<label for="inputConfirmPassword" class="sr-only">Password</label>
			<input type="password" id="inputConfirmPassword" class="form-control" placeholder="Confirm password" required> </br>
		
			<p>By creating an account you agree to our Terms of Service.</p>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Create My Account</button>
			
		</form>

      </div>


      <footer class="footer">
        <p>&copy; CMPE275 2015</p>
      </footer>

</body>
</html>
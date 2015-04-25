<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>SnippetShare-SignIn</title>
	<link href="./css/bootstrap.min.css" rel="stylesheet">
	<link href="./css/Style.css" rel="stylesheet">
</head>
<body>
<div class="container">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation" ><a href="Home.html">Home</a></li>
            <li role="presentation"class="active"><a href="SignIn.html">Sign In</a></li>
            <li role="presentation"><a href="Register.html">Register</a></li>
          </ul>
        </nav>
        <h3 class="text-muted">Snippet Share</h3>
      </div>

      <div class="signinform">
		<form class="form-signin">
			<h2 class="form-signin-heading">Please sign in</h2>
			<label for="inputEmail" class="sr-only">Email address</label><br>
			<input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
			<label for="inputPassword" class="sr-only">Password</label>
			<input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
				<div class="checkbox">
					<label>
						<input type="checkbox" value="remember-me"> Remember me
					</label>
				</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
		</form>

      </div>


      <footer class="footer">
        <p>&copy; CMPE275 2014</p>
      </footer>

    </div> <!-- /container -->
</body>
</html>
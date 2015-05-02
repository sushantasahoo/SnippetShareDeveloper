<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>SnippetShare-Register</title>
	<link href="./css/bootstrap.min.css" rel="stylesheet">
	<link href="./css/Style.css" rel="stylesheet">
	<script>
    function myFunction() {
        var pass1 = document.getElementById("inputPassword").value;
        var pass2 = document.getElementById("inputConfirmPassword").value;
        var ok = true;
        if (pass1 != pass2) {
            //alert("Passwords Do not match");
            document.getElementById("inputPassword").style.borderColor = "#E34234";
            document.getElementById("inputConfirmPassword").style.borderColor = "#E34234";
            alert("Passwords Mis-match!!!");
            ok=false;
        }

        return ok;
    }
</script>
</head>
<body>
<div class="container">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation" ><a href="${pageContext.request.contextPath}/">Home</a></li>
            <li role="presentation"><a href="${pageContext.request.contextPath}/SignIn">Sign In</a></li>
            <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/Register">Register</a></li>
          </ul>
        </nav>
        <h3 class="text-muted">Snippet Share</h3>
      </div>

      <div class="RegisterForm">
		<form class="form-signin"  method="post" action="${pageContext.request.contextPath}/createAccount" onsubmit="return myFunction()">
			<h2 class="form-signin-heading">Create an account</h2>
			
			<label for="inputFirstName" class="sr-only">First Name</label><br>
			<input type="text" name="firstname" id="inputFirstName" class="form-control" placeholder="First name" required autofocus>
	
			<label for="inputLastName" class="sr-only">Last Name</label><br>
			<input type="text" name="lastname" id="inputLastName" class="form-control" placeholder="Last name" required>
			
			<label for="inputEmail" class="sr-only">Email address</label>
			<input type="email" name="email" id="inputEmail" class="form-control" placeholder="Email address" required>

			<label for="inputPhone" class="sr-only">Phone</label>
			<input type="number" name="mobileNumber" id="inputPhone" class="form-control" placeholder="Phone" required>
			
			<label for="inputEmail" class="sr-only">Password</label>
			<input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required>
			
			<label for="inputConfirmPassword" class="sr-only">Password</label>
			<input type="password" name="password1" id="inputConfirmPassword" class="form-control" placeholder="Confirm password"> </br>
		
			<p>By creating an account you agree to our Terms of Service.</p>
			<input class="btn btn-lg btn-primary btn-block" TYPE=SUBMIT value="Create My Account">
			
		</form>
      </div>
     
      <footer class="footer">
        <p>&copy; CMPE275 2015</p>
      </footer>
</div>      

</body>
</html>
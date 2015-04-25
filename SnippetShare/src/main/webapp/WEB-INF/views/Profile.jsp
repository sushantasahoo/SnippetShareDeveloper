<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Profile</title>
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
		<form class="form-horizontal" role="form">
			<h2 class="form-signin-heading">Profile</h2>
			
			    <div class="form-group">
			      <label class="control-label col-sm-2" for="inputFirstName">First Name :</label>
			      <div class="col-sm-4">
			        <input type="text" class="form-control" id="inputFirstName" placeholder="First Name" required>
			      </div>
			    </div>
			    <div class="form-group">
			      <label class="control-label col-sm-2" for="inputLastName">Last Name :</label>
			      <div class="col-sm-4">
			        <input type="text" class="form-control" id="inputLastName" placeholder="Last Name" required>
			      </div>
			    </div>
			    <div class="form-group">
			      <label class="control-label col-sm-2" for="inputEmail">Email :</label>
			      <div class="col-sm-4">
			        <input type="email" class="form-control" id="inputEmail" placeholder="Email" required>
			      </div>
			    </div>
			    <div class="form-group">
			      <label class="control-label col-sm-2" for="inputAddress">Address :</label>
			      <div class="col-sm-4">
			        <input type="text" class="form-control" id="inputAddress" placeholder="Address" required>
			      </div>
			    </div>
			    <div class="form-group">
			      <label class="control-label col-sm-2" for="inputPhone">Phone :</label>
			      <div class="col-sm-4">
			        <input type="text" class="form-control" id="inputPhone" placeholder="Phone" required>
			      </div>
			    </div>
			    <div class="form-group">
			      <label class="control-label col-sm-2" for="inputPassword">Password:</label>
			      <div class="col-sm-4">          
			        <input type="password" class="form-control" id="inputPassword" placeholder="Enter password">
			      </div>
			    </div>
			    <div class="form-group">
			      <label class="control-label col-sm-2" for="inputConfirmPassword">Confirm Password:</label>
			      <div class="col-sm-4">          
			        <input type="password" class="form-control" id="inputConfirmPassword" placeholder="Enter password">
			      </div>
			    </div>
			   
			    <div class="form-group">        
			      <div class="col-sm-offset-2 col-sm-10">
			        <button type="submit" class="btn btn-primary">Update</button>
			      </div>
			    </div>
			 </form>

      <footer class="footer">
        <p>&copy; CMPE275 2015</p>
      </footer>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Dashboard</title>
	<link href="./css/bootstrap.min.css" rel="stylesheet">
	<link href="./css/Style.css" rel="stylesheet">
</head>
<body>
<div class="container">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
			<li role="presentation" ><a href="#">Private Board</a></li>
			<li role="presentation" ><a href="Home.html" >Log Out</a></li>
			
          </ul>
        </nav>
        <h3 class="text-muted">Snippet Share</h3>
      </div>

      <div class="Dashboard">
		<form class="container">
			<h2 class="form-signin-heading">Create a New Snippet</h2>
			
			<label for="inputName" class="sr-only">Title</label><br>
			<input height="50px" type="text" id="inputName" class="form-control" placeholder="Title" required autofocus>
			
			<label for="inputEmail" class="sr-only">Category</label>
			<input type="email" id="inputEmail" class="form-control" placeholder="Category" required>
			
			<form:select path="country">
				<form:option value="NONE" label="--- Select ---" />
				<form:options items="${countryList}" />
		     </form:select>
			
			
			<label class="radio-inline"><input type="radio" name="Access"  value="Public" checked>Public </label>
			<label class="radio-inline"><input type="radio" name="Access"  value="Private">Private</label> <br>
			
			
			<label for="inputContent" class="sr-only">Add Content</label>
			<textarea  rows="10" id="inputContent" class="form-control" placeholder="Add Content Here" required ></textarea>
			
			<label for="inputUrl" class="sr-only">URLs</label>
			<input type="url" id="inputUrl" class="form-control" placeholder="URLs" required>
		
			<p>By creating a snippet you agree to our Terms of Service.</p>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Create Snippet</button>			
		</form>
      </div>	
      <footer class="footer">
        <p>&copy; CMPE275 2015</p>
      </footer>

</body>
</html>
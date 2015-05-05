<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Create Board</title>
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

      <form class="Dashboard" method="post" action=${pageContext.request.contextPath}/createBoard>
			<h2 class="form-signin-heading">Create a New Board</h2>
			
			<label for="inputName" class="sr-only">Title</label><br>
			<input name="title" height="50px" type="text" id="inputName" class="form-control" placeholder="Title" required autofocus>
			
			<label for="inputEmail" class="sr-only">Category</label>
			<input name="category" type="text" id="inputEmail" class="form-control" placeholder="Category" required>
			
			<form:select path="Category">
				<form:option value="NONE" label="--- Select ---" />
				<form:options items="${categoryList}" />
		     </form:select>
			
			<label class="radio-inline"><input type="radio" name="accessType"  value="U" checked>Public </label>
			<label class="radio-inline"><input type="radio" name="accessType"  value="R">Private</label> <br>
			
			<p>By creating a board you agree to our Terms of Service.</p>
			<button class="btn btn-mg btn-primary" type="submit">Create Board</button>			
		</form>

      <footer class="footer">
        <p>&copy; CMPE275 2015</p>
      </footer>
</div>
</body>
</html>
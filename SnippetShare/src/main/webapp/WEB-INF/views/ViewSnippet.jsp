<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>View Snippet</title>
	<link href="./css/bootstrap.min.css" rel="stylesheet">
	<link href="./css/Style.css" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
 <div class="container">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation" ><a href="#">TBD</a></li>
			<li role="presentation" ><a href="#">TBD</a></li>
			<li role="presentation" ><a href="Home.html" >Log Out</a></li>	
          </ul>
        </nav>
        <h3 class="text-muted">Snippet Share</h3>
      </div>

      <form class="Dashboard">
			<h2 class="form-signin-heading">Snippet Title</h2>
				
			<label for="inputContent" class="sr-only">Add Content</label>
			<textarea rows="8" id="inputContent" class="form-control" readonly></textarea>
			
			<br>
			<button class="btn btn-md btn-default" type="submit">Back</button>
			<button class="btn btn-md btn-warning" type="submit">Delete --- If Owner</button>		
			<button class="btn btn-md btn-primary" type="submit" data-toggle="modal" data-target="#myModal">Add Comment</button>	
			</br>
			<p> TO DO : /// List of Comments</p>
			<br>
			
			<!-- Modal -->
			<div id="myModal" class="modal fade" role="dialog">
			  <div class="modal-dialog">
			    <!-- Modal content-->
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal">&times;</button>
			        <h4 class="modal-title">Add Comment</h4>
			      </div>
			      <div class="modal-body">
			        <p>Please add comment below</p>
			        <textarea  rows="6" id="inputComment" class="form-control" placeholder="Comments..." required></textarea><br>    
			      </div>
			      <div class="modal-footer">     
			        <button class="btn btn-md btn-default" data-dismiss="modal" type="submit">Back</button>
			        <button class="btn btn-md btn-primary" type="submit">Add Comment</button>
			      </div>
			    </div>
			
			  </div>
			</div>		
		</form>
				
      <footer class="footer">
        <p>&copy; CMPE275 2015</p>
      </footer>
 </div> 
 
</body>
</html>
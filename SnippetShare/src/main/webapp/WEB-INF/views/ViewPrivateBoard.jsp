<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Private Board</title>
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
      
       <h2>// TO DO : ADD PRIVATE SNIPPETS </h2>
      
      <button class="btn btn-md btn-primary" type="submit" data-toggle="modal" data-target="#myModal">Request Access</button>
			<!-- Modal -->
			<div id="myModal" class="modal fade" role="dialog">
			  <div class="modal-dialog">
			    <!-- Modal content-->
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal">&times;</button>
			        <h4 class="modal-title">Request Access</h4>
			      </div>
			      <div class="modal-body">
			        <p>Please add Request Message Below</p>
			        <textarea  rows="6" id="inputRequest" class="form-control" placeholder="Please give me access to the board..." required></textarea><br>    
			      </div>
			      <div class="modal-footer">     
			        <button class="btn btn-md btn-default" data-dismiss="modal" type="submit">Back</button>
			        <button class="btn btn-md btn-primary" type="submit">Request Access</button>
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
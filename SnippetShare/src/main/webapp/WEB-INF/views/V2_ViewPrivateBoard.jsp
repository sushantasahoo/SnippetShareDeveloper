<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>












<div class="portfolio-modal modal fade" id="requestModal1"
		tabindex="-1" role="dialog" aria-hidden="true">
		<form>
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
								<h2>Add Comment</h2>
								<p class="item-intro text-muted">Please read all the Terms
									and Condition befor adding Comment</p>

								<div class="form-group">
									<textarea rows="10" id="inputContent" class="form-control"
										placeholder="Add Comment Here" required></textarea>
									<p class="help-block text-danger"></p>
								</div>

								<button type="button" class="btn btn-lg btn-default"
									data-dismiss="modal">Back</button>

								<button type="button" class="btn btn-lg btn-success">
									Add</button>

							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>


</body>
</html>
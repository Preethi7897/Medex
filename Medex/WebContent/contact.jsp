<%@ include file="header.jsp"%>
<%@ include file="home_nav.jsp"%>
<br>
<center><h2 style="color:dodgerblue;">Contact Us</h2></center>
<div class="container col-xs-6 col-xs-offset-3">
<h3 style="color:dodgerblue;">Please fill your suggestions and feedback in  below form</h3>
<form action="" method="post">
<div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name"  name="name" >
</div>
<div class="form-group">
      <label for="email">Email id:</label>
      <input type="email" class="form-control" id="email"  name="email" >
</div>
<div class="form-group">
      <label for="subj">Subject Line:</label>
      <input type="text" class="form-control" id="subj"  name="subj" >
</div>
<div class="form-group">
			<label for="msg">Message:</label>
			<textarea rows="4" class="form-control" id="msg"
				 name="msg"></textarea>
</div>
<center><input type="submit" class="btn btn-danger" value="Submit"></center>
</form>
</div>
<%@ include file="footer.jsp"%>
<%@ include file="header.jsp" %>
<%@ include file="home_nav.jsp" %>

<br><br><br><br>
<div class="container row">
<div class="col-xs-7 col-xs-offset-1">

<a href=""><img src="images/img.jpg" width=100% height=100% ></a>
</div>
<div class="col-xs-4">
<br><br><br>
  <form method="post" action="login_serv" onsubmit="validate();">
    <div class="form-group">
      <label for="login_id">Your Login Id (Required):</label>
      <input type="text" class="form-control" id="pid" placeholder="Enter login Id" name="pid" 
      value=<%= ( (session.getAttribute("id")!=null) ? session.getAttribute("id") : "" ) %>>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" >
    </div>
<br>
    
    <input type="submit" class="btn btn-danger  " value="Sign In" onclick="validate();">
<input type="submit" class="btn btn-danger " value="Reset" >
  <a href="register_pat.jsp" class="btn btn-danger" id="nbutton4" id="register">Register for Free</a> 
<!-- <a href="register_pat.jsp" class="btn btn-danger " type="button" id="register">Register for Free</a>-->

  </form>
</div>
</div>
<script type="text/javascript">
            function validate()
            {
                var a = document.getElementById("pid");
                var b = document.getElementById("pwd");
				
				if(a.value.length<=0 && b.value.length<=0)
				window.alert("Error:Login Id and Password Cannot be Blank");
				else if(b.value.length<=0) 
				window.alert("Error:Password Cannot be Blank");
				else if(a.value.length<=0) 
				window.alert("Error:Login Id Cannot be Blank");
				
		}
            
		
</script>

<%@ include file="footer.jsp"%>

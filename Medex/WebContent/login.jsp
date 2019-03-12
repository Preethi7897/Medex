<%@ include file="header.jsp" %>
<%@ include file="home_nav.jsp" %>

<br><br><br><br><br><br>
<div class="container col-xs-3 col-xs-offset-5" >
  <form method="post" action="login_serv" onsubmit="validate();">
    <div class="form-group">
      <label for="login_id">Your Login Id (Required):</label>
      <input type="text" class="form-control" id="pid" placeholder="Enter login Id" name="pid" >
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" >
    </div>

    
    <input type="submit" class="btn btn-danger" value="Sign In" onclick="validate();">
<input type="submit" class="btn btn-danger" value="Reset" >
<!--<input type="submit" class="btn btn-danger" value="Register for Free" onclick="register();">-->
<a href="register_pat.jsp" class="btn btn-danger" type="button">Register for Free</a>

  </form>
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

</body>
</html>

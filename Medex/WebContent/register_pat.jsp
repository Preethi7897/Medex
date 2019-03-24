<%@ include file="header.jsp"%>
<%@ include file="home_nav.jsp"%>

<div class="container col-xs-3 col-xs-offset-5">
	<form action="pat_reg" method="post" >
		<div class="form-group">
			<label for="First name">First name :</label> <input type="text"
				class="form-control" id="fname" placeholder="Enter First name"
				name="fname" required>
		</div>
		<div class="form-group">
			<label for="Last name">Last name :</label> <input type="text"
				class="form-control" id="lname" placeholder="Enter Last name"
				name="lname" required>
		</div>

		<div class="form-group">
			<label for="pwd">Password:</label> <input type="password"
				class="form-control" id="pwd" placeholder="Enter password"
				name="pwd" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
				title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
				required>
		</div>

		<div class="form-group">
			<label for="Age">Age:</label> <input type="text" class="form-control"
				id="age" placeholder="Enter Age" name="age" required>
		</div>
		<div class="form-group">
			<label for="Gender">Gender:</label><br> <input type="radio"
				name="gender" id="gender" value="male" title="select the gender" required>Male<br>
			<input type="radio" name="gender" id="gender" value="female" required>Female<br>
		</div>

		<div class="form-group">
			<label for="Contact Number">Contact Number:</label> <input
				type="text" class="form-control" id="phn_number"
				placeholder="Enter Contact Number" name="phn_number" required>
		</div>
		<div class="form-group">
			<label for="Email">Email:</label> <input type="email"
				class="form-control" id="email" placeholder="Enter Email"
				name="email" required>
		</div>
		<div class="form-group">
			<label for="address">Address:</label>
			<textarea rows="5" class="form-control" id="address"
				placeholder="Enter Address" name="address" required></textarea>
		</div>
		<div class="form-group">
			<label for="Zipcode">Zipcode:</label> <input type="text"
				class="form-control" id="zipcode" placeholder="Enter Zipcode"
				name="zipcode" required>
		</div>
		<div class="form-group">
			<label for="City">City:</label> <input type="text"
				class="form-control" id="city" placeholder="Enter City" name="city" required>
		</div>
		<input type="submit" class="btn btn-danger col-xs-6 " value="Register" >
		<input type="reset" class="btn btn-danger col-xs-5 col-xs-offset-1" value="Reset">

	</form>
</div>

<div id="message">

	<p id="letter" class="invalid">
		A <b>Lowercase</b> letter
	</p>
	<p id="capital" class="invalid">
		A <b>Uppercase</b> letter
	</p>
	<p id="number" class="invalid">
		A <b>Number</b>
	</p>
	<p id="length" class="invalid">
		Minimum <b>8 characters</b>
	</p>
</div>

<script type="text/javascript">
var myInput = document.getElementById("pwd");
var letter = document.getElementById("letter");
var capital = document.getElementById("capital");
var number = document.getElementById("number");
var length = document.getElementById("length");


myInput.onfocus = function() {
  document.getElementById("message").style.display = "block";
}


myInput.onblur = function() {
  document.getElementById("message").style.display = "none";
}


myInput.onkeyup = function() {
 
  var lowerCaseLetters = /[a-z]/g;
  if(myInput.value.match(lowerCaseLetters)) {  
    letter.classList.remove("invalid");
    letter.classList.add("valid");
  } else {
    letter.classList.remove("valid");
    letter.classList.add("invalid");
  }
  
  
  var upperCaseLetters = /[A-Z]/g;
  if(myInput.value.match(upperCaseLetters)) {  
    capital.classList.remove("invalid");
    capital.classList.add("valid");
  } else {
    capital.classList.remove("valid");
    capital.classList.add("invalid");
  }

  
  var numbers = /[0-9]/g;
  if(myInput.value.match(numbers)) {  
    number.classList.remove("invalid");
    number.classList.add("valid");
  } else {
    number.classList.remove("valid");
    number.classList.add("invalid");
  }
  
 
  if(myInput.value.length >= 8) {
    length.classList.remove("invalid");
    length.classList.add("valid");
  } else {
    length.classList.remove("valid");
    length.classList.add("invalid");
  }
}


</script>

<%@ include file="footer.jsp"%>

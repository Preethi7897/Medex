<div class="lay1">
		<hr>
		<div class="container col-md-3 col-md-offset-4" style=" color: dodgerblue;">
			<form>
				<h3>Book a Doctor's Appointment</h3>
				<div class="form-group">
					Your Login id(Auto Generated)<input type="text"
						class="form-control" name="pid" id="pid" value=<%=session.getAttribute("id") %> disabled="disabled"/>

				</div>
				<div class="form-group">
					The specialist you are loking for(Required) 
					<select name="specialist" id="specialist" class="form-control">
					<option value=""></option>
					<option value="cardiologist">Cardiologist</option>
					<option value="dentist">Dentist</option>
					</select>

				</div>
				<p id="spec_desc" style="background-color:#eee;"></p>
				<div class="form-group">
					Your Date of visit(Required) <input type="date" id="date"
						class="form-control" name="date" />
				</div>
				<div class="form-group">
					Your Prefered Time Slot(Required) <input list="time" name="time"
						class="form-control">
					<datalist id="time">
						<option value="9.00-10.00">
						<option value="10.00-11.00">
						<option value="11.00-12.00">
						<option value="12.00-1.00">
						<option value="1.00-2.00">
						<option value="2.00-3.00">
						<option value="3.00-4.00">
						<option value="4.00-5.00">
						<option value="5.00-6.00">
						<option value="6.00-7.00">
						<option value="7.00-8.00">
						<option value="8.00-9.00">
					</datalist>
				</div>
				<div class="form-group">
					Select Available Doctor(Required) <input list="doctor"
						name="doctor" class="form-control">
					<datalist id="doctor">

					</datalist>
				</div>

				<input type="submit" class="btn btn-danger" value="Book"> <input
					type="submit" class="btn btn-danger" value="Reset">
			</form>
		</div>
	</div>


<div class="cancel">
		<hr>
		<div class="container col-xs-8 col-xs-offset-2">
			<h3 style="color: dodgerblue;">You Can Cancel The Appointment
				Ateast One day Before The Scheduled date</h3>
		</div>

		<div class="container col-xs-4 col-xs-offset-2">
			<form>

				<div class="form-group">

					Search the Appointment to Cancel(Required) 
					<select name="cancel_name" id="cancelId" class="form-control">
			<%@ page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.reflect.TypeToken"%>
<%@ page import="java.lang.reflect.Type"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="org.medex.beans.Display"%>
			
			<%
					Type listType = new TypeToken<List<Display>>() {}.getType();
                    Gson gson = new Gson();
					 List<Display> o=new ArrayList<Display>();
						
					  o = gson.fromJson((String)request.getAttribute("list"), listType); 
					  for(Display d:o) {
						  %>
						  <option value=<%=d.getAppId() %>> <% out.println(d.getDocName()+" "+d.getDocCategory()+" "+d.getAppDate()+"|"+d.getTimeSlot());%></option>
						  <%} %>
			</select>
			<br><br>
<div class="output">
<%
for(Display d:o) { %>

<div id=<%=d.getAppId()%> class="details" style="display:none;"><% out.println(d.getDocName()+"<br>"+d.getDocCategory()+"<br>"+d.getAppDate()+"|"+d.getTimeSlot()+"<br>"+d.getAppBookDate());%></div>

<%} %>
</div>
				</div>


			</form>
			
			
			<p id="cancelDisplay">
			
			</p>
		</div>
	</div>
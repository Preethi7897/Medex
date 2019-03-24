<script type="text/javascript">
	$(window).load(function() {
		$("div.lay").show();
		$("div.lay1").hide();
		$("div.lay2").hide();
		$("div.cancel").hide();

	});
	$(document)
			.ready(
					function() {
						$("#nbutton").click(function() {
							$("div.lay").show();
							$("div.lay1").hide();
							$("div.lay2").hide();
							$("div.cancel").hide();

						});
						$("#nbutton1").click(function() {
							$("div.lay").hide();
							$("div.lay1").show();
							$("div.lay2").hide();
							$("div.cancel").hide();

						});
						$("#nbutton2").click(function() {
							$("div.lay").hide();
							$("div.lay1").hide();
							$("div.lay2").show();
							$("div.cancel").hide();

						});

						$("#nbutton3").click(function() {
							$("div.lay").hide();
							$("div.lay1").hide();
							$("div.lay2").hide();
							$("div.cancel").show();

						});
					
						$("#specialist")
								.click(
										function() {
											var spec_cat = $(
													'#specialist :selected')
													.text();
											if (spec_cat == "Dentist") {
												$('#spec_desc')
														.text(
																"Dentists are medical healthcare professionals who work with patients to treat dental and oral disease and injuries and to prevent dental health problems.");
											} else if (spec_cat == "Cardiologist") {
												$('#spec_desc')
														.text(
																"A cardiologist is a doctor with special training and skill in finding, treating and preventing diseases of the heart and blood vessels.")
											} else {
												$('#spec_desc').text("")
											}

										});
				
						
						$("#appdate").change(function() {

				               $.ajax({
				                     
				                     type:'get',
				                     url : 'getDetails',
				                     data:{a_app_date:$('#appdate').val()
				                            },
				                            dataType: "text",
				                            success : function(responseText) {
				            					let data1=JSON.parse(responseText);
				            					var table=document.createElement("table");
				            					for(i=0;i<data1.length;i++)
				            					{
				            						let tr=document.createElement("tr");
				            						let td1=document.createElement("td");
				            						let td2=document.createElement("td");
				            						let td3=document.createElement("td");
				            						let td4=document.createElement("td");
				            						let td5=document.createElement("td");
				            				
				            						let text1=document.createTextNode(data1[i].docName);
				            						let text2=document.createTextNode(data1[i].docCategory);
				            						let text3=document.createTextNode(data1[i].appBookDate);
				            						let text4=document.createTextNode(data1[i].appDate);
				            						let text5=document.createTextNode(data1[i].timeSlot);
				            			
				            						
				            						
				            			
				            					
				            						td1.appendChild(text1);
				            						td2.appendChild(text2);
				            						td3.appendChild(text3); 
				            						td4.appendChild(text4);
				            						td5.appendChild(text5);
				            				
				            						
				            						tr.appendChild(td1);
				            						tr.appendChild(td2);
				            						tr.appendChild(td3); 
				            						tr.appendChild(td4);
				            						tr.appendChild(td5);
				            			
				            						
				            						table.appendChild(tr);
				            						console.log(table);
				            					}
				            					$("#pat_view").append(table);
				            				
				            				
				            				}
				                       });
				                });
						
						$('#cancelId').click(function(){
						    $('.details').hide();
						    $('#' + $(this).val()).show();
						  });
					});
</script>
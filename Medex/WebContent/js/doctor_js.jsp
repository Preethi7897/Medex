<script type="text/javascript">
        $(window).load(function() {
            $("div.lay").show();
            $("div.lay1").hide();
            $("div.lay2").hide();
            $("div.lay3").hide();
            $("div.cancel").hide();
        });
        $(document).ready(function() {
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
	            						let td6=document.createElement("td");
	            						let td7=document.createElement("td");
	            						let td8=document.createElement("td");
	            				
	            						let text1=document.createTextNode(data1[i].timeSlot);
	            						let text2=document.createTextNode(data1[i].patName);
	            						let text3=document.createTextNode(data1[i].patContactNo);
	            						let text4=document.createTextNode(data1[i].patEmail);
	            						let text5=document.createTextNode(data1[i].patGender);
	            						let text6=document.createTextNode(data1[i].patAge);
	            						let text7=document.createTextNode(data1[i].patAddress);
	            						let text8=document.createTextNode(data1[i].appBookDate);
	            			
	            						
	            						
	            			
	            					
	            						td1.appendChild(text1);
	            						td2.appendChild(text2);
	            						td3.appendChild(text3); 
	            						td4.appendChild(text4);
	            						td5.appendChild(text5);
	            						td6.appendChild(text6);
	            						td7.appendChild(text7);
	            						td8.appendChild(text8);
	            				
	            						
	            						tr.appendChild(td1);
	            						tr.appendChild(td2);
	            						tr.appendChild(td3); 
	            						tr.appendChild(td4);
	            						tr.appendChild(td5);
	            						tr.appendChild(td6);
	            						tr.appendChild(td7);
	            						tr.appendChild(td8);
	            			
	            						
	            						table.appendChild(tr);
	            					}
	            					$("#doc_view").append(table);
	            				
	            				
	            				}
	                       });
            
        });
        });
</script>
<script type="text/javascript">
        $(window).load(function() {
            $("div.lay").show();
            $("div.lay1").hide();
            $("div.lay2").hide();
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
            
            $("#specialist").click(function(){
            	var spec_cat=$('#specialist :selected').text();
            	if(spec_cat=="Dentist")
            		{
            		$('#spec_desc').text("dentist text");}
            	else if(spec_cat=="Cardiologist")
            		{
            		$('#spec_desc').text("cardiologist text")}
            	else
            		{
            		$('#spec_desc').text("")
            		}
            	
            	
            	$.ajax({
            		type:'get',
            		url:'get_book_app_details',
            		success:function(responseText)
            		{
            			let data=JSON.parse(responseText);
            			
            		}
            	});
            });
            
            
   
            
        });
        
        
        
        
        
       

</script>
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
            
        });
</script>
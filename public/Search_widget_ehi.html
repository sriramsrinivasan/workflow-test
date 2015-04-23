
<!doctype html>
<html>
<head>
  <title>Demo &raquo; Dynamic grid width &raquo; gridster.js</title>
  <link rel="stylesheet" type="text/css" href="jquery.gridster.css">
  <link rel="stylesheet" type="text/css" href="demo.css">
</head>

<body>
<div id="div1"><h2>Enterprise Locations search </h2></div>
<input id="searchBox" type="text"/>
<button id="button">Search</button>
<div class="gridster">
    <ul>
      <li id="solrDynamicTable" data-row="1" data-col="1" data-sizex="8" data-sizey="15"></li>
      <li id="googleDynamicTable" data-row="1" data-col="3" data-sizex="8" data-sizey="15"></li>

    </ul>
  </div>

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.js"></script>
    <script src="jquery.gridster.js" type="text/javascript" charset="utf-8"></script>

    <script type="text/javascript">
      var gridster;

      $(function(){

        var log = document.getElementById('log');

        gridster = $(".gridster ul").gridster({
          widget_base_dimensions: [100, 55],
          widget_margins: [5, 5],
          autogrow_cols: true,
          resize: {
            enabled: true
          }
        }).data('gridster');


      });



	  $(document).ready(function(){


	      $("button").click(function(){
	       $.ajax(
	       				{ url: 'http://localhost:8080/locationSearch',
	       					data: {

	       						'queryText': $('#searchBox').val() + '~' // Wildcard "starts with" search
	       					},
	       				 success: function(locationResults) {
	       				        $('#googleDynamicTable').html("");$('#solrDynamicTable').html("");
	       				        if(locationResults.length>0){

									$('#googleDynamicTable').html("<p>Results from google places api</p>")
									$('#solrDynamicTable').html("<p>Results from Solr index</p>")
	                                $('#solrDynamicTable').append('<table></table>');
	                                $('#googleDynamicTable').append('<table></table>');



	  						 	var googleTable = $('#googleDynamicTable').children();
	  						 	var solrTable = $('#solrDynamicTable').children();

	  						 	for(i=0;i<locationResults.length;i++){
	  						 	if(locationResults[i].name!=null)
	  						 	googleTable.append("<tr><td>"+locationResults[i].formattedAddress+"</td><td>"+locationResults[i].latitude+"</td><td>"+locationResults[i].longitude+"</td></tr>");
	  						 	else

	  						 	solrTable.append("<tr><td>"+locationResults[i].formattedAddress+"</td><td>"+locationResults[i].latitude+"</td><td>"+locationResults[i].longitude+"</td></tr>");
	  						 console.log("write something");
	  							}
	  							}
	  							else{
	  							    $('#dynamicTable').html("<p>No locations found!!</p>");
	  							}
	  						   //$("#dynamicTable").html("<table><tr><td>"+locationResults.length+"</td></tr></table>");



	       				 },
	       				 error:function(locationResults){
	       				      //  $('#dynamicTable').append('<table></table>');
	  											 //	var table = $('#dynamicTable').children();
	  											// 	for(i=0;i<locationResults.length;i++){
	  						 	//table.append("<tr><td>"+locationResults[i].formattedAddress+"</td></tr>");
	  						 //	}

	  						 	 $("#dynamicTable").html("<table><tr><td>"+JSON.stringify(locationResults)+"</td></tr></table>");
	  						 	  console.log(" error called")

	       				 },
	       				 dataType: 'json',
	       				// jsonp: 'json.wrf',
	       				 crossDomain: 'true',
	       				// jsonpCallback: 'notneeded'
	  				 });
	      });

	      function notneeded(){

	        console.log("not needed called")
	      }

	  });


    </script>
</body>
</html>

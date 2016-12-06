<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section class="slider">
	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel"> 
	 	 <!-- Indicators -->
	  	<ol class="carousel-indicators">
	    	<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
	    	<li data-target="#carousel-example-generic" data-slide-to="1"></li>
	    	<li data-target="#carousel-example-generic" data-slide-to="2"></li>
	  	</ol>

	 	 <!-- Wrapper for slides -->
	 	<div class="carousel-inner" role="listbox">
			<div class="item active">
				<center>
					<a href="#">
						<img src="./images/slider-1839b.jpg" alt="Slide 1">	      		
					</a>
				</center>
			</div>
	    	<div class="item">
	      		<center>
					<a href="#">
						<img src="./images/slider-2a839b.jpg" alt="Slide 2">	      		
					</a>
				</center>   		
	    	</div>	
	    	<div class="item">
	      		<center>
					<a href="#">
						<img src="./images/slider-3a839b.jpg" alt="Slide 3">	      		
					</a>
				</center>      		
	    	</div>		    
	 	</div>

	  	<!-- Controls -->
	  	<a class="left-slide" href="#carousel-example-generic" role="button" data-slide="prev">
	    	<span class="fa fa-angle-left" aria-hidden="true"></span>
	    	<span class="sr-only">Previous</span>
	  	</a>
	  	<a class="right-slide" href="#carousel-example-generic" role="button" data-slide="next">
	    	<span class="fa fa-angle-right" aria-hidden="true"></span>
	   		<span class="sr-only">Next</span>
	  	</a>
	</div>
</section>

    </body>
</html>

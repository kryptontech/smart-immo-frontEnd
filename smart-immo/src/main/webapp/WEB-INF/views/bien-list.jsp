<!-- Html-------- -->
<%@ include file="head.jsp" %>>
 
  <body id="top" class="thebg" >
     
    <!-- --------- Header -->
	<%@ include file="header.jsp" %>
	
	<div class="container breadcrub">
	    <div>
			<a class="homebtn left" href="#"></a>
			<div class="left">
				<ul class="bcrumbs">
					<li>/</li>
					<li><a href="<c:url value='/'/>">Accueil</a></li>
					<li>/</li>
					<li><a href="<c:url value='/Resultat'/>">Resultats</a></li>								
				</ul>				
			</div>
			<a class="backbtn right" href="#"></a>
		</div>
		<div class="clearfix"></div>
		<div class="brlines"></div>
	</div>	

	<!-- CONTENT -->
	<div class="container">
		<div class="container pagecontainer space offset-0">	

			<!-- LIST CONTENT-->
			<div class="rightcontent col-md-12 offset-0">
				<br/><br/>
				<div class="clearfix"></div>
				

				<div class="itemscontainer offset-1">

					<div class="clearfix"></div>
					 <div class="offset-2"><hr class="featurette-divider3"></div>
					
					<div class="offset-2">
						<div class="col-md-4 offset-0">
							<div class="listitem2">
								<a href="resources/images/index.jpg" data-footer="A custom footer text" data-title="A random title" data-gallery="multiimages" data-toggle="lightbox"><img src="resources/images/index.jpg" alt=""/></a>
								<div class="liover"></div>
							</div>
						</div>
						<div class="col-md-8 offset-0">
							<div class="itemlabel3">
								<div class="labelright">
									<img src="images/filter-rating-5.png" width="60" alt=""/><br/><br/><br/>
									<img src="images/user-rating-5.png" width="60" alt=""/><br/>
									<span class="size11 grey"></span><br/><br/>
									<span class="green size18"><b>Prix</b></span><br/>
									<span class="size11 grey">par mois</span><br/><br/><br/>
									<form action="details.html">
									 <a href="<c:url value='/detailsBien-{idBien}'/>" class="btn btn-custom" type="submit">Decouvrir</a>	
									</form>	
									<br/>
									<form action="details.html">
									 <button class="btn btn-custom" type="submit">Contacter</button>	
									</form>	
								</div>
								<div class="labelleft2">			
									
									<b>Sous categorie bien</b><br/><br/>
									<b>Quartier bien</b><br/><br/>
									<b>Commune</b><br/><br/>
									<b>Ville</b><br/><br/>
									<p class="grey">
									DESCRIPTION Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec semper lectus. Suspendisse placerat enim mauris, eget lobortis nisi egestas et.
									Donec elementum metus et mi aliquam eleifend. Suspendisse volutpat egestas rhoncus</p><br/>
									
								</div>
							</div>
						</div>
					</div>

					<div class="clearfix"></div>
					<div class="offset-2"><hr class="featurette-divider3"></div>
					
					<div class="offset-2">
						<div class="col-md-4 offset-0">
							<div class="listitem2">
								<a href="images/items/item1.jpg" data-footer="A custom footer text" data-title="A random title" data-gallery="multiimages" data-toggle="lightbox"><img src="images/items/item1.jpg" alt=""/></a>
								<div class="liover"></div>
								<a class="fav-icon" href="#"></a>
								<a class="book-icon" href="details.html"></a>
							</div>
						</div>
						<div class="col-md-8 offset-0">
							<div class="itemlabel3">
								<div class="labelright">
									<img src="images/filter-rating-5.png" width="60" alt=""/><br/><br/><br/>
									<img src="images/user-rating-5.png" width="60" alt=""/><br/>
									<span class="size11 grey">18 Reviews</span><br/><br/>
									<span class="green size18"><b>$45.00</b></span><br/>
									<span class="size11 grey">avg/night</span><br/><br/><br/>
									<form action="details.html">
									 <button class="bookbtn mt1" type="submit">Book</button>	
									</form>			
								</div>
								<div class="labelleft2">			
									<b>Mabely Grand Hotel</b><br/><br/><br/>
									<p class="grey">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec semper lectus. Suspendisse placerat enim mauris, eget lobortis nisi egestas et.
									Donec elementum metus et mi aliquam eleifend. Suspendisse volutpat egestas rhoncus.</p><br/>
									<ul class="hotelpreferences">
										<li class="icohp-fridge"></li>
										<li class="icohp-microwave"></li>
										<li class="icohp-washing"></li>
										<li class="icohp-roomservice"></li>
										<li class="icohp-safe"></li>
										<li class="icohp-playground"></li>
										<li class="icohp-conferenceroom"></li>
									</ul>
									
								</div>
							</div>
						</div>
					</div>

					<div class="clearfix"></div>
					<div class="offset-2"><hr class="featurette-divider3"></div>
					
					<div class="offset-2">
						<div class="col-md-4 offset-0">
							<div class="listitem2">
								<a href="images/items/item5.jpg" data-footer="A custom footer text" data-title="A random title" data-gallery="multiimages" data-toggle="lightbox"><img src="images/items/item5.jpg" alt=""/></a>
								<div class="liover"></div>
								<a class="fav-icon" href="#"></a>
								<a class="book-icon" href="details.html"></a>
							</div>
						</div>
						<div class="col-md-8 offset-0">
							<div class="itemlabel3">
								<div class="labelright">
									<img src="images/filter-rating-5.png" width="60" alt=""/><br/><br/><br/>
									<img src="images/user-rating-5.png" width="60" alt=""/><br/>
									<span class="size11 grey">18 Reviews</span><br/><br/>
									<span class="green size18"><b>$49.00</b></span><br/>
									<span class="size11 grey">avg/night</span><br/><br/><br/>
									<form action="details.html">
									 <button class="bookbtn mt1" type="submit">Book</button>	
									</form>			
								</div>
								<div class="labelleft2">			
									<b>Mabely Grand Hotel</b><br/><br/><br/>
									<p class="grey">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec semper lectus. Suspendisse placerat enim mauris, eget lobortis nisi egestas et.
									Donec elementum metus et mi aliquam eleifend. Suspendisse volutpat egestas rhoncus.</p><br/>
									<ul class="hotelpreferences">
										<li class="icohp-internet"></li>
										<li class="icohp-air"></li>
										<li class="icohp-pool"></li>
										<li class="icohp-childcare"></li>
										<li class="icohp-fitness"></li>
										<li class="icohp-breakfast"></li>
										<li class="icohp-parking"></li>
										<li class="icohp-pets"></li>
										<li class="icohp-spa"></li>
									</ul>
									
								</div>
							</div>
						</div>
					</div>

					<div class="clearfix"></div>
					<div class="offset-2"><hr class="featurette-divider3"></div>
					
					<div class="offset-2">
						<div class="col-md-4 offset-0">
							<div class="listitem2">
								<a href="images/items/item2.jpg" data-footer="A custom footer text" data-title="A random title" data-gallery="multiimages" data-toggle="lightbox"><img src="images/items/item2.jpg" alt=""/></a>
								<div class="liover"></div>
								<a class="fav-icon" href="#"></a>
								<a class="book-icon" href="details.html"></a>
							</div>
						</div>
						<div class="col-md-8 offset-0">
							<div class="itemlabel3">
								<div class="labelright">
									<img src="images/filter-rating-5.png" width="60" alt=""/><br/><br/><br/>
									<img src="images/user-rating-5.png" width="60" alt=""/><br/>
									<span class="size11 grey">18 Reviews</span><br/><br/>
									<span class="green size18"><b>$49.00</b></span><br/>
									<span class="size11 grey">avg/night</span><br/><br/><br/>
									<form action="details.html">
									 <button class="bookbtn mt1" type="submit">Book</button>	
									</form>									
								</div>
								<div class="labelleft2">			
									<b>Mabely Grand Hotel</b><br/><br/><br/>
									<p class="grey">
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec semper lectus. Suspendisse placerat enim mauris, eget lobortis nisi egestas et.
									Donec elementum metus et mi aliquam eleifend. Suspendisse volutpat egestas rhoncus.</p><br/>
									<ul class="hotelpreferences">
										<li class="icohp-fridge"></li>
										<li class="icohp-microwave"></li>
										<li class="icohp-washing"></li>
										<li class="icohp-roomservice"></li>
										<li class="icohp-safe"></li>
										<li class="icohp-playground"></li>
										<li class="icohp-conferenceroom"></li>
									</ul>
									
								</div>
							</div>
						</div>
					</div>

					<div class="clearfix"></div>
					<div class="offset-2"><hr class="featurette-divider3"></div>
					

				</div>	
				<!-- End of offset1-->		

				<div class="hpadding20">
				
					<ul class="pagination right paddingbtm20">
					  <li class="disabled"><a href="#">&laquo;</a></li>
					  <li><a href="#">1</a></li>
					  <li><a href="#">2</a></li>
					  <li><a href="#">3</a></li>
					  <li><a href="#">4</a></li>
					  <li><a href="#">5</a></li>
					  <li><a href="#">&raquo;</a></li>
					</ul>

				</div>

			</div>
			<!-- END OF LIST CONTENT-->
			
		

		</div>
		<!-- END OF container-->
		
	</div>
	<!-- END OF CONTENT -->
	

	
<%@ include file="footer.jsp" %>>
    
<%@ include file ="java.jsp" %>
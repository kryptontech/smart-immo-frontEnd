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
					<li><a href="index.jsp">Accueil</a></li>
					<li>/</li>
					<li><a href="#">Bien</a></li>			
				</ul>				
			</div>
			<a class="backbtn right" href="#"></a>
		</div>
		<div class="clearfix"></div> 
		<div class="brlines"></div>
	</div>	

	<!-- CONTENT -->
	<div class="container">
		<div class="container pagecontainer offset-0">	

			<!-- SLIDER -->
			<div class="col-md-8 details-slider">
			
				<div id="c-carousel">
				<div id="wrapper">
				<div id="inner">
					<div id="caroufredsel_wrapper2">
						<div id="carousel">
							<img src="resources/images/index.jpg" alt="Photo bien"/>
							<img src="resources/images/A46A0121.jpg" alt=""/>
							<img src="resources/images/A46B0121.jpg" alt=""/>
							<img src= "resources/images/A46C0121.jpg"alt=""/>
							<img src="resources/images/A46D0121.jpg" alt=""/>						
						</div>
					</div>
					<div id="pager-wrapper">
						<div id="pager">
							<img src="resources/images/index.jpg" width="120" height="68" alt=""/>
							<img src="resources/images/A46A0121.jpg" width="120" height="68" alt=""/>
							<img src="resources/images/A46B0121.jpg" width="120" height="68" alt=""/>
							<img src="resources/images/A46C0121.jpg" width="120" height="68" alt=""/>
							<img src="resources/images/A46D0121.jpg" width="120" height="68" alt=""/>					
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
				<button id="prev_btn2" class="prev2"><img src="resources/images/spacer.png" alt=""/></button>
				<button id="next_btn2" class="next2"><img src="resources/images/spacer.png" alt=""/></button>		
					
		</div>
		</div> <!-- /c-carousel -->
			
			
			
			
			
			</div>
			<!-- END OF SLIDER -->			
			
			<!-- RIGHT INFO -->
			<div class="col-md-4 detailsright offset-0">
				<div class="padding20">
					<h4 class="lh1">Sous categorie bien</h4>
				</div>
				
				<div class="line3"></div>
				
				<div class="hpadding20">
					<h2 class="opensans slim green2">Fournisseur</h2>
				</div>
				
				<div class="line3 margtop20"></div>
				</br>
				
				<div class="hpadding20">
				<form class="form-horizontal">
						<div class="row">
							<div class="form-group">
								<div class="col-lg-6">
									<input type="text" class="form-control"placeholder="Votre nom*">
								</div>
								<div class="col-lg-6">
									<input type="text" class="form-control"placeholder="Votre prenom">
								</div>
							</div>
						</div>
						<br/>
					  <div class="form-group">
						  <div class="input-group">
								<span class="input-group-addon">+225</span>
								<input type="text" class="form-control" placeholder="Votre contact">
						  </div>
					 </div>
					 </br>
					   <div class="form-group">
						<input type="email" class="form-control"placeholder="Entrer votre email">
					   </div>
					  </br>
					   <div class="form-group">
					     <textarea rows="3"class="form-control">Bonjour, j'ai trouve votre annonce sur SmartImmo et j'aimerais en savoir plus. Merci de me rappeler ce sujet.</textarea>
					   </div>
					   <div class="form-group">
							<div class="container">
							 <button class="btn btn-primary right" type="submit">Voir le numero</button>
							 <button class="btn btn-primary" type="submit">Envoyer un message</button>
							</div>
					   </div>
					</form>
				</div>
			</div>
			<!-- END OF RIGHT INFO -->

		</div>
		<!-- END OF container-->
		
		<div class="container mt25 offset-0">

			<div class="col-md-8 pagecontainer2 offset-0">
				<div class="container cstyle12">
				   
				   <h2 class="padding-right:5px">	Descriptif du Bien	</h2></span>
				</div>
				<div class="table-content" >
						<p class="hpadding20">
						  Maison de caractère située à 10min de dole dans un secteur au calme (rivera 2). 
						  La maison comprend une cuisine équipée ouverte sur grand salon séjour lumineux avec poêle à bois (70m²). 
						  6 chambres (entre 18 et 30m²), 2 salles d'eau dont une de 19m² avec baignoire en plus. Grand garage et dépendances. 
						  Le tout sur un terrain de plus de 2800 m² clos et arboré. Chauffage bois et gaz.
						  Nombreuses possibilités. Dpe : c, ges : d. Prix 250 000€fai. Pour plus d'informations, 
						  votre agent-commerciale Louise au 06 33 49 70 85. BELLIS IMMO TRANSACTIONS Tél. 03 80 37 84 21 Réf. annonce : 205vs84

						</p>
						<div class="line4"></div>
						
						<!-- Collapse 1 -->	
						<button type="button" class="collapsebtn2" data-toggle="collapse" data-target="#collapse1">
						  Caractéristique  du bien
						</button>
						
						<div id="collapse1" class="collapse in">
							 <div class="container">
						      <div class="col-lg-12 table-responsive ">
							 		<table class="table  table-striped tablecondensed">
										<thead>
											<tr>
							 				   <td>Surperficie</td>
							 				   <td>Nombre de pièces</td>
							 				   <td>Disponibilité</td>
							 				</tr>
										</thead>
										</tbody>
											<tr>
							 				   <td>25m2</td>
							 				   <td>5</td>
							 				   <td>Immédiate</td>
							 				</tr>
										</tbody>
							 				
											
										<tbody>
							 		</table>
							 </div>
						    </div>
							<div class="clearfix"></div>
						</div>
						<!-- End of collapse 1 -->	
						
						
						<div class="line4"></div>						
						
				</div>
			</div>
			
			<div class="col-md-4" >
				
				<div class="pagecontainer2 mt20 alsolikebox">
					<div class="cpadding1">
						<span class="icon-location"></span>
						<h4 class="opensans"> Ces biens vous interresseront</h4>
						<div class="clearfix"></div>
					</div>
					<div class="line5"></div> 
					<div class="container ">
						<a href="#"><img src="resources/images/index.jpg" class="left mr20 smallimg" alt=""/></a>
						<a href="#" class="dark"><b>Appartement</b></a><br/>
						<span class="opensans green bold size14">$125000</span> <br/>
						<span class="grey">Yopougon-Millionnaire</span>
					</div>
					<div class="line5"></div>
					<div class="container ">
						<a href="#"><img src="resources/images/A46A0121.jpg" class="left mr20  smallimg" alt=""/></a>
						<a href="#" class="dark"><b>Appartement</b></a><br/>
						<span class="opensans green bold size14">$125000</span> <br/>
						<span class="grey">Yopougon-Millionnaire</span>
					</div>
					<div class="line5"></div>			
					<div class="container ">
						<a href="#"><img src="resources/images/A46B0121.jpg" class="left mr20  smallimg" alt=""/></a>
						<a href="#" class="dark"><b>Appartement</b></a><br/>
						<span class="opensans green bold size14">$105000</span> <br/>
						<span class="grey">Riveria</span>
					</div>
					<br/>
				
					
				</div>				
			
			</div>
		</div>
		
		
		
	</div>
	<!-- END OF CONTENT -->
	
<%@ include file="footer.jsp" %>>
    
<%@ include file ="java.jsp" %>

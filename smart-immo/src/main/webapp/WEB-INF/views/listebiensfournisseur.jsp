
<!-- LISTE DES BIENS -->
<%@ include file ="head.jsp" %>
  <body id="top" class="thebg" >
    <%@ include file="header.jsp" %>
	<!-- /Top wrapper -->
	<div class="container breadcrub">
	    <div>
			<a class="homebtn left" href="#"></a>
			<div class="left">
				<ul class="bcrumbs">
					<li>/</li>
					<li><a href="#" class="active">Mon Compte</a></li>					
				</ul>				
			</div>
			<a class="backbtn right" href="#"></a>
		</div>
		<div class="clearfix"></div>
		<div class="brlines"></div>
	</div>	

	<!-- CONTENT -->
	<div class="container">

		
		<div class="container mt25 offset-0">
			
			
			<!-- CONTENT -->
			<div class="col-md-12 pagecontainer2 space offset-0">
				
				<!-- LEFT MENU -->
				<div class="col-md-1 offset-0">
					<!-- Nav tabs -->
					<ul class="nav profile-tabs">
					 
					  <li class="active">
						  <a href="#history" data-toggle="tab" onclick="mySelectUpdate()">
						  <span class="history-icon"></span>								  
						   historiques de vos annonces
						  </a></li>
						  
					 <li>
						  <a href="  <c:url value='/publier'/> ">
						  <span class="bookings-icon"></span>						  
						  Publier un nouveau bien
						  </a></li>
					 
					  <li>
						  <a href="<c:url value='/mesDonnees'/>">
						  <span class="settings-icon"></span>								  
						  Modifier vos informations
						  </a></li>
					  
					  <li>
						  <a href="<c:url value='/change-password'/> ">
						  <span class="password-icon"></span>							  
						  Changer votre mot de passe
						  </a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<!-- LEFT MENU -->
					
				<!-- RIGHT CPNTENT -->
				<div class="col-md-11 offset-0">
					<!-- Tab panes from left menu -->
					<div class="tab-content5">
				
					  
 <!-- HISTORIQUE DES BIENS PAR FOURNISSEURS -->					  
					  <div class="tab-pane active" id="history">
						<div class="padding40">	
						<div class="clearfix"></div>
							<br/>
							
							<table class="table table-striped table-bordered table-hover">
								<thead>
									<tr class="success">
										<td class=" bold">Date de publication</td>
										<td class=" bold">Titre du bien</td>
										<td class=" bold">Quartier</td>
										<td class=" bold">Action</td>
									</tr>
								</thead>
								<tbody>
								  <c:forEach items="${listBiens}" var="biens">
								  <tr>
								  		
								  			<td>${biens.datePubBien}</td>
								  			<td>${biens.titreBien}</td>
								  			<td>${biens.quartierBien}</td>
								  			<td> 
								  			    <button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span></button>
							                    <button type="submit" class="btn-search5"><span class="glyphicon glyphicon-trash"></span></button>
							                </td>
								  		
								  </tr>
								  </c:forEach>
								</tbody>
								
							</table>
							
							
							
						</div>
					  </div>
 <!-- FIN HISTORIQUE DES BIENS PAR FOURNISSEURS -->
					  
					</div>
					<!-- End of Tab panes from left menu -->	
					
				</div>
				<!-- END OF RIGHT CPNTENT -->
			
			<div class="clearfix"></div><br/><br/>
			</div>
			<!-- END CONTENT -->			
			

			
		</div>
		
		
	</div>
	<!-- END OF CONTENT -->
	

	
	
<%@ include file="footer.jsp" %>>
    
<%@ include file ="java.jsp" %>

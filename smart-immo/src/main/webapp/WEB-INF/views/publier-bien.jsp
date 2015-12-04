
<!-- FORMULAIRE DE PUBLICATION DES BIENS -->
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
					 
					  <li >
						  <a href=" <c:url value='/vosBiens'/>" >
						  <span class="history-icon"></span>								  
						   historiques de vos annonces
						  </a></li>
						  
					 <li class="active">
						  <a href="#bookings" data-toggle="tab" onclick="mySelectUpdate()">
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
					
<!-- TAB ajouter BIEN POUR UN FOURNISSEUR   -->
					  					  
					  <div class="tab-pane active "id="bookings">
						<div class="padding40">
						  
						<div class="clearfix"></div>
							<br/>
							
							<div class="relative margtop10">
							 <f:form method="POST" modelAttribute="frontPage" class="form-horizontal col-lg-12">
								 <f:input type="hidden" value="${idFour}" path="fournisseur" class="form-control input-sm"/> 
								<f:input type="hidden" value="${date}" path="datePubBien" class="form-control input-sm"/>
								<f:input type="hidden" value="${date}" path="statutBien" class="form-control input-sm"/>
								 <f:input type="hidden" value="${idBien}" path="idBien" class="form-control input-sm"/> 
								
									   <div class=" row well">
									   <div class="container">
											<div class="form-group">
												<label class="col-lg-3">Titre du bien:</label>
												<div class="col-lg-8">
													<f:input type="text" path="titreBien" id="titreBien" class="form-control input-sm"/>
			                                         												</div> 
											</div>
									   </div>
									    <div class="container">
											<div class="form-group">
												<label class="col-lg-3">Prix du bien:</label>
												<div class="col-lg-8">
													<f:input type="text" path="prixBien" id="prixBien" class="form-control input-sm"/>
			                                      </div> 
											</div>
									   </div>
									   <br>
												
										<div class="container">
											<div class="form-group">
												<label class="col-lg-3">Type Offre</label>
												<div class="col-lg-8">
													<f:select path="typeoffre" items="${listTypeOffre}" class="form-control">
   					                                 </f:select>
                                                     
												</div>
											</div>
									   </div>
									  <br>
												
										<div class="container">
											<div class="form-group">
												<label class="col-lg-3">Type de bien</label>
												<div class="col-lg-8">
													<f:select path="souscategorie" class="form-control" items="${listSousCategorie}">
   													</f:select>
                  									 
												</div>
											</div>
									   </div>
									   </div>
									   
									   
									   
										<div class=" row well">
										
												
									    <div class="container">
											<div class="form-group">
												<label class="col-lg-3">Ville:</label>
												<div class="col-lg-8">
													 <f:select path="ville" class="form-control" items="${listVille}">
   													</f:select>
                   										 
												</div>
											</div>
									   </div>
									   <br>
												
									    <div class="container">
											<div class="form-group">
												<label class="col-lg-3">Quartier:</label>
												<div class="col-lg-8">
													<f:input type="text" path="quartierBien" id="quartierBien" class="form-control"/>
												</div>
											</div>
									   </div>
									    <br>
												
									   <div class="container">
											<div class="form-group">
											 <label class="col-lg-3">Superficie:</label>
											 <div class="input-group col-lg-4">
												<f:input type="number" path="superficieBien" id="superficieBien" class="form-control "/>
							                   	
												<span class="input-group-addon">m2</span>
											</div>
											</div>
									   </div>
									   </div>
									  
										<div class=" row well">
									   <div class="container">
											<div class="form-group">
											 <label class="col-lg-3">nombre de pieces</label>
											 <div class="col-lg-4">
											 	 <f:input type="number" path="nbPieceBien" id="nbPieceBien" class="form-control "/>
							                    
											</div>
											</div>
									   </div>
									   <br>
												
									   <div class="container">
											<div class="form-group">
											 <label class="col-lg-3">Entrer une description pour votre bien:</label>
											 <div class="col-lg-8">
											 	 <f:textarea type="text" path="descriptionBien" id="descriptionBien" class="form-control "></f:textarea>
							              
											</div>
											</div>
									   </div>
									   <br>
									     <div class="container">
											<div class="form-group">
												<label class="col-lg-3">Disponibilite:</label>
												<div class="col-lg-8">
													 <f:select path="disponibilite" class="form-control " items="${listDisponibilite}">
									   					</f:select>
									                    
												</div>
											</div>
									   </div>
									   </div>
										<div class=" row well">
										<div class="form-group pull-right"> 
												<c:choose>
                    								<c:when test="${edit}">
                        								<input type="submit" value="Modifier" class="btn btn-danger btn-sm"/>
                    								</c:when>
                    							<c:otherwise>
                        							<input type="submit" value="Enregister" class="btn btn-danger btn-sm"/>
                    							</c:otherwise>
               									 </c:choose>
												<div class="container col-lg-6">
													<button type="reset" class="btn bnt-success">Annuler</button>
												</div>
									  </div>
									   </div> 
									</f:form>
						</div>	
						</div>
					  </div>
<!-- fin tab ajouter BIEN POUR UN FOURNISSEUR   -->
 
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

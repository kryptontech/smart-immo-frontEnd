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
						  <a href="#bookings" data-toggle="tab" onclick="mySelectUpdate()">
						  <span class="bookings-icon"></span>						  
						  Publier un nouveau bien
						  </a></li>
					 
					  <li>
						  <a href="#profile" data-toggle="tab" onclick="mySelectUpdate()">
						  <span class="settings-icon"></span>								  
						  Modifier vos informations
						  </a></li>
					  
					  <li>
						  <a href="#password" data-toggle="tab" onclick="mySelectUpdate()">
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
					
					  <!-- TAB 1 -->
					  <div class="tab-pane padding40 " id="profile">

						<div class="clearfix"></div>
							<br/>
						
						
						
	<!-- MODIFIER LES INFO DU FOURNISSEUR  -->					
						
						<legend class="size20 bold red">Mes informations personnelles</legend>
						
						  

						<!-- COL 1 -->
						<f:form method="post" modelAttribute="fFournisseur" class="well" >
						<div class="col-md-12 offset-0">
							
							<br/>
							Nom*:
							<f:input path="nomFournisseur" id="nomFournisseur" type="text" class="form-control" placeholder="John Doe" rel="popover"  data-content="This field is mandatory" data-original-title="Here you can edit your name"/>
							<br/>
							Pseudo*:
							<f:input path="pseudoFournisseur"
							id="pseudoFournisseur" type="text" class="form-control" placeholder="Jack" rel="popover"  data-content="This field is mandatory" data-original-title="Here you can edit your username"/>						  
							<br/>
							E-mail*:
							<f:input path="emailFournisseur"
							id="emailFournisseur" type="text" class="form-control" placeholder="office@email.com"  data-content="This field is mandatory" data-original-title="Edit your email address"/>
							<br/>
							telephone:
							<f:input path="telMobileFournisseur"
							id="telMobileFournisseur" type="text" class="form-control" placeholder=""/>	
							
							<br/>
						<br/>
						
						
					    <button type="submit" class="btn btn-custom margtop20">Modifier</button>					    
					    </div>	
						</f:form>		
					  </div>
					  
 <!-- FIN DES INFO SUR LE FOURNISSEUR  -->	
<!-- TAB BIEN POUR UN FOURNISSEUR   -->
					  					  
					  <div class="tab-pane"id="bookings">
						<div class="padding40">
						  
						<div class="clearfix"></div>
							<br/>
							
							<div class="relative margtop10">
							 <f:form method="POST" action="profileAddBien" modelAttribute="formBien" class="form-horizontal col-lg-12">
							
									   <div class=" row well">
									   
									   <div class="container">
											<div class="form-group">
												<label class="col-lg-3">Titre du bien:</label>
												<div class="col-lg-8">
													<f:input type="text" path="titreBien" id="titreBien" class="form-control input-sm"/>
			                                         <div class="has-error">
			                                           <f:errors path="titreBien" class="help-inline"/>
			                                          </div>
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
                                                     <div class="has-error">
                                                       <f:errors path="typeoffre" class="help-inline"/>
                    								</div>
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
                  									  <div class="has-error">
                        								<f:errors path="souscategorie" class="help-inline"/>
                   									 </div>
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
                   										 <div class="has-error">
                     							   <f:errors path="ville" class="help-inline"/>
                   									 </div>
												</div>
											</div>
									   </div>
									   <br>
												
									    <div class="container">
											<div class="form-group">
												<label class="col-lg-3">Quartier:</label>
												<div class="col-lg-8">
													<f:input type="text" path="quartierBien" id="quartierBien" class="form-control"/>
                   								<div class="has-error">
                     							  <f:errors path="quartierBien" class="help-inline"/>
                    							</div>
												</div>
											</div>
									   </div>
									    <br>
												
									   <div class="container">
											<div class="form-group">
											 <label class="col-lg-3">Superficie:</label>
											 <div class="input-group col-lg-4">
												<f:input type="number" path="superficieBien" id="superficieBien" class="form-control "/>
							                   	<div class="has-error">
							                        <f:errors path="superficieBien" class="help-inline"/>
							                    </div>
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
							                    <div class="has-error">
							                        <f:errors path="nbPieceBien" class="help-inline"/>
							                    </div>
											</div>
											</div>
									   </div>
									   <br>
												
									   <div class="container">
											<div class="form-group">
											 <label class="col-lg-3">Entrer une description pour votre bien:</label>
											 <div class="col-lg-8">
											 	 <f:textarea type="text" path="descriptionBien" id="descriptionBien" class="form-control "></f:textarea>
							                    <div class="has-error">
							                        <f:errors path="descriptionBien" class="help-inline"/>
							                    </div>
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
									                    <div class="has-error">
									                        <f:errors path="disponibilite" class="help-inline"/>
									                    </div>
												</div>
											</div>
									   </div>
									   </div>
									  
									  <div class=" row">
							             <div class="form-group">
							            
							            <div class=" container col-lg-6">
							             <a href="<c:url value='/AjouterAlbum'/>" class="btn-custom btn">Ajouter un album
							             <span class="glyphicon glyphicon-picture"></span></a>
							            </div>
							           </div>
							            </div>  
							           
										<div class=" row well">
										<div class="form-group pull-right">
										  
												<div class=" container col-lg-6">
													<button type="submit" class="btn-primary btn">Publier</button>
												</div>
												<div class="container col-lg-6">
													<button type="reset" class="btn-custom btn">Annuler</button>
												</div>
									  </div>
									   </div> 
									</f:form>
						</div>
						  
						
						
						</div>
					  </div>
<!-- TAB BIEN POUR UN FOURNISSEUR   -->
					  
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
								   <c:forEach  items="${listBiens}" var="biens">
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
							
							
							
							<!-- <div class="line4"></div>
							<div class="col-md-3">17.07.10</div>
							<div class="col-md-3">Spain - Malaga</div>
							<div class="col-md-3">Flight Tickets</div>
							<div class="col-md-3 textright"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span></button></div>
							<div class="clearfix"></div>
							
							<div class="line4"></div>
							<div class="col-md-3">01.05.09</div>
							<div class="col-md-3">Bulgary - Sunny Beach</div>
							<div class="col-md-3">Flight Tickets</div>
							<div class="col-md-3 textright"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span></button></div>
							<div class="clearfix"></div>
							
							<div class="line4"></div>
							<div class="col-md-3">01.05.09</div>
							<div class="col-md-3">France - Paris</div>
							<div class="col-md-3">Rent a car</div>
							<div class="col-md-3 textright"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span></button></div>
							<div class="clearfix"></div>
							
							<div class="line4"></div>
							<div class="col-md-3">15.03.11</div>
							<div class="col-md-3">U.A.E. - Dubai</div>
							<div class="col-md-3">Car + Hotel + Flight</div>
							<div class="col-md-3 textright"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span></button></div>
							<div class="clearfix"></div>
							
							<div class="line4"></div>
							<div class="col-md-3">15.06.12</div>
							<div class="col-md-3">Grand Britain - London</div>
							<div class="col-md-3">Car + Hotel + Flight</div>
							<div class="col-md-3 textright"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span></button></div>
							<div class="clearfix"></div> -->
							
						</div>
					  </div>
 <!-- FIN HISTORIQUE DES BIENS PAR FOURNISSEURS -->
					  
 <!-- MOT DE PASSE DU FOURNISSEUR -->					  
					  <div class="tab-pane" id="password">
						<div class="padding40">
						<div class="clearfix"></div>
							<br/>
							 
							<legend class="red size20 bold">Changer de mot de passe</legend>
							
							<f:form method="post" action ="profilePass-" class="well" modelAttribute="mdpform" >
							Mot de Passe<br/>
							<f:input path = "mdpFournisseur" type="text" class="form-control " placeholder=""/>
							<br/>
							Nouveau Mot de Pass<br/>
							<f:input path="newMdpFournisseur" type="text" class="form-control " placeholder=""/>
							<br/>
							Confirmer<br/>
							<input type="text" class="form-control " placeholder=""/>
							<br/>
							<button type="submit" class="btn btn-custom">Modifier</button>
							</f:form>
							<br/>
							
							
						</div>
					  </div>
<!-- MOT DE PASSE DU FOURNISSEUR -->
			
					  
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

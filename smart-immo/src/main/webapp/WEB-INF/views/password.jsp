<!--FORMULAIRE DE CHANGEMENT DE MOT DE PASS -->
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
					<li><a href="<c:url value='/' />"> Accueil</a></li>
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
					 
					  <li>
						  <a href=" <c:url value='/vosBiens'/>">
						  <span class="history-icon"></span>								  
						   historiques de vos annonces
						  </a></li>
						  
					 <li>
						  <a href=" <c:url value='/publier'/>">
						  <span class="bookings-icon"></span>						  
						  Publier un nouveau bien
						  </a></li>
					 
					  <li>
						  <a href="<c:url value='/mesDonnees'/>">
						  <span class="settings-icon"></span>								  
						  Modifier vos informations
						  </a></li>
					  
					  <li class="active">
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
									  
 <!-- MOT DE PASSE DU FOURNISSEUR -->					  
					  <div class="tab-pane active" id="password">
						<div class="padding40">
						<div class="clearfix"></div>
							<br/>
							 
							<legend class="red size20 bold">Changer de mot de passe</legend>
							
							<f:form method="post" class="well" modelAttribute="mdpForm" >
							<f:input type ="hidden" path = "mdpHideFournisseur" class="form-control " placeholder=""/>
							Mot de Passe<br/>
							<f:input path = "mdpFournisseur" type="password" class="form-control " placeholder=""/>
							<br/>
							Nouveau Mot de Pass<br/>
							<f:input path="newMdpFournisseur" type="password" class="form-control " placeholder=""/>
							<br/>
							Confirmer<br/>
							<input type="password" class="form-control " placeholder=""/>
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

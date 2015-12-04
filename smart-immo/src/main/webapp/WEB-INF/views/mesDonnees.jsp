<!-- MODIF DES DONNEES PERSO -->

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
						  <a href=" <c:url value='/vosBiens'/> " >
						  <span class="history-icon"></span>								  
						   historiques de vos annonces
						  </a></li>
						  
					 <li>
						  <a href=" <c:url value='/publier'/>">
						  <span class="bookings-icon"></span>						  
						  Publier un nouveau bien
						  </a></li>
					 
					  <li class="active">
						  <a href="#profile" data-toggle="tab" onclick="mySelectUpdate()">
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
					
					  <!-- TAB 1 -->
					  <div class="tab-pane padding40 active " id="profile">

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

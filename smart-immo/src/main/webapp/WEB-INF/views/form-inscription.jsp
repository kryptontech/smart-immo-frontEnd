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
					<li><a href="#">Creér un compte</a></li>			
				</ul>				
			</div>
			<a class="backbtn right" href="#"></a>
		</div>
		<div class="clearfix"></div> 
		<div class="brlines"></div>
	</div>	

	<!-- CONTENT -->
	<div class="container">
		<div class="col-md-8 pagecontainer">	
			<form class="form-horizontal col-lg-12 well">
			 </br>
			  <div class="container">
				<div class="form-group">
					<Label>Creer un compte</label> 
				</div>
			  </div>
			</br>
			  <div class="container">
			     <div class="col-lg-3">
					<div class="form-group">
						<Label class="radio">
						 <input type="radio" name="fournisseur" value="1">
						Particulier</label> 
					</div>
				  </div>
				  
				  <div class="col-lg-4 ">
					<div class="form-group">
						<Label class="radio">
						 <input type="radio" name="fournisseur" value="2" data-toggle="collapse" data-target="#fieldset2">
						Agent particulier</label> 
					</div>
				  </div>
			  </div>
			  <br/>
			  <fieldset>
			   <div class="container">
			     <div class="col-lg-6">
					<div class="form-group">
						<Label for="nom" class="col-lg-3">Nom*</label> 
						<div class="col-lg-12">
						   <input type="text" class="form-control" id="nom">
						</div>
					</div>
				  </div>
				  
				   <div class="col-lg-6">
					<div class="form-group">
						<Label for="prenom" class="col-lg-3">Prenom*</label> 
						<div class="col-lg-12">
						   <input type="text" class="form-control" id="prenom">
						</div>
					</div>
				  </div>
			  </div>
			  </br>
			  
			   <div class="container">
			    <div class="col-lg-6">
					<div class="form-group">
						<Label for="mobile" class="col-lg-3">Mobile</label> 
						<div class="col-lg-12">
						   <input type="text" class="form-control" id="mobile">
						</div>
					</div>
				  </div>
			     <div class="col-lg-6">
					<div class="form-group">
						<Label for="email" class="col-lg-3">Email</label> 
						<div class="col-lg-12">
						   <input type="email" class="form-control" id="email">
						</div>
					</div>
				  </div>
			  </div>
			  </br>
			   <div class="container">
			    <div class="col-lg-6">
					<div class="form-group">
						<Label for="password" class="col-lg-6">Mot de passe</label> 
						<div class="col-lg-12">
						   <input type="password" class="form-control" id="password">
						</div>
					</div>
				  </div>
			     <div class="col-lg-6">
					<div class="form-group">
						<Label for="confirm" class="col-lg-10">Confirmer votre mot de passe</label> 
						<div class="col-lg-12">
						   <input type="password" class="form-control" id="confirm">
						</div>
					</div>
				  </div>
			  </div>
			 </fieldset>
			 </br>
			 <fieldset id="fieldset2" class="collapse">
			    <legend>Agence agrée</legend>
				<br>
				<div class="container">
			    <div class="col-lg-6">
					<div class="form-group">
						<Label for="agence" class="col-lg-6">Nom Agence*</label> 
						<div class="col-lg-12">
						   <input type="text" class="form-control" id="agence">
						</div>
					</div>
				  </div>
			     <div class="col-lg-6">
					<div class="form-group">
						<Label for="site" class="col-lg-10">Site web</label> 
						<div class="col-lg-12">
						   <input type="text" class="form-control" id="site">
						</div>
					</div>
				  </div>
			  </div>
			  </br>
			  <div class="container">
			    <div class="col-lg-6">
					<div class="form-group">
						<Label for="adresse" class="col-lg-6">Adresse*</label> 
						<div class="col-lg-12">
						   <input type="text" class="form-control" id="adresse">
						</div>
					</div>
				  </div>
			     <div class="col-lg-6">
					<div class="form-group">
						<Label for="fixe" class="col-lg-10">Telephone fixe</label> 
						<div class="col-lg-12">
						   <input type="text" class="form-control" id="fixe">
						</div>
					</div>
				  </div>
			  </div>
			  </br>
			   <div class="container">
			    <div class="col-lg-6">
					<div class="form-group">
						<Label for="logo" class="col-lg-6">Logo*</label> 
						<div class="col-lg-12">
						   <input type="file" id="logo">
						</div>
					</div>
				 </div>
			  </div>
			 </fieldset>
			 <br/>
			  <div class="container">
			   <div class="col-lg-12">
					<div class="form-group">
						<label class="checkbox">
						  <input type="checkbox">I accept the Conditions générales d'utilisation pour notre site
						</label>
					</div>
				</div>
			    <div class="col-lg-12">
					<div class="form-group">
						<label class="checkbox">
						  <input type="checkbox">Je souhaite recevoir la newsletter de SmartImmo pour rester connecté 
								eux meilleures offres immobilières du marché</label>
					</div>
			  </div>
			 </div>
			  <div class="container">
			    <div class="col-lg-12">
					<div class="form-group">
						<input type="submit" class="btn btn-primary btn-default pull-right" value="CREER MON COMPTE">
					</div>
				 </div>
			  </div>
			</form>
		</div>
		
			<!-- END OF container-->
	</div>
	<!-- END OF CONTENT -->
	
<%@ include file="footer.jsp" %>>
    
<%@ include file ="java.jsp" %>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
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
					<li><a href="<c:url value='/' />"> Accueil</a></li>
					<li>/</li>
					<li><a href="<c:url value='/Inscription' />">Cre�r un compte</a></li>			
				</ul>				
			</div>
			<a class="backbtn right" href="#"></a>
		</div>
		<div class="clearfix"></div> 
		<div class="brlines"></div>
	</div>	

	<!-- CONTENT -->
	<div class="container">
		
<br>
<br>
		<div>

  <!-- Nav tabs -->
  <ul class="nav nav-tabs" role="tablist">
    <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">Particulier</a></li>
    <li role="presentation"><a href="<c:url value='/saveAgence' />" >Agence</a></li>
  </ul>

  <!-- Tab panes -->
  <div class="tab-content4">
   
    <div role="tabpanel" class="tab-pane active" id="home">
    	<!--Tab Particulier-->
		
		<f:form method="POST" action="saveFournisseur" modelAttribute="formFournisseur" class="form-horizontal col-lg-12 well">
			 </br>
			 <br/>
			  <fieldset>
			   <div class="container">
			     <div class="col-lg-4">
					<div class="form-group">
						<Label for="nomFournisseur" class="col-lg-3">Nom*</label> 
							<div class="col-lg-12">
								<f:input type="text" path="nomFournisseur" id="nomFournisseur" class="form-control input-sm" required="true"/>
							</div>
							<div class="has-error">
								<f:errors path="nomFournisseur" class="help-inline" />
							</div>
						</div>
					</div>
				   <div class="col-lg-1"></div>
				  
				   <div class="col-lg-4">
					<div class="form-group">
						<Label for="pseudoFournisseur" class="col-lg-3">Pseudo*</label> 
					<div class="col-lg-12">
					<f:input type="text" path="pseudoFournisseur"
							id="pseudoFournisseur" class="form-control input-sm" required="true" />
							<div class="has-error">
							<f:errors path="pseudoFournisseur" class="help-inline" />
						</div>
						</div>
						
					</div>
				  </div>
				    <div class="col-lg-1"></div>
			  	 </div>
			  </br>
			  
			   <div class="container">
			    <div class="col-lg-4">
					<div class="form-group">
						<Label for="mobile" class="col-lg-3">Mobile*</label>
						<div class="col-lg-12"> 
	                    <f:input type="tel" path="telMobileFournisseur" id="telMobileFournisseur" class="form-control input-sm" required="true" />
						<div class="has-error">
							<f:errors path="telMobileFournisseur" class="help-inline" />
						</div>
						</div>
						
					</div>
				  </div>
				    <div class="col-lg-1"></div>
			     <div class="col-lg-4">
					<div class="form-group">
						<Label for="email" class="col-lg-3">Email*</label> 
						<div class="col-lg-12">
						<f:input type="email" path="emailFournisseur" id="emailFournisseur"  class="form-control" required="true" />
						   <div class="has-error">
							<f:errors path="emailFournisseur" class="help-inline" />
						  </div>
					</div>
				  </div>
			  </div>
			    <div class="col-lg-1"></div>
			  </div>
			  </br>
			   <div class="container">
			    <div class="col-lg-4">
					<div class="form-group">
						<Label for="password" class="col-lg-6">Mot de passe*</label> 
						<div class="col-lg-12">
						   <f:input type="password" path="mdpFournisseur" id="mdpFournisseur"  required="true" class="form-control input-sm" />
							<div class="has-error">
							<f:errors path="mdpFournisseur" class="help-inline" />
					        </div>
				        </div>
				  </div>
				  </div>
				  <div class="col-lg-1"></div>
			     <div class="col-lg-4">
					<div class="form-group">
						<Label for="confirm" class="col-lg-10">Confirmer votre mot de passe</label> 
						<div class="col-lg-12">
						   <input type="password" class="form-control" id="confirm"   required="true"/>
						</div>
					</div>
				  </div>
						<f:input path="admin" type="hidden" value = "1" class="form-control" id="confirm"   required="true"/>
			  </div>
			 </fieldset>
			   <div class="col-lg-1"></div>
			 <br/>
			 
			 <br/>
			  <div class="container">
			   <div class="col-lg-12">
					<div class="form-group">
						<label class="checkbox">
						  <input type="checkbox">j'accepte les Conditions g�n�rales d'utilisation de votre site
						</label>
					</div>
				</div>
			    <div class="col-lg-12">
					<div class="form-group">
						<label class="checkbox">
						  <input type="checkbox">Je souhaite recevoir la newsletter de SmartImmo pour rester connect� 
								eux meilleures offres immobili�res du march�</label>
					</div>
			  </div>
			 </div>
			  <div class="container">
			    <div class="col-lg-11">
					<div class="form-group">
						<input type="submit" class="btn btn-custom pull-right" value="CREER MON COMPTE">
					</div>
				 </div>
			  </div>
			</f:form>
    
    <!-- end form founisseur  -->
    
    </div>
    <!--  AGENCE FORME   -->
  </div>
  
</div>
		
			<!-- END OF container-->
	</div>
	
	<!-- END OF CONTENT -->
	
<%@ include file="footer.jsp" %>
    
<%@ include file ="java.jsp" %>

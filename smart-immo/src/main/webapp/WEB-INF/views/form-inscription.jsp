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
			<form class="form-horizontal">
			 </br>
			  <div class="container">
				<div class="form-group">
					<Label>Creer un compte</label> 
				</div>
			  </div>
				
			  <div class="container">
			     <div class="col-lg-3 col-lg-offset-2">
					<div class="form-group">
						<Label class="radio">
						 <input type="radio" name="fournisseur" value="1">
						Particulier</label> 
					</div>
				  </div>
				  
				  <div class="col-lg-4 ">
					<div class="form-group">
						<Label class="radio">
						 <input type="radio" name="fournisseur" value="2">
						Agent particulier</label> 
					</div>
				  </div>
			  </div>
			  <br/>
			   <div class="container">
			     <div class="col-lg-6">
					<div class="form-group">
						<Label for="nom" class="col-lg-2">Nom*:</label> 
						<div class="col-lg-6">
						   <input type="text" class="form-control" id="nom">
						</div>
					</div>
				  </div>
				  
				   <div class="col-lg-6">
					<div class="form-group">
						<Label for="nom" class="col-lg-2">Prenom*:</label> 
						<div class="col-lg-6">
						   <input type="text" class="form-control" id="nom">
						</div>
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

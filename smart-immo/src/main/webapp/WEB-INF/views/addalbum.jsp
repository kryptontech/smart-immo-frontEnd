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
				<div class="container">
					<div class="row-fluid sortable box">	
						<form method="POST"  class="form-horizontal well" enctype = "multipart/form-data">
						<input type="hidden" path="idAlbum" id="idAlbum"/>
						<input type="hidden" path="idBien" id="idBien"/>
						<br>
						<br> 
										
				  
					<div class="container-fluid">
						<legend>Ajouter des photos</legend>
						<br/>
						<br/>
						<div class="form-group span12">
							 <div class="row-fluid span4">
								 <div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input type="file"/>
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input type="file"/>
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input type="file"/>
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input type="file"/>
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input type="file"/>
								 </div>
							 </div>	
							 <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input type="file"/>
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input type="file"/>
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input type="file"/>
								 </div>
							 </div>	
						</div>
								
					</div>
					<br/>
					<br/>			 
					<div class="row groupbtn">
						<div class="form-group pull-right">
										  
												<div class=" container col-lg-6">
													<a href="<c:url value='/Profile'/>" value="Enregister" class="btn btn-primary"> Enregistrer<a/> 
												</div>
												<div class="container col-lg-6">
													<a class="btn btn-danger" href="<c:url value='/viewAlbums'/>">Annuler</a>
												</div>
										
						</div>
					</div>
				</form>
             </div>
				</div>
			</div>
			<!-- END CONTENT -->			
			

			
		</div>
		
		
	</div>
	<!-- END OF CONTENT -->
	

	
	
<%@ include file="footer.jsp" %>>
    
<%@ include file ="java.jsp" %>

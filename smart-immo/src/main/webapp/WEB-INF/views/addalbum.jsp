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
						<f:form method="POST" action="multipleSave" class="form-horizontal well" enctype = "multipart/form-data">
						
						<input type="hidden" value ="${idBien}" id="id"/>
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
									<input id="upload_file" type="file" name="file"> <br />
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input id="upload_file" type="file" name="file"> <br />
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input id="upload_file" type="file" name="file"> <br />
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input id="upload_file" type="file" name="file"> <br />
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input id="upload_file" type="file" name="file"> <br />
								 </div>
							 </div>	
							 <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input id="upload_file" type="file" name="file"> <br />
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input id="upload_file" type="file" name="file"> <br />
								 </div>
							 </div>	
							  <div class="row-fluid span4">
								<div class="row-fluid">
									 <div class="span10 img-polaroid albumbox">
									   </div>
								 </div>
								  <br/>
								  <div class="row-fluid">
									<input id="upload_file" type="file" name="file"> <br />
								 </div>
							 </div>	
						</div>
								
					</div>
					<br/>
					<br/>			 
					<div class="row groupbtn">
						<div class="form-group pull-right">
										  
												<div class=" container col-lg-6">
													<c:choose>
                    									<c:when test="${edit}">
                        									<input type="submit" value="Modifier" class="btn btn-danger btn-sm"/>
                    									</c:when>
                    									<c:otherwise>
                        									<input type="submit" value="Enregister" class="btn btn-danger btn-sm"/>
                    									</c:otherwise>
                									</c:choose>
												</div>
												<div class="container col-lg-6">
													<button type = "reset" class="btn btn-danger">Annuler</button>
												</div>
						</div>
					</div>
				</f:form>
             </div>
				</div>
			</div>
			<!-- END CONTENT -->			
			

			
		</div>
		
		
	</div>
	<!-- END OF CONTENT -->
	

	
	
<%@ include file="footer.jsp" %>>
    
<%@ include file ="java.jsp" %>

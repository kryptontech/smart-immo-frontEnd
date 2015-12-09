<%@ include file="head.jsp"%>
<body id="top" class="thebg">
	<%@ include file="headers.jsp"%>
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
			<div class=" pagecontainer2 space offset-0">
				<div class="container">
					<div class="row-fluid sortable box">
						<f:form method="POST" action="multipleSave"
							class="form-horizontal" enctype="multipart/form-data">
							<legend>Photo du bien</legend>

							<br>
							<br>


							<br />
							<br />

							<div class="container-fluid">
								<div class="col-md-12 offset-0">
									<legend>Ajouter des photos</legend>
									<br /> <br />
									<div class="form-group span2 col-md-2 offset-0"></div>
									<div class="form-group span6 col-md-4 offset-0">
										<input style="display: none" type="text" value="${idBien}"
											id="id" name="id" /> <br>
										<div class="row-fluid span4">
											<div class="row-fluid">
												<div class="span10 img-polaroid albumbox"></div>
											</div>
											<br />
											<div class="row-fluid">
												<input id="upload_file" type="file" name="file"> <br />
											</div>
										</div>
										<div class="row-fluid span4">
											<div class="row-fluid">
												<div class="span10 img-polaroid albumbox"></div>
											</div>
											<br />
											<div class="row-fluid">
												<input id="upload_file" type="file" name="file"> <br />
											</div>
										</div>
										<div class="row-fluid span4">
											<div class="row-fluid">
												<div class="span10 img-polaroid albumbox"></div>
											</div>
											<br />
											<div class="row-fluid">
												<input id="upload_file" type="file" name="file"> <br />
											</div>
										</div>
										<div class="row-fluid span4">
											<div class="row-fluid">
												<div class="span10 img-polaroid albumbox"></div>
											</div>
											<br />
											<div class="row-fluid">
												<input id="upload_file" type="file" name="file"> <br />
											</div>
										</div>

									</div>
									<div class="form-group span2 col-md-2 offset-0"></div>
									<div class="form-group span6 col-md-4">
										<div class="row-fluid span4">
											<div class="row-fluid">
												<div class="span10 img-polaroid albumbox"></div>
											</div>
											<br />
											<div class="row-fluid">
												<input id="upload_file" type="file" name="file"> <br />
											</div>
										</div>
										<div class="row-fluid span4">
											<div class="row-fluid">
												<div class="span10 img-polaroid albumbox"></div>
											</div>
											<br />
											<div class="row-fluid">
												<input id="upload_file" type="file" name="file"> <br />
											</div>
										</div>
										<div class="row-fluid span4">
											<div class="row-fluid">
												<div class="span10 img-polaroid albumbox"></div>
											</div>
											<br />
											<div class="row-fluid">
												<input id="upload_file" type="file" name="file"> <br />
											</div>
										</div>
										<div class="row-fluid span4">
											<div class="row-fluid">
												<div class="span10 img-polaroid albumbox"></div>
											</div>
											<br />
											<div class="row-fluid">
												<input id="upload_file" type="file" name="file"> <br />
											</div>
										</div>


									</div>
								</div>
							</div>
							<hr />
							<br />
							<br />
							<div class="container-fluid groupbtn">
								<br /> <br />
								<div class="form-group span5">

									<input type="submit" value="Enregister"
										class="btn btn-primary btn-sm">



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




	<%@ include file="footer.jsp"%>

	<%@ include file="java.jsp"%>
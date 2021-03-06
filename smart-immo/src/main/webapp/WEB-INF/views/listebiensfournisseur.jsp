
<!-- LISTE DES BIENS -->
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
			<div class="col-md-12 pagecontainer2 space offset-0">

				<!-- LEFT MENU -->
				<div class="col-md-2 offset-0">
					<!-- Nav tabs -->
					<ul class="nav profile-tabs">

						<li class="active"><a href=" <c:url value='/secure/listeBiensFour'/> ">
								<span class="history-icon"></span> historiques de vos annonces
						</a></li>

						<li><a href=" <c:url value='/secure/saveBien'/>"> <span
								class="bookings-icon"></span> Publier un nouveau bien
						</a></li>


						<li ><a
							href="<c:url value='/secure/profiles'/>"> <span
								class="settings-icon"></span> Modifier vos informations
						</a></li>

						<li><a href="<c:url value='/secure/modifyMdpFournisseur'/> ">
								<span class="password-icon"></span> Changer votre mot de passe
						</a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<!-- LEFT MENU -->

				<!-- RIGHT CPNTENT -->
				<div class="col-md-10 offset-0">
					<!-- Tab panes from left menu -->
					<div class="tab-content5">


						<!-- HISTORIQUE DES BIENS PAR FOURNISSEURS -->
						<div class="tab-pane active" id="history">
							<div class="padding40">
								<div class="clearfix"></div>
								<br />

								<table class="table table-striped table-bordered " id="example">
									<thead>
										<tr class="success">
											<td class=" bold">Date de publication</td>
											<td class=" bold">Titre du bien</td>
											<td class=" bold">Quartier</td>
											<td class=" bold">Photos</td>
											<td class=" bold">Action</td>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list}" var="biens">
											<tr>


												<td>${biens.datePubBien}</td>
												<td>${biens.titreBien}</td>
												<td>${biens.quartierBien}</td>
												<td><a class="btn btn-success" data-toggle="tooltip"
													title="Voir les photos"
													href="<c:url value='/secure/viewAlbums-${biens.idBien}'/>">
														<i class="glyphicon glyphicon-camera"></i>
												</a> <a class="btn btn-default" data-toggle="tooltip"
													title="Ajouter des photos"
													href="<c:url value='/secure/saveAlbum-${biens.idBien}'/>">
														<i class="glyphicon glyphicon-plus "></i>
												</a></td>
												<td><a class="btn btn-info" data-toggle="modal"
													href="<c:url value='/secure/modifyBien-${biens.idBien}' />">
														<i class="glyphicon glyphicon-pencil"></i>
												</a> <a class="btn btn-danger" data-toggle="modal"
													href="<c:url value='/secure/deleteBien-${biens.idBien}' />">
														<i class="glyphicon glyphicon-trash"></i>
												</a></td>
											</tr>
										</c:forEach>
									</tbody>

								</table>



							</div>
						</div>
						<!-- FIN HISTORIQUE DES BIENS PAR FOURNISSEURS -->

					</div>
					<!-- End of Tab panes from left menu -->

				</div>
				<!-- END OF RIGHT CPNTENT -->

				<div class="clearfix"></div>
				<br /> <br />
			</div>
			<!-- END CONTENT -->



		</div>


	</div>
	<!-- END OF CONTENT -->




	<%@ include file="footer.jsp"%>

	<%@ include file="java.jsp"%>
<%@ include file="includes.jsp"%>
<%@ include file="head.jsp"%>

<body id="">


	<%@ include file="header.jsp"%>

	<div class="container breadcrub">
		<div>
			<a class="homebtn left" href="#"></a>
			<div class="left">
				<ul class="bcrumbs">
					<li>/</li>
					<li><a href="<c:url value='/'/>">Accueil</a></li>

				</ul>
			</div>
			<a class="backbtn right" href="#"></a>
		</div>
		<div class="clearfix"></div>
		<div class="brlines"></div>
	</div>

	<!-- CONTENT -->
	<div class="container">
		<div class="container  offset-0">

			<!-- LIST CONTENT-->
			
			<div class=" col-md-12 offset-0">
				<br /> <br />
				<div class="clearfix"></div>


				<div class=" offset-1">

					<div class="clearfix"></div>
					<div class="offset-2">
						<hr class="featurette-divider3">
					</div>
					<table id="example" class="table table-striped table-bordered"
						cellspacing="0" width="100%">
						<thead>
							<tr>
								<th>Offres</th>
							
							</tr>
						</thead>

						<tbody>

							<c:forEach var="bien" items="${listBiens}">
								<tr>
									<td>

										<div class="col-md-4 offset-0">
											<div class="listitem2">
												<img src="${bien.album}" alt="" />
												<div class="liover"></div>
											</div>
										</div>

										<div class="col-md-8 ">
											<div class="itemlabel4">
												<div class="labelright">
													<br /> <span class="green size18"><b>${bien.prixBien}</b></span><br />
													<span class="size11 grey"></span><br /> <br /> <br /> <br />
													<br /> <span class="size11 grey"> <br /> <span
														class="grey2"><b></b></span>

													</span><br /> <br />


													<form action="details.html">
														<a href="<c:url value='/detailsBien-${bien.idBien}' />"
															class="bookbtn mt1" type="submit">Details</a>
													</form>

												</div>
												<br /> <br />
												<div class="labelleft2">
													<span class="size16"><b>${bien.titreBien}</b></span><br />
													<span class="opensans size14 grey"><span
														class="grey2">From:</span> ${bien.quartierBien},
														${bien.ville}</span><br />
													<div class="line4 wh80percent"></div>

													<p class="grey size14 lh6">
														<span class="opensans size14 grey2">description :</span>
														${bien.descriptif}<br /> <span
															class="opensans size14 grey2">Sails to:</span> Key West,
														FL; Cozumel, Mexico
													</p>
													<br /> <br />

												</div>

											</div>
										</div>



									</td>
									





								</tr>
							</c:forEach>
						</tbody>
					</table>





				</div>
				<!-- End of offset1-->




			</div>
			
			<!-- END OF LIST CONTENT-->



		</div>
		<!-- END OF container-->
		<br> <br>
		<hr>
	</div>
	<!-- END OF CONTENT -->



	<%@ include file="footer.jsp"%>

	<%@ include file="java.jsp"%>
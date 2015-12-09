<%@ include file="head.jsp"%>

<body id="top">


	<%@ include file="header.jsp"%>

	<!--
	#################################
		- THEMEPUNCH BANNER -
	#################################
	-->


	<div class="fullscreenbanner">

		<video autoplay loop poster="polina.jpg" id="bgvid">

			<source src="http://149.202.192.23:6570/video/videoplayback.mp4"
				type="video/mp4">
		</video>
		<div class="tp-bannertimer none"></div>
	</div>


	<!--
		##############################
		 - ACTIVATE THE BANNER HERE -
		##############################
		
		<!-- WRAP -->
	<div class="wrap cstyle03 login-fullwidith ">

		<div class="container mt-130 z-index100">
			<div class="row">
				<div class="col-md-12">
					<div class="bs-example bs-example-tabs cstyle04">

						<ul class="nav nav-tabs myTab2pos " id="myTab2">
							<li onclick="mySelectUpdate()" class="active"><a
								data-toggle="tab" href="#airtab3"><span class="hidetext">Acheter</span>&nbsp;</a></li>
							<li onclick="mySelectUpdate()" class=""><a data-toggle="tab"
								href="#hoteltab3"><span class="hidetext">Louer</span>&nbsp;</a></li>
							<!--
									<li onclick="mySelectUpdate()" class=""><a data-toggle="tab" href="#vacationstab3"><span class="suitcasetab3"></span><span class="hidetext">Vacations</span>&nbsp;</a></li>
								-->
						</ul>

						<div class="tab-content2">

							<!-- Tab airtab3 -->
							<!-- BARRE DE RECHERCHE POUR VENTE-->
							<div class="tab-pane  active" id="airtab3">

								<f:form method="post" action="rechercheVente"
									modelAttribute="formSearch" class="form-inline col-lg-12">
									<div class="form-group col-lg-2">
										<span class="opensans size13"><b>VILLE</b><br></span>
										<f:input type="text" path="ville" id="ville"
											class="form-control" style="text-align:left"
											placeholder="la ville" />
										<div class="has-error">
											<f:errors path="ville" class="help-inline" />
										</div>
									</div>

									<div class="form-group col-lg-2">
										<span class="opensans size13"><b>QUARTIER</b><br></span>
										<div class="input-group">
											<f:input path="quartierBien" id="quartierBien" type="text"
												class="form-control" style="text-align:left"
												placeholder="le quartier" />
										</div>
										<div class="has-error">
											<f:errors path="quartierBien" class="help-inline" />
										</div>
									</div>

									<div class="form-group col-lg-2">
										<span class="opensans size13"><b>TYPE DE BIEN</b><br></span>
										<f:input path="sousCategorie" id="sousCategorie"
											class="form-control " />

										<div class="has-error">
											<f:errors path="sousCategorie" class="help-inline" />
										</div>
									</div>

									<div class="form-group col-lg-2">
										<span class="opensans size13"><b>PRIX MINIMUM</b><br></span>
										<div class="input-group">
											<f:input path="prixMini" type="text" class="form-control"
												style="text-align:left" placeholder="prix min" />
											<span class="input-group-addon">Fcfa</span>
											<div class="has-error">
												<f:errors path="prixMini" class="help-inline" />
											</div>
										</div>
									</div>

									<div class="form-group col-lg-2">
										<span class="opensans size13"><b>PRIX MAXIMUM</b><br></span>
										<div class="input-group">
											<f:input type="text" path="prixMaxi" class="form-control"
												style="text-align:left" placeholder="prix max" />
											<span class="input-group-addon">Fcfa</span>
											<div class="has-error">
												<f:errors path="prixMaxi" class="help-inline" />
											</div>
										</div>
									</div>
									<div class=" form-group col-lg-2 ">
										<br>
										<button type="search" class="btn btn-custom right col-lg-12">
											<span class="glyphicon glyphicon-search"></span> Chercher
										</button>
									</div>
								</f:form>
							</div>
							<!-- End of Tab airtab3 -->

							<!-- Tab hoteltab3 -->

							<!-- BARRE DE RECHERCHE POUR LOCATION  -->
							<div class="tab-pane " id="hoteltab3">
								<f:form method="post" action="rechercheLocation"
									modelAttribute="formSearch" class="form-inline col-lg-12">
									<div class="form-group col-lg-2">
										<span class="opensans size13"><b>VILLE</b><br></span>
										<f:input type="text" path="ville" id="ville"
											class="form-control" style="text-align:left"
											placeholder="la ville" />
										<div class="has-error">
											<f:errors path="ville" class="help-inline" />
										</div>
									</div>

									<div class="form-group col-lg-2">
										<span class="opensans size13"><b>QUARTIER</b><br></span>
										<div class="input-group">
											<f:input path="quartierBien" id="quartierBien" type="text"
												class="form-control" style="text-align:left"
												placeholder="le quartier" />
										</div>
										<div class="has-error">
											<f:errors path="quartierBien" class="help-inline" />
										</div>
									</div>

									<div class="form-group col-lg-2">
										<span class="opensans size13"><b>TYPE DE BIEN</b><br></span>
										<f:input path="sousCategorie" type="text" class="form-control"
											style="text-align:left" placeholder="prix min" />
										<!-- <f:select path="sousCategorie" items="${listsousCategorie}" class="form-control">
                                    </f:select> -->
										<div class="has-error">
											<f:errors path="sousCategorie" class="help-inline" />
										</div>
									</div>

									<div class="form-group col-lg-2">
										<span class="opensans size13"><b>PRIX MINIMUM</b><br></span>
										<div class="input-group">
											<f:input path="prixMini" type="text" class="form-control"
												style="text-align:left" placeholder="prix min" />
											<span class="input-group-addon">Fcfa</span>
											<div class="has-error">
												<f:errors path="prixMini" class="help-inline" />
											</div>
										</div>
									</div>

									<div class="form-group col-lg-2">
										<span class="opensans size13"><b>PRIX MAXIMUM</b><br></span>
										<div class="input-group">
											<f:input type="text" path="prixMaxi" class="form-control"
												style="text-align:left" placeholder="prix max" />
											<span class="input-group-addon">Fcfa</span>
											<div class="has-error">
												<f:errors path="prixMaxi" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group col-lg-2">
										<br>
										<button href="<c:url value='/recherche'/>"
											class="btn btn-custom right col-lg-12">
											<span class="glyphicon glyphicon-search"></span> Chercher
										</button>
									</div>
								</f:form>
							</div>

						</div>



					</div>

				</div>

			</div>
		</div>
		<!---------- Start liste bien---------------->
		<div class="container">
			<div class="container pagecontainer mt-130 offset-0">


				<div class=" col-md-12">
					<!-- End of padding -->

					<br /> <br />
					<div class="clearfix"></div>


					<div class="row offset-1">

						<c:forEach items="${listBiensHome}" var="bien">
							<div class="col-md-4">
								<div class="list-box">

									<div class="listitem2">
										<img src="${bien.album}" alt="" />
										<div class="liover"></div>
										<div class="itemlabel">
											<span class="right  lred2 size14 ">${bien.datePuBien}</span>
											<span><span class="glyphicon glyphicon-camera"
												aria-hidden="true"></span>4</span><br> <br> <span
												class=" lightgrey right mt1 green size20 ">${bien.prix}</span>
											<span class=" size20">DUPLEX</span><br /></br> <span
												class="right size20">LOCATION</span> <span class="size20">${bien.quartier}
											</span><br /> <br /> <a
												href="<c:url value='/detailsBien-${bien.idBien}'/>"
												class="btn  right btn-custom">Detail</a> <span
												class="size14">5<span class="glyphicon glyphicon-bed"></span></span>
											<span class="size14">${bien.superfie}</span>
										</div>
									</div>
								</div>
							</div>

						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>



</body>
<%@ include file="footer.jsp"%>

<%@ include file="java.jsp"%>
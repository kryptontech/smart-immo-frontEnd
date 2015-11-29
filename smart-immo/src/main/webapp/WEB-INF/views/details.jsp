<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ include file="head.jsp"%>>

<body id="top" class="thebg">

	<!-- --------- Header -->
	<%@ include file="header.jsp"%>



	<div class="container breadcrub">
		<div>
			<a class="homebtn left" href="#"></a>
			<div class="left">
				<ul class="bcrumbs">
					<li>/</li>
					<li><a href="index.jsp">Accueil</a></li>
					<li>/</li>
					<li><a href="#">Bien</a></li>
				</ul>
			</div>
			<a class="backbtn right" href="#"></a>
		</div>
		<div class="clearfix"></div>
		<div class="brlines"></div>
	</div>

	<!-- CONTENT -->
	<div class="container">

		<c:if test="${not empty unBien }">

			<div class="container pagecontainer offset-0">

				<!-- SLIDER -->
				<div class="col-md-8 details-slider">

					<div id="c-carousel">
						<div id="wrapper">
							<div id="inner">
								<div id="caroufredsel_wrapper2">
									<div id="carousel">
									
								
										<c:forEach items="${listAlbums}" var="o">
										
											<img src="${o.pathAlbum}" alt="Photo bien" />
										</c:forEach>
									</div>
								</div>
								<div id="pager-wrapper">
									<div id="pager">
										<c:forEach var="p" items="${listAlbu}">
											<img src="${p.pathAlbum}" alt="Photo bien" />
										</c:forEach>
									</div>
								</div>
							</div>
							

						</div>
					</div>
					<!-- /c-carousel -->





				</div>
				<!-- END OF SLIDER -->

				<!-- RIGHT INFO -->
				<div class="col-md-4 detailsright offset-0">
					<div class="padding20">
						<h4 class="lh1">${unBien.sousCategorie}</h4>
					</div>

					<div class="line3"></div>

					<div class="hpadding20">
						<h2 class="opensans slim green2">${unBien.fournisseur}</h2>
					</div>

					<div class="line3 margtop20"></div>
					</br>

					<div class="hpadding20">
						<form class="form-horizontal">
							<div class="row">
								<div class="form-group">
									<div class="col-lg-6">
										<input type="text" class="form-control"
											placeholder="Votre nom*">
									</div>
									<div class="col-lg-6">
										<input type="text" class="form-control"
											placeholder="Votre prenom">
									</div>
								</div>
							</div>
							<br />
							<div class="form-group">
								<div class="input-group">
									<span class="input-group-addon">+225</span> <input type="text"
										class="form-control" placeholder="Votre contact">
								</div>
							</div>
							</br>
							<div class="form-group">
								<input type="email" class="form-control"
									placeholder="Entrer votre email">
							</div>
							</br>
							<div class="form-group">
								<textarea rows="3" class="form-control">Bonjour, j'ai trouve votre annonce sur SmartImmo et j'aimerais en savoir plus. Merci de me rappeler ce sujet.</textarea>
							</div>
							<div class="form-group">
								<div class="container">
									<button class="btn btn-primary right" type="submit">Voir
										le numero</button>
									<button class="btn btn-primary" type="submit">Envoyer
										un message</button>
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- END OF RIGHT INFO -->

			</div>
			<!-- END OF container-->

			<div class="container mt25 offset-0">

				<div class="col-md-8 pagecontainer2 offset-0">
					<div class="container cstyle12">

						<h2 class="padding-right:5px">Descriptif du Bien</h2>
						</span>
					</div>
					<div class="table-content">
						<p class="hpadding20">${unBien.descriptif}</p>
						<div class="line4"></div>

						<!-- Collapse 1 -->
						<button type="button" class="collapsebtn2" data-toggle="collapse"
							data-target="#collapse1">Caractéristique du bien</button>

						<div id="collapse1" class="collapse in">
							<div class="container">
								<div class="col-lg-12 table-responsive ">
									<table class="table  table-striped tablecondensed">
										<thead>
											<tr>
												<th>Superficie</th>
												<td>Nombre de pièces</td>
												<td>Disponibilité</td>
											</tr>
										</thead>
										</tbody>
										<tr>
											<td>${unBien.superficieBien}</td>
											<td>${unBien.nbrePiece}</td>
											<td>${unBien.dispo}</td>
										</tr>
										</tbody>


										<tbody>
									</table>
								</div>
							</div>
							<div class="clearfix"></div>
						</div>
						<!-- End of collapse 1 -->


						<div class="line4"></div>

					</div>
				</div>

				<div class="col-md-4">

					<div class="pagecontainer2 mt20 alsolikebox">
						<div class="cpadding1">
							<span class="icon-location"></span>
							<h4 class="opensans">Ces biens vous interresseront</h4>
							<div class="clearfix"></div>
						</div>
						<div class="line5"></div>
						<div class="container ">
							<a href="#"><img src="resources/images/index.jpg"
								class="left mr20 smallimg" alt="" /></a> <a href="#" class="dark"><b>Appartement</b></a><br />
							<span class="opensans green bold size14">$125000</span> <br /> <span
								class="grey">Yopougon-Millionnaire</span>
						</div>
						<div class="line5"></div>
						<div class="container ">
							<a href="#"><img src="resources/images/A46A0121.jpg"
								class="left mr20  smallimg" alt="" /></a> <a href="#" class="dark"><b>Appartement</b></a><br />
							<span class="opensans green bold size14">$125000</span> <br /> <span
								class="grey">Yopougon-Millionnaire</span>
						</div>
						<div class="line5"></div>
						<div class="container ">
							<a href="#"><img src="resources/images/A46B0121.jpg"
								class="left mr20  smallimg" alt="" /></a> <a href="#" class="dark"><b>Appartement</b></a><br />
							<span class="opensans green bold size14">$105000</span> <br /> <span
								class="grey">Riveria</span>
						</div>
						<br />


					</div>

				</div>
			</div>



		</c:if>
	</div>
	<!-- END OF CONTENT -->

	<%@ include file="footer.jsp"%>>

	<%@ include file="java.jsp"%>
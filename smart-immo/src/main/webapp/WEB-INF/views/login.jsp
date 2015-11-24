<!DOCTYPE html>
<html>
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Travel Agency - HTML5 Booking template</title>
	
	<!-- Bootstrap -->
	<link href="resources/dist/css/bootstrap.css" rel="stylesheet" media="screen">
	<link href="resources/assets/css/custom.css" rel="stylesheet" media="screen">

	<!-- Animo css-->
	<link href="resources/plugins/animo/animate+animo.css" rel="stylesheet" media="screen">
	
	<link href="resources/examples/carousel/carousel.css" rel="stylesheet">
	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
	  <script src="resources/assets/js/html5shiv.js"></script>
	  <script src="resources/assets/js/respond.min.js"></script>
	<![endif]-->
	
	<!-- Fonts -->	
	<link href='http://fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:700,400,300,300italic' rel='stylesheet' type='text/css'>	
	<!-- Font-Awesome -->
	<link rel="stylesheet" type="text/css" href="resources/assets/css/font-awesome.css" media="screen" />
	<!--[if lt IE 7]><link rel="stylesheet" type="text/css" href="assets/css/font-awesome-ie7.css" media="screen" /><![endif]-->
	
	<!-- Load jQuery -->
	<script src="resources/assets/js/jquery.v2.0.3.js"></script>


	

  </head>
  <body>
	<!-- 100% Width & Height container  -->
	<div class="login-fullwidith">
		
		<!-- Login Wrap  -->
		<div class="login-wrap">
			<img src="resources/images/logo.png" class="login-img" alt="logo"/><br/>
			<div class="login-c1">
				<div class="cpadding50">
					<input type="text" class="form-control logpadding" placeholder="Pseudo">
					<br/>
					<input type="text" class="form-control logpadding" placeholder="Mot de passe">
				</div>
			</div>
			<div class="login-c2">
				<div class="logmargfix">
					<div class="chpadding50">
							<div class="alignbottom">
								<button class="btn-search4"  type="submit" onclick="errorMessage()">Valider</button>							
							</div>
							<div class="alignbottom2">
							  <div class="checkbox">
								<label>
								  <input type="checkbox">Se souvenir
								</label>
							  </div>
							</div>
					</div>
				</div>
			</div>
			<div class="login-c3">
				<div class="left"><a href="#" class="whitelink"><span></span>Acceuil</a></div>
				<div class="right"><a href="#" class="whitelink">Mot de passe oubli�?</a></div>
			</div>			
		</div>
		<!-- End of Login Wrap  -->
	
	</div>	
	<!-- End of Container  -->

	<!-- Javascript  -->
	<script src="resources/assets/js/initialize-loginpage.js"></script>
	<script src="resources/assets/js/jquery.easing.js"></script>
	<!-- Load Animo -->
	<script src="resources/plugins/animo/animo.js"></script>
	<script>
	function errorMessage(){
		$('.login-wrap').animo( { animation: 'tada' } );
	}
	</script>
	
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="resources/dist/js/bootstrap.min.js"></script>
  </body>
</html>
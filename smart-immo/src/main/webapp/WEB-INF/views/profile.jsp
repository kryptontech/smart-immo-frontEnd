<%@include file="head.jsp" %>
<%@include file="header.jsp" %>
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
			<div class="col-md-12 pagecontainer2 offset-0">
				
				<!-- LEFT MENU -->
				<div class="col-md-1 offset-0">
					<!-- Nav tabs -->
					<ul class="nav profile-tabs">
					 
					  <li class="active">
						  <a href="#history" data-toggle="tab" onclick="mySelectUpdate()">
						  <span class="history-icon"></span>								  
						   historiques de vos annonces
						  </a></li>
						  
					 <li>
						  <a href="#bookings" data-toggle="tab" onclick="mySelectUpdate()">
						  <span class="bookings-icon"></span>						  
						  Publier un nouveau bien
						  </a></li>
					 
					  <li>
						  <a href="#profile" data-toggle="tab" onclick="mySelectUpdate()">
						  <span class="settings-icon"></span>								  
						  Modifier vos informations
						  </a></li>
					  
					  <li>
						  <a href="#password" data-toggle="tab" onclick="mySelectUpdate()">
						  <span class="password-icon"></span>							  
						  Changer votre mot de passe
						  </a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<!-- LEFT MENU -->
					
				<!-- RIGHT CPNTENT -->
				<div class="col-md-11 offset-0">
					<!-- Tab panes from left menu -->
					<div class="tab-content5">
					
					  <!-- TAB 1 -->
					  <div class="tab-pane padding40 " id="profile">

						  <!-- Admin top -->
						 
						  <div class="col-md-4">
						  </div>
						   <div class="col-md-4 col-md-offset-4">
							<img src="resources/images/IMG_0091.jpg" alt="" class="left margright20 profile"/>
							<p class="size12 grey margtop10">
							Salut <span class="lred">Cisse</span><br/>
							<a href="#" class="lblue">Changer votre photo de profil</a>
							<a href="#" class="lrouge">Deconnexion</a>
							</p>
							<div class="clearfix"></div>
						  </div>
						  <!-- End of Admin top -->
						   </br>
						  </br>
						  </br>
						  </br>
						  </br>
						  
						<div class="clearfix"></div>
							<br/>
						
						<span class="size16 bold">Mes informations personnelles</span>
						<div class="line2"></div>
						  

						<!-- COL 1 -->
						<div class="col-md-12 offset-0">
							<table>
								<tr>
									<td>
										<div class="radio left">
										  <label>
											<input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
											Ms. 
										  </label>
										</div>
									</td>
									<td>
										<div class="radio">
										  <label>
											<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
											Mr. 
										  </label>
										</div>
									</td>
								</tr>
							</table>
							
							
							<br/>
							Name*:
							<input type="text" class="form-control" placeholder="John Doe" rel="popover" id="name" data-content="This field is mandatory" data-original-title="Here you can edit your name">
							<br/>
							Username*:
							<input type="text" class="form-control" placeholder="Jack" rel="popover" id="username" data-content="This field is mandatory" data-original-title="Here you can edit your username">						  
							<br/>
							E-mail*:
							<input type="text" class="form-control" placeholder="office@email.com" id="email" data-content="This field is mandatory" data-original-title="Edit your email address">
							<br/>
							Phone number:
							<input type="text" class="form-control" placeholder="">	
							
							<br/>
							Birth date:<br/>
							<div class="row">
								<div class="col-md-4">
									<select class="form-control mySelectBoxClass">
									  <option>12:00 AM</option>
									</select>
								</div>
								<div class="col-md-4">
									<select class="form-control mySelectBoxClass">
									  <option>12:00 AM</option>
									</select>
								</div>
								<div class="col-md-4">
									<select class="form-control mySelectBoxClass">
									  <option>12:00 AM</option>
									</select>
								</div>
							</div>


						
				
						<br/>
						<br/>						
						<span class="size16 bold">Your address</span>
						<div class="line2"></div>
						
						<br/>
						Company name:
						<input type="text" class="form-control" placeholder="">	
						
						<br/>
						Address*:
						<input type="text" class="form-control" placeholder="">							
						
						<br/>
						Zip Code*:
						<input type="text" class="form-control" placeholder="">

						<br/>
						Country*:
						<select class="form-control mySelectBoxClass">
						  <option value="">Country...</option>
							<option value="AF">Afghanistan</option>
							<option value="AL">Albania</option>
							<option value="DZ">Algeria</option>
							<option value="AS">American Samoa</option>
							<option value="AD">Andorra</option>
							<option value="AG">Angola</option>
							<option value="AI">Anguilla</option>
							<option value="AG">Antigua &amp; Barbuda</option>
							<option value="AR">Argentina</option>
							<option value="AA">Armenia</option>
							<option value="AW">Aruba</option>
							<option value="AU">Australia</option>
							<option value="AT">Austria</option>
							<option value="AZ">Azerbaijan</option>
							<option value="BS">Bahamas</option>
							<option value="BH">Bahrain</option>
							<option value="BD">Bangladesh</option>
							<option value="BB">Barbados</option>
							<option value="BY">Belarus</option>
							<option value="BE">Belgium</option>
							<option value="BZ">Belize</option>
							<option value="BJ">Benin</option>
							<option value="BM">Bermuda</option>
							<option value="BT">Bhutan</option>
							<option value="BO">Bolivia</option>
							<option value="BL">Bonaire</option>
							<option value="BA">Bosnia &amp; Herzegovina</option>
							<option value="BW">Botswana</option>
							<option value="BR">Brazil</option>
							<option value="BC">British Indian Ocean Ter</option>
							<option value="BN">Brunei</option>
							<option value="BG">Bulgaria</option>
							<option value="BF">Burkina Faso</option>
							<option value="BI">Burundi</option>
							<option value="KH">Cambodia</option>
							<option value="CM">Cameroon</option>
							<option value="CA">Canada</option>
							<option value="IC">Canary Islands</option>
							<option value="CV">Cape Verde</option>
							<option value="KY">Cayman Islands</option>
							<option value="CF">Central African Republic</option>
							<option value="TD">Chad</option>
							<option value="CD">Channel Islands</option>
							<option value="CL">Chile</option>
							<option value="CN">China</option>
							<option value="CI">Christmas Island</option>
							<option value="CS">Cocos Island</option>
							<option value="CO">Colombia</option>
							<option value="CC">Comoros</option>
							<option value="CG">Congo</option>
							<option value="CK">Cook Islands</option>
							<option value="CR">Costa Rica</option>
							<option value="CT">Cote D'Ivoire</option>
							<option value="HR">Croatia</option>
							<option value="CU">Cuba</option>
							<option value="CB">Curacao</option>
							<option value="CY">Cyprus</option>
							<option value="CZ">Czech Republic</option>
							<option value="DK">Denmark</option>
							<option value="DJ">Djibouti</option>
							<option value="DM">Dominica</option>
							<option value="DO">Dominican Republic</option>
							<option value="TM">East Timor</option>
							<option value="EC">Ecuador</option>
							<option value="EG">Egypt</option>
							<option value="SV">El Salvador</option>
							<option value="GQ">Equatorial Guinea</option>
							<option value="ER">Eritrea</option>
							<option value="EE">Estonia</option>
							<option value="ET">Ethiopia</option>
							<option value="FA">Falkland Islands</option>
							<option value="FO">Faroe Islands</option>
							<option value="FJ">Fiji</option>
							<option value="FI">Finland</option>
							<option value="FR">France</option>
							<option value="GF">French Guiana</option>
							<option value="PF">French Polynesia</option>
							<option value="FS">French Southern Ter</option>
							<option value="GA">Gabon</option>
							<option value="GM">Gambia</option>
							<option value="GE">Georgia</option>
							<option value="DE">Germany</option>
							<option value="GH">Ghana</option>
							<option value="GI">Gibraltar</option>
							<option value="GB">Great Britain</option>
							<option value="GR">Greece</option>
							<option value="GL">Greenland</option>
							<option value="GD">Grenada</option>
							<option value="GP">Guadeloupe</option>
							<option value="GU">Guam</option>
							<option value="GT">Guatemala</option>
							<option value="GN">Guinea</option>
							<option value="GY">Guyana</option>
							<option value="HT">Haiti</option>
							<option value="HW">Hawaii</option>
							<option value="HN">Honduras</option>
							<option value="HK">Hong Kong</option>
							<option value="HU">Hungary</option>
							<option value="IS">Iceland</option>
							<option value="IN">India</option>
							<option value="ID">Indonesia</option>
							<option value="IA">Iran</option>
							<option value="IQ">Iraq</option>
							<option value="IR">Ireland</option>
							<option value="IM">Isle of Man</option>
							<option value="IL">Israel</option>
							<option value="IT">Italy</option>
							<option value="JM">Jamaica</option>
							<option value="JP">Japan</option>
							<option value="JO">Jordan</option>
							<option value="KZ">Kazakhstan</option>
							<option value="KE">Kenya</option>
							<option value="KI">Kiribati</option>
							<option value="NK">Korea North</option>
							<option value="KS">Korea South</option>
							<option value="KW">Kuwait</option>
							<option value="KG">Kyrgyzstan</option>
							<option value="LA">Laos</option>
							<option value="LV">Latvia</option>
							<option value="LB">Lebanon</option>
							<option value="LS">Lesotho</option>
							<option value="LR">Liberia</option>
							<option value="LY">Libya</option>
							<option value="LI">Liechtenstein</option>
							<option value="LT">Lithuania</option>
							<option value="LU">Luxembourg</option>
							<option value="MO">Macau</option>
							<option value="MK">Macedonia</option>
							<option value="MG">Madagascar</option>
							<option value="MY">Malaysia</option>
							<option value="MW">Malawi</option>
							<option value="MV">Maldives</option>
							<option value="ML">Mali</option>
							<option value="MT">Malta</option>
							<option value="MH">Marshall Islands</option>
							<option value="MQ">Martinique</option>
							<option value="MR">Mauritania</option>
							<option value="MU">Mauritius</option>
							<option value="ME">Mayotte</option>
							<option value="MX">Mexico</option>
							<option value="MI">Midway Islands</option>
							<option value="MD">Moldova</option>
							<option value="MC">Monaco</option>
							<option value="MN">Mongolia</option>
							<option value="MS">Montserrat</option>
							<option value="MA">Morocco</option>
							<option value="MZ">Mozambique</option>
							<option value="MM">Myanmar</option>
							<option value="NA">Nambia</option>
							<option value="NU">Nauru</option>
							<option value="NP">Nepal</option>
							<option value="AN">Netherland Antilles</option>
							<option value="NL">Netherlands (Holland, Europe)</option>
							<option value="NV">Nevis</option>
							<option value="NC">New Caledonia</option>
							<option value="NZ">New Zealand</option>
							<option value="NI">Nicaragua</option>
							<option value="NE">Niger</option>
							<option value="NG">Nigeria</option>
							<option value="NW">Niue</option>
							<option value="NF">Norfolk Island</option>
							<option value="NO">Norway</option>
							<option value="OM">Oman</option>
							<option value="PK">Pakistan</option>
							<option value="PW">Palau Island</option>
							<option value="PS">Palestine</option>
							<option value="PA">Panama</option>
							<option value="PG">Papua New Guinea</option>
							<option value="PY">Paraguay</option>
							<option value="PE">Peru</option>
							<option value="PH">Philippines</option>
							<option value="PO">Pitcairn Island</option>
							<option value="PL">Poland</option>
							<option value="PT">Portugal</option>
							<option value="PR">Puerto Rico</option>
							<option value="QA">Qatar</option>
							<option value="ME">Republic of Montenegro</option>
							<option value="RS">Republic of Serbia</option>
							<option value="RE">Reunion</option>
							<option value="RO">Romania</option>
							<option value="RU">Russia</option>
							<option value="RW">Rwanda</option>
							<option value="NT">St Barthelemy</option>
							<option value="EU">St Eustatius</option>
							<option value="HE">St Helena</option>
							<option value="KN">St Kitts-Nevis</option>
							<option value="LC">St Lucia</option>
							<option value="MB">St Maarten</option>
							<option value="PM">St Pierre &amp; Miquelon</option>
							<option value="VC">St Vincent &amp; Grenadines</option>
							<option value="SP">Saipan</option>
							<option value="SO">Samoa</option>
							<option value="AS">Samoa American</option>
							<option value="SM">San Marino</option>
							<option value="ST">Sao Tome &amp; Principe</option>
							<option value="SA">Saudi Arabia</option>
							<option value="SN">Senegal</option>
							<option value="RS">Serbia</option>
							<option value="SC">Seychelles</option>
							<option value="SL">Sierra Leone</option>
							<option value="SG">Singapore</option>
							<option value="SK">Slovakia</option>
							<option value="SI">Slovenia</option>
							<option value="SB">Solomon Islands</option>
							<option value="OI">Somalia</option>
							<option value="ZA">South Africa</option>
							<option value="ES">Spain</option>
							<option value="LK">Sri Lanka</option>
							<option value="SD">Sudan</option>
							<option value="SR">Suriname</option>
							<option value="SZ">Swaziland</option>
							<option value="SE">Sweden</option>
							<option value="CH">Switzerland</option>
							<option value="SY">Syria</option>
							<option value="TA">Tahiti</option>
							<option value="TW">Taiwan</option>
							<option value="TJ">Tajikistan</option>
							<option value="TZ">Tanzania</option>
							<option value="TH">Thailand</option>
							<option value="TG">Togo</option>
							<option value="TK">Tokelau</option>
							<option value="TO">Tonga</option>
							<option value="TT">Trinidad &amp; Tobago</option>
							<option value="TN">Tunisia</option>
							<option value="TR">Turkey</option>
							<option value="TU">Turkmenistan</option>
							<option value="TC">Turks &amp; Caicos Is</option>
							<option value="TV">Tuvalu</option>
							<option value="UG">Uganda</option>
							<option value="UA">Ukraine</option>
							<option value="AE">United Arab Emirates</option>
							<option value="GB">United Kingdom</option>
							<option value="US">United States of America</option>
							<option value="UY">Uruguay</option>
							<option value="UZ">Uzbekistan</option>
							<option value="VU">Vanuatu</option>
							<option value="VS">Vatican City State</option>
							<option value="VE">Venezuela</option>
							<option value="VN">Vietnam</option>
							<option value="VB">Virgin Islands (Brit)</option>
							<option value="VA">Virgin Islands (USA)</option>
							<option value="WK">Wake Island</option>
							<option value="WF">Wallis &amp; Futana Is</option>
							<option value="YE">Yemen</option>
							<option value="ZR">Zaire</option>
							<option value="ZM">Zambia</option>
							<option value="ZW">Zimbabwe</option>
						</select>
						
						<br/><br/>
						City*:
						<input type="text" class="form-control" placeholder="ex: London">

						<br/>
						Region/State*:
						<input type="text" class="form-control" placeholder="">

					    <button type="submit" class="bluebtn margtop20">Update</button>	
						</div>
						<!-- END OF COL 1 -->
						
						<div class="clearfix"></div><br/><br/><br/>
						
						
						<div class="row">
							<div class="col-md-4 grey">
								<span class="size16 bold dark">Personal details</span>
								<div class="line2"></div>
								<a href="#" class="clblue">New York Marriott Marquis</a> from <span class="bold green">$150</span><br/>
								<a href="#" class="clblue">The Jade Hotel</a> from <span class="bold green">$49</span><br/>
								<a href="#">See all</a>
							</div>
							<div class="col-md-4">
								<span class="size16 bold dark">Wish lists</span>
								<div class="line2"></div>
								<a href="#" class="clblue">Incredible places</a> (1)<br/>
								<a href="#" class="clblue">My next places</a> (0)<br/>
								<a href="#">+ Add new category</a>							
							</div>						
							<div class="col-md-4">
								<span class="size16 bold dark">Your past bookings</span>
								<div class="line2"></div>				
								<a href="#" class="clblue">Solita Soho Hotel</a> from <span class="bold green">$150</span><br/>
								<a href="#" class="clblue">Helmsley Park Lane Hotel</a> from <span class="bold green">$49</span><br/>
								<a href="#">See all</a>							
							</div>			
						</div>
						
						
						
						
						
					  </div>
					  <!-- END OF TAB 1 -->	
					  
					  <!-- TAB 2 -->					  
					  <div class="tab-pane"id="bookings">
						<div class="padding40">
								<div class="col-md-4 col-md-offset-8">
									<img src="resources/images/IMG_0091.jpg" alt="" class="left margright20 profile"/>
									<p class="size12 grey margtop10">
										Salut <span class="lred">Cisse</span><br/>
										<a href="#" class="lblue">Changer votre photo de profil</a>
										<a href="#" class="lrouge">Deconnexion</a>
									</p>
								</div>
							
						  <!-- End of Admin top -->
						   </br>
						  </br>
						  </br>
						  </br>
						  </br>
						  
						<div class="clearfix"></div>
							<br/>
							
							<div class="relative margtop10">
							<ul class="nav nav-tabs myTab2pos" id="myTab2">
								<li onclick="mySelectUpdate()" class="active"><a data-toggle="tab" href="#airtab3"><span class="hidetext">Type d'offre</span>&nbsp;</a></li>
								<li onclick="mySelectUpdate()" class=""><a data-toggle="tab" href="#hoteltab3"><span class="hidetext">Description du bien</span>&nbsp;</a></li>
								<!--
									<li onclick="mySelectUpdate()" class=""><a data-toggle="tab" href="#vacationstab3"><span class="suitcasetab3"></span><span class="hidetext">Vacations</span>&nbsp;</a></li>
								-->
								</ul>
						
							<div class="tab-content6">
							
								<!-- Tab airtab3 -->
								<div class="tab-pane row active" id="airtab3">
									<form class="form-inline col-lg-12">
									  <div class="row">
										<div class="form-group col-lg-6">
											<span class="opensans" for="typ01"><b>Mettre un bien en location</b></span>
											<input type="radio" class="radio" name="id_typeoffre" value="1" id="typ01">
										</div>
										<div class="form-group  col-lg-6">
											<span class="opensans" for="typ02"><b>Mettre un bien en vente</b></span>
											<input type="radio" class="radio" name="id_typeoffre" value="2" id="typ02">
										</div>
									   </div>
										<div class="row">
										 <button type="submit" class="btn-search4 right mr30">suivant</button>
									   </div>
									
									</form>
									
								</div>
								<!-- End of Tab airtab3 -->
								
								<!-- Tab hoteltab3 -->
								<div class="tab-pane  row" id="hoteltab3">
									<form class="form-horizontal col-lg-12">
									   <div class="row">
											<div class="form-group">
												<label class="col-lg-3">Titre du bien:</label>
												<div class="col-lg-8">
													<input type="text" class="form-control" placeholder="donner un titre clair à votre bien"/>
												</div>
											</div>
									   </div>
									  
									    <div class="row">
											<div class="form-group">
												<label class="col-lg-3">Ville:</label>
												<div class="col-lg-8">
													<select class="form-control">
														<option>Ville1</option>
														<option>Ville2</option>
														<option>Ville3</option>
													</select>
												</div>
											</div>
									   </div>
									   
									   <div class="row">
											<div class="form-group">
												<label class="col-lg-3">Commune:</label>
												<div class="col-lg-8">
													<select class="form-control">
														<option>Commune1</option>
														<option>Commune2</option>
														<option>Commune3</option>
													</select>
												</div>
											</div>
									   </div>
									    <div class="row">
											<div class="form-group">
												<label class="col-lg-3">Quartier:</label>
												<div class="col-lg-8">
													<input  type="text"class="form-control">
												</div>
											</div>
									   </div>
									    <div class="row">
											<div class="form-group">
												<label class="col-lg-3">Categorie du bien:</label>
												<div class="col-lg-8">
													<select class="form-control">
														<option>Que proposez-vous?</option>
														<option>Appartement</option>
														<option>Terrain</option>
													</select>
												</div>
											</div>
									   </div>
									    <div class="row">
											<div class="form-group">
												<label class="col-lg-3">Sous Categorie du bien:</label>
												<div class="col-lg-8">
													<select class="form-control">
														<option>Faites un choix</option>
														<option>Appartement</option>
														<option>Terrain</option>
													</select>
												</div>
											</div>
									   </div>
									   <div class="row">
											<div class="form-group">
											 <label class="col-lg-3">Superficie:</label>
											 <div class="input-group col-lg-4">
												<input type="text" class="form-control">
												<span class="input-group-addon">m2</span>
											</div>
											</div>
									   </div>
									   <div class="row">
											<div class="form-group">
											 <label class="col-lg-3">nombre de pieces</label>
											 <div class="col-lg-4">
											 	<input type="number" class="form-control" />
											</div>
											</div>
									   </div>
									   
									   <div class="row">
											<div class="form-group">
											 <label class="col-lg-3">Entrer une description pour votre bien:</label>
											 <div class="col-lg-8">
											 	<textarea name="ameliorer"  class="form-control" id="ameliorer"></textarea>
											</div>
											</div>
									   </div>
											<div class="form-group">
											  <label>Ajouter des photos:</label>
											  <div class="col-lg-12">
											    	 <div class="col-lg-2">
											        	<img src="" alt="Choisir une photo">
											         </div>
													 <div class="col-lg-2">
														<img src="" alt="Choisir une photo">
											         </div>
													 <div class="col-lg-2">
											        	<img src="" alt="Choisir une photo">
											         </div>
													 <div class="col-lg-2">
											        	<img src="" alt="Choisir une photo">
											         </div>
													 <div class="col-lg-2">
											        	<img src="" alt="Choisir une photo">
											         </div>
													 <div class="col-lg-2">
											        	<img src="" alt="Choisir une photo">
											         </div>
											  </div>
											</div>
										<div class="cstyle02 row">
										 <button type="submit" class="btn-search4 right mr30">Continuer</button>
									   </div>
									</form>
								<!-- End of Tab hoteltab3 -->							
								</div>
							</div>
						</div>
						  
						
						
						</div>
					  </div>
					  <!-- END OF TAB 2 -->	
					  
					  <!-- TAB 3 -->					  
					  <div class="tab-pane active" id="history">
						<div class="padding40">	
								<div class="col-md-4 col-md-offset-8">
									<img src="resources/images/IMG_0091.jpg" alt="" class="left margright20 profile"/>
									<p class="size12 grey margtop10">
										Salut <span class="lred">Cisse</span><br/>
										<a href="#" class="lblue">Changer votre photo de profil</a>
										<a href="#" class="lrouge">Deconnexion</a>
									</p>
								</div>
							
						  <!-- End of Admin top -->
						  </br>
						  </br>
						  </br>
						  </br>
						  </br>
						  
						<div class="clearfix"></div>
							<br/>
							
							<div class="col-md-3 bold">Type bien</div>
							<div class="col-md-3 bold">Type Offre</div>
							<div class="col-md-2 bold">Lieux</div>
							<div class="col-md-2 bold">Date</div>
							<div class="col-md-2 bold">Action</div>
							<div class="clearfix"></div>
							<div class="line4"></div>
							
							<div class="col-md-3">XXXXX</div>
							<div class="col-md-3">Grece - Zakynthos</div>
							<div class="col-md-2">XXXX</div>
							<div class="col-md-2">XXXl</div>
							<div class="col-md-2 textright">
							<div class="row">
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span> </button></div>
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-remove"></span> </button></div>
							</div>
							</div><div class="clearfix"></div>
							
							<div class="line4"></div>
							<div class="col-md-3">XXXX</div>
							<div class="col-md-3">Spain - Malaga</div>
							<div class="col-md-2">XXXX</div>
							<div class="col-md-2">17.07.10</div>
							<div class="col-md-2">
							<div class="row">
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span> </button></div>
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-remove"></span> </button></div>
							</div>
							</div>
							<div class="clearfix"></div>
							
							<div class="line4"></div>
							<div class="col-md-3">XXXX</div>
							<div class="col-md-3">Spain - Malaga</div>
							<div class="col-md-2">XXXX</div>
							<div class="col-md-2">17.07.10</div>
							<div class="col-md-2">
							<div class="row">
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span> </button></div>
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-remove"></span> </button></div>
							</div>
							</div><div class="clearfix"></div>
							
							<div class="line4"></div>
							<div class="col-md-3">XXXX</div>
							<div class="col-md-3">Spain - Malaga</div>
							<div class="col-md-2">XXXX</div>
							<div class="col-md-2">17.07.10</div>
							<div class="col-md-2">
							<div class="row">
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span> </button></div>
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-remove"></span> </button></div>
							</div>
							</div><div class="clearfix"></div>
							
							<div class="line4"></div>
							<div class="col-md-3">XXXX</div>
							<div class="col-md-3">Spain - Malaga</div>
							<div class="col-md-2">XXXX</div>
							<div class="col-md-2">17.07.10</div>
							<div class="col-md-2">
							<div class="row">
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span> </button></div>
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-remove"></span> </button></div>
							</div>
							</div><div class="clearfix"></div>
							
							<div class="line4"></div>
							<div class="col-md-3">XXXX</div>
							<div class="col-md-3">Spain - Malaga</div>
							<div class="col-md-2">XXXX</div>
							<div class="col-md-2">17.07.10</div>
							<div class="col-md-2">
							<div class="row">
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-plus"></span> </button></div>
							<div class="col-md-5"><button type="submit" class="btn-search5"><span class="glyphicon glyphicon-remove"></span> </button></div>
							</div>
							</div><div class="clearfix"></div>
							
						</div>
					  </div>
					  <!-- END OF TAB 3 -->	
					  
					  <!-- TAB 4 -->					  
					  <div class="tab-pane" id="password">
						<div class="padding40">
								<div class="col-md-4 col-md-offset-8">
									<img src="resources/images/IMG_0091.jpg" alt="" class="left margright20 profile"/>
									<p class="size12 grey margtop10">
										Salut <span class="lred">Cisse</span><br/>
										<a href="#" class="lblue">Changer votre photo de profil</a>
										<a href="#" class="lrouge">Deconnexion</a>
									</p>
								</div>
							
						  <!-- End of Admin top -->
						   </br>
						  </br>
						  </br>
						  </br>
						  </br>
						  
						<div class="clearfix"></div>
							<br/>
							
							<span class="dark size18">Changer votre mot de passe</span>
							<div class="line4"></div>
							
							Pseudo<br/>
							<input type="text" class="form-control " placeholder="">
							<br/>
							Mot de passe actuel<br/>
							<input type="text" class="form-control " placeholder="">
							<br/>
							Nouveau mot de passe<br/>
							<input type="text" class="form-control " placeholder="">
							<br/>
							<span class="dark size18">Security</span>
							<div class="line4"></div>
							
							What is your father's middle name?
							<input type="password" class="form-control " placeholder="●●●●●●●●●">
							
							<br/>
							Please choose a security question<br/>
							<select class="form-control mySelectBoxClass hasCustomSelect cpwidth3">
							  <option value="">What is your father's middle name?</option>
							  <option value="">What was the name of your first pet</option>
							  <option value="">What was your first telephone number</option>
							</select>
							
							<br/>
							<br/>
							Please enter an answer<br/>
							<input type="text" class="form-control " placeholder="">
							
							<br/>
							 Please confirm your answer<br/>
							<input type="text" class="form-control " placeholder="">
							<br/>
							<button type="submit" class="btn-search5">Save changes</button>
							
							
						</div>
					  </div>
					  <!-- END OF TAB 4 -->	
			
					  
					</div>
					<!-- End of Tab panes from left menu -->	
					
				</div>
				<!-- END OF RIGHT CPNTENT -->
			
			<div class="clearfix"></div><br/><br/>
			</div>
			<!-- END CONTENT -->			
			

			
		</div>
		
		
	</div>
	<!-- END OF CONTENT -->

<%@include file="footer.jsp" %>	
<%@include file="java.jsp"%>
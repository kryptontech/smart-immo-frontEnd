<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ include file ="head.jsp" %>

  <body id="top">
    
	<%@ include file="header.jsp" %>

	<!--
	#################################
		- THEMEPUNCH BANNER -
	#################################
	-->
	<div id="dajy" class="fullscreen-container mtslide sliderbg fixed">
			<div class="fullscreenbanner">
				<ul>

					<!-- papercut fade turnoff flyin slideright slideleft slideup slidedown-->
				
				
					<!-- FADE -->
					<li data-transition="fade" data-slotamount="1" data-masterspeed="300"> 										
						
						<img src="resources/images/slider/slide1.jpg" alt=""/>
						<div class="tp-caption scrolleffect sft"
							 data-x="center"
							 data-y="120"
							 data-speed="1000"
							 data-start="800"
							 data-easing="easeOutExpo"  >
						</div>	
					</li>	
					
					<!-- FADE -->
					<li data-transition="fade" data-slotamount="1" data-masterspeed="300"> 										
						<img src="resources/images/slider/slide2.jpg" alt=""/>
						<div class="tp-caption scrolleffect sft"
							 data-x="center"
							 data-y="120"
							 data-speed="1000"
							 data-start="800"
							 data-easing="easeOutExpo">
						</div>	
					</li>	
				
					<!-- FADE -->
					<li data-transition="fade" data-slotamount="1" data-masterspeed="300"> 										
						<img src="resources/images/slider/slide3.jpg" alt=""/>
						<div class="tp-caption scrolleffect sft"
							 data-x="center"
							 data-y="120"
							 data-speed="1000"
							 data-start="800"
							 data-easing="easeOutExpo">
						</div>	
					</li>


				</ul>
				<div class="tp-bannertimer none"></div>
			</div>
		</div>

		<!--
		##############################
		 - ACTIVATE THE BANNER HERE -
		##############################
		-->
		<script type="text/javascript">

			var tpj=jQuery;
			tpj.noConflict();

			tpj(document).ready(function() {

			if (tpj.fn.cssOriginal!=undefined)
				tpj.fn.css = tpj.fn.cssOriginal;

				tpj('.fullscreenbanner').revolution(
					{
						delay:9000,
						startwidth:1170,
						startheight:600,

						onHoverStop:"on",						// Stop Banner Timet at Hover on Slide on/off

						thumbWidth:100,							// Thumb With and Height and Amount (only if navigation Tyope set to thumb !)
						thumbHeight:50,
						thumbAmount:3,

						hideThumbs:0,
						navigationType:"bullet",				// bullet, thumb, none
						navigationArrows:"solo",				// nexttobullets, solo (old name verticalcentered), none

						navigationStyle:false,				// round,square,navbar,round-old,square-old,navbar-old, or any from the list in the docu (choose between 50+ different item), custom


						navigationHAlign:"left",				// Vertical Align top,center,bottom
						navigationVAlign:"bottom",					// Horizontal Align left,center,right
						navigationHOffset:30,
						navigationVOffset:30,

						soloArrowLeftHalign:"left",
						soloArrowLeftValign:"center",
						soloArrowLeftHOffset:20,
						soloArrowLeftVOffset:0,

						soloArrowRightHalign:"right",
						soloArrowRightValign:"center",
						soloArrowRightHOffset:20,
						soloArrowRightVOffset:0,

						touchenabled:"on",						// Enable Swipe Function : on/off


						stopAtSlide:-1,							// Stop Timer if Slide "x" has been Reached. If stopAfterLoops set to 0, then it stops already in the first Loop at slide X which defined. -1 means do not stop at any slide. stopAfterLoops has no sinn in this case.
						stopAfterLoops:-1,						// Stop Timer if All slides has been played "x" times. IT will stop at THe slide which is defined via stopAtSlide:x, if set to -1 slide never stop automatic

						hideCaptionAtLimit:0,					// It Defines if a caption should be shown under a Screen Resolution ( Basod on The Width of Browser)
						hideAllCaptionAtLilmit:0,				// Hide all The Captions if Width of Browser is less then this value
						hideSliderAtLimit:0,					// Hide the whole slider, and stop also functions if Width of Browser is less than this value


						fullWidth:"on",							// Same time only Enable FullScreen of FullWidth !!
						fullScreen:"off",						// Same time only Enable FullScreen of FullWidth !!


						shadow:0								//0 = no Shadow, 1,2,3 = 3 Different Art of Shadows -  (No Shadow in Fullwidth Version !)

					});


		});
		</script>
		

		

		<!-- WRAP -->
	<div class="wrap cstyle03">
		
		<div class="container mt-130 z-index100">		
		  <div class="row">
			<div class="col-md-12">
				<div class="bs-example bs-example-tabs cstyle04">
				
					<ul class="nav nav-tabs myTab2pos" id="myTab2">
								<li onclick="mySelectUpdate()" class="active"><a data-toggle="tab" href="#airtab3"><span class="hidetext">Acheter</span>&nbsp;</a></li>
								<li onclick="mySelectUpdate()" class=""><a data-toggle="tab" href="#hoteltab3"><span class="hidetext">Louer</span>&nbsp;</a></li>
								<!--
									<li onclick="mySelectUpdate()" class=""><a data-toggle="tab" href="#vacationstab3"><span class="suitcasetab3"></span><span class="hidetext">Vacations</span>&nbsp;</a></li>
								-->
								</ul>
						
							<div class="tab-content2">
							
								<!-- Tab airtab3 -->
								<div class="tab-pane  active" id="airtab3">
								
									<f:form method="post" modelAttribute="formSearch" class="form-inline col-lg-12">
								<div class="form-group col-lg-2">
									<span class="opensans size13"><b>VILLE</b><br><br></span>
									<f:input type="text" path="ville" id="ville" class="form-control" style="text-align:left" placeholder="la ville" />
									<div class="has-error">
                        				<f:errors path="ville" class="help-inline"/>
                  				    </div>
								</div>	
								
								<div class="form-group col-lg-3">
									<span class="opensans size13"><b>QUARTIER</b><br><br></span>
									<div class="input-group">
										<f:input path="quartierBien" id="quartierBien" type="text" class="form-control" style="text-align:left" placeholder="le quartier" />
									</div>
									<div class="has-error">
                        				<f:errors path="quartierBien" class="help-inline"/>
                  				    </div>
								</div>
								
								<div class="form-group col-lg-3">
									<span class="opensans size13"><b>TYPE DE BIEN</b><br><br></span>
									<f:select path="souscategorie" items="${listSousCategorie}" class="form-control ">
                                    </f:select>
                                    <div class="has-error">
                        				<f:errors path="souscategorie" class="help-inline"/>
                  				    </div>
								</div>	
								
								<div class="form-group col-lg-2">
									<span class="opensans size13"><b>PRIX MINIMUM</b><br><br></span>
									<div class="input-group">
										<f:input path="prixBien" type="text" class="form-control" style="text-align:left" placeholder="prix min" />
										<span class="input-group-addon">Fcfa</span>
										<div class="has-error">
                        				<f:errors path="prixBien" class="help-inline"/>
                  				    </div>
									</div>
								</div>
								
								<div class="form-group col-lg-2">
									<span class="opensans size13"><b>PRIX MAXIMUM</b><br><br></span>
									<div class="input-group">
										<f:input type="text" path="prixBien" class="form-control" style="text-align:left" placeholder="prix max" />
										<span class="input-group-addon">Fcfa</span>
									<div class="has-error">
                        				<f:errors path="prixBien" class="help-inline"/>
                  				    </div>
									</div>
								</div>	
									<h2 class="left ca01">Mieux chercher, Mieux trouver</h2>
									<button type="search" class="btn-search right mr30">Chercher</button>
							</f:form>
								</div>
								<!-- End of Tab airtab3 -->
								
								<!-- Tab hoteltab3 -->
								<div class="tab-pane " id="hoteltab3">
							<f:form method="post" modelAttribute="formSearch" class="form-inline col-lg-12">
								<div class="form-group col-lg-2">
									<span class="opensans size13"><b>VILLE</b><br><br></span>
									<f:input type="text" path="ville" id="ville" class="form-control" style="text-align:left" placeholder="la ville" />
									<div class="has-error">
                        				<f:errors path="ville" class="help-inline"/>
                  				    </div>
								</div>	
								
								<div class="form-group col-lg-3">
									<span class="opensans size13"><b>QUARTIER</b><br><br></span>
									<div class="input-group">
										<f:input path="quartierBien" id="quartierBien" type="text" class="form-control" style="text-align:left" placeholder="le quartier" />
									</div>
									<div class="has-error">
                        				<f:errors path="quartierBien" class="help-inline"/>
                  				    </div>
								</div>
								
								<div class="form-group col-lg-3">
									<span class="opensans size13"><b>TYPE DE BIEN</b><br><br></span>
									<f:select path="souscategorie" items="${listSousCategorie}" class="form-control">
                                    </f:select>
                                    <div class="has-error">
                        				<f:errors path="souscategorie" class="help-inline"/>
                  				    </div>
								</div>	
								
								<div class="form-group col-lg-2">
									<span class="opensans size13"><b>PRIX MINIMUM</b><br><br></span>
									<div class="input-group">
										<f:input path="prixBien" type="text" class="form-control" style="text-align:left" placeholder="prix min" />
										<span class="input-group-addon">Fcfa</span>
										<div class="has-error">
                        				<f:errors path="prixBien" class="help-inline"/>
                  				    </div>
									</div>
								</div>
								
								<div class="form-group col-lg-2">
									<span class="opensans size13"><b>PRIX MAXIMUM</b><br><br></span>
									<div class="input-group">
										<f:input type="text" path="prixBien" class="form-control" style="text-align:left" placeholder="prix max" />
										<span class="input-group-addon">Fcfa</span>
									<div class="has-error">
                        				<f:errors path="prixBien" class="help-inline"/>
                  				    </div>
									</div>
								</div>
									<h2 class="left ca01">Mieux chercher, Mieux trouver</h2>
									<button type="search" class="btn-search right mr30">Chercher</button>
							</f:form>							
						</div>
					
					</div>
					
					<%-- <div class="searchbg2">
						<h2 class="left ca01">Mieux chercher, Mieux trouver</h2>
						<form action="list4.html">
							<button type="search" class="btn-search right mr30">Chercher</button>
						</form>
					</div> --%>
						
				</div>
			
			</div>
			
		  </div>
		</div>
					<!---------- Start liste bien---------------->
		<div class="container">
		<div class="container pagecontainer offset-0">	
		<!--NE PAS SUPPRIMER POURRA SERVIR PROCHE
			FILTERS
			
			<div class="col-md-3 filters offset-0">

				
				TOP TIP
				<div class="filtertip">
					<div class="padding20">
						<p class="size13"><span class="size18 bold counthotel">53</span> Hotels starting at</p>
						<p class="size30 bold">$<span class="countprice"></span></p>
						<p class="size13">Narrow results or <a href="#">view all</a></p>
					</div>
					<div class="tip-arrow"></div>
				</div>
				
	
				<div class="bookfilters hpadding20">
					
						<div class="w50percent">
							<div class="radio">
							  <label>
								<input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
								<span class="hotel-ico"></span> Hotels
							  </label>
							</div>
							<div class="radio">
							  <label>
								<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
								<span class="flight-ico"></span> Flights
							  </label>
							</div>
							<div class="radio">
							  <label>
								<input type="radio" name="optionsRadios" id="optionsRadios3" value="option3">
								<span class="suitcase-ico"></span> Vacations
							  </label>
							</div>
							<div class="radio">
							  <label>
								<input type="radio" name="optionsRadios" id="optionsRadios4" value="option4">
								<span class="car-ico"></span> Cars
							  </label>
							</div>
							<div class="radio">
							  <label>
								<input type="radio" name="optionsRadios" id="optionsRadios5" value="option5">
								<span class="cruise-ico"></span>Cruises
							  </label>
							</div>
						</div>
						
						<div class="w50percentlast">
							<p class="cstyle08">Packages:</p>
							<div class="radio">
							  <label>
								<input type="radio" name="optionsRadios" id="optionsRadios6" value="option6">
								Flight+Hotel+Car
							  </label>
							</div>
							<div class="radio">
							  <label>
								<input type="radio" name="optionsRadios" id="optionsRadios7" value="option7">
								Flight+Hotel
							  </label>
							</div>
							<div class="radio">
							  <label>
								<input type="radio" name="optionsRadios" id="optionsRadios8" value="option8">
								Flight+Car
							  </label>
							</div>
							<div class="radio">
							  <label>
								<input type="radio" name="optionsRadios" id="optionsRadios9" value="option9">
								Hotel+Car
							  </label>
							</div>
						</div>	
						
						<div class="clearfix"></div><br/>
						
						HOTELS TAB
						<div class="hotelstab2 none">
							<span class="opensans size13">Where do you want to go?</span>
							<input type="text" class="form-control" placeholder="Greece">
							
							<div class="clearfix pbottom15"></div>
							
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Check in date</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker" placeholder="mm/dd/yyyy"/>
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">Check in date</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker2" placeholder="mm/dd/yyyy"/>
								</div>
							</div>
							
							<div class="clearfix pbottom15"></div>
							
							<div class="room1" >
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 1</b></span><br/>
										
										<div class="addroom1 block"><a onclick="addroom2()" class="grey cpointer">+ Add room</a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right ohidden">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option>1</option>
												  <option selected>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right ohidden">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option>0</option>
												  <option selected>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div>
							
							<div class="room2 none">
								<div class="clearfix"></div><div class="line1"></div>
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 2</b></span><br/>
										<div class="addroom2 block grey"><a onclick="addroom3()" class="grey cpointer">+ Add room</a> | <a onclick="removeroom2()" class="orange cpointer"><img src="images/delete.png" alt="delete"/></a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option>1</option>
												  <option>2</option>
												  <option selected>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>0</option>
												  <option>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div>		

							<div class="room3 none">
								<div class="clearfix"></div><div class="line1"></div>
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 3</b></span><br/>
										<div class="addroom3 block grey"><a onclick="addroom3()" class="grey cpointer">+ Add room</a> | <a onclick="removeroom3()" class="orange cpointer"><img src="images/delete.png" alt="delete"/></a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>0</option>
												  <option>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div><div class="clearfix"></div>
							<button type="submit" class="btn-search3">Search</button>
						</div>
						END OF HOTELS TAB
						
						FLIGHTS TAB 
						<div class="flightstab2 none">
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Flying from</span>
									<input type="text" class="form-control" placeholder="City or airport">
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">To</span>
									<input type="text" class="form-control" placeholder="City or airport">
								</div>
							</div>
							
							
							<div class="clearfix pbottom15"></div>
							
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Departing</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker3" placeholder="mm/dd/yyyy"/>
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">Returning</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker4" placeholder="mm/dd/yyyy"/>
								</div>
							</div>
							
							<div class="clearfix pbottom15"></div>
							
							<div class="room1" >
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13">Adult</span>
										<select class="form-control mySelectBoxClass">
										  <option>1</option>
										  <option selected>2</option>
										  <option>3</option>
										  <option>4</option>
										  <option>5</option>
										</select>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<span class="opensans size13">Child</span>
										<select class="form-control mySelectBoxClass">
										  <option>0</option>
										  <option selected>1</option>
										  <option>2</option>
										  <option>3</option>
										  <option>4</option>
										  <option>5</option>
										</select>
									</div>
								</div>
							</div><div class="clearfix"></div>
							<button type="submit" class="btn-search3">Search</button>
						</div>
						 END OF FLIGHTS TAB 
						
						VACATIONS TAB
						<div class="vacationstab2 none">
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Flying from</span>
									<input type="text" class="form-control" placeholder="City or airport">
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13"><b>To</b></span>
									<input type="text" class="form-control" placeholder="City or airport">
								</div>
							</div>
							
							<div class="clearfix pbottom15"></div>
							
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Check in date</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker7" placeholder="mm/dd/yyyy"/>
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">Check in date</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker8" placeholder="mm/dd/yyyy"/>
								</div>
							</div>
							
							<div class="clearfix pbottom15"></div>
							
							<div class="room1" >
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 1</b></span><br/>
										
										<div class="addroom1 block"><a onclick="addroom2()" class="grey cpointer">+ Add room</a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option>1</option>
												  <option selected>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option>0</option>
												  <option selected>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div>
							
							<div class="room2 none">
								<div class="clearfix"></div><div class="line1"></div>
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 2</b></span><br/>
										<div class="addroom2 block grey"><a onclick="addroom3()" class="grey cpointer">+ Add room</a> | <a onclick="removeroom2()" class="orange cpointer"><img src="images/delete.png" alt="delete"/></a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option>1</option>
												  <option>2</option>
												  <option selected>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>0</option>
												  <option>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div>		

							<div class="room3 none">
								<div class="clearfix"></div><div class="line1"></div>
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 3</b></span><br/>
										<div class="addroom3 block grey"><a onclick="addroom3()" class="grey cpointer">+ Add room</a> | <a onclick="removeroom3()" class="orange cpointer"><img src="images/delete.png" alt="delete"/></a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>0</option>
												  <option>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div><div class="clearfix"></div>
							<button type="submit" class="btn-search3">Search</button>
						</div>
						END OF VACATIONS TAB 
						
						CARS TAB
						<div class="carstab2 none">
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Picking up</span>
									<input type="text" class="form-control" placeholder="Airport, address">
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">Dropping off</span>
									<input type="text" class="form-control" placeholder="Airport, address">
								</div>
							</div>
							
							<div class="clearfix pbottom15"></div>
							
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Pick up date</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker5" placeholder="mm/dd/yyyy"/>
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">Hour</span>
									<select class="form-control mySelectBoxClass">
									  <option>12:00 AM</option>
									  <option>12:30 AM</option>
									  <option>01:00 AM</option>
									  <option>01:30 AM</option>
									  <option>02:00 AM</option>
									  <option>02:30 AM</option>
									  <option>03:00 AM</option>
									  <option>03:30 AM</option>
									  <option>04:00 AM</option>
									  <option>04:30 AM</option>
									  <option>05:00 AM</option>
									  <option>05:30 AM</option>
									  <option>06:00 AM</option>
									  <option>06:30 AM</option>
									  <option>07:00 AM</option>
									  <option>07:30 AM</option>
									  <option>08:00 AM</option>
									  <option>08:30 AM</option>
									  <option>09:00 AM</option>
									  <option>09:30 AM</option>
									  <option>10:00 AM</option>
									  <option selected>10:30 AM</option>
									  <option>11:00 AM</option>
									  <option>11:30 AM</option>
									  <option>12:00 PM</option>
									  <option>12:30 PM</option>								  
									  <option>01:00 PM</option>
									  <option>01:30 PM</option>
									  <option>02:00 PM</option>
									  <option>02:30 PM</option>
									  <option>03:00 PM</option>
									  <option>03:30 PM</option>
									  <option>04:00 PM</option>
									  <option>04:30 PM</option>
									  <option>05:00 PM</option>
									  <option>05:30 PM</option>
									  <option>06:00 PM</option>
									  <option>06:30 PM</option>
									  <option>07:00 PM</option>
									  <option>07:30 PM</option>
									  <option>08:00 PM</option>
									  <option>08:30 PM</option>
									  <option>09:00 PM</option>
									  <option>09:30 PM</option>
									  <option>10:00 PM</option>
									  <option>10:30 PM</option>
									  <option>11:00 PM</option>
									  <option>11:30 PM</option>								  
									</select>
								</div>
							</div>
							
							<div class="clearfix pbottom15"></div>
							
							<div class="room1" >
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13">Drop off date</span>
										<input type="text" class="form-control mySelectCalendar" id="datepicker6" placeholder="mm/dd/yyyy"/>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<span class="opensans size13">Hour</span>
										<select class="form-control mySelectBoxClass">
										  <option>12:00 AM</option>
										  <option>12:30 AM</option>
										  <option>01:00 AM</option>
										  <option>01:30 AM</option>
										  <option>02:00 AM</option>
										  <option>02:30 AM</option>
										  <option>03:00 AM</option>
										  <option>03:30 AM</option>
										  <option>04:00 AM</option>
										  <option>04:30 AM</option>
										  <option>05:00 AM</option>
										  <option>05:30 AM</option>
										  <option>06:00 AM</option>
										  <option>06:30 AM</option>
										  <option>07:00 AM</option>
										  <option>07:30 AM</option>
										  <option>08:00 AM</option>
										  <option>08:30 AM</option>
										  <option>09:00 AM</option>
										  <option>09:30 AM</option>
										  <option>10:00 AM</option>
										  <option selected>10:30 AM</option>
										  <option>11:00 AM</option>
										  <option>11:30 AM</option>
										  <option>12:00 PM</option>
										  <option>12:30 PM</option>								  
										  <option>01:00 PM</option>
										  <option>01:30 PM</option>
										  <option>02:00 PM</option>
										  <option>02:30 PM</option>
										  <option>03:00 PM</option>
										  <option>03:30 PM</option>
										  <option>04:00 PM</option>
										  <option>04:30 PM</option>
										  <option>05:00 PM</option>
										  <option>05:30 PM</option>
										  <option>06:00 PM</option>
										  <option>06:30 PM</option>
										  <option>07:00 PM</option>
										  <option>07:30 PM</option>
										  <option>08:00 PM</option>
										  <option>08:30 PM</option>
										  <option>09:00 PM</option>
										  <option>09:30 PM</option>
										  <option>10:00 PM</option>
										  <option>10:30 PM</option>
										  <option>11:00 PM</option>
										  <option>11:30 PM</option>		
										</select>
									</div>
								</div>
							</div><div class="clearfix"></div>
							<button type="submit" class="btn-search3">Search</button>
						</div>
						 END OF CARS TAB 
						
						 CRUISE TAB 
						<div class="cruisestab2 none">
							<div class="fullwidth">
								<span class="opensans size13">Going to</span>
								<select class="form-control mySelectBoxClass">
								  <option selected>Show all</option>
								  <optgroup label="Most Popular">
									  <option>Caribbean</option>
									  <option>Bahamas</option>
									  <option>Mexico</option>
									  <option>Alaska</option>
									  <option>Europe</option>
									  <option>Bermuda</option>
									  <option>Hawaii</option>
								  </optgroup>
								  <optgroup label="Other Destinations">
									  <option>Africa</option>
									  <option>Arctic/Antartctic</option>
									  <option>Asia</option>
									  <option>Australia/New Zealand</option>
									  <option>Central America</option>
									  <option>Cruise to Nowhere</option>
									  <option>Galapagos</option>
									  <option>Greenland/Iceland</option>
									  <option>Middle East</option>
									  <option>Pacific Coastal</option>
									  <option>Panama Canal</option>
									  <option>South Africa</option>
									  <option>South Pacific</option>
									  <option>Tahiti</option>
									  <option>Transatlantic</option>
									  <option>World Cruises</option>
								  </optgroup>
								</select>

								<div class="clearfix pbottom15"></div>
								
								<span class="opensans size13">Departure</span>
								<select class="form-control mySelectBoxClass">
								  <option selected>Show all</option>
								  <option>October 2013</option>
								  <option>November 2013</option>
								  <option>December 2013</option>
								  <option>January 2014</option>
								  <option>February 2014</option>
								  <option>March 2014</option>
								  <option>April 2014</option>
								  <option>May 2014</option>
								  <option>June 2014</option>
								  <option>July 2014</option>
								  <option>August 2014</option>
								  <option>September 2014</option>
								  <option>October 2014</option>
								  <option>November 2014</option>
								  <option>December 2014</option>
								</select>
							</div><div class="clearfix"></div>
							<button type="submit" class="btn-search3">Search</button>
						</div>
						 END OF CRUISE TAB 				
						
						
						 FLIGHT+HOTEL+CAR TAB					
						<div class="flighthotelcartab2 none">
								
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Flying from</span>
									<input type="text" class="form-control" placeholder="City or airport">
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">To</span>
									<input type="text" class="form-control" placeholder="City or airport">
								</div>
							</div>
								
							<div class="clearfix pbottom15"></div>
								
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Departing</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker13" placeholder="mm/dd/yyyy"/>
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">Returning</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker14" placeholder="mm/dd/yyyy"/>
								</div>
							</div>

							<div class="clearfix pbottom15"></div>
							
							<div class="room1" >
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 1</b></span><br/>
										
										<div class="addroom1 block"><a onclick="addroom2()" class="grey cpointer">+ Add room</a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right ohidden">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option>1</option>
												  <option selected>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right ohidden">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option>0</option>
												  <option selected>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div>
							
							<div class="room2 none">
								<div class="clearfix"></div><div class="line1"></div>
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 2</b></span><br/>
										<div class="addroom2 block grey"><a onclick="addroom3()" class="grey cpointer">+ Add room</a> | <a onclick="removeroom2()" class="orange cpointer"><img src="images/delete.png" alt="delete"/></a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option>1</option>
												  <option>2</option>
												  <option selected>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>0</option>
												  <option>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div>		

							<div class="room3 none">
								<div class="clearfix"></div><div class="line1"></div>
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 3</b></span><br/>
										<div class="addroom3 block grey"><a onclick="addroom3()" class="grey cpointer">+ Add room</a> | <a onclick="removeroom3()" class="orange cpointer"><img src="images/delete.png" alt="delete"/></a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>0</option>
												  <option>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div><div class="clearfix"></div>
							<div class="center size10 ca03">! An economy car will be added to your search. (You may change your car options later.)</div>							
							<button type="submit" class="btn-search3">Search</button>
						</div>
						<!-- END OF FLIGHT+HOTE+CAR TAB 
						
						
						<FLIGHT+HOTEL TAB				
						<div class="flighthoteltab2 none">
						
							
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Flying from</span>
									<input type="text" class="form-control" placeholder="City or airport">
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">To</span>
									<input type="text" class="form-control" placeholder="City or airport">
								</div>
							</div>
							
							<div class="clearfix pbottom15"></div>
							

							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Departing</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker10" placeholder="mm/dd/yyyy"/>
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">Returning</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker9" placeholder="mm/dd/yyyy"/>
								</div>
							</div>
							
							<div class="clearfix pbottom15"></div>
							
							<div class="room1" >
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 1</b></span><br/>
										
										<div class="addroom1 block"><a onclick="addroom2()" class="grey cpointer">+ Add room</a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right ohidden">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option>1</option>
												  <option selected>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right ohidden">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option>0</option>
												  <option selected>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div>
							
							<div class="room2 none">
								<div class="clearfix"></div><div class="line1"></div>
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 2</b></span><br/>
										<div class="addroom2 block grey"><a onclick="addroom3()" class="grey cpointer">+ Add room</a> | <a onclick="removeroom2()" class="orange cpointer"><img src="images/delete.png" alt="delete"/></a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option>1</option>
												  <option>2</option>
												  <option selected>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>0</option>
												  <option>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div>		

							<div class="room3 none">
								<div class="clearfix"></div><div class="line1"></div>
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 3</b></span><br/>
										<div class="addroom3 block grey"><a onclick="addroom3()" class="grey cpointer">+ Add room</a> | <a onclick="removeroom3()" class="orange cpointer"><img src="images/delete.png" alt="delete"/></a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>0</option>
												  <option>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="clearfix"></div>
							<button type="submit" class="btn-search3">Search</button>					
						</div>
						END OF FLIGHT+HOTE TAB				
						
						FLIGHT+CAR TAB 				
						<div class="flightcartab2 none">
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Flying from</span>
									<input type="text" class="form-control" placeholder="City or airport">
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">To</span>
									<input type="text" class="form-control" placeholder="City or airport">
								</div>
							</div>
							
							<div class="clearfix pbottom15"></div>
							

							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Departing</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker11" placeholder="mm/dd/yyyy"/>
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">Returning</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker12" placeholder="mm/dd/yyyy"/>
								</div>
							</div>
							
							<div class="clearfix pbottom15"></div>
							
							<div class="center size10 ca03">! An economy car will be added to your search. (You may change your car options later.)</div>
							<div class="clearfix"></div>
							<button type="submit" class="btn-search3">Search</button>										
						</div>
						END OF FLIGHT+CAR TAB 	
						
						HOTEL+CAR TAB 			
						<div class="hotelcartab2 none">
							
							<span class="opensans size13">Where do you want to go?</span>
							<input type="text" class="form-control" placeholder="Greece">
							
							<div class="clearfix pbottom15"></div>
							
							<div class="w50percent">
								<div class="wh90percent textleft">
									<span class="opensans size13">Check in date</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker15" placeholder="mm/dd/yyyy"/>
								</div>
							</div>

							<div class="w50percentlast">
								<div class="wh90percent textleft right">
									<span class="opensans size13">Check in date</span>
									<input type="text" class="form-control mySelectCalendar" id="datepicker16" placeholder="mm/dd/yyyy"/>
								</div>
							</div>
							
							<div class="clearfix pbottom15"></div>
							
							<div class="room1" >
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 1</b></span><br/>
										
										<div class="addroom1 block"><a onclick="addroom2()" class="grey cpointer">+ Add room</a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right ohidden">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option>1</option>
												  <option selected>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right ohidden">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option>0</option>
												  <option selected>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div>
							
							<div class="room2 none">
								<div class="clearfix"></div><div class="line1"></div>
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 2</b></span><br/>
										<div class="addroom2 block grey"><a onclick="addroom3()" class="grey cpointer">+ Add room</a> | <a onclick="removeroom2()" class="orange cpointer"><img src="images/delete.png" alt="delete"/></a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option>1</option>
												  <option>2</option>
												  <option selected>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>0</option>
												  <option>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div>		

							<div class="room3 none">
								<div class="clearfix"></div><div class="line1"></div>
								<div class="w50percent">
									<div class="wh90percent textleft">
										<span class="opensans size13"><b>ROOM 3</b></span><br/>
										<div class="addroom3 block grey"><a onclick="addroom3()" class="grey cpointer">+ Add room</a> | <a onclick="removeroom3()" class="orange cpointer"><img src="images/delete.png" alt="delete"/></a></div>
									</div>
								</div>

								<div class="w50percentlast">	
									<div class="wh90percent textleft right">
										<div class="w50percent">
											<div class="wh90percent textleft left">
												<span class="opensans size13">Adult</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>							
										<div class="w50percentlast">
											<div class="wh90percent textleft right">
											<span class="opensans size13">Child</span>
												<select class="form-control mySelectBoxClass">
												  <option selected>0</option>
												  <option>1</option>
												  <option>2</option>
												  <option>3</option>
												  <option>4</option>
												  <option>5</option>
												</select>
											</div>
										</div>
									</div>
								</div>
							</div><div class="clearfix"></div><br/>
							<div class="center size10 ca03">! An economy car will be added to your search. (You may change your car options later.)</div>
							<button type="submit" class="btn-search3">Search</button>						
						</div>
					 END OF HOTEL+CAR TAB 

						
						
				</div>
				END OF BOOK FILTERS 	
				
				<div class="line2"></div>
				
				<div class="padding20title"><h3 class="opensans dark">Filter by</h3></div>
				<div class="line2"></div>
				
				Star ratings 
				<button type="button" class="collapsebtn" data-toggle="collapse" data-target="#collapse1">
				  Star rating <span class="collapsearrow"></span>
				</button>

				<div id="collapse1" class="collapse in">
					<div class="hpadding20">
						<div class="checkbox">
							<label>
							  <input type="checkbox"><img src="images/filter-rating-5.png" class="imgpos1" alt=""/> 5 Stars
							</label>
						</div>
						<div class="checkbox">
							<label>
							  <input type="checkbox"><img src="images/filter-rating-4.png" class="imgpos1" alt=""/> 4 Stars
							</label>
						</div>
						<div class="checkbox">
							<label>
							  <input type="checkbox"><img src="images/filter-rating-3.png" class="imgpos1" alt=""/> 3 Stars
							</label>
						</div>
						<div class="checkbox">
							<label>
							  <input type="checkbox"><img src="images/filter-rating-2.png" class="imgpos1" alt=""/> 2 Stars
							</label>
						</div>
						<div class="checkbox">
							<label>
							  <input type="checkbox"><img src="images/filter-rating-1.png" class="imgpos1" alt=""/> 1 Star
							</label>
						</div>	
					</div>
					<div class="clearfix"></div>
				</div>
				End of Star ratings 
				
				<div class="line2"></div>
				
				Price range 
				<button type="button" class="collapsebtn" data-toggle="collapse" data-target="#collapse2">
				  Price range <span class="collapsearrow"></span>
				</button>
					
				<div id="collapse2" class="collapse in">
					<div class="padding20">
						<div class="layout-slider wh100percent">
							<span class="cstyle09"><input id="Slider1" type="slider" name="price" value="400;700" /></span>
						</div>
						<script type="text/javascript" >
						  jQuery("#Slider1").slider({ from: 100, to: 1000, step: 5, smooth: true, round: 0, dimension: "&nbsp;$", skin: "round" });
						</script>
					</div>
				</div>
			 End of Price rang
				
				<div class="line2"></div>
				
				Acomodations 		
				<button type="button" class="collapsebtn" data-toggle="collapse" data-target="#collapse3">
				  Acomodation type <span class="collapsearrow"></span>
				</button>				
				
				<div id="collapse3" class="collapse in">
					<div class="hpadding20">
						<div class="radio">
						  <label>
							<input type="radio" name="optionsRadios2" id="Acomodation1" value="option1" checked>
							All
						  </label>
						</div>
						<div class="radio">
						  <label>
							<input type="radio" name="optionsRadios2" id="Acomodation2" value="option2">
							Hotel
						  </label>
						</div>
						<div class="radio">
						  <label>
							<input type="radio" name="optionsRadios2" id="Acomodation3" value="option3">
							Bed & Breakfast
						  </label>
						</div>
						<div class="radio">
						  <label>
							<input type="radio" name="optionsRadios2" id="Acomodation4" value="option4">
							Apartment
						  </label>
						</div>
						<div class="radio">
						  <label>
							<input type="radio" name="optionsRadios2" id="Acomodation5" value="option5">
							Condo
						  </label>
						</div>
						<div class="radio">
						  <label>
							<input type="radio" name="optionsRadios2" id="Acomodation6" value="option6">
							All-Inclusive Resort 
						  </label>
						</div>
					</div>	
					<div class="clearfix"></div>					
				</div>
				End of Acomodations
				
				<div class="line2"></div>
				
				Hotel Preferences 
				<button type="button" class="collapsebtn last" data-toggle="collapse" data-target="#collapse4">
				  Hotel Preferences <span class="collapsearrow"></span>
				</button>	
				<div id="collapse4" class="collapse">
					<div class="hpadding20">
						<div class="checkbox">
							<label>
							  <input type="checkbox">High-speed Internet (41)
							</label>
						</div>
						<div class="checkbox">
							<label>
							  <input type="checkbox">Air conditioning (52)
							</label>
						</div>
						<div class="checkbox">
							<label>
							  <input type="checkbox">Swimming pool (55)
							</label>
						</div>
						<div class="checkbox">
							<label>
							  <input type="checkbox">Childcare (12)
							</label>
						</div>
						<div class="checkbox">
							<label>
							  <input type="checkbox">Fitness equipment (49)
							</label>
						</div>	
						<div class="checkbox">
							<label>
							  <input type="checkbox">Free breakfast (14)
							</label>
						</div>	
						<div class="checkbox">
							<label>
							  <input type="checkbox">Free parking (11)
							</label>
						</div>	
						<div class="checkbox">
							<label>
							  <input type="checkbox">Hair dryer (48)
							</label>
						</div>	
						<div class="checkbox">
							<label>
							  <input type="checkbox">Pets allowed (16)
							</label>
						</div>	
						<div class="checkbox">
							<label>
							  <input type="checkbox">Restaurant in hotel (47)
							</label>
						</div>	
						<div class="checkbox">
							<label>
							  <input type="checkbox">Room service (38)
							</label>
						</div>	
						<div class="checkbox">
							<label>
							  <input type="checkbox">Spa services on site (57) 
							</label>
						</div>	

					</div>
					<div class="clearfix"></div>						
				</div>	
				End of Hotel Preferences 
				
				<div class="line2"></div>
				<div class="clearfix"></div>
				<br/>
				<br/>
				<br/>
				
				
			</div>
			<!-- END OF FILTERS -->
			
			<!-- LIST CONTENT-->
			<div class=" col-md-12">
				<!-- End of padding -->
				
				<br/><br/>
				<div class="clearfix"></div>
				

				<div class="row offset-1">


					<div class="col-md-4">
					  <div class="list-box">
						<div class="listitem">
							<img src="resources/images/A46A0121.jpg" alt=""/>
							<div class="liover"></div>
						</div>
						<div class="itemlabel">
							<span class="right  lred2 size14 ">Mise à jour le:25/11/2015</span>
							<span><span class="glyphicon glyphicon-camera" aria-hidden="true"></span>4</span></br><br>
							<span class=" lightgrey right mt1 green size20 ">170000</span>
							<span class=" size20">Appartement</span><br/></br>
							
							<span class="right size20" >Location</span>
							<span class="size20">Rivera 2 </span><br/><br/>
							
							<button href="#" class="btn btn-xs right btngrd">Detail</button>
							<span class="size14">5<span class="glyphicon glyphicon-bed"></span></span>
							<span class="size14">Surface 65m2</span>
						</div>
						</div>
					</div>
					
					
					<div class="col-md-4">
					  <div class="list-box">
						<div class="listitem">
							<img src="resources/images/A46A0121.jpg" alt=""/>
							<div class="liover"></div>
						</div>
						<div class="itemlabel">
							<span class="right  lred2 size14 ">Mise à jour le:25/11/2015</span>
							<span><span class="glyphicon glyphicon-camera" aria-hidden="true"></span>4</span></br><br>
							<span class=" lightgrey right mt1 green size20 ">170000</span>
							<span class=" size20">Appartement</span><br/></br>
							
							<span class="right size20" >Location</span>
							<span class="size20">Rivera 2 </span><br/><br/>
							
							<button href="#" class="btn btn-xs right btngrd">Detail</button>
							<span class="size14">5<span class="glyphicon glyphicon-bed"></span></span>
							<span class="size14">Surface 65m2</span>
						</div>
						</div>
					</div>
					
					
					<div class="col-md-4">
					  <div class="list-box">
						<div class="listitem">
							<img src="resources/images/A46A0121.jpg" alt=""/>
							<div class="liover"></div>
						</div>
						<div class="itemlabel">
							<span class="right  lred2 size14 ">Mise à jour le:25/11/2015</span>
							<span><span class="glyphicon glyphicon-camera" aria-hidden="true"></span>4</span></br><br>
							<span class=" lightgrey right mt1 green size20 ">170000</span>
							<span class=" size20">Appartement</span><br/></br>
							
							<span class="right size20" >Location</span>
							<span class="size20">Rivera 2 </span><br/><br/>
							
							<button href="#" class="btn btn-xs right btngrd">Detail</button>
							<span class="size14">5<span class="glyphicon glyphicon-bed"></span></span>
							<span class="size14">Surface 65m2</span>
						</div>
						</div>
					</div>
					
					
					<div class="col-md-4">
					  <div class="list-box">
						<div class="listitem">
							<img src="resources/images/A46A0121.jpg" alt=""/>
							<div class="liover"></div>
						</div>
						<div class="itemlabel">
							<span class="right  lred2 size14 ">Mise à jour le:25/11/2015</span>
							<span><span class="glyphicon glyphicon-camera" aria-hidden="true"></span>4</span></br><br>
							<span class=" lightgrey right mt1 green size20 ">170000</span>
							<span class=" size20">Appartement</span><br/></br>
							
							<span class="right size20" >Location</span>
							<span class="size20">Rivera 2 </span><br/><br/>
							
							<button href="#" class="btn btn-xs right btngrd">Detail</button>
							<span class="size14">5<span class="glyphicon glyphicon-bed"></span></span>
							<span class="size14">Surface 65m2</span>
						</div>
						</div>
					</div>
					
					<div class="col-md-4">
					  <div class="list-box">
						<div class="listitem">
							<img src="resources/images/A46A0121.jpg" alt=""/>
							<div class="liover"></div>
						</div>
						<div class="itemlabel">
							<span class="right  lred2 size14 ">Mise à jour le:25/11/2015</span>
							<span><span class="glyphicon glyphicon-camera" aria-hidden="true"></span>4</span></br><br>
							<span class=" lightgrey right mt1 green size20 ">170000</span>
							<span class=" size20">Appartement</span><br/></br>
							
							<span class="right size20" >Location</span>
							<span class="size20">Rivera 2 </span><br/><br/>
							
							<button href="#" class="btn btn-xs right btngrd">Detail</button>
							<span class="size14">5<span class="glyphicon glyphicon-bed"></span></span>
							<span class="size14">Surface 65m2</span>
						</div>
						</div>
					</div>
					
					<div class="col-md-4">
					  <div class="list-box">
						<div class="listitem">
							<img src="resources/images/A46A0121.jpg" alt=""/>
							<div class="liover"></div>
						</div>
						<div class="itemlabel">
							<span class="right  lred2 size14 ">Mise à jour le:25/11/2015</span>
							<span><span class="glyphicon glyphicon-camera" aria-hidden="true"></span>4</span></br><br>
							<span class=" lightgrey right mt1 green size20 ">170000</span>
							<span class=" size20">Appartement</span><br/></br>
							
							<span class="right size20" >Location</span>
							<span class="size20">Rivera 2 </span><br/><br/>
							
							<button href="#" class="btn btn-xs right btngrd">Detail</button>
							<span class="size14">5<span class="glyphicon glyphicon-bed"></span></span>
							<span class="size14">Surface 65m2</span>
						</div>
						</div>
					</div>
					
					
				</div>	
				<!-- End of offset1-->		

			</div>
			<!-- END OF LIST CONTENT-->
			
		

		</div>
		<!-- END OF container-->
		
	</div>
			<!-- END OF CONTENT -->
	         <!---footer-->
     	<div class="footerbg">
		<div class="container">		
			<div class="col-md-3">
				<span class="ftitle">Suivez toute l'actualité de smartImmo.net sur:</span>
				<br/><br/>
				<div class="scont">
					<a href="#" class="social1b"><img src="resources/images/icon-facebook.png" alt=""/></a>
					<a href="#" class="social2b"><img src="resources/images/icon-twitter.png" alt=""/></a>
					<a href="#" class="social4b"><img src="resources/images/icon-youtube.png" alt=""/></a>
					<br/><br/><br/>
					<a href="#"><img src="resources/images/logo.png" alt="" /></a><br/>
					<span class="grey2">&copy; 2015  |  <a href="#"> Tous droits réservé</a><br/>
					</span>
					<br/><br/>
					
				</div>
			</div>
			<!-- End of column 1-->
			
			<div class="col-md-3">
				<span class="ftitle">Nos Annonces de vente</span>
				<br/><br/>
				<ul class="footerlistblack">
					<li><a href="#">Vente de maison</a></li>
					<li><a href="#">Vente de terrain</a></li>
					<li><a href="#">Vente de local commercial</a></li>
				</ul>
			</div>
			<!-- End of column 2-->		
			
			<div class="col-md-3">
				<span class="ftitle">Nos annonces de location</span>
				<br/><br/>
				<ul class="footerlistblack">
					<li><a href="#">Appartement</a></li>
					<li><a href="#">Studio</a></li>
					<li><a href="#">Villa</a></li>
					<li><a href="#">Terrain</a></li>
				</ul>				
			</div>
			<!-- End of column 3-->		
			
			<div class="col-md-3 grey">
				<span class="ftitle">Recevez les meilleurs offres du marché</span>
				<br/><br/>
				<div class="relative">
					<input type="email" class="form-control fccustom2" id="exampleInputEmail1" placeholder="Enter email">
					<button type="submit" class="btn btn-default btncustom">Submit<img src="images/arrow.png" alt=""/></button>
				</div>
				<br/><br/>
			</div>			
			<!-- End of column 4-->			
		
			
			
		</div>	
	</div>		
<%@ include file="footer.jsp" %>>
    
<%@ include file ="java.jsp" %>
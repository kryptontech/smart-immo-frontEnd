
//------------------------------
//ajouter formulaire agent
//------------------------------
$(document).ready(function(){

	function mySelectUpdate(){
		setTimeout(function (){
			$('.mySelectBoxClass').trigger('update');
		}, 500);
	}
	mySelectUpdate();

	$('#fieldset2').addClass('none');
	
	$( "#option1" ).click(function() {
		$('#fieldset2').addClass('none');							
		mySelectUpdate();
	});
	$( "#option2" ).click(function() {
		$('#fieldset2').removeClass('none');
		mySelectUpdate();
	});				
	
	
	});

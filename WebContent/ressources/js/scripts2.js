function form_contact(){ 
	if (document.getElementById('add_contact').style.display=='none'){ 
		document.getElementById('add_contact').style.display='block'; 
		document.getElementById('bouton_add').style.display='';
		document.getElementById('tableau').style.display='none';
	} else { 
		document.getElementById('add_contact').style.display='none'; 
		document.getElementById('tableau').style.display='';

	} 
} 

function liste_contact(){ 

	if (document.getElementById('add_contact').style.display=='block'){ 
		document.getElementById('add_contact').style.display='none'; 
		document.getElementById('tableau').style.display='';
	} 
} 

function address(){
	if(document.getElementById('add_address').style.display=='none'){
		document.getElementById('add_address').style.display='block';
		document.getElementById('valider1').style.display='none';
		document.getElementById('modif_address').style.display='none';

	} else {
		document.getElementById('add_address').style.display='none';
	}
	
}

function address2(){
	if(document.getElementById('add_address2').style.display=='none'){
		document.getElementById('add_address2').style.display='block';
		document.getElementById('add_address').style.display='none';
		document.getElementById('valider1').style.display='none';
		document.getElementById('modif_address').style.display='none';



	} else {
		document.getElementById('add_address2').style.display='none';
	}
	
}

function modif_address(value){
	if(document.getElementById('modif_address_'+value).style.display=='none'){
		document.getElementById('modif_address_'+value).style.display='block';
		document.getElementById('adresse').style.display='none';
		document.getElementById('add_address2').style.display='none';
		document.getElementById('add_address').style.display='none';
		document.getElementById('valider1').style.display='none';

	} else {
		document.getElementById('modif_address').style.display='none';
		document.getElementById('adresse').style.display='';

	}
	
}
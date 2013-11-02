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
		document.getElementById('tableau').style.display='none';
	} else {
		document.getElementById('add_address').style.display='none';
	}
	
}


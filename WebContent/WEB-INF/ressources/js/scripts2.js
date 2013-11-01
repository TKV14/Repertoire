function form_upload(){ 

	if (document.getElementById('add_contact').style.display=='none'){ 
		document.getElementById('add_contact').style.display='block'; 
		document.getElementById('bouton_upload').style.display='';
		document.getElementById('tableau').style.display='none';
	} else { 
		document.getElementById('add_contact').style.display='none'; 
		document.getElementById('tableau').style.display='';

	} 
} 

function liste_fichiers(){ 

	if (document.getElementById('add_contact').style.display=='block'){ 
		document.getElementById('add_contact').style.display='none'; 
		document.getElementById('tableau').style.display='';
	} 
} 
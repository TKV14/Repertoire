<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<html>
	<head>
		<title>ESIEA Agenda - Contact</title>    	
		<link rel="stylesheet" type="text/css" href="ressources/design.css"/>
		<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
		<script src="ressources/js/scripts2.js"></script>
	</head>

	<body>

		<div id="page">
 	
 			<div class="titre">
   			ESIEA AGENDA
   			</div>  

		<div class="element3">
			<p id="bouton_liste" class="bouton2">
				<a href="./home.html" onclick="liste_contact();">Liste des Contacts</a>
			</p>
		</div>

		<br>
	
		<div id="tableau2" class="tableau2">
			<TABLE BORDER="1"> 
			<p>
				<CAPTION><h1>Informations du Contact</h1></CAPTION>
				<var="contact" items="${contact}"> 
					<TR> 
						<TH>NOM</TH> 
						<TH>PRENOM</TH> 
						<TH>EMAIL</TH> 
					</TR> 
					<TR>
						<TD>${contact.getName()}</TD>
						<TD>${contact.getFirstName()}</TD>
						<TD>${contact.getMail()}</TD>
					</TR>
					<TR> 
						<TH>DATE DE NAISSANCE</TH> 
						<TH>AGE</TH> 
						<TH>ACTIF</TH>
					</TR>
					<TR>
						<TD>${contact.getDateDeNaissance()}</TD>
						<TD>${contact.getAge()}</TD>
						<TD>${contact.getActif()}</TD>
					</TR>  
			</p>				
			</TABLE>
		</div>
		
		<br>
		<div id="tableau_address" class="tableau_address">		
			<TABLE BORDER="1"> 
			<p>
				<CAPTION><h1>Adresses</h1></CAPTION> 		
			</p>
		</div>
		
		<div id="add_contact" class="add_contact" style="display:none;">
			<form name="add_contact" action="./home.html" method="post">
				<h3>Veuillez remplir les champs suivants : </h3>
				<h4>Civil</h4>
					<input id="contact_nom" name="contact_LastName" type="text" placeholder="Nom" required="required" value="" size="30"/>
					<input id="contact_prenom" name="contact_FirstName" type="text" placeholder="Prénom" required="required" value="" size="30" />
					<p>
					<input id="contact_email" name="contact_Email" type="" placeholder="Email" required="required" value="" size="40" />
					</p>
				<h4>Date de Naissance</h4>
					<p>
					<input id="contact_datedenaissance" name="contact_DateDeNaissance" type="date" value="" size="11"/>
					</p>
					<input type="submit" name="submit" value="Valider" />
			</form>
				<a href="#" onclick="address();">Ajouter une adresse au contact</a>
			<form id="add_address" name="add_address" action="/" method="post" style="display:none;">
				<h4>Adresse</h4>
					<p>
					<input id="adresse_intitule" name="adresse_intitule" type="text" placeholder="Maison, Bureau..." required="required" size="20"/>
					</p>
					<p>
					<input id="adresse_numero" name="adresse_numero" type="text" placeholder="Numéro" required="required" size="10"/>
					<input id="adresse_rue" name="adresse_rue" type="text" placeholder="Rue" required="required" size="50"/>
					</p>
					<p>
					<input id="adresse_cp" name="adresse_cp" type="text" placeholder="Code Postal" required="required" size="20"/>
					<input id="adresse_ville" name="adresse_ville" type="text" placeholder="Ville" required="required" size="30"/>
					</p>
				<h4>Actif</h4>
					<p>
					<h5>
					<input type="radio" name="actif" value="Oui" /> Oui
					<input type="radio" name="actif" value="Non" /> Non
					</h5>
					</p>
					<input type="submit" name="submit" value="Valider" />
			</form>
		</div>			
	</div>
</div>
	
	<footer>
		Arthur CLOUET - ESIEA AGENDA © 2013 - Nicolas LOUIS
	</footer>

	</body>

</html>
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
		<div id="modif_contact" class="modif_contact"">
			<form name="modif_contact" action="./modify.html" method="post">
				<h4>Civil</h4>
					<input id="contact_nom" name="contact_LastName" type="text" placeholder="Nom" required="required" value="${contact.getName()}" size="30"/>
					<input id="contact_prenom" name="contact_FirstName" type="text" placeholder="Prénom" required="required" value="${contact.getFirstName()}" size="30" />
					<p>
					<input id="contact_email" name="contact_Email" type="" placeholder="Email" required="required" value="${contact.getMail()}" size="40" />
					</p>
					
				<h4>Date de Naissance</h4> 
				<input id="contact_datedenaissance" name="contact_DateDeNaissance" type="date" value="${contact.getDateDeNaissance()}" size="11"/>
					<h4>Actif</h4>
					<p>
					<h5>
					<c:if test="${contact.isActif() == \"oui\"}">
					<input type="radio" name="actif" value="Oui" checked/> Oui
					<input type="radio" name="actif" value="Non" /> Non
					</c:if>
					<c:if test="${contact.isActif() == \"non\"}">
					<input type="radio" name="actif" value="Oui" /> Oui
					<input type="radio" name="actif" value="Non" checked/> Non
					</c:if>
					<input type="hidden" name="maj" value="infos" />
					<input type="hidden" name="keyValue" value="${contact.getKey()}" />
					</h5>
					</p>
					<input id="valider1" type="submit" name="submit" value="Valider" />
			</form>
			
			<c:forEach var="adresse" items="${adresseList}">
			<div id="adresse_${adresse.getKey()}" class="adresse">
			<h7>${adresse.getType()}</h7> <br>
			${adresse.getNum()} ${adresse.getRue()} <br>
			${adresse.getCodePostal()} ${adresse.getVille()} <br>
			</div>
			<br>
			<a href="#" onclick="javascript:modif_address('${adresse.getKey()}');">Modifier l'adresse du contact</a>
			
			
			
			<form id="modif_address_${adresse.getKey()}" name="adresse_getKey" action="./modify.html" method="post" style="display:none;">
				<h4>Adresse</h4>
					<p>
					<input id="adresse_intitule" name="adresse_intitule" type="text" placeholder="Maison, Bureau..." required="required" value="${adresse.getType()}" size="20"/>
					</p>
					<p>
					<input id="adresse_numero" name="adresse_numero" type="text" placeholder="Numéro" required="required" value="${adresse.getNum()}" size="10"/>
					<input id="adresse_rue" name="adresse_rue" type="text" placeholder="Rue" required="required" value="${adresse.getRue()}" size="50"/>
					</p>
					<p>
					<input id="adresse_cp" name="adresse_cp" type="text" placeholder="Code Postal" required="required" value="${adresse.getCodePostal()}" size="20"/>
					<input id="adresse_ville" name="adresse_ville" type="text" placeholder="Ville" required="required" value="${adresse.getVille()}" size="30"/>
					</p>
						<input type="hidden" name="maj" value="majadresse" />
						<input type="hidden" name="keyValueAd" value="${adresse.getKey()}" />
						<input type="submit" name="submit" value="Valider"/>
			</form>							
			
			</c:forEach>
			
			
			
			<br>
			<br>
			<a href="#" onclick="address();">Ajouter une adresse au contact</a>
			
			<form id="add_address" name="adresse_getKey" action="./modify.html" method="post" style="display:none;">
				<h4>Adresse</h4>
					<p>
					<input id="adresse_intitule" name="adresse_intitule" type="text" placeholder="Maison, Bureau..." required="required" value="${adresse.getType}" size="20"/>
					</p>
					<p>
					<input id="adresse_numero" name="adresse_numero" type="text" placeholder="Numéro" required="required" value="${adresse.getNum}" size="10"/>
					<input id="adresse_rue" name="adresse_rue" type="text" placeholder="Rue" required="required" value="${adresse.getRue}" size="50"/>
					</p>
					<p>
					<input id="adresse_cp" name="adresse_cp" type="text" placeholder="Code Postal" required="required" value="${adresse.getCodePostal}" size="20"/>
					<input id="adresse_ville" name="adresse_ville" type="text" placeholder="Ville" required="required" value="${adresse.getVille}" size="30"/>
					</p>
						<input type="hidden" name="maj" value="newadresse" />
						<input type="hidden" name="keyValue" value="${keyAdd}" />
						<input type="submit" name="submit" value="Valider" />
					<br>
					<br>
				<a href="#" onclick="address2();">Ajouter une autre adresse au contact</a>
			</form>
		</div>			
	</div>
</div>
	
	<footer>
		Arthur CLOUET - ESIEA AGENDA © 2013 - Nicolas LOUIS
	</footer>

	</body>

</html>
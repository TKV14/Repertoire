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
		<div id="informations" class="informations">
				<CAPTION><h1>Informations du Contact</h1></CAPTION>
				<var="contact" items="${contact}"> 
					 
						${contact.getName()} ${contact.getFirstName()} <br> 
						${contact.getMail()} <br>
						${contact.getDateDeNaissance()} <br>
						ACTIF</h3> : ${contact.isActif()}
		
		</div>
		
		<br>
		<c:forEach var="adresse" items="${adresseList}">
		<div id="adresse" class="adresse">
		${adresse.getType} <br>
		${adresse.getNum} ${adresse.getRue} <br>
		${adresse.getCodePostal} ${adresse.getVille} <br>
		</div>
		</c:forEach>
		
		
				
		</div>			
	</div>
</div>
	
	<footer>
		Arthur CLOUET - ESIEA AGENDA © 2013 - Nicolas LOUIS
	</footer>

	</body>

</html>
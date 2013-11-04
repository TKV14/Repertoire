<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<html>
	<head>
		<title>ESIEA Agenda - Page de Gestion</title>    	
		<link rel="stylesheet" type="text/css" href="ressources/design.css"/>
		<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
		<script src="ressources/js/scripts2.js"></script>
	</head>

	<body>

		<div id="page">
 	
 			<div class="titre">
   			ESIEA AGENDA
   			</div>  

		<div class="element2">

			<p id="bouton_liste" class="bouton2">
				<a href="./home.html" onclick="liste_contact();">Liste des Contacts</a>
			</p>
		</div>
			
			<div class="informations">
			<br><br>Résultat de la recherche : <br><br>
	<c:forEach var="contact" items="${contactList}">
	<form name="getKey" method="post" action ="./detail.html">
		<input name="keyValue" type="hidden" value ="${contact.getKey()}">
		<input name="submit" type="submit" class=link value="${contact.getName()} ${contact.getFirstName()}" />
	</form><br>
	</c:forEach>
	
	</div>
	
		<footer>
		Arthur CLOUET - ESIEA AGENDA © 2013 - Nicolas LOUIS
	</footer>
	
	
	</div>
	
</body>
</html>
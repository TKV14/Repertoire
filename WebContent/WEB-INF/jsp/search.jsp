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
			
	<form name="search" action="./search.html" method="post">
		<p>Nom: <input id="name" name="name" type="text" size="30"/><br>
		Prenom: <input id="firstName" name="firstName" type="text" size="30"/><br><br>
		Mail: <input id="mail" name="mail" type="text" size="30"/><br>
		</p><br>
		Ne chercher que dans les contact actif : <input id="actif" name="actif" type="checkbox" value="OK"><br>
	<input type="submit" name="submit" value="Valider" />
	</form>
	</div>
	</div>
</body>
</html>
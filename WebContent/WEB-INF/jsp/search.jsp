<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
	<form name="search" action="./search.html" method="post">
		Nom: <input id="name" name="name" type="text" size="30"/><br>
		Prenom: <input id="firstName" name="firstName" type="text" size="30"/><br>
		Mail: <input id="mail" name="mail" type="text" size="30"/><br>
		<br>
		Ne chercher que dans les contact actif : <input id="actif" name="actif" type="checkbox" value="OK"><br>
	<input type="submit" name="submit" value="Valider" />
	</form>
</body>
</html>
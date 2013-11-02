<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
	<title>Insert title here</title>
</head>
<body>
	<h1>Home</h1>
	Contact
	<table>
		<c:forEach var="contact" items="${contactList}">
			<tr>
				<td>${contact.getName()}</td>
				<td>${contact.getFirstName()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
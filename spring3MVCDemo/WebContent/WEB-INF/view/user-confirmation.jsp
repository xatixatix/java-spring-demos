<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User confirmed</title>
</head>
<body>
	The user is confirmed: ${user.firstName} ${user.lastName} from ${user.country} ${user.countryO}
	<br>
	Favourite language: ${user.favouriteLanguage}
	<br>
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${user.operatingSystems}">
		<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World Form</title>
</head>
<body>
	<form action="processFormToUppercaseV2" method="GET">
		<input type="text" name="userName"
		placeholder="What's your name?">
		<input type="submit">
	</form>
	<img src="${pageContext.request.contextPath}/resources/images/cat.jpg">
</body>
</html>
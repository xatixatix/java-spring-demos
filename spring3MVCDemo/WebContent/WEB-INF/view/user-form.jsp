<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="user">
		First name: <form:input path="firstName"/>
		Last name: <form:input path="lastName"/>
		<form:select path="country">
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="Hungary" label="Hungary"></form:option>
			<form:option value="United Kingdom" label="United Kingdom"></form:option>
			<form:option value="United States" label="United States"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="Austria" label="Austria"></form:option>
			<form:option value="France" label="France"></form:option>
		</form:select>
		<form:select path="countryO">
			<form:options items="${user.countryOptions}" ></form:options>
		</form:select>
		<br>
		Java<form:radiobutton path="favouriteLanguage" value="Java"></form:radiobutton>
		C#<form:radiobutton path="favouriteLanguage" value="C#"></form:radiobutton>
		Python<form:radiobutton path="favouriteLanguage" value="Python"></form:radiobutton>
		Ruby<form:radiobutton path="favouriteLanguage" value="Ruby"></form:radiobutton>
		<br>
		Operating systems: 
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		Windows<form:checkbox path="operatingSystems" value="Windows"/>
		Mac<form:checkbox path="operatingSystems" value="Mac"/>
		<br>
		<input type="submit" value="Submit"/>  
	</form:form>
</body>
</html>
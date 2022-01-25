<%@page import="beans.Utilisateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Liste Utilisateurs</h1>
	<% List<Utilisateur> utilisateurs = (List<Utilisateur>) request.getAttribute("utilisateurs");
		for(Utilisateur utilisateur : utilisateurs) {
	%>
		<p>Nom : ${utilisateur.nom}</p>
		<p>Prénom : ${utilisateur.prénom}</p>
		<p>Email : ${utilisateur.email}</p>
	<% 
		}
	%>

</body>
</html>
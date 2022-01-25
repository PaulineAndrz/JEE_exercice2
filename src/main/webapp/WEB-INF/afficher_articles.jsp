<%@page import="java.util.List"%>
<%@page import="beans.Article"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Liste Articles</h1>
	<% List<Article> articles = (List<Article>) request.getAttribute("articles");
		for(Article article : articles) {
	%>
		<p>Titre : ${article.titre}</p>
		<p>Description : ${article.description}</p>
		<p>Contenu : ${article.contenu}</p>
		<p>Auteur : ${article.auteur}</p>
	<% 
		}
	%>

</body>
</html>
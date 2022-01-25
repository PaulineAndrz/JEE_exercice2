<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bonjour ${utilisateur.prenom} ${utilisateur.nom }</h1>
	
	<p>Créer un article :</p>
	<form method="post" action="home">
		Titre: <input type="text" name="titre">
		Description: <input type="text" name="description">
		Contenu: <input type="text" name="contenu">
		<input type="submit" value="Envoyer">
	</form>

</body>
</html>
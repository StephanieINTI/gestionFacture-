<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="formulaireArticle" method="post">
<div>
<input type="text" name="description" placeholder="Entrer la description du produit">
</div>
<div>
<input type="text" name="quantite" placeholder="Entrer la quantite du produit">
</div>
<div>
<input type="text"  name="prix" placeholder="Entrer le prix du produit">
</div>

<div>
<input type="submit" value="Valider">
</div>

<div> 
   <a href="index.jsp">Retour vers la page d'accueil</a>
   </div>
</form>
</body>
</html>
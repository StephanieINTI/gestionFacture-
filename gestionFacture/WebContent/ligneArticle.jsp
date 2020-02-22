<%@ page import="com.inti.entities.Article" %>
<%@ page import="com.inti.service.impl.ArticleService" %>
<%@ page import="com.inti.service.interfaces.IArticleService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
     <a href="ligneArticle"><h1 style="color:blue"> L'article à été ajouter à votre stock</h1></a>
</div>
<div>
 <table border="1">
 <tr> 
      <th>Qté</th>
      <th>Désignation</th>
      <th>Prix</th>
      <th>idArticle</th>
      <th>Action</th>
 </tr>
 <tr>
 <c:forEach var="a" items="${articles}">
   <tr> 
       <td>${a.getQteStock()}</td>
       <td>${a.getDescription()}</td>
       <td>${a.getPrix()}</td>
       <td>${a.getIdArticle()}</td> 
       <td><a href="deleteArticle?pId=${a.getIdArticle()}" style="color: red;">Supprimer</a></td> 
   </tr>
 </c:forEach>
 </tr>
 </table>
 </div>

  <div><a href="formulaireArticle.jsp"> Ajouter un article</a></div>
  <div><a href="facture.jsp"> Editer une facture</a></div>
</body>
</html>
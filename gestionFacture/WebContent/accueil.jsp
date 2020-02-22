<%@ page import="com.inti.entities.Employe" %>
<%@ page import="com.inti.service.impl.EmployeService" %>
<%@ page import="com.inti.service.interfaces.IEmployeService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!-- Un TAGLIB qui nous permet d'utiliser le language jstl avec un alias "c" pour faire appel au jstl dans la balise foreach-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil</title>
</head>
<body>

 
 <div>
 <a href="accueil">  <h2> Gestion des employés </h2></a>
 <div>
 <h1 style="color:blue"> ${log}</h1>
 <table border="1">
 <tr> 
      <th>Login </th>
      <th>Password</th>
      <th>Nom</th>
      <th>Prenom</th>
      <th>Date de naissance</th>
      <th>Action</th>
 </tr>
 <tr>
 <c:forEach var="e" items="${employes}">
   <tr> 
       <td>${e.getUsername()}</td>
       <td>${e.getPassword()}</td>
       <td>${e.getNomEmploye()}</td>
       <td>${e.getPrenomEmploye()}</td>
       <td>${e.getDateNaissance() }</td>
       <td><a href="delete?pId=${e.getIdEmploye()}" style="color: red;">Supprimer</a></td>
   
   </tr>
 
 </c:forEach>
 </tr>
 
 </table>
 </div>
 </div>
</body>
</html>
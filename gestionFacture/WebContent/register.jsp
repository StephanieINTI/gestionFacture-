<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="register" method="post">
   <span>Créer votre compte !!!</span>
   <div>
    <input type="text" name="nom" placeholder="nom">
    </div>
   <div>
   <input type="text" name="prenom" placeholder="prenom">
   </div>
   <div>
   <input type="text" name="dateN" placeholder="14/02/2014">
   </div>
   <div>
   <input type="text" name="username" placeholder="username">
   </div>
   <h5 style="color : red; text-align:center"> ${login}</h5>
   <div>
   <input type="password" name="password" placeholder="*********" >
   </div>
   <div>
   <input type="password" name="verifPassword" placeholder="**********">
   </div>
   <h4 style="color : red; text-align:center"> ${pass}</h4>
   <div> 
   <input type="submit" value="Register">
   </div>
   <div> 
   <a href="index.jsp">Retour vers la page d'accueil</a>
   </div>
   
  </form>
</body>
</html>
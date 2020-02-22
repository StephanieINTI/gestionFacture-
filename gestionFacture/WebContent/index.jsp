<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authentification</title>
</head>
<body>
  <form action="login" method="POST">
   <div>
    <input type="text" name="username" placeholder="Nom d'utilisateur" >
   </div>
    <div> 
    <input type="password" name="password" placeholder="mot de passe">
    </div>
    <h4 style="color:red; text-align:center"> ${msg} </h4>
    <div>
    <input type="submit" value="Se connecter!!!"> 
    </div>
    <div> 
    <a href="register.jsp"> Créer votre compte</a></div>
   </form>
</body>
</html>
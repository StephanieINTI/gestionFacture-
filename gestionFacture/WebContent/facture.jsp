<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="facture" method="post">
<div>
<input type="text" name="dateCreation" placeholder="Entrer la date de création">
</div>
<div>
<input type="text" name="dateModification" placeholder="Entrer la date de modification">
</div>
<div>
<input type="text"  name="quantite" placeholder="Entrer la quantite">
</div>
<div>
<label> Article:<SELECT name="article"> 
              <option default=""> </option> 
              <option value="stylo"> Stylo</option>		
               <option value="casque"> casque </option>	
			   <option value="gant"> gant </option>
			   </SELECT>
</label>			 
</div>
<div>
<input type="submit" value="Valider">
</div>
</form>
</body>
</html>
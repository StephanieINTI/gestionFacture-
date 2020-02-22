package com.inti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Employe;
import com.inti.service.impl.EmployeService;
import com.inti.service.interfaces.IEmployeService;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    IEmployeService employeService = new EmployeService();    
   
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		String login =request.getParameter("username");
		String password =request.getParameter("password"); // on récupère des choses dans l'attribut name de la balise input de la  page HTML
		if( employeService.getEmployeByLoginAndPassword(login, password) !=null) {
		request.setAttribute("employes", employeService.findAll(Employe.class)); 
		//Si le login et password correspondent
		// Ici, on ajoute un attribut 'employes' dans la balise (dans la page accueil.jsp) qui porte le nom employe,
		//qui va nous permettre d'avoir la liste des employes -> Back to front
		//"employes" est une liste d'employe
		request.setAttribute("log", "Bonjour M/Mme" +
		employeService.getEmployeByLoginAndPassword(login, password).getNomEmploye() +
		"-"+employeService.getEmployeByLoginAndPassword(login, password).getPrenomEmploye());
		
		request.getRequestDispatcher("accueil.jsp").forward(request,response);
		} else {
			request.setAttribute("msg", "login ou password incorrect");
			request.getRequestDispatcher("index.jsp").forward(request,response);
		}
	}

}

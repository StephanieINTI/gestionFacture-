package com.inti.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Employe;
import com.inti.service.impl.EmployeService;
import com.inti.service.interfaces.IEmployeService;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IEmployeService employeService = new EmployeService();
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SimpleDateFormat dateN = new SimpleDateFormat("dd/MM/yyyy");
		try {
			if (employeService.getEmployeByLogin(request.getParameter("username"))==null) {
				if (request.getParameter("verifPassword").equals(request.getParameter("password"))) {
					employeService.save(new Employe(request.getParameter("nom"), request.getParameter("prenom"), dateN.parse(request.getParameter("dateN")), request.getParameter("username"), request.getParameter("password")));
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}else {
					request.setAttribute("pass", "error password");
					request.getRequestDispatcher("register.jsp").forward(request, response);
					}
				
			}else {
				request.setAttribute("login", "username déjà existant !");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}

}

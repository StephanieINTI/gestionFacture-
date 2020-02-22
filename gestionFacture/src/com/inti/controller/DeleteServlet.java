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


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  IEmployeService employeService = new EmployeService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("pId"));
		Employe emp = employeService.findOne(Employe.class, id);
		employeService.remove(emp);
		request.setAttribute("employes", employeService.findAll(Employe.class));
		request.getRequestDispatcher("/accueil.jsp").forward(request, response);
	}

}

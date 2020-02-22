package com.inti.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inti.entities.Facture;
import com.inti.service.impl.FactureService;
import com.inti.service.interfaces.IFactureService;






@WebServlet("/facture")
public class FactureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	IFactureService factureService = new FactureService();
	SimpleDateFormat dateN = new SimpleDateFormat("dd/MM/yyyy");
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			factureService.save(new Facture(dateN.parse(request.getParameter("dateCreation")), dateN.parse(request.getParameter("dateModification")), Integer.parseInt(request.getParameter("quantite")), request.getParameter("article")));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("facture.jsp").forward(request, response);
		
	}

}

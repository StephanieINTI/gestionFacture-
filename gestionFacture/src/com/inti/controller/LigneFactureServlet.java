package com.inti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.inti.entities.Article;
import com.inti.service.impl.ArticleService;
import com.inti.service.interfaces.IArticleService;



@WebServlet("/ligneArticle")
 public class LigneFactureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       IArticleService articleService = new ArticleService();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("articles",articleService.findAll(Article.class));
		request.getRequestDispatcher("/ligneArticle.jsp").forward(request, response);
	}
}


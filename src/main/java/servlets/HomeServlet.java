package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import beans.Article;
import beans.Utilisateur;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titre = request.getParameter("titre");
		String description = request.getParameter("description");
		String contenu = request.getParameter("contenu");
		Utilisateur auteur = (Utilisateur) request.getAttribute("utilisateur");
		
		Article article = new Article();
		article.setTitre(titre);
		article.setDescription(description);
		article.setContenu(contenu);
		article.setAuteur(auteur);
		
		List<Article> articles = new ArrayList<Article>();
		articles.add(article);
		request.setAttribute("articles", articles);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/afficher_articles.jsp").forward(request, response);
	}

}

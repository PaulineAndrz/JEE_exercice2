package servlets;

import java.io.IOException;

import beans.Utilisateur;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginUtilisateurServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/login_utilisateur.jsp").forward(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		// Récupération des informations de l'utilisateurs
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
	
		// Instanciation d'un nouvel utilisateur
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom(nom);
		utilisateur.setPrenom(prenom);
		utilisateur.setEmail(email);
		
		session.setAttribute("utilisateur", utilisateur);
		
		response.sendRedirect(request.getContextPath() + "/home");
	}

}

package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import beans.Utilisateur;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreationUtilisateurServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_utilisateur.jsp").forward(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Récupération des informations de l'utilisateurs
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
	
		// Instanciation d'un nouvel utilisateur
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom(nom);
		utilisateur.setPrenom(prenom);
		utilisateur.setEmail(email);
		
		// Ajout du nouvel utilisateur dans la liste
		List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		utilisateurs.add(utilisateur);
		request.setAttribute("utilisateurs", utilisateurs);
		
		// Affichage de la liste à l'envoi du formulaire
		request.getRequestDispatcher("/WEB-INF/afficher_utilisateurs.jsp").forward(request, response);
	}

}
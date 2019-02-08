package fr.akharroub.basededonnes.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.akharroub.basededonnes.business.impl.AccueilBusiness;

/**
 * Servlet implementation class AccueilServlet 
 */
@WebServlet(name = "accueil", urlPatterns = { "/accueil" })
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccueilBusiness accueilBZ = new AccueilBusiness();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> villes = accueilBZ.getvilles() ;
		
		request.setAttribute("villes", villes);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/accueil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package fr.akharroub.animall.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.akharroub.animall.bean.Gardien;
import fr.akharroub.animall.business.impl.GardienBusiness;

/**
 * Servlet implementation class GardienServlet
 */
@WebServlet(name = "gardien", urlPatterns = { "/gardien" })
public class GardienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GardienBusiness gardienBusiness = new GardienBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GardienServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Gardien> Gardienn = gardienBusiness.recupLaListeDesGardien();
		request.setAttribute("Gardienn", Gardienn);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/gardien.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

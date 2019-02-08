package fr.akharroub.animall.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.akharroub.animall.bean.animall;
import fr.akharroub.animall.business.impl.AnimallBusiness;

/**
 * Servlet implementation class AnimallWithBeanSrervlet
 */
@WebServlet(name = "tt-animall", urlPatterns = { "/tt-animall" })
public class AnimallWithBeanSrervlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AnimallBusiness animalzoo = new AnimallBusiness(); 

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AnimallWithBeanSrervlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<animall> animaux = animalzoo.recupLaListeDesAnimaux();

		request.setAttribute("animaux", animaux);

		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/animaux-bean.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

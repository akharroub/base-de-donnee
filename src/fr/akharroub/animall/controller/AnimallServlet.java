package fr.akharroub.animall.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.akharroub.animall.business.impl.AnimallBusiness;

/**
 * Servlet implementation class AnimallServlet
 */
@WebServlet(name = "animall", urlPatterns = { "/animall" })
public class AnimallServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AnimallBusiness animalzoo = new AnimallBusiness();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimallServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 ArrayList<String> animal = animalzoo.getanimal();
 ArrayList<String> typeanimal = animalzoo.getLesType();
 ArrayList<Integer> ageAnimal = animalzoo.getAge();
 
 request.setAttribute("animal", animal);
 request.setAttribute("typeanimal", typeanimal);
 request.setAttribute("ageAnimal", ageAnimal);
 
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/animall.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

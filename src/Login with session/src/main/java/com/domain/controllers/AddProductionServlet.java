package com.domain.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.daos.MovieDao;
import com.domain.daos.ProductionDao;
import com.domain.models.Movie;
import com.domain.models.Production;

/**
 * Servlet implementation class AddProductionServlet
 */
@WebServlet("/AddProductionServlet")
public class AddProductionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProductionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String ownername = request.getParameter("ownername");
		String address = request.getParameter("address");
		String year = request.getParameter("year");

		Production production = new Production(name, address, ownername, year);
		ProductionDao productionDao = new ProductionDao();
		try {
			boolean saveProduction = productionDao.addProduction(production);
			if (saveProduction) {
				response.sendRedirect("AllProductions.jsp");
			} else {
				System.out.println("Got error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

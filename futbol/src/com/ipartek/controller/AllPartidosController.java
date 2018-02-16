package com.ipartek.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.model.service.PartidoService;

import eu.dataaccess.footballpool.TGameInfo;

@WebServlet("/partidos")
public class AllPartidosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PartidoService partidoService;
	
	@Override
	public void init() throws ServletException {
		partidoService = new PartidoService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TGameInfo[] partidos = partidoService.getPartidos();
		
		//OPCION 1:
		//request.getSession().setAttribute("partidos", partidos);
		//response.sendRedirect("WEB-INF/partidos.jsp");
		
		//OPCION 2:
		request.setAttribute("partidos", partidos);
		request.getRequestDispatcher("WEB-INF/partidosJSTL.jsp").forward(request, response);
	}

}

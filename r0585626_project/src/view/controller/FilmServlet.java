package view.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Film;
import domain.FilmDb;
import domain.FilmService;

@WebServlet("/FilmServlet")
public class FilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilmServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("error", "There is no GET request on this form.");
		request.getRequestDispatcher("WEB-INF/error.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String totalSt = request.getParameter("total");
		String watchedSt = request.getParameter("watched");
		String ratingSt = request.getParameter("rating");
		try{
			FilmService.addFilm(name, totalSt, watchedSt, ratingSt);
			request.getRequestDispatcher("WEB-INF/result.jsp").forward(request, response);
		}catch (Exception e){
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("WEB-INF/error.jsp").forward(request, response);
		}
	}

}

package view.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Film;
import domain.FilmDb;

@WebServlet("/FilmServlet")
public class FilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final FilmDb db;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilmServlet() {
        super();
        db = FilmDb.getInstance();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		String totalSt = request.getParameter("total");
		String watchedSt = request.getParameter("watched");
		String ratingSt = request.getParameter("rating");
		try{
			int total = Integer.parseInt(totalSt);
			int watched = Integer.parseInt(watchedSt);
			double rating = Double.parseDouble(ratingSt);
			Film f = new Film(name, total, watched, rating);
			db.addFilm(f);
			request.getRequestDispatcher("/result.jsp").forward(request, response);
		}catch (Exception e){
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

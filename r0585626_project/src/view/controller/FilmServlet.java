package view.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.db.FilmDb;
import domain.model.FilmService;

@WebServlet("/FilmServlet")
public class FilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final FilmService service;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilmServlet() {
        super();
        service = new FilmService(new FilmDb());
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("films", service.getFilms());
		request.getRequestDispatcher("WEB-INF/overview.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String totalSt = request.getParameter("total");
		String watchedSt = request.getParameter("watched");
		String ratingSt = request.getParameter("rating");
		List<String> errors = service.addFilm(name, totalSt, watchedSt, ratingSt);
		
		if(errors.isEmpty()){
			request.setAttribute("films", service.getFilms());
			request.getRequestDispatcher("WEB-INF/overview.jsp").forward(request, response);
		}else{
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("add.jsp").forward(request, response);
		}
		try{
			request.setAttribute("films", service.getFilms());
			request.getRequestDispatcher("overview.jsp").forward(request, response);
		}catch (Exception e){
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("WEB-INF/error.jsp").forward(request, response);
		}
	}

}

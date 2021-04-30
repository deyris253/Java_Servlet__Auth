package com.ort.msi.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet()
     */
    public MaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		////////////////////////////////////////////////////////////////////
		////////////////// TP Servlet /////////////////////////////////////
		///////////////////////////////////////////////////////////////////
		
		/*response.getWriter().append("Served at: ").append(request.getContextPath());
		 
		response.setStatus(HttpServletResponse.SC_OK);
		response.setContentType("text/html");
		*/
		response.setCharacterEncoding("UTF-8");
		PrintWriter dr = response.getWriter();
		
		
		///////////////////////////////////////////////////
		/////////////// Page Simple ///////////////////////
		
		dr.println("<!DOCTYPE html>");
		dr.println("<html>");
		dr.println("<head>");
		dr.println("<meta charset=\"UTF-8\">");
		dr.println("<title>TP Servlet</title>");
		dr.println("</head>");
		dr.println("<body>");
		dr.println("<h1>Bonjour, ceci est un titre</h1>");
		dr.println("<p>Ceci est un paragraphe</p>");
		dr.println("<ul>");
		dr.println("Ceci est une liste");
		dr.println("<li>puce 1</li>");
		dr.println("<li>puce 2</li>");
		dr.println("</ul>");
		dr.println("</br>");
		
		
		///////////////////////////////////////////////////
		/////////////// Formulaire ////////////////////////
		dr.println("<h2>Voici un Formulaire Simple</h2>");
		dr.println("<form method=\"post\">");
		dr.println("<div>");
		dr.println("<label>Login</label>");
		dr.println("<input type=\"text\" name=\"login\">");
		dr.println("</div>");
		dr.println("</br>");
		dr.println("<div>");
		dr.println("<label>Mot de passe</label>");
		dr.println("<input type=\"password\" name=\"password\">");
		dr.println("</div>");
		dr.println("</br>");
		dr.println("<button type=\"submit\">Se connecter</button>");
		dr.println("</form");
		dr.println("</body>");
		dr.println("</html>");
		
		//////////////////////////////////////////////////////////////////////////
		////////////////////// Fin TP Servlet ////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
		
		
		//////////////////////////////////////////////////////////////////////////
		////////////////////// TP JSP ////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
		
		//this.getServletContext().getRequestDispatcher("/WEB-INF/majsp.jsp").forward(request, response);
		
		//////////////////////////////////////////////////////////////////////////
		////////////////////// Fin TP JSP ////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////
		
	}

	/**
	 * @see HttpServlet#doPost
	 * (HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		///////////////////////////////////////////////////////////////////////
		////////////////////// TP Servlet /////////////////////////////////////
		///////////////////////////////////////////////////////////////////////
		
		String username = request.getParameter("login");
		String pw = request.getParameter("password");
		
		PrintWriter dr = response.getWriter();
		
		if (username.equals("Jim") && pw.equals("Halpert")) {
			dr.println("</br>Connexion ACCEPTÉE !");
		} else {
			dr.println("</br>Connexion REFUSÉE !");
		}
		
		if (username.isEmpty()) {
			dr.println("Veuillez indiquer votre login.");
		}
		
		if (pw.isEmpty()) {
			dr.println("Veuillez indiquer votre mot de passe.");
		}
		
		//////////////////////////////////////////////////////////////////////
		///////////////////// Fin TP Servlet /////////////////////////////////
		//////////////////////////////////////////////////////////////////////
		
		
		//////////////////////////////////////////////////////////////////////
		///////////////////// TP JSP /////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////
		
		//this.getServletContext().getRequestDispatcher("/WEB-INF/majsp.jsp").forward(request, response);
		
		//////////////////////////////////////////////////////////////////////
		/////////////////// Fin TP JSP ///////////////////////////////////////
		//////////////////////////////////////////////////////////////////////
		
		
		
		
	}

}

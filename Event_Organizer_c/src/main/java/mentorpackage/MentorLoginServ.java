package mentorpackage;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MentorLoginServ
 */
@WebServlet("/MentorLoginServ")
public class MentorLoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MentorLoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	PrintWriter out = response.getWriter();
    	String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_organizer", "root", "rootuser");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select name, password from mentor where name = '"+name+"' and password = '"+password+"'");
			
			
			if (rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("name", name);
				response.sendRedirect("http://localhost:9494/Event_Organizer_a/SeminarTableServlet?name="+rs.getString("name"));
//				HttpSession session = request.getSession();
//				session.setAttribute("name", name);
			}else {
				out.println("wrong id and password");
			}			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
//		PrintWriter out = response.getWriter();
//		String name = request.getParameter("name");
//		String password = request.getParameter("password");
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_organizer", "root", "rootuser");
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select name, password from mentor where name = '"+name+"' and password = '"+password+"'");
//			
//			
//			if (rs.next()) {
//				response.sendRedirect("http://localhost:9494/Event_Organizer_a/seminar-list.jsp?name="+rs.getString("name"));
//				HttpSession session = request.getSession();
//				session.setAttribute("name", name);
//			}else {
//				out.println("wrong id and password");
//			}			
//		}catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
	}

}

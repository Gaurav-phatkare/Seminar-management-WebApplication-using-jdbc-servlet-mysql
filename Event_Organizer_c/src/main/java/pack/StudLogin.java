package pack;

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

/**
 * Servlet implementation class StudLogin
 */
@WebServlet("/StudLogin")
public class StudLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();

		
		String Student_name = request.getParameter("Student_name");
		String Password = request.getParameter("Password");
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_organizer", "root", "rootuser" );
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Student_name, Password from student where Student_name = '" + Student_name +"' and Password = '"+ Password + "'");
			
			if (rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("Student_name", Student_name);
				response.sendRedirect("http://localhost:9494/Event_Organizer_a/StudInterfaceServlet?Student_name="+Student_name+"");
			
			}else {
				out.println("wrong username or password");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter out = response.getWriter();
//		doGet(request, response);
//		
//		String Student_name = request.getParameter("Student_name");
//		String Password = request.getParameter("Password");
//	
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_organizer", "root", "rootuser" );
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select Student_name, Password from student where Student_name = '" + Student_name +"' and Password = '"+ Password + "'");
//			
//			if (rs.next()) {
//				HttpSession session = request.getSession();
//				session.setAttribute("Student_name", Student_name);
//				response.sendRedirect("/StudInterfaceServlet?Student_name="+Student_name+"");
//			
//			}else {
//				out.println("wrong username or password");
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}

	}
}

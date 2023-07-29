package adminpackage;

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
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
//		doGet(request, response);
		
		String Admin_name = request.getParameter("Admin_name");
		String Password = request.getParameter("Password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_organizer", "root", "rootuser" );
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Admin_name, Password from admin where Admin_name = '"+Admin_name+"' and Password = '"+Password+"'");
//			HttpSession session = request.getSession();
//			session.setAttribute("Admin_name", Admin_name);
		
			
			if (rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("Admin_name", Admin_name);
				response.sendRedirect("http://localhost:9494/Event_Organizer_a/AdminInterfaceServlet?Admin_name= "+rs.getString("Admin_name"));

			}else {
				
				out.println("wrong username or password");
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
//		PrintWriter out = response.getWriter();
//		doGet(request, response);
//		
//		String Admin_name = request.getParameter("Admin_name");
//		String Password = request.getParameter("Password");
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_organizer", "root", "rootuser" );
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select Admin_name, Password from admin where Admin_name = '"+Admin_name+"' and Password = '"+Password+"'");
//		
//			
//			if (rs.next()) {
//				HttpSession session = request.getSession();
//				session.setAttribute("Admin_name", Admin_name);
//				response.sendRedirect("welcomeAdmin.jsp?Admin_name= "+Admin_name+"");
//			}else {
//				out.println("wrong username or password");
//			}
//		}catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
		
	}
}

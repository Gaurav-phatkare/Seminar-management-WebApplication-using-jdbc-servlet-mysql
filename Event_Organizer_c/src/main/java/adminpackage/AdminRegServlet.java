package adminpackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminRegServlet
 */
@WebServlet("/AdminRegServlet")
public class AdminRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public AdminRegServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
		
		
		try {
			Connection conn = AdminDBConnection.getConnection();
			int Admin_ID = 0;
			String Admin_name = request.getParameter("Admin_name");
			String Contact = request.getParameter("Contact");
			String Email = request.getParameter("Email");
			String Password = request.getParameter("Password");
			String City = request.getParameter("City");
			String Qualification = request.getParameter("Qualification");
			String Interest = request.getParameter("Interest");
			
			
			PreparedStatement ps = conn.prepareStatement("select max(Admin_ID) from admin");
			
			ResultSet rs = ps.executeQuery();
			
			
			if (rs.next()) {
				Admin_ID = rs.getInt(1);
				Admin_ID++;
				
				PreparedStatement p = conn.prepareStatement("insert into admin(Admin_ID, Admin_name, Contact, Email, Password, City, Qualification, Interest ) value (?, ?, ?, ?, ?, ?, ?, ?)");
				p.setInt(1, Admin_ID);
				p.setString(2, Admin_name);
				p.setString(3, Contact);
				p.setString(4, Email);
				p.setString(5, Password);
				p.setString(6, City);
				p.setString(7, Qualification);
				p.setString(8, Interest);
				
				int i = p.executeUpdate();
				if (i > 0) {
					response.sendRedirect("AdminLogin.jsp");
				}else {
					response.sendRedirect("error.jsp");
				}
				
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

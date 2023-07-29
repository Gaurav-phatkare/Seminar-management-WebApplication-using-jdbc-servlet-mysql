package mentorpackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import pack.StudDBConnection;

/**
 * Servlet implementation class MentRegServlet
 */
@WebServlet("/MentRegServlet")
public class MentRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public MentRegServlet() {
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
			Connection conn = MentDBConnection.getConnection();
			int Mentor_ID = 0;
			String name = request.getParameter("name");
			String contact = request.getParameter("contact");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String age =  request.getParameter("age");
			String qualification = request.getParameter("qualification");
			String work_experience = request.getParameter("work_experience");
			String specialization = request.getParameter("specialization");
			String city = request.getParameter("city");
			
			PreparedStatement ps = conn.prepareStatement("select max(Mentor_ID) from mentor");
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				Mentor_ID = rs.getInt(1);
				Mentor_ID++;
				
				PreparedStatement p = conn.prepareStatement("insert into mentor(Mentor_ID, name, contact, email, password, age, qualification, work_experience, specialization, city) value(?,?,?,?,?,?,?,?,?,?)");
				
				p.setInt(1, Mentor_ID);
				p.setString(2, name);
				p.setString(3, contact);
				p.setString(4, email);
				p.setString(5, password);
				p.setString(6, age);
				p.setString(7, qualification);
				p.setString(8, work_experience);
				p.setString(9, specialization);
				p.setString(10, city);
				
				int i = p.executeUpdate();
				if (i > 0) {
					response.sendRedirect("MentorLogin.jsp");
					
				}else {
					response.sendRedirect("error.jsp");
					
				}
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

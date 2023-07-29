package pack;

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
 * Servlet implementation class StudRegServlet
 */
@WebServlet("/StudRegServlet")
public class StudRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public StudRegServlet() {
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
			
			Connection conn = StudDBConnection.getConnection();
			int Student_ID = 0;
			String Student_name = request.getParameter("Student_name");
			String College_name = request.getParameter("College_name");
			String Email = request.getParameter("Email");
			String Contact_no = request.getParameter("Contact_no");
			String Password = request.getParameter("Password");
			String Branch = request.getParameter("Branch");
			String Date_of_Birth = request.getParameter("Date_of_Birth");
			String Interested_topics = request.getParameter("Interested_topics");
			String Qualification = request.getParameter("Qualification");
			String City = request.getParameter("City");
			
			PreparedStatement ps = conn.prepareStatement("select max(Student_ID) from student");
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				Student_ID = rs.getInt(1);
				Student_ID++;
				
				PreparedStatement p = conn.prepareStatement("insert into student(Student_ID, Student_name, College_name, Email, Contact_no, Password, Branch, Date_of_Birth, Interested_topics, Qualification, City) value(?,?,?,?,?,?,?,?,?,?,?)");
				
				p.setInt(1, Student_ID);
				p.setString(2, Student_name);
				p.setString(3, College_name);
				p.setString(4, Email);
				p.setString(5, Contact_no);
				p.setString(6, Password);
				p.setString(7, Branch);
				p.setString(8, Date_of_Birth);
				p.setString(9, Interested_topics);
				p.setString(10, Qualification);
				p.setString(11, City);
				
				int i = p.executeUpdate();
				if(i > 0) {
					response.sendRedirect("StudentLogin.jsp");
							
				}else {
					response.sendRedirect("error.jsp");
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
}
package studSeminarInterface;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class StudInterfaceServlet
 */
@WebServlet("/StudInterfaceServlet")
public class StudInterfaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private StudInterfaceDAO studinterfaceDAO; 
       
    
    public StudInterfaceServlet() {
        super();
        // TODO Auto-generated constructor stub
        this.studinterfaceDAO = new StudInterfaceDAO();
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
//		String Student_name = request.getParameter("Student_name");
		HttpSession session = request.getSession();
		String Student_name = (String) session.getAttribute("Student_name");
		PrintWriter out = response.getWriter();
		
		out.println(Student_name);
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
			listSeminarTable(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	private void listSeminarTable(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		List<StudInterfaceEl> liststudseminartable = studinterfaceDAO.selectAllSeminars();
		List<StudInterfaceEl> liststudseminartableT = studinterfaceDAO.selectAllPastSeminars();
		
		request.setAttribute("liststudseminartable", liststudseminartable);
		request.setAttribute("liststudseminartableT", liststudseminartableT);
		RequestDispatcher dispatcher = request.getRequestDispatcher("studentInterface_List.jsp");
		dispatcher.forward(request, response);
	}
	
//	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("#");
//		dispatcher.forward(request, response);
//	}
	
	
//	private void listSeminarTable(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
//		
//		
//	}
	
	
	
	
	
	
}

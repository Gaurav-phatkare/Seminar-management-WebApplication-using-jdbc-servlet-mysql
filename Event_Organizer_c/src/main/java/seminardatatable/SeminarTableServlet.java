package seminardatatable;

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
 * Servlet implementation class SeminarTableServlet
 */
@WebServlet("/SeminarTableServlet")
public class SeminarTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SeminarTableDAO seminartableDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeminarTableServlet() {
//        super();
    	
    	this.seminartableDAO = new SeminarTableDAO();
    	
        // TODO Auto-generated constructor stub
    }
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
    	this.doGet(request, response);
//    	String name = request.getParameter("name");
    	HttpSession session = request.getSession();
    	String name = (String) session.getAttribute("name");   	
    	PrintWriter out = response.getWriter();
    	
    	out.println(name);
    	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action = request.getServletPath();
		
		switch (action) {
		case "/new":
			showNewForm(request, response);
			break;
		case "/insert":
			try {
				insertSeminar(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/delete":
			try {
				deleteSeminar(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/edit":
			try {
				showEditForm(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/update":
			try {
				updateSeminar(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
//			handle list
			try {
				listSeminarTable(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		} 
	}
	
	private void listSeminarTable(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		List<SeminarTable> listSeminarTable = seminartableDAO.selectAllSeminars();
		List<SeminarTable> listSeminarTablesT = seminartableDAO.selectAllPastSeminars();
		
		request.setAttribute("listSeminarTable", listSeminarTable);
		request.setAttribute("listSeminarTablesT", listSeminarTablesT);
		RequestDispatcher dispatcher = request.getRequestDispatcher("seminartable_list.jsp");
		dispatcher.forward(request, response);
	}
	
	
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("seminar_form.jsp");
		dispatcher.forward(request, response);
		
	}
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		int seminar_ID = Integer.parseInt(request.getParameter("seminar_ID"));
		SeminarTable existingSeminar = seminartableDAO.selectSeminar(seminar_ID);
		RequestDispatcher dispatcher = request.getRequestDispatcher("seminar_form.jsp");
		request.setAttribute("seminartable", existingSeminar);
		dispatcher.forward(request, response);
	}
	
	
	private void insertSeminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String topic = request.getParameter("topic");
		String mentor_Name = request.getParameter("mentor_Name");
		int mentor_ID = Integer.parseInt(request.getParameter("mentor_ID"));
		String description = request.getParameter("description");
		String date_Time = request.getParameter("date_Time");
		String active_Status = request.getParameter("active_Status");
		String survey_Link = request.getParameter("survey_Link");
		String seminar_Link = request.getParameter("seminar_Link");
		String documents = request.getParameter("documents");
		SeminarTable newSeminar = new SeminarTable(topic,mentor_Name,mentor_ID,description,date_Time,active_Status,survey_Link,seminar_Link,documents);
		seminartableDAO.insertSeminar(newSeminar);
		response.sendRedirect("list");
	
	}
	
	private void deleteSeminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int seminar_ID = Integer.parseInt(request.getParameter("seminar_ID"));
		seminartableDAO.deleteSeminar(seminar_ID);
		response.sendRedirect("list");
		
	}
	
	private void updateSeminar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int seminar_ID = Integer.parseInt(request.getParameter("seminar_ID"));
		String topic = request.getParameter("topic");
		String mentor_Name = request.getParameter("mentor_Name");
		int mentor_ID = Integer.parseInt(request.getParameter("mentor_ID"));
		String description = request.getParameter("description");
		String date_Time = request.getParameter("date_Time");
		String active_Status = request.getParameter("active_Status");
		String survey_Link = request.getParameter("survey_Link");
		String seminar_Link = request.getParameter("seminar_Link");
		String documents = request.getParameter("documents");
		
		SeminarTable book = new SeminarTable(seminar_ID, topic,mentor_Name,mentor_ID,description,date_Time,active_Status,survey_Link,seminar_Link,documents);
		seminartableDAO.updateSeminar(book);
		response.sendRedirect("list");
	}

	

}

package adminSeminarInterface;

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
 * Servlet implementation class AdminInterfaceServlet
 */
@WebServlet("/AdminInterfaceServlet")
public class AdminInterfaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AdminInterfaceDAO admininterfaceDAO;
	
	
   
    public AdminInterfaceServlet() {
//        super();
        this.admininterfaceDAO = new AdminInterfaceDAO();
        
    }

   	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
//		String Admin_name = request.getParameter("Admin_name");
		HttpSession session = request.getSession();
		String Admin_name = (String) session.getAttribute("Admin_name");
		PrintWriter out = response.getWriter();
		
		out.println(Admin_name);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String action = request.getServletPath();
	
		switch (action) {
		case "/newF":
			showNewForm(request, response);
			break;
		case "/insertS":
			try {
				insertSeminar(request, response);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/deleteS":
			try {
				deleteSeminar(request, response);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
		case "/editF":
			try {
				showEditForm(request, response);
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
			break;
		case "/updateS":
			try {
				updateSeminar(request, response);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
//			handle list
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
			break;
		}
	}
	
	private void listSeminarTable(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		List<AdminInterfaceEl> listSeminarTable = admininterfaceDAO.selectAllSeminars();
		List<AdminInterfaceEl> listMentorTable = admininterfaceDAO.selectAllMentors();
		
		request.setAttribute("listSeminarTable", listSeminarTable);
		request.setAttribute("listMentorTable", listMentorTable);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminSeminar_list.jsp");
		dispatcher.forward(request, response);
	}
	
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminSeminar_form.jsp");
		dispatcher.forward(request, response);
	}
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		int seminar_ID = Integer.parseInt(request.getParameter("seminar_ID"));
		
		AdminInterfaceEl existingSeminar = admininterfaceDAO.selectSeminar(seminar_ID);
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminSeminar_form.jsp");
		request.setAttribute("admintable", existingSeminar);
		dispatcher.forward(request, response);
		
	}
	
	
	private void insertSeminar(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		String topic = request.getParameter("topic");
		String mentor_Name = request.getParameter("mentor_Name");
		int mentor_ID = Integer.parseInt(request.getParameter("mentor_ID"));
		String description = request.getParameter("description");
		String date_Time = request.getParameter("date_Time");
		String active_Status = request.getParameter("active_Status");
		String survey_Link = request.getParameter("survey_Link");
		String seminar_Link = request.getParameter("seminar_Link");
		String documents = request.getParameter("documents");
		String feedback_Form = request.getParameter("feedback_Form");
		AdminInterfaceEl newSeminar = new AdminInterfaceEl(topic,mentor_Name,mentor_ID,description,date_Time,active_Status,survey_Link,seminar_Link,documents, feedback_Form);
		admininterfaceDAO.insertSeminar(newSeminar);
		response.sendRedirect("listS");
	}
	
	private void deleteSeminar(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		
		int seminar_ID = Integer.parseInt(request.getParameter("seminar_ID"));
//		
//		
		
		admininterfaceDAO.deleteSeminar(seminar_ID);
//		
		
		response.sendRedirect("listS");
		
	}
//	private void deleteMentor(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
//		int ment_ID = Integer.parseInt(request.getParameter("ment_ID"));
//		admininterfaceDAO.deleteMentor(ment_ID);
//		response.sendRedirect("listS");
//		
//		
//		
//	}
	
	private void updateSeminar(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
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
		String feedback_Form = request.getParameter("feedback_Form");
		
		
		AdminInterfaceEl book = new AdminInterfaceEl(seminar_ID, topic,mentor_Name,mentor_ID,description,date_Time,active_Status,survey_Link,seminar_Link,documents, feedback_Form);
		admininterfaceDAO.updateSeminar(book);
		response.sendRedirect("listS");
		
		
	}

}




























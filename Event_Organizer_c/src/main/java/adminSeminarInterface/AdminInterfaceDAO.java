package adminSeminarInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminInterfaceDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/event_organizer?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "rootuser";
    
    private static final String INSERT_SEMINAR_SQL = "INSERT INTO seminar" + " (topic, mentor_Name, mentor_ID, description, date_Time, active_Status, survey_Link, seminar_Link, documents, feedback_Form) VALUES" + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_SEMINAR_BY_ID = "select seminar_ID, topic, mentor_Name, mentor_ID, description, date_Time, active_Status, survey_Link, seminar_Link, documents, feedback_Form from seminar where seminar_ID = ?";
    private static final String SELECT_ALL_SEMINARS = "select * from seminar";
    private static final String SELECT_ALL_MENTORS = "select Mentor_ID as ment_ID, name, contact, email, qualification, work_experience, city from mentor";
    private static final String DELETE_SEMINARS_SQL = "delete from seminar where seminar_ID = ?";
//    private static final String DELETE_MENTOR_SQL = "delete from mentor where ment_ID = ?"; 
    private static final String UPDATE_SEMINARS_SQL = "update seminar set topic=?, mentor_Name=?, mentor_ID=?, description=?, date_Time=?, active_Status=?, survey_Link=?, seminar_Link=?, documents=?, feedback_Form = ? where seminar_ID = ?;";
    
    protected Connection getConnection() {
    	Connection connection = null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    		
    	}catch (SQLException e) {
    		e.printStackTrace();
    		
    	}catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	return connection;
    }
    
    public void insertSeminar(AdminInterfaceEl admintable) throws SQLException {
    	try (Connection connection = getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SEMINAR_SQL);){
    		preparedStatement.setString(1,  admintable.getTopic());
    		preparedStatement.setString(2, admintable.getMentor_Name());
    		preparedStatement.setInt(3,  admintable.getMentor_ID());
    		preparedStatement.setString(4, admintable.getDescription());
    		preparedStatement.setString(5, admintable.getDate_Time());
    		preparedStatement.setString(6, admintable.getActive_Status());
    		preparedStatement.setString(7, admintable.getSurvey_Link());
    		preparedStatement.setString(8, admintable.getSeminar_Link());
    		preparedStatement.setString(9, admintable.getDocuments());
    		preparedStatement.setString(10, admintable.getFeedback_Form());
    		
    		preparedStatement.executeUpdate();
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public boolean updateSeminar(AdminInterfaceEl admintable) throws SQLException {
    	boolean rowUpdated;
    	try (Connection connection = getConnection();
    			PreparedStatement statement= connection.prepareStatement(UPDATE_SEMINARS_SQL);){
    		statement.setString(1, admintable.getTopic());
    		statement.setString(2, admintable.getMentor_Name());
    		statement.setInt(3, admintable.getMentor_ID());
    		statement.setString(4, admintable.getDescription());
    		statement.setString(5, admintable.getDate_Time());
    		statement.setString(6, admintable.getActive_Status());
    		statement.setString(7, admintable.getSurvey_Link());
    		statement.setString(8, admintable.getSeminar_Link());
    		statement.setString(9, admintable.getDocuments());
    		statement.setString(10, admintable.getFeedback_Form());
    		statement.setInt(11, admintable.getSeminar_ID());
    		
    		
    		rowUpdated = statement.executeUpdate() > 0;
    	}
    	return rowUpdated;
    }
    
    public AdminInterfaceEl selectSeminar(int seminar_ID) {
    	AdminInterfaceEl admintable = null;
    	try (Connection connection = getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SEMINAR_BY_ID);	){
    		preparedStatement.setInt(1, seminar_ID);
    		System.out.println(preparedStatement);
    		ResultSet rs = preparedStatement.executeQuery();
    		
    		
    		while (rs.next()) {
    			String topic = rs.getString("topic");
    			String mentor_Name = rs.getString("mentor_Name");
    			int mentor_ID = rs.getInt("mentor_ID");
    			String description = rs.getString("description");
    			String date_Time = rs.getString("date_Time");
    			String active_Status = rs.getString("active_Status");
    			String survey_Link = rs.getString("survey_Link");
    			String seminar_Link = rs.getString("seminar_Link");
    			String documents = rs.getString("documents");
    			String feedback_Form = rs.getString("feedback_Form");
    			
    			admintable = new AdminInterfaceEl(seminar_ID, topic, mentor_Name, mentor_ID, description, date_Time, active_Status, survey_Link, seminar_Link, documents, feedback_Form);
    		
    		}
    	}catch (SQLException e) {
			e.printStackTrace();
    	}
    	return admintable;
    }
    
    
    
    
    public List<AdminInterfaceEl> selectAllSeminars() {
    	List<AdminInterfaceEl> admintable = new ArrayList<>();
    	try(Connection connection = getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SEMINARS);
    			){
    		System.out.println(preparedStatement);
    		ResultSet rs = preparedStatement.executeQuery();
    		
    		
    		
    		while(rs.next()) {
    			int seminar_ID = rs.getInt("seminar_ID");
    			String topic = rs.getString("topic");
    			String mentor_Name = rs.getString("mentor_Name");
    			int mentor_ID = rs.getInt("mentor_ID");
    			String description = rs.getString("description");
    			String date_Time = rs.getString("date_Time");
    			String active_Status = rs.getString("active_Status");
    			String survey_Link = rs.getString("survey_Link");
    			String seminar_Link = rs.getString("seminar_Link");
    			String documents = rs.getString("documents");
    			String feedback_Form = rs.getString("feedback_Form");
    			
    			admintable.add(new AdminInterfaceEl(seminar_ID, topic, mentor_Name, mentor_ID, description, date_Time, active_Status, survey_Link, seminar_Link, documents, feedback_Form));
   	
    		} 		
    	}catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return admintable;
    }
    public List<AdminInterfaceEl> selectAllMentors() {
    	List<AdminInterfaceEl> mentortable = new ArrayList<>();
    	try(Connection connection = getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_MENTORS);) {
    		System.out.println(preparedStatement);
    		ResultSet rs = preparedStatement.executeQuery();
    		
    		while(rs.next()) {
    			int ment_ID = rs.getInt("ment_ID");
    			String name = rs.getString("name");
    			String contact = rs.getString("contact");
    			String email = rs.getString("email");
    			String qualification = rs.getString("qualification");
    			String work_experience = rs.getString("work_experience");
    			String city = rs.getString("city");
    			
    			mentortable.add(new AdminInterfaceEl(ment_ID, name, contact, email, qualification, work_experience, city));
    			
    		}
    	}catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return mentortable;
    }
    
    
    
    
    public boolean deleteSeminar(int seminar_ID) throws SQLException {
    	boolean rowDeleted;
    	try (Connection connection = getConnection();
    			PreparedStatement statement = connection.prepareStatement(DELETE_SEMINARS_SQL);) {
    		statement.setInt(1, seminar_ID);
    		rowDeleted = statement.executeUpdate() > 0;
    	}
    	return rowDeleted;
    }
    
    
//   public boolean deleteMentor(int ment_ID) throws SQLException {
//	   boolean rowMentorDeleted;
//	   try (Connection connection = getConnection();
//			   PreparedStatement statement = connection.prepareStatement(DELETE_MENTOR_SQL);){
//		   statement.setInt(1, ment_ID);
//		   rowMentorDeleted = statement.executeUpdate() > 0;
//	   }
//	   return rowMentorDeleted;
//   }
//    
 
    
    
    
  
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

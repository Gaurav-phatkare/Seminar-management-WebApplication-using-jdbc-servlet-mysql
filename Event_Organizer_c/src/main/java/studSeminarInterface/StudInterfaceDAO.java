package studSeminarInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudInterfaceDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/event_organizer?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "rootuser";
    
    
    private static final String SELECT_ALL_SEMINARS = "select * from seminar where active_Status ='Upcoming' or active_Status = 'ongoing'";
    private static final String SELECT_ALL_PAST_SEMINARS = "select * from seminar where active_Status = 'Past'";
    
    
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
    
    

    
    public List<StudInterfaceEl> selectAllSeminars() {
    	List<StudInterfaceEl> studseminartable = new ArrayList<>();
    	try (Connection connection = getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SEMINARS);){
    		System.out.println(preparedStatement);
    		ResultSet rs = preparedStatement.executeQuery();
    		
    		while (rs.next()) {
    			int seminar_ID = rs.getInt("seminar_ID");
    			String topic = rs.getString("topic");
    			String mentor_Name = rs.getString("mentor_Name");
    			String description = rs.getString("description");
    			String date_Time = rs.getString("date_Time");
    			String active_Status = rs.getString("active_Status");
    			String survey_Link = rs.getString("survey_Link");
    			String seminar_Link = rs.getString("seminar_Link");
    			String documents = rs.getString("documents");
    			String feedback_Form = rs.getString("feedback_Form");
    			
    			studseminartable.add(new StudInterfaceEl(seminar_ID, topic, mentor_Name, description, date_Time, active_Status, survey_Link, seminar_Link, documents, feedback_Form));
    		}
    	}catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return studseminartable;
    }
    
    public List<StudInterfaceEl> selectAllPastSeminars() {
    	List<StudInterfaceEl> studseminartableT = new ArrayList<>();
    	try (Connection connection = getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PAST_SEMINARS);){
    		System.out.println(preparedStatement);
    		ResultSet rs = preparedStatement.executeQuery();
    		
    		while (rs.next()) {
    			int seminar_ID = rs.getInt("seminar_ID");
    			String topic = rs.getString("topic");
    			String mentor_Name = rs.getString("mentor_Name");
    			String date_Time = rs.getString("date_Time");
    			String active_Status = rs.getString("active_Status");
    			String documents = rs.getString("documents");
    			String feedback_Form = rs.getString("feedback_Form");
    			
    			studseminartableT.add(new StudInterfaceEl(seminar_ID, topic, mentor_Name, date_Time, active_Status, documents, feedback_Form));
    			
    			
    		}
    	}catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return studseminartableT;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

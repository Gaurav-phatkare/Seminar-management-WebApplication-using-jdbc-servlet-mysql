package seminardatatable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SeminarTableDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/event_organizer?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "rootuser";
    
    
    private static final String INSERT_SEMINAR_SQL = "INSERT INTO seminar" + " (topic, mentor_Name, mentor_ID, description, date_Time, active_Status, survey_Link, seminar_Link, documents) VALUES" + "(?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_SEMINAR_BY_ID = "select seminar_ID, topic, mentor_Name, mentor_ID, description, date_Time, active_Status, survey_Link, seminar_Link, documents from seminar where seminar_ID = ?";
    private static final String SELECT_ALL_SEMINARS = "select * from seminar";
    private static final String DELETE_SEMINARS_SQL = "delete from seminar where seminar_ID = ?";
    private static final String UPDATE_SEMINARS_SQL = "update seminar set topic=?, mentor_Name=?, mentor_ID=?, description=?, date_Time=?, active_Status=?, survey_Link=?, seminar_Link=?, documents=? where seminar_ID = ?;";
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
    
    
    
//    create or insert seminar
    public void insertSeminar(SeminarTable seminartable) throws SQLException {
    	try (Connection connection = getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SEMINAR_SQL);) {
    		preparedStatement.setString(1, seminartable.getTopic());
    		preparedStatement.setString(2, seminartable.getMentor_Name());
    		preparedStatement.setInt(3, seminartable.getMentor_ID());
    		preparedStatement.setString(4, seminartable.getDescription());
    		preparedStatement.setString(5, seminartable.getDate_Time());
    		preparedStatement.setString(6, seminartable.getActive_Status());
    		preparedStatement.setString(7, seminartable.getSurvey_Link());
    		preparedStatement.setString(8, seminartable.getSeminar_Link());
    		preparedStatement.setString(9, seminartable.getDocuments());
    		
    		preparedStatement.executeUpdate();
    		
    		
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
//    update seminar
    public boolean updateSeminar(SeminarTable seminartable) throws SQLException {
    	boolean rowUpdated;
    	try (Connection connection = getConnection();
    			PreparedStatement statement = connection.prepareStatement(UPDATE_SEMINARS_SQL);){
    		statement.setString(1, seminartable.getTopic());
    		statement.setString(2, seminartable.getMentor_Name());
    		statement.setInt(3, seminartable.getMentor_ID());
    		statement.setString(4, seminartable.getDescription());
    		statement.setString(5, seminartable.getDate_Time());
    		statement.setString(6, seminartable.getActive_Status());
    		statement.setString(7, seminartable.getSurvey_Link());
    		statement.setString(8, seminartable.getSeminar_Link());
    		statement.setString(9, seminartable.getDocuments());
    		statement.setInt(10, seminartable.getSeminar_ID());
    		
    		rowUpdated = statement.executeUpdate() > 0;
    	}
    	return rowUpdated;
    }
    
    
//    select seminar by id:
    public SeminarTable selectSeminar(int seminar_ID) {
    	SeminarTable seminartable = null;
    	try (Connection connection = getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SEMINAR_BY_ID);) {
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
    			seminartable = new SeminarTable(seminar_ID, topic, mentor_Name, mentor_ID, description, date_Time, active_Status, survey_Link, seminar_Link, documents);
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return seminartable;
    }
    
    
//    select All Seminars
    public List<SeminarTable> selectAllSeminars() {
    	List<SeminarTable> seminartable = new ArrayList<>();
    	try (Connection connection = getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SEMINARS);) {
    		System.out.println(preparedStatement);
    		ResultSet rs = preparedStatement.executeQuery();
    		
    		while (rs.next()) {
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
    			seminartable.add(new SeminarTable(seminar_ID, topic, mentor_Name, mentor_ID, description, date_Time, active_Status, survey_Link, seminar_Link, documents));
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return seminartable;
    }
    
    
//    past seminars
    public List<SeminarTable> selectAllPastSeminars() {
    	List<SeminarTable> seminartablesT = new ArrayList<>();
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
    			
    			seminartablesT.add(new SeminarTable(seminar_ID, topic, mentor_Name, date_Time, active_Status, documents));
    			
    		}
    	}catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return seminartablesT;
    }
    
//    delete seminars
    public boolean deleteSeminar(int seminar_ID) throws SQLException {
    	boolean rowDeleted;
    	try (Connection connection = getConnection();
    			PreparedStatement statement = connection.prepareStatement(DELETE_SEMINARS_SQL);){
    		statement.setInt(1, seminar_ID);
    		rowDeleted = statement.executeUpdate() > 0;
    	}
    	return rowDeleted;
    }
}

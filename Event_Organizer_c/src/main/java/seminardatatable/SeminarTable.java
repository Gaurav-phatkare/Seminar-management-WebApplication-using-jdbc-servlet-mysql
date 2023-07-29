package seminardatatable;

public class SeminarTable {
	private int seminar_ID;
	private String topic;
	private String mentor_Name;
	private int mentor_ID;
	private String description;
	private String date_Time;
	private String active_Status;
	private String survey_Link;
	private String seminar_Link;
	private String documents;
	
	
	
	public SeminarTable() {}
	
	
	
	public SeminarTable(int seminar_ID, String topic, String mentor_Name, String date_Time, String active_Status,
			String documents) {
		super();
		this.seminar_ID = seminar_ID;
		this.topic = topic;
		this.mentor_Name = mentor_Name;
		this.date_Time = date_Time;
		this.active_Status = active_Status;
		this.documents = documents;
	}



	public SeminarTable(String topic, String mentor_Name, int mentor_ID, String description, String date_Time,
			String active_Status, String survey_Link, String seminar_Link, String documents) {
		super();
		this.topic = topic;
		this.mentor_Name = mentor_Name;
		this.mentor_ID = mentor_ID;
		this.description = description;
		this.date_Time = date_Time;
		this.active_Status = active_Status;
		this.survey_Link = survey_Link;
		this.seminar_Link = seminar_Link;
		this.documents = documents;
	}
	public SeminarTable(int seminar_ID, String topic, String mentor_Name, int mentor_ID, String description,
			String date_Time, String active_Status, String survey_Link, String seminar_Link, String documents) {
		super();
		this.seminar_ID = seminar_ID;
		this.topic = topic;
		this.mentor_Name = mentor_Name;
		this.mentor_ID = mentor_ID;
		this.description = description;
		this.date_Time = date_Time;
		this.active_Status = active_Status;
		this.survey_Link = survey_Link;
		this.seminar_Link = seminar_Link;
		this.documents = documents;
	}
	public int getSeminar_ID() {
		return seminar_ID;
	}
	public void setSeminar_ID(int seminar_ID) {
		this.seminar_ID = seminar_ID;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getMentor_Name() {
		return mentor_Name;
	}
	public void setMentor_Name(String mentor_Name) {
		this.mentor_Name = mentor_Name;
	}
	public int getMentor_ID() {
		return mentor_ID;
	}
	public void setMentor_ID(int mentor_ID) {
		this.mentor_ID = mentor_ID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate_Time() {
		return date_Time;
	}
	public void setDate_Time(String date_Time) {
		this.date_Time = date_Time;
	}
	public String getActive_Status() {
		return active_Status;
	}
	public void setActive_Status(String active_Status) {
		this.active_Status = active_Status;
	}
	public String getSurvey_Link() {
		return survey_Link;
	}
	public void setSurvey_Link(String survey_Link) {
		this.survey_Link = survey_Link;
	}
	public String getSeminar_Link() {
		return seminar_Link;
	}
	public void setSeminar_Link(String seminar_Link) {
		this.seminar_Link = seminar_Link;
	}
	public String getDocuments() {
		return documents;
	}
	public void setDocuments(String documents) {
		this.documents = documents;
	}
	
	
	
	
}

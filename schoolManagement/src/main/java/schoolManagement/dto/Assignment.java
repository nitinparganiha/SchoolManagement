package schoolManagement.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Assignment {
	@Id
private int assignmentid;
private String subject;
private String assignment;
private int marks;
private Date date;
private int clas;

public int getClas() {
	return clas;
}
public void setClas(int clas) {
	this.clas = clas;
}
public int getAssignmentid() {
	return assignmentid;
}
public void setAssignmentid(int assignmentid) {
	this.assignmentid = assignmentid;
}

public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getAssignment() {
	return assignment;
}
public void setAssignment(String assignment) {
	this.assignment = assignment;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}



}

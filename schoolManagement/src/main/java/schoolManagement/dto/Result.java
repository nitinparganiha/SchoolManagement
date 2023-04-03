package schoolManagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {
	@Id
private int id;
private String subject;
private int marks;
private String email;
private int clas;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getClas() {
	return clas;
}
public void setClas(int clas) {
	this.clas = clas;
}

}

package schoolManagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.mysql.cj.jdbc.Blob;

@Entity
public class SubmitAsg {
	@Id
private int id;
private String email;
private int clas;
private String subject;
private String date;
//private Blob file;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
//public Blob getFile() {
//	return file;
//}
//public void setFile(Blob file) {
//	this.file = file;
//}


}

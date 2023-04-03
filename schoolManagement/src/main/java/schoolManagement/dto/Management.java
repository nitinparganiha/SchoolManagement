package schoolManagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Management {
	@Id
private int id;
private String name;
private int pass;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPass() {
	return pass;
}
public void setPass(int pass) {
	this.pass = pass;
}


}

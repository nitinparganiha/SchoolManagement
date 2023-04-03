package schoolManagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private int id;
private String name;
private int clas;
private int age;
private String address;
private int pass;

public int getClas() {
	return clas;
}
public void setClas(int clas) {
	this.clas = clas;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
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

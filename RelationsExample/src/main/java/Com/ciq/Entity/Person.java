package Com.ciq.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table

public class Person {
	@Id
	@GenericGenerator(name="Identity_tab",strategy="identity")
	@GeneratedValue(strategy=GenerationType.IDENTITY,generator="identity_tab")
private long pid;

private String firstname;

private String secondname;

public Person() {
	// TODO Auto-generated constructor stub
}

public Person(long pid,String firstname, String secondname) {
	super();
	this.firstname = firstname;
	this.secondname = secondname;
}
public Person(String firstname, String secondname) {
	super();
	this.firstname = firstname;
	this.secondname = secondname;
}



public long getPid() {
	return pid;
}

public void setPid(long pid) {
	this.pid = pid;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getSecondname() {
	return secondname;
}

public void setSecondname(String secondname) {
	this.secondname = secondname;
}


}

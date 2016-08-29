package shadman.project.tms.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	private  int id;
	private  String name;
	private  String position;
	private  String department;

	//Default Constructor




	//Constructor with some data

	public Person(String name,int id, String position, String department) {
		this.name = name;
		this.id = id;
		this.position = position;
		this.department =  department;
	}

	//getters and setters

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position){
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department){
		this.department = department;
	}


}

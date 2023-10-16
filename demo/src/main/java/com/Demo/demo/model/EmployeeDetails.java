package com.Demo.demo.model;


public class EmployeeDetails {
	
private  String firstName;
private String lastName;
private int age;
private  String deprtment;

public EmployeeDetails(String firstName, String lastName, int age, String deprtment) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.deprtment = deprtment;
}
 public EmployeeDetails() {
	 
 }

public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public int getAge() {
	return age;
}
public String getDeprtment() {
	return deprtment;
}

}

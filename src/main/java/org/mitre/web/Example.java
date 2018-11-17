package org.mitre.web;

public class Example {
private int eid;
private String name;
private String lastName;

Example(){
	
}
public Example(int eid, String name, String lastName){
	this.eid = eid;
	this.name= name;
	this.lastName = lastName;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
@Override
public String toString() {
	return "Example [eid=" + eid + ", name=" + name + ", lastName=" + lastName + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
}

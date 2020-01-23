package com.spring5.practice.model;

public class University {
	

private int id;
private String name;
private String rank;
private String numOfDepartment;
private String uniCode;

public University() {
	super();
}

public University(int id, String name, String rank, String numOfDepartment) {
	super();
	this.id = id;
	this.name = name;
	this.rank = rank;
	this.numOfDepartment = numOfDepartment;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUniCode() {
	return uniCode;
}

public void setUniCode(String uniCode) {
	this.uniCode = uniCode;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRank() {
	return rank;
}

public void setRank(String rank) {
	this.rank = rank;
}

public String getNumOfDepartment() {
	return numOfDepartment;
}

public void setNumOfDepartment(String numOfDepartment) {
	this.numOfDepartment = numOfDepartment;
}

@Override
public String toString() {
	return "University [id=" + id + ", name=" + name + ", rank=" + rank + ", numOfDepartment=" + numOfDepartment + "]";
}





	


}

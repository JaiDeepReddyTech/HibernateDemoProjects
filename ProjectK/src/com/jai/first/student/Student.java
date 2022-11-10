package com.jai.first.student;

public class Student  {
private int id;
private String name;
private String mobileNo;
private int age;
public Student(int id, String name, String mobileNo, int age) {
	super();
	this.id = id;
	this.name = name;
	this.mobileNo = mobileNo;
	this.age = age;
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

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + ", age=" + age + "]";
}

}
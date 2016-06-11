package com.test.aopEx;

public class Student {
	private String name;
	private String hakbun;
	private String age;
	private String grade;
	
	public void getInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("학번 : " + getHakbun());
		System.out.println("나이 : " + getAge());
		System.out.println("학년 : " + getGrade());
		
	}
	
	// setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}

package com.NepalCode.SpringvalueAnno;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
	
	
	/*
	//@Value("Yuvi")
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	
	@Required
	//@Value("PHP")
	@Value("${student.interestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	
	@Required
	//@Value("BaseBall")
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	*/
	
	
	public void displayStudentInfo() {
		System.out.println("Student name " + name);
		System.out.println("Interested course " +interestedCourse );
		System.out.println("Student hobby " + hobby);
	}
	
	

}

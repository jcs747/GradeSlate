package com.gradeslate.gradeslate.backend;

import java.io.Serializable;

public class Course implements Serializable {
	
	private Bookbag knapsack= new Bookbag();
	private Grades grades = new Grades();
	private Professor prof;
	private String title;
	private int credHour = 0;
	private String description;
	
	/********************
	 * 
	 * adding times for labs, tests, assignments and other
	 */

	public Course(String title, int credHour){
		this.title = title;
		this.credHour = credHour;
		prof = new Professor();
	}
	
	public Professor getProf(){
		return prof;
	}
	
	public Grades getGrades(){
		return grades;
	}
	
	public Bookbag getBag(){
		return knapsack;
	}
	
	public String getTitle(){
		return title;
	}

	
	public void inDes(String des){
		this.description = des;
	}
	
	public String getDes(){
		return description;
	}
	
	public char letGrd(){
		return grades.getLetGrd();
	}
	
	public int getCredHour(){
		return credHour;
	}
	

}

package com.gradeslate.gradeslate;
import java.util.ArrayList;

public class Courses {
	private ArrayList<Course>  courses = new ArrayList<Course>();
	private float gpa = 0;
	private String semester = "";
	
	Courses(String semester){
		this.semester = semester;
	}
	
	public void addCourse(String title, int time, int credHour){
		Course next = new Course(title, time, credHour);
		courses.add(next);
	}
	
	public Course getCourse(String title){
		for(Course find:courses)
			if(find.getTitle() == title)
				return find;
		return null;
	}

	public void setName(String semester){
		this.semester = semester;
	}

	public String getName(){
		return semester;
	}
	
	
	public float calcGPA(){
		int sumGPA = 0;
		int count = courses.size();
		
		for(Course calc:courses){
			if(calc.letGrd() == 'A'){
				sumGPA += 4*calc.getCredHour();
				count++;
			}
			else if(calc.letGrd() == 'B'){
				sumGPA += 3*calc.getCredHour();
				count++;
			}
			else if(calc.letGrd() == 'C'){
				sumGPA += 2*calc.getCredHour();
				count++;
			}
			else if(calc.letGrd() == 'D'){
				sumGPA += 1*calc.getCredHour();
				count++;
			}
			else if(calc.letGrd() == 'F'){
				sumGPA += 0;
				count++;
			}

		}
		
		gpa = sumGPA/count;
		
		return gpa;
			
	}
}

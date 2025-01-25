package org.generation.practice;

import java.util.ArrayList;

public class Course {
	String courseName, professorName;
	int year;
	
	ArrayList<Student> studentsEnrolled = new ArrayList<>();
	
	public Course(String courseName, String professorName, int year) {
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}
	
	public void enroll(Student student){
		studentsEnrolled.add(student);
		System.out.println(student.firstName + " " + student.lastName + " was enrolled to " + courseName + ".\n");
	}
	public void enroll(Student[] students) {
		String studentsEnrolled = students[0].firstName + " " + students[0].lastName;
		this.studentsEnrolled.add(students[0]);
		for (int i = 1; i < students.length; i++) {
			this.studentsEnrolled.add(students[i]);
			studentsEnrolled += ", " + students[i].firstName + " " + students[i].lastName;
		}
		System.out.println("Students (" + studentsEnrolled + ") were enrolled to " + courseName + " course.\n");
	}

    public void unEnroll(Student student){
    	if(studentsEnrolled.remove(student)) System.out.println(student.firstName + " " + student.lastName + " was unenrolled to " + courseName + ".\n");
    	else System.out.println(student.firstName + " " + student.lastName + " is not part of " + courseName + " course.\n");
    }

    public int countStudents(){
    	return studentsEnrolled.size();
    }
    
    public int bestGrade(){
    	int grade = 0;
    	for (Student student : studentsEnrolled) {
			if(student.grade > grade) grade = student.grade;
		}
        return grade;
    }
    
    public double printAverageGrade() {
    	double average = 0;
    	for (Student student : studentsEnrolled) {
			average += student.grade;
		}
    	average /= studentsEnrolled.size();
    	System.out.println("Average grade on " + courseName + " course: " + average + ".\n");
    	return average;
    }
    
    // Don't sure
    public void ranking() {
    	if(studentsEnrolled.size() == 0) {
    		System.out.println("There is no students to rank.\n");
    		return;
    	}
        ArrayList<Student> ranking = new ArrayList<>();
        ranking.add(studentsEnrolled.get(0));

        for(int i = 1; i < studentsEnrolled.size(); i++) {
        	if(studentsEnrolled.get(i).grade > ranking.get(0).grade) ranking.add(0, studentsEnrolled.get(i));
        	else ranking.add(studentsEnrolled.get(i));
        }

        System.out.println("<<<<< " + courseName + " course ranking >>>>>\n");
        for (int i = 0; i < ranking.size(); i++) {
            System.out.println((i + 1) + ". " + ranking.get(i).firstName + " " + ranking.get(i).lastName + ". Grade: " + ranking.get(i).grade + "\n");
        }
        System.out.println();
    }
    
    public void aboveAverage() {
    	double average = printAverageGrade();
    	System.out.println(courseName + " course average grade: " + average);
    	for (Student student : studentsEnrolled) {
            String comparison = (student.grade > average) ? "greater" : "lower";
            System.out.println(student.firstName + " " + student.lastName + "'s grade (" + student.grade + ") is " + comparison + " than the course average.");
        }
    	System.out.println();
    }

	@Override
	public String toString() {
		return "<<< Course information >>>\nCourse name: " + courseName + ",\nProfessor name: " + professorName + ",\nYear: " + year + ",\nStudents enrolled: (\n" + studentsEnrolled + "\n)\n";
	}
}
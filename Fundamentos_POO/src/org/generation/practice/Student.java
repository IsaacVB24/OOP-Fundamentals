package org.generation.practice;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student(String firstName, String lastName, int registration, int grade, int year) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.registration = registration;
    	this.grade = grade;
    	this.year = year;
    }
    public Student(String firstName, String lastName, int registration) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.registration = registration;
    }
    public Student(String firstName, String lastName, int registration, int grade) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.registration = registration;
    	this.grade = grade;
    }
    
    public void printFullName(){
        System.out.println("Student's full name: " + firstName + " " + lastName + "\n");
     }

     public boolean isApproved(){
    	 boolean approved = false;
    	 if(grade >= 60) approved = true;
    	 return approved;
     }

     public void changeYearIfApproved(){
    	 if(isApproved()) {
    		 year++;
    		 System.out.println("Congratulations, " + firstName + "!\n");
    	 } else {
    		 System.out.println("Sorry, " + firstName + " " + lastName + ". You are not approved.\n");
    	 }
     }
     
     @Override
     public String toString() {
    	 return "<<< Student information >>> \n{"
    	 		+ "\n\tFirst name: " + firstName + ","
    	 		+ "\n\tLast name: " + lastName + ","
    	 		+ "\n\tRegistration: " + registration + ","
    	 		+ "\n\tGrade: " + grade + ","
    	 		+ "\n\tYear: " + year + "\n"
    	 		+ "}\n";
     }
}
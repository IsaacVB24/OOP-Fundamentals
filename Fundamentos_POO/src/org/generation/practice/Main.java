package org.generation.practice;

public class Main {
	public static void main(String[] args) {
		Course maths = new Course("Maths", "Chevtorisky", 2025);
		Course physics = new Course("Physics", "Riley", 2025);
		Course language = new Course("Language", "Casey", 2025);
		Course sports = new Course("Sports", "Alex", 2025);

		Student student1 = new Student("Emma", "Johnson", 20250125, 89, 2025);
		Student student2 = new Student("Liam", "Carter", 20250126, 70, 2026);
		Student student3 = new Student("Sophia", "Wilson", 20250127, 99, 2027);
		Student student4 = new Student("Oliver", "Taylor", 20250128, 49, 2028);
		Student student5 = new Student("Ava", "Smith", 20250129, 75, 2029);
		Student student6 = new Student("Ethan", "Davis", 20250130, 88, 2030);
		Student student7 = new Student("Noah", "Anderson", 20250131, 64, 2031);
		
		System.out.println(student1);
		student1.changeYearIfApproved();
		System.out.println(student1);
		student2.printFullName();
		student4.changeYearIfApproved();
		
		Student[] students = {student3, student5, student6};
		Student[] students2 = {student1, student4, student7};
		
		System.out.println(maths.professorName + ".\n");
		System.out.println(maths);
		maths.enroll(students);
		System.out.println(maths);
		physics.enroll(student7);
		System.out.println("Number of students on physics course: " + physics.countStudents() + ".\n");
		maths.unEnroll(student5);
		System.out.println("Number of students on maths course: " + maths.countStudents() + ".\n");
		System.out.println(maths);
		System.out.println("Best grade on maths course: " + maths.bestGrade() + ".\n");
		language.enroll(student2);
		language.enroll(student4);
		System.out.println("Best grade on language course: " + language.bestGrade() + ".\n");
		sports.enroll(students2);
		System.out.println(sports);
		maths.unEnroll(student7);
		student7.changeYearIfApproved();
		student4.changeYearIfApproved();
		System.out.println(language);
		language.printAverageGrade();
		maths.ranking();
		maths.enroll(students2);
		maths.ranking();
		maths.aboveAverage();
	}
}
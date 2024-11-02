package part1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Declare
		Student student_1 = new Student();
		Student student_2 = new Student();

		// Input
		System.out.println("Enter student id 1: ");
		student_1.id = scanner.nextLine();
		System.out.println("Enter full name 1: ");
		student_1.name = scanner.nextLine();
		System.out.println("Enter math score: ");
		student_1.math = scanner.nextFloat();
		System.out.println("Enter physic score: ");
		student_1.physic = scanner.nextFloat();
		System.out.println("Enter chemistry score: ");
		student_1.chemistry = scanner.nextFloat();
		student_1.setAverage_score(student_1.math, student_1.physic, student_1.chemistry);
		student_1.setRate(student_1.average_score);

		scanner.nextLine();
		System.out.println("Enter student id 2: ");
		student_2.id = scanner.nextLine();
		System.out.println("Enter full name 2: ");
		student_2.name = scanner.nextLine();
		System.out.println("Enter math score: ");
		student_2.math = scanner.nextFloat();
		System.out.println("Enter physic score: ");
		student_2.physic = scanner.nextFloat();
		System.out.println("Enter chemistry score: ");
		student_2.chemistry = scanner.nextFloat();
		student_2.setAverage_score(student_2.math, student_2.physic, student_2.chemistry);
		student_2.setRate(student_2.average_score);

		// Output
		System.out.println("Student id 1: " + student_1.getId());
		System.out.println("Student name 1: " + student_1.getName());
		System.out.println("Math: " + student_1.getMath());
		System.out.println("Physic: " + student_1.getPhysic());
		System.out.println("Chemistry: " + student_1.getChemistry());
		System.out.println("Total: " + student_1.getAverage_score());
		System.out.println("Rate: " + student_1.getRate());
		System.out.println("-------------------------------");
		System.out.println("Student id 1: " + student_2.getId());
		System.out.println("Student name 1: " + student_2.getName());
		System.out.println("Math: " + student_2.getMath());
		System.out.println("Physic: " + student_2.getPhysic());
		System.out.println("Chemistry: " + student_2.getChemistry());
		System.out.println("Total: " + student_2.getAverage_score());
		System.out.println("Rate: " + student_2.getRate());

	}
}

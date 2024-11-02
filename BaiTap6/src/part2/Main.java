package part2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Declare
		int quantity, option;
		StudentManagement manage = new StudentManagement();
		System.out.println("Enter student quantity: ");
		quantity = scanner.nextInt();

		// Input
		do {
			System.out.println("---------------------------------------");
			System.out.println("1. Create fake data. ");
			System.out.println("2. List student. ");
			System.out.println("3. Student with the highest score. ");
			System.out.println("4. Students with the weak rate. ");
			System.out.println("5. Find student with name. ");
			System.out.println("6. Find student with id. ");
			System.out.println("7. Remove student with id. ");
			System.out.println("---------------------------------------");
			System.out.println("Option: ");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				manage.createFakeData(quantity);
				break;
			case 2:
				if (manage.checkEmpty() == false) {
					System.out.println("List null.");
				} else {
					manage.listStudent();
				}
				break;
			case 3:
				if (manage.checkEmpty() == false) {
					System.out.println("List null.");
				} else {
					System.out.println("Student with the highest score: \n" + manage.studentWithTheHighestScore());

				}

				break;
			case 4:
				if (manage.checkEmpty() == false) {
					System.out.println("List null.");
				} else {
					System.out.println("List student with the weak rate: ");
					manage.studentWithWeakRate();
				}
				break;
			case 5:
				if (manage.checkEmpty() == false) {
					System.out.println("List null.");
				} else {
					scanner.nextLine();
					String name = "";
					System.out.println("Enter student name: ");
					name = scanner.nextLine();
					manage.findStudentWithName(name);
				}

				break;
			case 6:
				if (manage.checkEmpty() == false) {
					System.out.println("List null.");
				} else {
					scanner.nextLine();
					int findId;
					System.out.println("Enter student id: ");
					findId = scanner.nextInt();
					if (manage.findStudentWithId(findId) == null) {
						System.out.println("Not found student with id: " + findId);
					} else {
						System.out.println(manage.findStudentWithId(findId));
					}
				}

				break;
			case 7:
				if (manage.checkEmpty() == false) {
					System.out.println("List null.");
				} else {
					scanner.nextLine();
					int removeId;
					System.out.println("Enter student id: ");
					removeId = scanner.nextInt();
					if (manage.removeStudentWithId(removeId) == false) {
						System.out.println("Not found student id: " + removeId);
					} else {
						System.out.println("Deleted successfully!");
						manage.removeStudentWithId(removeId);

					}
				}

				break;

			default:
				break;
			}
		} while (option != 0);

	}
}

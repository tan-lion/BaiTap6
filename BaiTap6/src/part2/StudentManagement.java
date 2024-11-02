package part2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class StudentManagement {
	private List<Student> listStudent;

	public StudentManagement() {
		this.listStudent = new ArrayList<>();
	}

	public StudentManagement(List<Student> listStudent) {
		super();
		this.listStudent = listStudent;
	}

	public void addStudent(Student student) {
		listStudent.add(student);
	}

	public void listStudent() {
		for (Student student : listStudent) {
			System.out.println(student);
		}
	}

	public boolean checkEmpty() {
		if (listStudent.isEmpty()) {
			return false;
		}
		return true;
	}

	public Student studentWithTheHighestScore() {
		Student studenthighestScore = listStudent.get(0);

		for (Student student : listStudent) {
			if (student.average_score > studenthighestScore.average_score) {
				studenthighestScore = student;
			}
		}
		return studenthighestScore;
	}

	public void studentWithWeakRate() {
		List<Student> listWeakStudent = new ArrayList<>();
		for (Student student : listStudent) {
			if ((student.rate).equals("Weak")) {
				listWeakStudent.add(student);
			}
		}
		for (Student student : listWeakStudent) {
			System.out.println(student);
		}
	}

	public void findStudentWithName(String name) {
		for (Student student : listStudent) {
			if ((student.name).contains(name)) {
				System.out.println(student);
			}
		}
	}

	public Student findStudentWithId(int findId) {
		for (Student student : listStudent) {
			if (student.id == findId) {
				return student;
			}
		}
		return null;
	}

	public boolean removeStudentWithId(int removeId) {
		boolean check=false;
		for (int i = 0; i < listStudent.size(); i++) {
			Student student=listStudent.get(i);
			if(student.id==removeId) {
				listStudent.remove(i);
				check=true;
			}
		}
		return check;
	}

	public void createFakeData(int quantity) {
		Random random = new Random();

		for (int i = 0; i < quantity; i++) {
			int studentID = (i + 1);
			String name = "Student " + (i + 1);
			float math = random.nextFloat() * 10;
			float physic = random.nextFloat() * 10;
			float chemistry = random.nextFloat() * 10;
			float average_score = (math + physic + chemistry) / 3;
			String rate = "";
			if (average_score >= 5) {
				rate = "Ordinary";
			}
			if (average_score >= 6) {
				rate = "Average good";
			}
			if (average_score >= 7) {
				rate = "Good";
			}
			if (average_score >= 8) {
				rate = "Verry good";
			}
			if (average_score >= 9) {
				rate = "Excellent";
			}
			if (average_score < 5) {
				rate = "Weak";
			}

			Student student = new Student(studentID, name, math, physic, chemistry, average_score, rate);
			listStudent.add(student);
		}
	}

}

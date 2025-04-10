package Chapter007.Ex04;

import java.util.ArrayList;

public class Student {

	int                studentID;
	String             studentName;
	ArrayList<Subject> subjectList;

	// 학생 생성자
	public Student(int studentID, String studentName) {
		this.studentID   = studentID;
		this.studentName = studentName;
		subjectList      = new ArrayList<Subject>();
	}

	// 과목 추가하기
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}

	public void showStudentInfo() {
		int total = 0;

		for (Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.print("학생 " + studentName + "의 " + subject.getName());
			System.out.println(" 과목 성적은 " + subject.getScorePoint() + "입니다.");
		}

		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
}

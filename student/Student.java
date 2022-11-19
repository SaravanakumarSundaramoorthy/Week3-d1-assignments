package org.student;

import org.department.*;

public class Student extends Department {

	private void studentName() {
		System.out.println("Saravanakumar S");
	}

	private void studentDept() {
		System.out.println("ECE");
	}

	private void studentId() {
		System.out.println("L27");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student my = new Student();

		my.collegeName();
		my.collegeCode();
		my.collegeRank();
		my.deptName();
		my.studentName();
		my.studentDept();
		my.studentId();

	}

}

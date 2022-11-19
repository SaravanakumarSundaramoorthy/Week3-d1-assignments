package org.Students;

public class Students {

	private void getStudentInfo(int id) {
		System.out.println(id);
	}

	private void getStudentInfo(int id, String name) {
		System.out.println(id);
		System.out.println(name);

	}

	private void getStudentInfo(String email, int i) {
		System.out.println(email);
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s = new Students();
		s.getStudentInfo(27);
		s.getStudentInfo(27, "Saravanakumar");
		s.getStudentInfo("saravana@gmail.com", 27);
	}

}

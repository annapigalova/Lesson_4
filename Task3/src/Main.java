import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Student> studentsList = initStudents();
		
		calcStatistics(studentsList);
		showDetailInfo(studentsList);
		
	}

	public static ArrayList<Student> initStudents() {

		Student std1 = new Student();
		std1.setFirstName("Ivan");
		std1.setLastName("Ivanov");

		ArrayList<Integer> markStd1 = new ArrayList<Integer>();
		markStd1.add(4);
		markStd1.add(2);
		markStd1.add(3);
		markStd1.add(3);
		markStd1.add(5);

		std1.setMark(markStd1);

		Student std2 = new Student();

		ArrayList<Integer> markStd2 = new ArrayList<Integer>();
		std2.setFirstName("Petr");
		std2.setLastName("Petrov");

		markStd2.add(5);
		markStd2.add(2);
		markStd2.add(3);
		markStd2.add(4);
		markStd2.add(5);

		std2.setMark(markStd2);

		Student std3 = new Student();

		ArrayList<Integer> markStd3 = new ArrayList<Integer>();
		std3.setFirstName("Pavel");
		std3.setLastName("Durov");

		markStd3.add(5);
		markStd3.add(5);
		markStd3.add(5);
		markStd3.add(5);
		markStd3.add(5);

		std3.setMark(markStd3);

		Student std4 = new Student();
		std4.setFirstName("Bill");
		std4.setLastName("Geits");

		ArrayList<Integer> markStd4 = new ArrayList<Integer>();

		markStd4.add(2);
		markStd4.add(3);
		markStd4.add(4);
		markStd4.add(3);
		markStd4.add(2);

		std4.setMark(markStd4);

		ArrayList<Student> studentsList = new ArrayList<Student>();

		studentsList.add(std1);
		studentsList.add(std2);
		studentsList.add(std3);
		studentsList.add(std4);

		return studentsList;

	}

	public static void showDetailInfo(ArrayList<Student> studentsList) {
		System.out.println("Detail Information");
		System.out.println("");
		for (Student st : studentsList) {
			st.show();
		}

	}

	public static void calcStatistics(ArrayList<Student> studentsList) {
		int numberNeird = 0;
		int numberLoser = 0;
		for (Student st : studentsList) {
			if (st.isStudentNerd() == true) {
				numberNeird += 1;
			}
			if (st.isStudentLoser() == true) {
				numberLoser += 1;
			}
			
		}
		System.out.println("Number of Nerds:  " + numberNeird);
		System.out.println("Number of Losers: " + numberLoser);
		System.out.println("");

	}
}

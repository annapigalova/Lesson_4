import java.util.ArrayList;

public class Group {

	private ArrayList<Student> studentList = new ArrayList<>();
	private int groupNumber;

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void addStudent(Student st) {

		studentList.add(st);

	}

	public double avgGroupMark() {

		int sumMark = 0;
		int cnt = 0;

		for (Student st : studentList) {

			for (int i = 0; i < st.getMark().size(); i++) {
				sumMark += st.getMark().get(i);
				cnt++;
			}

		}
		double avgGroupMark = (double) sumMark / cnt;

		return avgGroupMark;
	}

	@Override
	public String toString() {

		return "Group Num: " + getGroupNumber() + System.lineSeparator() + "Average Group Mark: " + avgGroupMark()
				+ System.lineSeparator();
	}
}
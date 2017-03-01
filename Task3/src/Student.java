import java.util.ArrayList;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<Integer> mark = new ArrayList<Integer>();
	private static int idSequence = 0;

	public Student() {

		idSequence++;
		id = idSequence;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Integer> getMark() {
		return mark;
	}

	public void setMark(ArrayList<Integer> mark) {
		this.mark = mark;
	}

	public void show() {
		System.out.println("ID: " + getId());
		System.out.println("First Name: " + getFirstName());
		System.out.println("Last Name: " + getLastName());
		System.out.println("Average Mark: " + getAvgRate());
		System.out.println(" ");

	}

	public double getAvgRate() {

		double avgRate;
		int sumMark = 0;

		for (int i = 0; i < this.mark.size(); i++) {
			sumMark += this.mark.get(i);
		}
		avgRate = sumMark / (double) this.mark.size();
		return avgRate;

	}

	public boolean isStudentNerd() {

		boolean isStudentNerd = false;
		if (getAvgRate() == 5) {
			isStudentNerd = true;
		}
		return isStudentNerd;
	}

	public boolean isStudentLoser() {

		boolean isStudentLoser = false;

		for (int i = 0; i < this.mark.size(); i++) {
			if (this.mark.get(i) == 2) {
				isStudentLoser = true;
				break;
			}
		}

		return isStudentLoser;

	}

}

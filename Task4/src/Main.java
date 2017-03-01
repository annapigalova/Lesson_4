import java.util.ArrayList;
import java.util.Collections;

public class Main {
	private static final int NUM_PLACE = 3;
	
	public static void main(String[] args) {
		ArrayList<Abiturient> abiturientList = new ArrayList<Abiturient>();
		abiturientList = initAbiturient();
		sortStudentList(abiturientList);
	}

	public static ArrayList<Abiturient> initAbiturient() {

		Abiturient abt1 = new Abiturient();
		abt1.setFirstName("Ivan");
		abt1.setLastName("Ivanov");
		abt1.setBrsmMember(false);

		ArrayList<Integer> markAbt1 = new ArrayList<Integer>();
		markAbt1.add(4);
		markAbt1.add(2);
		markAbt1.add(3);
		markAbt1.add(3);
		markAbt1.add(5);

		abt1.setMark(markAbt1);

		Abiturient abt2 = new Abiturient();

		ArrayList<Integer> markAbt2 = new ArrayList<Integer>();
		abt2.setFirstName("Petr");
		abt2.setLastName("Petrov");
		abt2.setBrsmMember(false);

		markAbt2.add(5);
		markAbt2.add(2);
		markAbt2.add(3);
		markAbt2.add(4);
		markAbt2.add(5);

		abt2.setMark(markAbt2);

		Abiturient abt3 = new Abiturient();

		ArrayList<Integer> markAbt3 = new ArrayList<Integer>();
		abt3.setFirstName("Pavel");
		abt3.setLastName("Durov");
		abt3.setBrsmMember(false);

		markAbt3.add(5);
		markAbt3.add(5);
		markAbt3.add(5);
		markAbt3.add(5);
		markAbt3.add(5);

		abt3.setMark(markAbt3);

		Abiturient abt4 = new Abiturient();
		abt4.setFirstName("Bill");
		abt4.setLastName("Geits");
		abt4.setBrsmMember(false);

		ArrayList<Integer> markAbt4 = new ArrayList<Integer>();

		markAbt4.add(2);
		markAbt4.add(3);
		markAbt4.add(4);
		markAbt4.add(3);
		markAbt4.add(2);

		abt4.setMark(markAbt4);

		Abiturient abt5 = new Abiturient();
		abt5.setFirstName("Ilon");
		abt5.setLastName("Mask");
		abt5.setBrsmMember(false);

		ArrayList<Integer> markAbt5 = new ArrayList<Integer>();

		markAbt5.add(2);
		markAbt5.add(4);
		markAbt5.add(4);
		markAbt5.add(3);
		markAbt5.add(3);

		abt5.setMark(markAbt5);

		Abiturient abt6 = new Abiturient();
		abt6.setFirstName("Donald");
		abt6.setLastName("Trump");
		abt6.setBrsmMember(false);

		ArrayList<Integer> markAbt6 = new ArrayList<Integer>();

		markAbt6.add(5);
		markAbt6.add(4);
		markAbt6.add(3);
		markAbt6.add(2);
		markAbt6.add(4);

		abt6.setMark(markAbt6);

		Abiturient abt7 = new Abiturient();
		abt7.setFirstName("Tim");
		abt7.setLastName("Kuk");
		abt7.setBrsmMember(true);

		ArrayList<Integer> markAbt7 = new ArrayList<Integer>();

		markAbt7.add(2);
		markAbt7.add(4);
		markAbt7.add(4);
		markAbt7.add(4);
		markAbt7.add(4);

		abt7.setMark(markAbt7);

		ArrayList<Abiturient> abiturList = new ArrayList<Abiturient>();

		abiturList.add(abt1);
		abiturList.add(abt2);
		abiturList.add(abt3);
		abiturList.add(abt4);
		abiturList.add(abt5);
		abiturList.add(abt6);
		abiturList.add(abt7);

		return abiturList;

	}

	private static void sortStudentList(ArrayList<Abiturient> abiturientList) {

		Collections.sort(abiturientList, Abiturient.sortAvgRate);
		
		int i = 0;
	
		for (Abiturient abt : abiturientList) {
			if (i < NUM_PLACE) {
				System.out.println(i + 1);
				abt.show();

			}
			i++;
		}

	}

}

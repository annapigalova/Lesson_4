import java.util.ArrayList;
import java.util.Comparator;

public class Abiturient {

	private String firstName;
	private String lastName;
	private ArrayList<Integer> mark = new ArrayList<Integer>();
	private boolean isBrsmMember;

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

	public boolean getIsBrsmMember() {
		return isBrsmMember;
	}

	public void setBrsmMember(boolean isBrsmMember) {
		this.isBrsmMember = isBrsmMember;
	}

	@Override
	public String toString() {

		return "First Name: " + getFirstName() + System.lineSeparator() + "Last Name: " + getLastName()
				+ System.lineSeparator() + "Average Mark: " + getAvgRate() + System.lineSeparator();
	}

	public double getAvgRate() {

		double avgRate = 0;
		int sumMark = 0;
		if (mark.size() != 0) {
			for (int i = 0; i < mark.size(); i++) {
				sumMark += mark.get(i);
			}
			avgRate = sumMark / (double) mark.size();
		}
		return avgRate;

	}

	public int getMaxRate() {
		int maxRate = 0;

		for (int i = 0; i < mark.size(); i++) {
			if (mark.get(i) > maxRate) {
				maxRate = mark.get(i);
			}
		}

		return maxRate;
	}

	public int getMinRate() {
		int minRate = 0;

		for (int i = 0; i < mark.size(); i++) {
			if (i == 0) {
				minRate = mark.get(i);
			}
			if (mark.get(i) < minRate) {
				minRate = mark.get(i);
			}
		}

		return minRate;
	}

	public static Comparator<Abiturient> sortAvgRate = new Comparator<Abiturient>() {

		public int compare(Abiturient s1, Abiturient s2) {

			double avgRate1 = s1.getAvgRate();
			double avgRate2 = s2.getAvgRate();

			int avgRateCompare = Double.compare(avgRate2, avgRate1);
			if (avgRateCompare == 0) {
				int isBrsmMemberCompare = Boolean.compare(s2.getIsBrsmMember(), s1.getIsBrsmMember());
				if (isBrsmMemberCompare == 0) {
					int maxMark = Integer.compare(s2.getMaxRate(), s1.getMaxRate());
					return maxMark;
				} else {
					return isBrsmMemberCompare;
				}
			} else {
				return avgRateCompare;
			}

		}
	};

}

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String DOB;
	private String address;
	private String phoneNum;
	private String faculty;
	private int course;
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public void show() {
		System.out.println("ID: " + id);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Middle Name: " + middleName);
		System.out.println("Date of birth: " + DOB);
		System.out.println("Address: " + address);
		System.out.println("Phone Num: " + phoneNum);
		System.out.println("Faculty: " + faculty);
		System.out.println("Course: " + course);
		System.out.println(" ");

	}

	public void studingProcess() {

		int monthToSession = 6;

		while (monthToSession >= 0) {

			if (monthToSession == 6 || monthToSession == 3) {
				System.out.println(monthToSession + " months to Session!");
				System.out.println("Sleeping.. Drinking ... ");
			} else if (monthToSession == 1) {
				System.out.println(monthToSession + " months to Session!");
				System.out.println("Sleeping.. Drinking ... Scratching the head ");
			} else if (monthToSession == 0) {
				System.out.println("It's a Session time!");
				System.out.println("Crying... Studing... No Sleeping...");
			}

			monthToSession--;
		}

	}

}
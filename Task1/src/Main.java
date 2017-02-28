import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		boolean isInputOK = false;
		System.out.println("Choose the branch, please. If you want to find information:" + "\n"
				+ "about customers enter 1" + "\n" + "about students  enter 0");

		while (!isInputOK) {
			if (sc.hasNextInt()) {
				choice = sc.nextInt();
				if (choice < 2 && choice >= 0) {
					if (choice == 0) {
						processStudent(sc);
						isInputOK = true;
					} else {
						processCustomer(sc);
						isInputOK = true;
					}
				} else {
					System.out.println("Incorect number! Try again!");

				}
			} else {
				System.out.println("Incorect number! Try again!");
				sc.next();
			}
		}

	}

	private static void processStudent(Scanner sc) {

		ArrayList<Student> studentsList = new ArrayList<Student>();
		
		Student std1 = new Student();
		
		std1.setFirstName("Ivan");
		std1.setLastName("Ivanov");
		std1.setFaculty("Electronics");
		std1.setCourse(1);
		
		Student std2 = new Student();
		std2.setFirstName("Petr");
		std2.setLastName("Petrov");
		std2.setFaculty("Informatics");
		std2.setCourse(2);
		
		Student std3 = new Student();
		std3.setFirstName("Pavel");
		std3.setLastName("Durov");
		std3.setFaculty("Informatics");
		std3.setCourse(1);
		
		Student std4 = new Student();
		std4.setFirstName("Bill");
		std4.setLastName("Geits");
		std4.setFaculty("Informatics");
		std4.setCourse(2);
				

		studentsList.add(std1);
		studentsList.add(std2);
		studentsList.add(std3);
		studentsList.add(std4);

		String faculty = null;
		int course = 0;
		boolean isDataExist = false;
		//boolean isInputFacultyOK = false;
		boolean isInputCourseOK = false;

		System.out.print("Enter Course: ");

		while (!isInputCourseOK) {
			if (sc.hasNextInt()) {
				course = sc.nextInt();
				if (course > 0) {
					isInputCourseOK = true;
				} else {
					System.out.println("Incorrect course! Try again! ");
				}
			} else {
				System.out.println("Incorrect course! Try again! ");
				sc.next();
			}
		}

		System.out.print("Enter Faculty: ");

		faculty = sc.next();

		for (Student st : studentsList) {

			if (faculty.equals(st.getFaculty()) && course == st.getCourse()) {
				st.show();
				isDataExist = true;
			}
		}

		if (isDataExist == false) {
			System.out.println("0 results");
		}

	}

	private static void processCustomer(Scanner sc) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
        Customer cust1 = new Customer();
        cust1.setCreditCardNum(000000);
        cust1.setLastName("Ivanov");
        
        Customer cust2 = new Customer();
        cust2.setCreditCardNum(111111);
        cust2.setLastName("Sidorov");
        
        Customer cust3 = new Customer();
        cust3.setCreditCardNum(222222);
        cust3.setLastName("Petrov");
        
        Customer cust4 = new Customer();
        cust4.setCreditCardNum(333333);
        cust4.setLastName("Vasechkin");
        

		customerList.add(cust1);
		customerList.add(cust2);
		customerList.add(cust3);
		customerList.add(cust4);
		

		int creditCardNumber = 0;
		boolean isInputCreditCardOK = false;
		boolean isDataExist = false;

		System.out.print("Enter Credit Card Number: ");

		while (!isInputCreditCardOK) {
			if (sc.hasNextInt()) {
				creditCardNumber = sc.nextInt();
				isInputCreditCardOK = true;
			} else {
				System.out.println("Incorrect card number! Try again! ");
				sc.next();
			}
		}
		for (Customer cust : customerList) {

			if (creditCardNumber == cust.getCreditCardNum()) {
				cust.show();
				cust.checkBalance(creditCardNumber);
				isDataExist = true;
			}
		}

		if (isDataExist == false) {
			System.out.println("0 results");
		}

	}

}
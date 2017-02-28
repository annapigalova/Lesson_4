public class Customer {
	private String firstName;
	private String lastName;
	private String middleName;
	private int creditCardNum;
	private int bankAccountNum;
	
	public Customer (){
		creditCardNum = 0;
		bankAccountNum = 0;
		firstName = "";
		lastName = "";
		middleName = "";				
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBankAccountNum() {
		return bankAccountNum;
	}
	public void setBankAccountNum(int bankAccountNum) {
		this.bankAccountNum = bankAccountNum;
	}
	public int getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(int creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	
	public void show() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Middle Name: " + middleName);
		System.out.println("Credit Card Number: " + creditCardNum);
		System.out.println("Account Number: " + bankAccountNum);
		System.out.println(" ");

	}

	
	
	public void checkBalance
	(int creditCardNum)
	{	  int a = -1000; 
	      	      
	      int balance = (int) (Math.random()*a) ; 
	      System.out.println("Balance: " + balance + " BYN");
	}

}
/*
 * Programmer: Felipe SG
 * Date: 18/02/2020
 * Details:
Create a storage class named BankAccount. 
A BankAccount has fields that hold the account number, the customer's name (2 fields), 
their address, and the balance
Create the accessor and mutator methods for each attribute. The class will also contain 
methods to deposit and withdraw an amount (internally updating the stored balance by the 
amount deposited or withdrawn). 
Create a default constructor to default any numeric attribute to 2 and any string attribute to "empty".
Create another constructor to allow you to set all attributes stored within the object when the object is declared.
Create a third construct that allows you set all string attributes when the object is declared and defaults all the
 numeric attributes to 2.
Create a display function to show the class's current state.
Create a class named TestBankAccount and test all methods you created for your BankAccount class.
 */



public class BankAccount {
	
	//define the attributes
		private int accNumber;
		private String firstName;
		private String lastName;
		private String address;
		private double balance;
		
		public BankAccount() 
		{
			accNumber=2;
			firstName ="empty"; lastName= "empty"; address="empty";
			this.balance = 2.0;
		}

		
		public BankAccount(String fn1, String ln2, String ad1, String ad2) 
		{
			firstName = fn1; lastName= ln2; address=ad1;
		}

		public int getaccNumber() {return this.accNumber;}
		public String getFisrtName() {return firstName;}
		public String getLastName() {return lastName;}
		public String getAddress() {return address;}
		public String getDepartment() {return department;}
		public double getRateOfPay() {return rateOfPay;}
		public double getHoursWorked() {return hoursWorked;}
		
		//set functions for each
		public void setID(int temp) {id = temp;}
		public void setFirstName(String temp) {firstName = temp;}
		public void setLastName(String temp) {lastName = temp;}
		public void setAddress(String temp) {address = temp;}
		public void setDepartment(String department) {this.department = department;}
		public void setRateOfPay(double temp) {rateOfPay = temp;}
		public void setHoursWorked(double temp) {hoursWorked = temp;}
		
		//display
		public void display() 
		{
			System.out.println("Name:"+firstName + " " +lastName);
			System.out.println("Adress:" +address);
			System.out.println("Department:" +department);
			System.out.println("Rate of Pay:" +rateOfPay);
			System.out.println("Hours Worked:"+ hoursWorked);
			System.out.println("ID:" +id);
		
		}
	}


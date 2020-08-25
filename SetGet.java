Program Name: Set Get
Objecrtive: Practice the set and get 
Programmer: Felipe SG 


public class Employee {
	//define the attributes (variables that define this template
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String department;
	private double rateOfPay;
	private double hoursWorked;
	
	//get functions for each
	public int getID() {return id;}
	public String getFisrtName() {return firstName;}
	public String getLastName() {return lastName;}
	public String getAddress() {return address;}
	public String getDepartment() {return department;}
	public double getRateOfPay() {return rateOfPay;}
	public double getHoursWorked() {return hoursWorked;}
	
	//get functions for each
	public void setID(int temp) {id = temp;}
	public void setFirstName(String temp) {firstName = temp;}
	public void setLastName(String temp) {lastName = temp;}
	public void setAddress(String temp) {address = temp;}
	public void setDepartment(String temp) {department = temp;}
	public void setRateOfPay(double temp) {rateOfPay = temp;}
	public void setHoursWorked(double temp) {hoursWorked = temp;}
	
	//display
	public void display() 
	{
		System.out.println(firstName + " " +lastName);
	}
}

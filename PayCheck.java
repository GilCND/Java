Program Name: Pay Check
Objective: Calculate the pay from an imployee.
Programmer: Felipe SG

import javax.swing.JOptionPane;
public class UserPaycheck {
	public static void main(String[] args) {
		String strNumber1 = JOptionPane.showInputDialog(null, "Please inform the hourly rate:");
		String strNumber2 = JOptionPane.showInputDialog(null, "Please inform the hours worked :");
		double HourlyRate = Integer.parseInt(strNumber1);
		double HoursWorked = Integer.parseInt(strNumber2);
		double GrossPay = HourlyRate*HoursWorked;
		double Tax = GrossPay*0.10;
		double Netpay = GrossPay-Tax;
		System.out.println(" Your GrossPay is: " + GrossPay + " The withholding tax is: " + Tax + " The Net pay would be: " + Netpay);
	}
}


/*
Programmer: Felipe Souza Gil
Date: 05/02/2020.
Program details:
Create an application that prompts an employee for an hourly pay rate and number of hours worked. 
Compute their gross pay (hours times rate), withholding tax, and net pay (gross pay 
minus withholding tax). Withholding tax is computed as a percentage of gross pay based on 
the following:

Gross Pay ($)                       Withholding (%)
Up to and including 300.00                10
300.01 and up                             12

Version: 1.0
Changelog: First Version


*/



import javax.swing.JOptionPane;
public class CalculatePayAdvanced {
	public static void main(String[] args) {

		Double grossPay = 0.00, withholding = 0.00, netPay = 0.00, housWorked = 0.00, hourlyRate = 0.00;

		int keyFactor = 0;
		
		while (keyFactor != 1)
		{
			// Asks user for hourly rate.	
			String Ans1 = JOptionPane.showInputDialog(null, "Please inform the hourly pay rate");
			hourlyRate = Double.parseDouble(Ans1);
			if (hourlyRate > 0)
			{
				//Ask the user for number of hours worked
				String Ans2 = JOptionPane.showInputDialog(null, "Please inform the worked hours");
				housWorked = Double.parseDouble(Ans2);				
				if (housWorked >0)
				{
					grossPay = hourlyRate * housWorked;
					keyFactor = 1;
				}
					
			// Based on grossPay, select a withholding %
				if (grossPay <= 300)
				{
					withholding = 0.1;
				}
				
				else if (grossPay > 300 && grossPay <= 400)
				{
					withholding = 0.12;
				}
				else if (grossPay > 400 && grossPay <= 500)
				{
					withholding = 0.15;
				}
				else if (grossPay > 500)
				{
					withholding = 0.20;
				}
			//Calculate the netPay
				netPay = grossPay - (grossPay * withholding);
			}
			else 
			{
				//If the user enters an invalid number
				JOptionPane.showMessageDialog(null,"Please inform a valid number");
			}
		}	
		//Print all information.
		JOptionPane.showMessageDialog
		(null,"You entered" + hourlyRate + "hours. The pay rate is: $"+ hourlyRate + "The GrossPay is: $" + grossPay + " The withholding is:  " + withholding * 100 + 
		" % " + "The total payment will be: $" + netPay);
	}
}

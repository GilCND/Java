Program Name: Felipe SG
Objective: Create a simple program to sum 2 numbers 
Programmer: Felipe SG 

import javax.swing.JOptionPane;

public class TestFunction {

	public static void main(String[] args) {
		//prompt the user for 2 values (integers)
		String  strNumber = JOptionPane.showInputDialog(null, " what is the first number?");
		int number1 = Integer.parseInt(strNumber);
		strNumber = JOptionPane.showInputDialog(null, " What is the second number?");
		int number2 = Integer.parseInt(strNumber);
		
		//pass them off to a function that will calculate their sum 
		int sum = addNumbers(number1, number2);
				
		//pass the 3 numbers to a function do display
		display(number1, number2, sum);
	}
	
	// sum = addNumbers(number1, number2)
	public static int addNumbers(int n1, int n2) {
	
	int sum = n1 +n2;
	return sum;
	}
	// display(number1, number2, sum);
	public static void display(int n1, int n2, int n3)
	{
		JOptionPane.showMessageDialog(null, "Sum of " +n1+ "and" +n2+"is"+n3);
	}
}

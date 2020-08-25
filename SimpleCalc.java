Program Name: Simple Calc
Objective: Calculate 2 numbers 
Progrtammer: Felipe SG

import javax.swing.JOptionPane;
public class test2 {
	public static void main(String[] args) {
		String strNumber1 = JOptionPane.showInputDialog(null, "Width:");
		String strNumber2 = JOptionPane.showInputDialog(null, "length :");
		double number1 = Integer.parseInt(strNumber1);
		double number2 = Integer.parseInt(strNumber2);
		double result4 = number1*number2;
		System.out.println(number1+"*"+number2+"="+result4+" feet");
	}
}

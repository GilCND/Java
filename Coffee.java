/*
Programmer: Felipe SG
Date: 04/02/2020.
Program Name: Coffee
Version: 1.0
 */

import javax.swing.JOptionPane;
public class test1 {
	public static void main(String[] args) {
		// 	
		Double coffeePrice = 5.99, Tax = 0.15, Total, totalTax;



		//Prompt the user for weight and number of coffee bags
		int key = 0;
		
		while (key != 1)
		{
			String userTyped1 = JOptionPane.showInputDialog(null, "Please inform the weight of the coffee bags");
			Integer weightCoffee = Integer.parseInt(userTyped1);
			String userTyped2 = JOptionPane.showInputDialog(null, "Please inform the number of bags");
			Integer numberBags = Integer.parseInt(userTyped2);
			
			// If user typed a number greater than 0
			if (weightCoffee > 0)
			{
				if (numberBags > 0)
				{
				totalTax = ((weightCoffee * numberBags)*coffeePrice)*Tax;
				Total = totalTax + ((weightCoffee * numberBags)*coffeePrice);
				key = key + 1;
				System.out.println("Number of bags sold " + numberBags);
				System.out.println("Weight per bag " + weightCoffee);
				System.out.println("The current price per pound is " + coffeePrice);
				System.out.println("The sales taxes is " + Tax * 100 + "%");
				System.out.println("___________________________________");
				System.out.println("Total Price: $" + Total);
				}
				else
				{
					//If the user enters an invalid number of bags, generate error
					JOptionPane.showMessageDialog(null,"Please inform a valid number");
				}
			}
			else 
			{
				//If the user enters an invalid weight, generate error
				JOptionPane.showMessageDialog(null,"Please inform a valid number");
			}
		}		

	}
}

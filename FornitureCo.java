/*
Program Name: Forniture Company
Objective:
Create an application for a furniture company which will determine the 
price of a table. Ask the user to choose 1 for pine, 2 for oak, or 3 for mahogany.
The output is the name of the wood chosen as well as the price of the table.
Pine tables cost $100, oak tables cost $225, and mahogany tables cost $310.
If the user enters an invalid wood code, set the price to 0.

1b - 
Modify the application you wrote in 1A to ask the user to specify the table size 
(large or small), but only if the wood selection is valid.
Add $35 to the price of any large table, and add nothing to the price for a small table. 
Display an appropriate message if the size value is invalid, and assume the price is for a small table.
Programmer: Felipe SG

*/

import javax.swing.JOptionPane;
public class TableSize {
	public static void main(String[] args) {
		// Print wood options and ask 1 answer.	
		Integer Pine = 100, Oak = 225, Mahogany = 310, Price = 0, Extra = 0;
		String Name = "", sizeName = "";


		//Based on the option selected create a case statement
		int keyFactor = 0;
		
		while (keyFactor != 1)
		{
			JOptionPane.showMessageDialog(null,"Please select the type of table:");
			String Selection1 = JOptionPane.showInputDialog(null, "1 - Pine,      2 - Oak,       3 - Mahogany");
			Integer woodSelected = Integer.parseInt(Selection1);
			if (woodSelected > 0 && woodSelected <=3)
			{
				//ask the user to specify the table size
				JOptionPane.showMessageDialog(null,"Please select the size of the table");
				String Selection2 = JOptionPane.showInputDialog(null, "1 - Large.        2 - Small");
				Integer sizeSelected = Integer.parseInt(Selection2);				
				if (sizeSelected >0 && sizeSelected <=2)
				{
			//Add $35 to the price of any large table, and add nothing to the price for a small table
					switch (sizeSelected)
					{
						case 1:
							Extra = 35;
							sizeName = "Large";
							break;
						case 2:
							Extra = 0;
							sizeName = "Small";			
							break;
					}
				}
				else
				{
					//Display an appropriate message if the size value is invalid, and assume the price is for a small table.
					sizeName = "Small";
					Extra = 0;
					JOptionPane.showMessageDialog(null,"The selection is invalid size Small Selected. ");
				}
				
				
				switch (woodSelected)
				{
					case 1:
						Price = Pine + Extra;
						Name = ("Pine");
						keyFactor ++;
						break;
					case 2:
						Price = Oak + Extra;
						Name =("Oak");
						keyFactor ++;
						break;
					case 3:
						Price = Mahogany + Extra;
						Name = ("Mahogany");
						keyFactor ++;
						break;
				}
				
			}
			else 
			{
				//If the user enters an invalid wood code, set the price to 0
				Price = 0;
				JOptionPane.showMessageDialog(null,"Please inform a valid number");
			}
		}		
		JOptionPane.showMessageDialog(null,"You have selected " + Name + " The price is  " + Price + " for a " + sizeName + " table. ");
	}
}

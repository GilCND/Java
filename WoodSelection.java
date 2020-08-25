/*
Program Name: Wood Selection
Objective:
Create an application for a furniture company which will determine the 
price of a table. Ask the user to choose 1 for pine, 2 for oak, or 3 for mahogany.
The output is the name of the wood chosen as well as the price of the table.
Pine tables cost $100, oak tables cost $225, and mahogany tables cost $310.
If the user enters an invalid wood code, set the price to 0.
Programmer: Felipe SG
 */

import javax.swing.JOptionPane;
public class Table {
	public static void main(String[] args) {
		// Print wood options and ask 1 answer.	
		Integer Pine = 100, Oak = 225, Mahogany = 310, Price = 0;
		String Name = "";


		//Based on the option selected create a case statement
		int keyFactor = 0;
		
		while (keyFactor != 1)
		{
			JOptionPane.showMessageDialog(null,"Please select the type of table:");
			String Selection1 = JOptionPane.showInputDialog(null, "1 - Pine,      2 - Oak,       3 - Mahogany");
			Integer woodSelected = Integer.parseInt(Selection1);
			if (woodSelected > 0 && woodSelected <=3)
			{
				switch (woodSelected)
				{
					case 1:
						Price = Pine;
						Name = ("Pine");
						keyFactor ++;
						break;
					case 2:
						Price = Oak;
						Name =("Oak");
						keyFactor ++;
						break;
					case 3:
						Price = Mahogany;
						Name = ("Mahogany");
						keyFactor ++;
						break;
				}
				
			}
			else 
			{
				Price = 0;
				JOptionPane.showMessageDialog(null,"Please inform a valid number");
			}
		}		
		JOptionPane.showMessageDialog(null,"You have selected " + Name + " The price is " + Price);
	}
}

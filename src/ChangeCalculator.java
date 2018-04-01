//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String Nickels = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		int nickels = Integer.parseInt(Nickels);
		// Ask the user how many dimes they have, and convert their answer
		String Dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		int dimes = Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
		String Quarters = JOptionPane.showInputDialog(null, "How many quarters do you have?");
		int quarters = Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a double variable 
		nickels = (int) (nickels *.05);
		dimes = (int) (dimes *.10);
		quarters = (int) (quarters *.25);
		int totalmoney = nickels + quarters + dimes;
		JOptionPane.showMessageDialog(null, "You have $" + totalmoney + "!");
		// Tell the user how much money they have

	}
}


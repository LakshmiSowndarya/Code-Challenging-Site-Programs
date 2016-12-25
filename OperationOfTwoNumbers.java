package JavaPrograms;

import javax.swing.JOptionPane;

/**
 * 
 * @author Sowndarya
 * 
 * An application that asks the user to enter two numbers, 
 * obtains the two numbers from the user and prints the sum, 
 * product, difference and quotient of the two numbers
 */
public class OperationOfTwoNumbers {
	public static void main(String[] args) {
		String number1 = JOptionPane.showInputDialog("Enter Number1");
		String number2 = JOptionPane.showInputDialog("Enter Number2");
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, 
			"The sum of the two numbers is " + sum + "\n" +
			"The difference of two numbers is " + (num1 - num2) + "\n" +
			"The product of two numbers is " + num1 * num2 + "\n" +
			"The quotient of two numbers is " + (num2 == 0 ? "undefined" : (num1 / num2)));
	}
}

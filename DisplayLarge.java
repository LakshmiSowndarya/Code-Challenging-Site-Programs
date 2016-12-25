package JavaPrograms;

import javax.swing.JOptionPane;

/**
 * @author Sowndarya
 *
 * An application that asks the user to enter two integers, 
 * obtains the numbers from the user and displays the larger number 
 * followed by the words "is larger" in an information message dialog. 
 * If the numbers are equal, print the message "These numbers are equal." 
 */
public class DisplayLarge {
	public static void main(String[] args) {
		String number1 = JOptionPane.showInputDialog("Enter Number1");
		String number2 = JOptionPane.showInputDialog("Enter Number2");
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		int large;
		if (num1 > num2) {
			large = num1;
		}
		else {
			large = num2;
		}
		if (num1 == num2) {
			JOptionPane.showMessageDialog(null, "These numbers are equal");
		}
		else {
			JOptionPane.showMessageDialog(null, large + " is larger");
		}
	}

}

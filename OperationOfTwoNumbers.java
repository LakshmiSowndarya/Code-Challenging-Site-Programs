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
	public int[] input() {
		int[] inputs = new int[2];
		for (int i = 0; i < 2;) inputs[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Number" + ++i));
		return inputs;
	}
	
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public int product(int n1, int n2) {
		return n1 * n2;
	}
	
	public int difference(int n1, int n2) {
		return n1 - n2;
	}
	
	public int quotient(int n1, int n2) {
		return n1 / n2;
	}
	
	public void output(int n1, int n2) {
		JOptionPane.showMessageDialog(null, 
			"Sum: " + sum(n1, n2) + "\n" + "Difference: " + difference(n1, n2) + "\n" +
			"Product: " + product(n1, n2) + "\n" + "Quotient: " + (n2 == 0 ? "undefined" : quotient(n1, n2)));
	}
	
	public static void main(String[] args) {
		OperationOfTwoNumbers operations = new OperationOfTwoNumbers();
		int[] inputs = operations.input();
		operations.output(inputs[0], inputs[1]);
	}
}

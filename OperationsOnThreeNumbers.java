/**
 * 
 */
package JavaPrograms;

import javax.swing.JOptionPane;

/**
 *
 * @author Sowndarya
 *
 * An application that inputs three integers from the user and displays 
 * the sum, average, product, smallest and largest of these numbers in 
 * an information message dialog. The average is an integer.
 *
 */
public class OperationsOnThreeNumbers {
	public int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	public int average(int n1, int n2, int n3) {
		return (n1 + n2 + n3) / 3;
	}
	
	public int product(int n1, int n2, int n3) {
		return n1 * n2 * n3;
	}
	
	public int minOfTwo(int n1, int n2) {
		if (n1 < n2) return n1;
		else return n2;
	}
	
	public int minOfThree(int n1, int n2, int n3) {
		if (n1 < n2) return minOfTwo(n1, n3);
		else return minOfTwo(n2, n3);
	}
	
	public int maxOfTwo(int n1, int n2) {
		if (n1 > n2) return n1;
		else return n2;
	}
	
	public int maxOfThree(int n1, int n2, int n3) {
		if (n1 > n2) return maxOfTwo(n1, n3);
		else return maxOfTwo(n2, n3);
	}
	
	public int[] input() {
		int[] inputs = new int[3];
		for(int i = 0; i < 3;) inputs[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Number" + ++i));
		return inputs;
	}
	
	public void output(int n1, int n2, int n3) {
		JOptionPane.showMessageDialog(null, "Sum: " + sum(n1, n2, n3) + "\n" +
			"Product: " + product(n1, n2, n3) + "\n" + "Average: " + average(n1, n2, n3) + "\n" +
			"Min: " + minOfThree(n1, n2, n3) + "\n" + "Max: " + maxOfThree(n1, n2, n3));
	}
	
	public static void main(String[] args) {
		OperationsOnThreeNumbers operations = new OperationsOnThreeNumbers();
		int[] inputs = operations.input();
		operations.output(inputs[0], inputs[1], inputs[2]);
	}

}

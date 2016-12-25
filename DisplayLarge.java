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
	public int[] input() {
		int inputs[] = new int[2];
		for (int i = 0; i < 2;) inputs[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Number" + ++i));
		return inputs;
	}

	public int max(int n1, int n2) {
		if (n1 > n2) return n1;
		else return n2;
	}

	public void output(int n1, int n2) {
		if (n1 == n2) JOptionPane.showMessageDialog(null, "These numbers are equal");
		else JOptionPane.showMessageDialog(null, max(n1, n2) + " is larger");
	}

	public static void main(String[] args) {
		DisplayLarge d = new DisplayLarge();
		int input[] = d.input();
		d.output(input[0], input[1]);
	}
}

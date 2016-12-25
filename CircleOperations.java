/**
 * 
 */
package JavaPrograms;

import javax.swing.JOptionPane;

/**
 * @author Sowndarya
 * 
 * An application that inputs from the user the radius of a circle 
 * and prints the circle's diameter, circumference and area.
 *
 */
public class CircleOperations {
	public double input() {
		return Double.parseDouble(JOptionPane.showInputDialog("Enter the radius"));
	}
 
	public double diameter(double radius) {
		return 2 * radius;
	}

	public double circumference(double radius) {
		return 2 * Math.PI * radius;
	}

	public double area(double radius) {
		return Math.PI * radius * radius;
	}

	public void output(double radius) {
		JOptionPane.showMessageDialog(null, "Diameter: " + diameter(radius) + "\n" +
			"Circumference: " + circumference(radius) + "\n" +
			"Area: " + area(radius));
	}

	public static void main(String[] args) {
		CircleOperations c = new CircleOperations();
		double radius = c.input();
		c.output(radius);
	}
}

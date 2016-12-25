/**
 * 
 */
package JavaPrograms;
import java.util.Scanner;

/**
 * @author Sowndarya
 *
 * Program that inputs five numbers and determines and 
 * prints the number of negative numbers input, 
 * the number of positive numbers input, the number of zeros input
 * 
 */
public class CountNumbers {
	int[] inputs;
	int numberOfNegativeNumbers;
	int numberOfPositiveNumbers;
	int numberOfZeros;
	
	/**
	 * Constructor to initialize the class variables
	 */
	public CountNumbers(
		int[] inputs, 
		int numberOfNegativeNumbers, 
		int numberOfPositiveNumbers, 
		int numberOfZeros) {
		this.inputs = inputs;
		this.numberOfPositiveNumbers = numberOfNegativeNumbers;
		this.numberOfNegativeNumbers = numberOfPositiveNumbers;
		this.numberOfZeros = numberOfZeros;
	}
	
	/**
	 * count[0] denotes number of Positive numbers
	 * count[1] denotes number of Negative numbers
	 * count[2] denotes number of Zeros
	 */
	public int[] countOfTypeOfNumbers(int[] array) {
		int count[] = new int[3];
		for (int i=0; i < array.length ; i++) count[checkNumber(array[i])]++;
		return count;
	}
	
	public int checkNumber(int n) {
		if (n > 0) return 0;
		else if (n < 0) return 1;
		else return 2;
	}
	
	public void output(CountNumbers c) {
		int count[] = countOfTypeOfNumbers(c.inputs);
		assertTheOutputs(count, c.numberOfPositiveNumbers, c.numberOfNegativeNumbers, c.numberOfZeros);
	}
	
	public void assertTheOutputs(
		int[] count, 
		int numberOfPositiveNumbers, 
		int numberOfNegativeNumbers, 
		int numberOfZeros) {
		if (count[0] == numberOfPositiveNumbers &&
			count[1] == numberOfNegativeNumbers &&
			count[2] == numberOfZeros) System.out.println("Passed");
		else System.out.println("Failed");
	}
	
	public static void testcases() {
		CountNumbers c[] = {
			new CountNumbers(new int[]{1, 2, 3, 4, 5}, 5, 0, 0),
	        new CountNumbers(new int[]{1, -2, 3, -4, 5}, 3, 2, 0),
	        new CountNumbers(new int[]{0, 0, 0, 0, 0}, 0, 0, 5),
	        new CountNumbers(new int[]{-1, -2, -3, -4, -5}, 0, 5, 0),
	        new CountNumbers(new int[]{1, -2, 0, -4, 5}, 2, 2, 1)
    	};
		for (int i = 0; i < c.length; i++) {
			c[i].output(c[i]);
		}
	}
	
	public static void main(String[] args) {
		testcases();
	}
}

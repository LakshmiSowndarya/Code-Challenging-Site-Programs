/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/
*/

import java.util.Scanner;

public class FindProduct {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// no of elements in the array
		int noOfElements = s.nextInt();
		long array[] = new long[noOfElements];
		for (int i=0;i<noOfElements;i++) {
			array[i] = s.nextInt();
		}
		long product = 1;
		long modulo = 1;
		for (int i=0;i<9;i++) {
			modulo = modulo * 10;
		}
		modulo = modulo + 7;
		for (int i=0;i<noOfElements;i++) {
			product = (product * array[i])% modulo;
		}
		System.out.println(product);
	}
}

/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/
*/

import java.util.Scanner;

public class CountDivisors {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int r = s.nextInt();
		int k = s.nextInt();
		int count = 0;
		for (int i=l; i<=r; i++) {
			if (i%k == 0) count++;
		}
		System.out.println(count);
	}
}

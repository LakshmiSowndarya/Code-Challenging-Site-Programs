/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/digit-problem/
*/

import java.math.BigInteger;
import java.util.Scanner;

public class DigitProblem {
	public static void main(String args[]) {
		Scanner s = new Scanner (System.in);
		String str = s.next();
		int num = s.nextInt();
		char a[] = str.toCharArray();
		int count = 0;
		for (int i=0;i<a.length;) {
			if (num == 0) break;
			if (a[i] != '9') {
				a[i] = '9';
				i++;
				count ++;
			}
			else {
				i++;
			}
			if (count == num) break;
		}
		System.out.println(a);
	}
}



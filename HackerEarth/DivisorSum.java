/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/can-you-guess/
*/

import java.util.Scanner;

public class DivisiorSum {
	public int sumDivisors(int a) {
		int sum = 0;
		for (int i=1;i<a;i++) {
			if (a%i == 0) sum =sum + i;
		}
		return sum;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		int arr[] = new int[testcases];
		for (int i=0;i<testcases;i++) {
			arr[i] = s.nextInt();
 		}
		DivisiorSum ds = new DivisiorSum();
		for (int i=0;i< testcases;i++) {
			System.out.println(ds.sumDivisors(arr[i]));
		}
	}
}

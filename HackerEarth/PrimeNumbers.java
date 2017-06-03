/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/prime-number-8
*/

import java.util.*;

public class PrimeNumbers {
	public boolean checkPrime(int num) {
		int count =0;
		for (int i=2;i<num;i++) {
			if(num%i == 0) count ++;
		}
		if (count == 0) return true;
		return false;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		PrimeNumbers p = new PrimeNumbers();
		for (int i=2;i <= num; i++) {
			if (p.checkPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}

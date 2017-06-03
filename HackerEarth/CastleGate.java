/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/the-castle-gate-july-easy/
*/


import java.util.*;
public class CastleGate {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		int a[] = new int[testcases];
		for (int i=0;i<testcases;i++) {
			a[i] = s.nextInt();
 		}
		for (int k=0;k<testcases;k++) {
			int count = 0;
			for (int i=1; i <= a[k]; i++) {
				for (int j=i; j <= a[k]; j++) {
					if (a[k] >= (i ^ j) && (i!=j)) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}

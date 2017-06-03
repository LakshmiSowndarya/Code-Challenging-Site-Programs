/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/fredo-and-game
*/

import java.util.ArrayList;
import java.util.Scanner;

public class FredoGame {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int noOfTestCases = s.nextInt();
		int A[] = new int[noOfTestCases];
		int N[] = new int[noOfTestCases];
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<noOfTestCases;i++){
			A[i] = s.nextInt();
			N[i] = s.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			for (int j=0;j<N[i];j++) {
				a.add(s.nextInt());
			}
			arr.add(a);
 		}
		for (int i=0;i<noOfTestCases;i++) {
			// logic
			int count = A[i];
			int index = -1;
			ArrayList<Integer> b = arr.get(i);
			for (int j=0;j<N[i];j++) {
				if (b.get(j) == 1) {
					count = count + 2;
				}
				else {
					count = count - 1;
				}
				if (count == 0) {
					index = j+1;
					break;
				}
			}
			if (count == 0 && index < N[i]) System.out.println("No " + index);
			else System.out.println("Yes " + count);
		}
	}
}

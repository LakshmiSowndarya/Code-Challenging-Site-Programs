/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-welcome-problem/
*/

import java.util.Scanner;

public class MonkWelcome {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in) ;
		int N= s.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		for (int i=0;i<N;i++) {
			A[i] = s.nextInt();
		}
		for (int i=0;i<N;i++) {
			B[i] = s.nextInt();
		}
		int c[] = new int[N];
		for (int i=0;i<N;i++) {
			c[i] = A[i] + B[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}

/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/the-great-kian/
*/

import java.util.*;
public class Greatkian {
	public long getSum(int[] a,int index) {
		long sum =0;
		for (int i=index;i<a.length;i=i+3) {
			sum = sum + a[i];
		}
		return sum; 
	}
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		Greatkian g = new Greatkian();
		for (int i=0;i<3;i++) {
			System.out.print(g.getSum(a,i) + " ");
		}
	}
}

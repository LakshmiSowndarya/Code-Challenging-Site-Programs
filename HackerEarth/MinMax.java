/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/min-max-3/
*/

import java.util.*;
public class MinMax {
	public int findMin(int[] a) {
		int small = a[0];
		for (int i=0;i<a.length;i++) {
			if (small > a[i]) 
				small = a[i];
		}
		return small;
	}
	public int findMax(int[] a) {
		int large = a[0];
		for (int i=0;i<a.length;i++) {
			if (large < a[i]) 
				large = a[i];
		}
		return large;
	}
	public boolean isExists(int[] a, int b) {
		boolean check = false;
		for (int i=0;i<a.length;i++) {
			if(a[i] == b) 
				check = true;
		}
		return check;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		MinMax m = new MinMax();
		int min = m.findMin(a);
		int max = m.findMax(a);
		int check =0;
		for (int i=min+1;i<max;i++) {
			if (m.isExists(a,i)) 
				check =1;
			else {
				check =0; break;}
		}
		if (check == 1) System.out.println("YES");
		else System.out.println("NO");
	}
}

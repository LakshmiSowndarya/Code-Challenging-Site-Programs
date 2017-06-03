/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/jarvis-and-numbers-1/
*/

import java.util.*;
public class JarvisNumbers {
	public int findNumDividesBoth(int a,int b) {
		int divisor = 1;
		int large =a;
		if (a < b) {
			large = b;
		}
		for (int i=1;i<large;i++) {
			if (a % i == 0 && b%i==0) {
				divisor = i;
			}
		}
		return divisor;
	}
	public int[] decimalToAnyBase(int num, int base) {
		int temp = num;
		int count=0;
		while(temp > 0) {
			int x = temp % base;
			temp = temp /base;
			count ++;
 		}
		int k=0;temp=num;
		int a[] = new int[count];
		while(temp > 0) {
			int x = temp % base;
			a[k++] = x;
			temp = temp /base;
 		}
		return a;
	}
	
	public int getSum(int[] a) {
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		int a[] = new int[testcases];
		for (int i=0;i<testcases;i++) {
			a[i] = s.nextInt();
 		}
		JarvisNumbers jn= new JarvisNumbers();
		for (int i=0;i<testcases;i++) {
			int sum =0,count =0;
			for (int j=2;j<a[i];j++) {
				sum =sum+jn.getSum(jn.decimalToAnyBase(a[i], j));
				count++;
			}
			if (sum % count == 0) 
				System.out.println("1");
			else {
				int num = jn.findNumDividesBoth(sum,count);
				System.out.println(count/num);
			}
		}
	}

}

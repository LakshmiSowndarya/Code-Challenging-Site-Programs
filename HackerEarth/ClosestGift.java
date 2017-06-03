/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/closest-gift/
*/

import java.util.*;
public class ClosestGift {
	public boolean checkPrime(long a) {
		int count = 0;
		for(long i=2;i<Math.sqrt(a);i++) {
			if(a%i == 0) count++;
		}
		if (a == 0) return false;
		else if (a == 1 || a == -1 ) return false;
		if (count == 0) return true;
		return false;
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner (System.in);
		ClosestGift c = new ClosestGift();
		long num = s.nextInt();
		long min = -1;
		for (long i=num;i>0;i--) {
			if (c.checkPrime(i)) {
				min = i;
				break;
			}
		}
		long max = -1;
		for (long i=num;i<num+100;i++) {
			if (c.checkPrime(i)) {
				max = i;
				break;
			}
		}
		long dist = 0;
		if (min < 0) {
			dist = max - num;
		}
		else if (num - min > max - num) {
			dist = max - num;
		}
		else if (num - min > max - num){
			dist = min - num;
		}
		System.out.println(Math.abs(dist));
	}
}

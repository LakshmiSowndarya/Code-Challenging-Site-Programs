// Problem 21 in ProjectEuler

import java.util.HashMap;
import java.util.Map;
public class AmicableNumber {
	public int getdivisorsSum(int a) {
		int sum = 0;
		for (int i=1;i<a;i++) {
			if (a%i == 0) 
			{
				sum = sum + i; 
				System.out.print(i + " ");
			}
		}
		return sum;
	}
	
	public static void main(String args[]) {
		AmicableNumber an = new AmicableNumber();
		Map <Integer,Integer> m = new HashMap<Integer,Integer>();
		int sum = 0;
		for(int i=2;i<10000;i++) {
			int j = an.getdivisorsSum(i);
			if (i == an.getdivisorsSum(j) && i != j) {
				sum = sum + i;
			}
		}
		System.out.println("sum is" + sum);
	}
}

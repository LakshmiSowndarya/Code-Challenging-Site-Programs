// Problem 16 in ProjectEular

import java.math.BigInteger;

public class SumOfDigits {

	public static long sum(String b) {
		long sum = 0;
		for (int i=0;i< b.length();i++) {
			sum = sum + Integer.parseInt(b.charAt(i) + "");
		}
		return sum;
	}
	public static void main(String[] args) {
		String str = BigInteger.valueOf(2).pow(1000).toString();
		System.out.println(sum(str));
	}
}

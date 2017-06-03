// Problem 15 in ProjectEular

import java.math.BigInteger;

public class LatticeProblem {

	public static BigInteger fact(int num){
		BigInteger product = BigInteger.valueOf(1);
		for (int i=num;i > 1; i--)
			product = product.multiply(BigInteger.valueOf(i));
		return product;
	}
	public static void main(String[] args) {
		BigInteger latticePaths = BigInteger.valueOf(1);
		latticePaths = fact(2 * 20);
		latticePaths = latticePaths.divide(fact(20));
		latticePaths = latticePaths.divide(fact(20));
		System.out.println(latticePaths);
	}

}

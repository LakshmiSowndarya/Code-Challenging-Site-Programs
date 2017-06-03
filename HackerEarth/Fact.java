/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-factorial/
*/

import java.math.BigInteger;
import java.util.*;
public class Fact {
	public static void main(String args[]) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
		BigInteger b = new BigInteger("1");
		for (int i=1;i<=num;i++) {
			b = b.multiply(new BigInteger(i + ""));
		}
		System.out.println(b.toString());
	}
}
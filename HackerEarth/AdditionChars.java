/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/addition-aint-simple/
*/

import java.util.Scanner;
public class AdditionChars {

	/**
	 * @param args
	 */
	public char[] getSum(String a, String b) {
		char [] a1 = a.toCharArray();
		char [] b1 = b.toCharArray();
		char [] c = new char[a.length()];
		for (int i=0;i<a1.length;i++) {
			c[i] = (char) (a1[i] + b1[i] - 2*96);
			c[i] = (char) (c[i]%26 + 96);
		}
		for (int i=0;i<c.length;i++) {
			if (c[i] == '`') c[i] = 'z'; 
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int testcases = s.nextInt();
		String [] strs = new String[testcases];
		String [] revs = new String[testcases];
		
		for (int i=0;i<testcases;i++) {
			strs[i] = s.next();
		}
		for (int i=0;i<testcases;i++) {
			revs[i] = new StringBuffer(strs[i]).reverse().toString();
		}
		AdditionChars a = new AdditionChars();
		for (int i=0;i<testcases;i++) {
			char [] result = a.getSum(strs[i],revs[i]);
			System.out.println(result);
		}
	}
}

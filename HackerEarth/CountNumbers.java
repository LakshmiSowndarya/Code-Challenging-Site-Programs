/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/count-numbers-46/
*/

import java.util.Scanner;
/**
 * check upto a number comes and then check upto next char
 * then count it as a number
 *
 */
public class CountNumbers {
	public int getNumberCount(String s) {
		int count = 0;
		int count1 = 0;
		int i=0;
		for (i=0;i<s.length();i++) {
			count = 0;
			while (s.charAt(i) >= 48 && s.charAt(i) <= 57 && i<s.length()-1) {
				count ++;i++;
			}
			if(count != 0) count1++;
		}
		if ((s.charAt(s.length()-1) >= 48 && s.charAt(s.length()-1) <= 57) && 
				!(s.charAt(s.length()-2) >= 48 && s.charAt(s.length()-2) <= 57)) {
			count1 ++;
		}
		return count1;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		int length[] = new int[testcases];
		CountNumbers c = new CountNumbers();
		String strs[] = new String[testcases];
		for (int i=0;i<testcases;i++) {
			length[i] = s.nextInt();
			strs[i] = s.next();
		}
		for (int i=0;i<testcases;i++) {
			System.out.println(c.getNumberCount(strs[i]));
		}
	}
}

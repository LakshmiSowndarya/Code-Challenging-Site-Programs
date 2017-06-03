/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/
*/

import java.util.Scanner;

public class Palindrome {
	public String isPalindrome(String str) {
		int count = 0;
		if (str.length()%2 == 0) {
			for (int i=0,j=str.length()-1; (i<= str.length()/2) && (j>= str.length()/2);i++,j--) {
				if (str.charAt(i) == str.charAt(j)) {
					count ++;
				}
			}
		}
		else {
			for (int i=0,j=str.length()-1; (i< str.length()/2) && (j> str.length()/2);i++,j--) {
				if (str.charAt(i) == str.charAt(j)) {
					count ++;
				}
			}
		}
		
		if (count == str.length()/2) return "YES";
		return "NO";
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome(str));
	}
}

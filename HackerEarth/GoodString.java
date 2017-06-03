/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/good-string-3/
*/

import java.util.Scanner;
public class GoodString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int a[] = new int[26];
		for (int i=0;i<str.length();i++) {
			a[str.charAt(i) - 'a'] ++;
		}
		int count = 0;
		for (int i=0;i<26;i++)
		{
			if(a[i]>1) count = count + a[i] - 1;
		}
		System.out.println(count);
	}

}
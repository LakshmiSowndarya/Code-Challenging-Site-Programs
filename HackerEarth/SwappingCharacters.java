/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/swapping-string-4/
*/

import java.util.*;

public class SwappingCharacters {
	
	public String getSwapped(String str) {
		char a[] = str.toCharArray();
		String result = "";
		if (str.length() % 2 == 0) {
			char x[] = new char[str.length()/2];
			char y[] = new char[str.length()/2];
			int k=0;
			for (int i=0;i<a.length;i=i+2) {
				x[k++] = a[i];
			}
			k=0;
			for (int i=1;i<a.length;i=i+2) {
				y[k++] = a[i];
			}
			x = new StringBuilder(new String(x)).reverse().toString().toCharArray();
			result = new StringBuilder(new String(y)).toString() + 
					new StringBuilder(new String(x)).toString();
		}
		else {
			char x[] = new char[str.length()/2];
			char y[] = new char[str.length()/2+1];
			int k=0;
			for (int i=0;i+1<a.length;i=i+2) {
				x[k++] = a[i];
			}
			k=0;
			for (int i=1;i<a.length;i=i+2) {
				y[k++] = a[i];
			}
			y[k] = a[str.length()-1]; 
			x = new StringBuilder(new String(x)).reverse().toString().toCharArray();
			result = new StringBuilder(new String(y)).toString() + 
					new StringBuilder(new String(x)).toString();
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		int length[] = new int[testcases];
		String strs[] = new String[testcases];
		for (int i=0;i<testcases;i++) {
			length[i] = s.nextInt();
			strs[i] = s.next();
		}
		SwappingCharacters sc = new SwappingCharacters();
		for (int i=0;i<testcases;i++) {
			System.out.println(sc.getSwapped(strs[i]));
		}
	}
}
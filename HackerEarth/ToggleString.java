/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/
*/

import java.util.*;
public class ToogleString {
	public String getConvert(String s) {
		String str = "";
		// A to Z are 65 to 90
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			// a to z are 97 to 122
			if (c > 96 && c < 123) {
				str = str + (char)(c - 32);
			}
			else {
				str = str + (char)(c + 32);
			}
		}
		return str;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		ToogleString t = new ToogleString();
		String result = t.getConvert(str);
		System.out.println(result);
	}
}

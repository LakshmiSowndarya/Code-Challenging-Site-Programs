/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/monk-takes-a-walk/
*/


import java.util.*;
public class MonkWalk {
	public int getVowelsCount(String str) {
		int count =0;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
				str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||
				str.charAt(i) == 'u' ||str.charAt(i) == 'A' ||
				str.charAt(i) == 'E' ||str.charAt(i) == 'I' ||
				str.charAt(i) == 'O' ||str.charAt(i) == 'U' ) {
				count ++;
			}
		}
		return count;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		String strs[] = new String[testcases];
		for (int i=0;i<testcases;i++) {
			strs[i] = s.next();
		}
		MonkWalk mw = new MonkWalk();
		for (int i=0;i<testcases;i++) {
			System.out.println(mw.getVowelsCount(strs[i]));
		}
	}
}
